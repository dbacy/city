package com.edgetech.models;

public class CountryLanguage {
    String countryCode;
    String language;
    float percentage;

    public String getCountryCode() { return countryCode; }

    public void setCountryCode(String countryCode) { this.countryCode = countryCode; }

    public String getLanguage() { return language; }

    public void setLanguage(String language) { this.language = language; }

    public float getPercentage() { return percentage; }

    public void setPercentage(float percentage) { this.percentage = percentage; }

    @Override
    public String toString() {
        return "CountryLanguage{" +
                "countryCode='" + countryCode + '\'' +
                ", language='" + language + '\'' +
                ", percentage=" + percentage +
                '}';
    }

    public CountryLanguage(String countryCode, String language, float percentage) {
        this.countryCode = countryCode;
        this.language = language;
        this.percentage = percentage;
    }
}
