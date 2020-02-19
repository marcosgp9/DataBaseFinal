package com.example.databasefinal;

import java.util.ArrayList;

public class Planet {

    String name;
    int gravity;
     ArrayList<Planet> planetas = new ArrayList();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGravity() {
        return gravity;
    }

    public void setGravity(int gravity) {
        this.gravity = gravity;
    }

    public ArrayList<Planet> getPlanetas() {
        return planetas;
    }

    public void setPlanetas(ArrayList<Planet> planetas) {
        this.planetas = planetas;
    }
}
