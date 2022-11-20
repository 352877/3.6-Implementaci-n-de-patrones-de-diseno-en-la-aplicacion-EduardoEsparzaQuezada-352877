/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crud.sqlite;

import java.sql.*;

public class Conexion {
    private String url;
    private String driver;
    private Connection conexion;
    
    public static String conection_string = "jdbc:sqlite:directorios.db";
    
    protected void conectar() throws SQLException{
        this.conexion = DriverManager.getConnection(this.driver+":"+this.url);
        if (!this.conexion.isClosed())
            System.out.println("Conectado");
    }
    
    protected void cerrar() throws SQLException {
        if (!this.conexion.isClosed())
            this.conexion.close();
    }

    protected Connection getConexion() {
        return conexion;
    }
}

