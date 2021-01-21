package com.edgetech.controllers;


import com.edgetech.models.Film;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Controller
public class FilmController {
    Connection con;

    public FilmController() {
//        String url = "jdbc:mysql://localhost:3306/world?useSSL=false"; //	user=root;password=password";
        String url = "jdbc:sqlserver://localhost:1433;databaseName=sakila;";

        try {
            con = DriverManager.getConnection(url, "root", "password");
        } catch (Exception except) {
            System.out.println(except.getMessage());
            SQLException ex = new SQLException("Connection Failed: " + except.getMessage());
        }

    }
    @RequestMapping("ratings")
    public String ccc(@RequestParam String rating, Model model) throws Exception {

        List<Film> films = new ArrayList<>();
        int length = 0;

        try {
            Statement stmt = con.createStatement();
            String query = "SELECT Title, Rating, Length, Rental_Rate, Release_Year, name FROM Film " +
                    "join film_category on film.film_id = film_category.film_id " +
                    "join category on film_category.category_id = category.category_id ";
            if (rating != null && rating.length() > 0)
                query += "WHERE Rating like '%" + rating + "%' ";
            query += "ORDER BY Title";


            ResultSet results = stmt.executeQuery(query);

            while (results.next()) {
               length += results.getInt("length");
                Film film = new Film(   results.getString("title"),
                                        results.getString("rating"),
                                        results.getInt("length"),
                                        results.getFloat("rental_Rate"),
                                        results.getInt("release_Year"),
                                        results.getString("name"));
                films.add(film);
            }
        } catch (Exception except) {
            System.out.println(except.getMessage());
            SQLException ex = new SQLException("Query or Connection Failed: " + except.getMessage());
        }
        model.addAttribute("title", "First JDBC Application");
        model.addAttribute("films", films);
        model.addAttribute("rating", rating);
        model.addAttribute("length", length);
        return "film";
    }

//    http://localhost:8080/ratings?rating
}
