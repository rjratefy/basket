package src.main.java.com.example.demo.Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Position {
    private Integer id_position;
    private String name;

    public Integer getId_position() {
        return id_position;
    }
    public String getName() {
        return name;
    }

    public void setId_position(INTEGER id_position) {
        this.id_position = id_position;
    }
    public void setName(String name) {
        this.name = name;
    }
        
}
