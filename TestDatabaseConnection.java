/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproject;

/**
 *
 * @author prajwal
 */
public class TestDatabaseConnection {
    public static void main(String[] args) {
        java.sql.Connection connection = DatabaseConnection.getConnection();
        if (connection != null) {
            System.out.println("Database connection established successfully!");
        } else {
            System.out.println("Failed to connect to the database.");
        }
    }
}
