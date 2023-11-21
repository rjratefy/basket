package src.main.java.com.example.demo.Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class changement {
    private Match match;
    private Playor outed;
    private Playor entered;
    private Integer time;

    public Match getMatch() {
        return Match;
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

    public void setMatch(Integer Match) {
        this.Match = Match;
    }
    public void setOuted(Playor outed) {
        this.outed = outed;
    }
    public void setEntered(Integer entered) {
        this.entered = entered;
    }
    public void time(Integer success) {
        this.success = success;
    }

}
