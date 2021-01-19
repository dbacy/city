package com.edgetech.models;

public class City {
    String name;
    String district;
    int population;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "city{" +
                "name='" + name + '\'' +
                ", district='" + district + '\'' +
                ", population=" + population +
                '}';
    }

    public City(String name, String district, int population) {
        this.name = name;
        this.district = district;
        this.population = population;
    }
}
