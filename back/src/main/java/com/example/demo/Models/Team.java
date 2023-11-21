package com.example.demo.Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Team {
    private Integer id_team;
    private String name;

    public Integer getId_team() {
        return id_team;
    }
    public String getName() {
        return name;
    }

    public void setId_team(Integer id_team) {
        this.id_team = id_team;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
