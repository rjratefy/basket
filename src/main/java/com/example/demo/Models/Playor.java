package src.main.java.com.example.demo.Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Playor {
    private Integer id_playor;
    private String name;
    private String firstname;
    private String birthday;
    private Position position;
    private Team team;

    public Integer getId_playor() {
        return id_playor;
    }
    public String getName() {
        return name;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getBirthday() {
        return birthday;
    }
    public Position getPosition() {
        return position
    }
    public Team getTeam() {
        return team
    }

    public void setId_playor(INTEGER id_playor) {
        this.id_playor = id_playor;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public void setPosition(Position position) {
        this.position = position;
    }
    public void setTeam(Team team) {
        this.team = team;
    }
}
