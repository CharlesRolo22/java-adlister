package controllers;

import models.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CarServlet", urlPatterns = "/cars")
public class CarServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Car prius = new Car(123456789123L, "Toyota", "Prius Prime", 2023, "hatchback", 46, "hybrid", true);
        Car supra = new Car(745825617590L, "Toyota", "Supra", 1994, "coupe", 27000, "gasoline", false);
        Car crossfire = new Car(6666666666666L, "Chrysler", "Crossfire SRT6", 2006, "roadster", 40000, "gasoline", true);

        List<Car> allCars = new ArrayList<>();

        allCars.add(prius);
        allCars.add(supra);
        allCars.add(crossfire);

        req.setAttribute("cars", allCars);

        req.getRequestDispatcher("/cars.jsp").forward(req, resp);
    }
}
