package com.example.demo.Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Time_played_by_playor {
    private Playor playor;
    private Match match;
    private Integer time;

    public Playor getPlayor() {
        return playor;
    }
    public Match getMatch() {
        return match;
    }
    public Integer getTime() {
        return time;
    }

    public void setPlayor(Playor playor) {
        this.playor = playor;
    }
    public void setMatch(Match match) {
        this.match = match;
    }
    public void setTime(Integer time) {
        this.time = time;
    }
    
}
