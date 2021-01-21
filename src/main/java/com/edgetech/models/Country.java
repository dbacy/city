package com.edgetech.models;

public class Country {
    String name;
    String continent;
    String headOfState;
    String capital;
    int lifeExpectancy;
    int population;



    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getContinent() { return continent; }

    public void setContinent(String continent) { this.continent = continent; }

    public String getHeadOfState() { return headOfState; }

    public void setHeadOfState(String headOfState) { this.headOfState = headOfState; }

    public String getCapital() { return capital; }

    public void setCapital(String capital) { this.capital = capital; }

    public int getLifeExpectancy() { return lifeExpectancy; }

    public void setLifeExpectancy(int lifeExpectancy) { this.lifeExpectancy = lifeExpectancy; }

    public int getPopulation() { return population; }

    public void setPopulation(int population) { this.population = population; }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", headOfState='" + headOfState + '\'' +
                ", capital='" + capital + '\'' +
                ", lifeExpectancy=" + lifeExpectancy +
                ", population=" + population +
                '}';
    }

    public Country(String name, String continent, String headOfState, String capital, int lifeExpectancy, int population) {
        this.name = name;
        this.continent = continent;
        this.headOfState = headOfState;
        this.capital = capital;
        this.lifeExpectancy = lifeExpectancy;
        this.population = population;
    }
}
