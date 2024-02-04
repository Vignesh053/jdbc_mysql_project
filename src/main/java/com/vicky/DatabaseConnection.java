package com.vicky;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/my_db"; 
        String user = "root"; 
        String password = "";

        String query = "INSERT INTO employee(empcode, empname, empage, esalary) VALUES (?, ?, ?, ?)";
        
        

        // connect to database and insert the data provided for employees
        try (Connection conn = DriverManager.getConnection(url, user, password);
            
        PreparedStatement stmt = conn.prepareStatement(query)) {

            // insert the values for first employee
            stmt.setInt(1, 101);
            stmt.setString(2, "Jenny");
            stmt.setInt(3, 25);
            stmt.setDouble(4, 10000);
            // update the query template with the values for new row
            stmt.executeUpdate();

            stmt.setInt(1, 102);
            stmt.setString(2, "Jacky");
            stmt.setInt(3, 30);
            stmt.setDouble(4, 20000);
            stmt.executeUpdate();

            stmt.setInt(1, 103);
            stmt.setString(2, "Joe");
            stmt.setInt(3, 20);
            stmt.setDouble(4, 40000);
            stmt.executeUpdate();

            stmt.setInt(1, 104);
            stmt.setString(2, "John");
            stmt.setInt(3, 40);
            stmt.setDouble(4, 80000);
            stmt.executeUpdate();

            stmt.setInt(1, 105);
            stmt.setString(2, "Shameer");
            stmt.setInt(3, 25);
            stmt.setDouble(4, 90000);
            stmt.executeUpdate();


            System.out.println("Inserted employees successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
