package controllers;

import models.NationalPark;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "NationalParkServlet", urlPatterns = "/parks")
public class NationalParkServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        NationalPark np1 = new NationalPark(1, "Acadia National Park", "Maine", LocalDate.parse("1919-02-26"), "Covering most of Mount Desert Island and other coastal islands, Acadia features the tallest mountain on the Atlantic coast of the United States, granite peaks, ocean shoreline, woodlands, and lakes. There are freshwater, estuary, forest, and intertidal habitats.");
        NationalPark np2 = new NationalPark(2, "Badlands National Park", "South Dakota", LocalDate.parse("1978-11-10"), "The Badlands are a collection of buttes, pinnacles, spires, and mixed-grass prairies within the drainage basin of the White River, in southwestern South Dakota. They contain the largest known assemblage of late Eocene and Oligocene mammal fossils.[19] Wildlife includes bison, bighorn sheep, black-footed ferrets, and prairie dogs.");

        List<NationalPark> nationalParks = new ArrayList<>();

        nationalParks.add(np1);
        nationalParks.add(np2);

        req.setAttribute("parks", nationalParks);

        req.getRequestDispatcher("/test.jsp").forward(req, resp);

    }
}