package src.main.java.com.example.demo.Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Match_duration {
    private Integer duration;
    private Match match;

    public Integer getDuration() {
        return duration;
    }
    public Match getMatch() {
        return match;
    }

    public void setDuration(INTEGER duration) {
        this.duration = duration;
    }
    public void setMatch(Match match) {
        this.match = match;
    }

}
