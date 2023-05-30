package Dao;

import Dao.Ads;
import Dao.Config;
import models.Ad;
import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection;

    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(config.getUrl(), config.getUsername(), config.getPassword());
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to database");
        }
    }

    @Override
    public List<Ad> all() {
        try {
            String selectAds = "SELECT * FROM ads";
            PreparedStatement stmt = connection.prepareStatement(selectAds);
            ResultSet rs = stmt.executeQuery();
            List<Ad> allAds = new ArrayList<>();
            while (rs.next()) {
                allAds.add(new Ad(rs.getLong("id"), rs.getLong("user_id"), rs.getString("title"), rs.getString("description")));
            }
            return allAds;
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving ads");
        }
    }

    @Override
    public Long insert(Ad ad) {
        try {
            String insertQuery = "INSERT INTO ads (user_id, title, description) VALUES (?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(insertQuery, PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setLong(1, ad.getUserId());
            stmt.setString(2, ad.getTitle());
            stmt.setString(3, ad.getDescription());
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                return rs.getLong(1);
            } else {
                throw new RuntimeException("Error retrieving inserted ad ID");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error adding ad");
        }
    }
}
