package com.example.demo.Models;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.Models.connection.GConnection;

public class Playor {
    private Integer id_playor;
    private String name;
    private String firstname;
    private Date birthday;
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
    public Date getBirthday() {
        return birthday;
    }
    public Position getPosition() {
        return position;
    }
    public Team getTeam() {
        return team;
    }

    public void setId_playor(Integer id_playor) {
        this.id_playor = id_playor;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public void setPosition(Position position) {
        this.position = position;
    }
    public void setTeam(Team team) {
        this.team = team;
    }

//Constructor
public Playor() {}
public Playor(Integer id_playor, String name, String firstname, Date birthday) {
    this.id_playor = id_playor;
    this.name = name;
    this.firstname = firstname;
    this.birthday = birthday;
}

//Fonction
public static List<Playor> getAll(Connection connection) {
    List<Playor> playors = new ArrayList<>();
    String query = "SELECT * FROM playor";

    
    Statement statement = null;
    ResultSet resultset = null;
    boolean closeable = false;

    try {
        if (connection == null) {
            closeable = true;
            connection = GConnection.getSimpleConnection();
            connection.setAutoCommit(false);
        }
        statement = connection.createStatement();
        resultset = statement.executeQuery(query);

        while (resultset.next()) {
          playors.add(new Playor(resultset.getInt("id_playor"), resultset.getString("name"), resultset.getString("firstname"),  resultset.getDate("birthday")));
        }

        if(closeable) {
            resultset.close();
            statement.close();
            connection.close();
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
    
    return playors;
}
}
