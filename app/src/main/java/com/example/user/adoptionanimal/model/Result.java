package com.example.user.adoptionanimal.model;

import java.util.ArrayList;

public class Result {
    private ArrayList<Animal> results;

    public Result(){results = new ArrayList<>();}

    public ArrayList<Animal> getResults(){
        return results;
    }

    @Override
    public String toString() {
        return "Result{" +
                "results=" + results +
                '}';
    }
}
