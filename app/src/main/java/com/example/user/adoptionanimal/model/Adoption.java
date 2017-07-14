package com.example.user.adoptionanimal.model;

public class Adoption {
    private Result result;

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Adoption{" +
                "result=" + result +
                '}';
    }
}
