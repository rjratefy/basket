package com.example.demo.Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Changement {
    private Match match;
    private Playor outed;
    private Playor entered;
    private Integer time;

    public Match getMatch() {
        return match;
    }
    public Playor getOuted() {
        return outed;
    }
    public Playor getEntered() {
        return entered;
    }
    public Integer time() {
        return time;
    }

    public void setMatch(Match Match) {
        this.match = Match;
    }
    public void setOuted(Playor outed) {
        this.outed = outed;
    }
    public void setEntered(Playor entered) {
        this.entered = entered;
    }
    public void time(Integer time) {
        this.time = time;
    }

}
