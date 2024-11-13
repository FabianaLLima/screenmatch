package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculator.Classifiable;

public class Episode implements Classifiable {
    private int number;
    private String name;
    private String serie;
    private int totalViews;

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    @Override
    public int getClassification() {
        if (totalViews > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
