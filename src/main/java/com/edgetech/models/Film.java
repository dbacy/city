package com.edgetech.models;

public class Film {
    String title;
    String rating;
    int length;
    float rentalRate;
    int releaseYear;
    String category;


    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getRating() { return rating; }

    public void setRating(String rating) { this.rating = rating; }

    public int getLength() { return length; }

    public void setLength(int length) { this.length = length; }

    public float getRentalRate() { return rentalRate; }

    public void setRentalRate(float rentalRate) { this.rentalRate = rentalRate; }

    public int getReleaseYear() { return releaseYear; }

    public void setReleaseYear(int releaseYear) { this.releaseYear = releaseYear; }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", rating='" + rating + '\'' +
                ", length=" + length +
                ", rentalRate=" + rentalRate +
                ", releaseYear=" + releaseYear +
                ", category='" + category + '\'' +
                '}';
    }

    public Film(String title, String rating, int length, float rentalRate, int releaseYear , String category) {
        this.title = title;
        this.rating = rating;
        this.length = length;
        this.rentalRate = rentalRate;
        this.releaseYear = releaseYear;
        this.category = category;
    }
}
