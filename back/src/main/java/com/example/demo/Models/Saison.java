package com.example.demo.Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Saison {
    private Integer id_match;
    private Team team1;
    private Team team2;
    private Integer date_debut;

    public Integer getId_match() {
        return id_match;
    }
    public Team getTeam1() {
        return team1;
    }
    public Team getTeam2() {
        return team2;
    }
    public Integer getDate_debut() {
        return date_debut;
    }

    public void setId_match(Integer id_match) {
        this.id_match = id_match;
    }
    public void setTeam1(Team team1) {
        this.team1 = team1;
    }
    public void setTeam2(Team team2) {
        this.team2 = team2;
    }
    public void setDate_debut(Integer date_debut) {
        this.date_debut = date_debut;
    }

}
