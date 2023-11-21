package src.main.java.com.example.demo.Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Type_action {
    private Integer id_type_action;
    private String name;

    public Integer getId_type_action() {
        return id_type_action;
    }
    public String getName() {
        return name;
    }

    public void setId_type_action(Integer id_type_action) {
        this.id_type_action = id_type_action;
    }
    public void getName(String name) {
        this.name = name;
    }

}
