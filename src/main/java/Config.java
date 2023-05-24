public class Config {
    public String getUrl() {
        // Return the database URL
        "jdbc:mysql://localhost:3306/adlister_db_db?allowPublicKeyRetrieval=true&useSSL=false",
                "root",
    }

    public String getUsername() {
        // Return the database username
        return "adlister_user";
    }

    public String getPassword() {
        // Return the database password
        return "password";
    }
}
