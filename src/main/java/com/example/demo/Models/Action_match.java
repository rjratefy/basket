package src.main.java.com.example.demo.Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Action_match {
    private Integer id_action;
    private Type_match type_match;
    private INTEGER number;
    private INTEGER success;
    private Playor playor;
    private Match match;

    public Integer getId_action() {
        return id_action;
    }
    public Type_match getType_match() {
        return type_match;
    }
    public Integer getNumber() {
        return number;
    }
    public Integer getSuccess() {
        return success;
    }
    public Playor getPlayor() {
        return playor;
    }
    public Match getMatch() {
        return match;
    }

    public void setId_action(Integer id_action) {
        this.id_action = id_action;
    }
    public void setType_match(Type_match type_match) {
        this.type_match = type_match;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public void setSuccess(Integer success) {
        this.success = success;
    }
    public void setPlayor(Playor playor) {
        this.playor = playor;
    }
    public void setMatch(match) {
        this.match = match;
    }
}
