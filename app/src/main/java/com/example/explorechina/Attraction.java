package com.example.explorechina;

public class Attraction {
    private int id;
    private String title;
    private String description;
    private String location;
    private String ticketPrice;
    private String openingHours;
    private String culturalInfo;
    private int imageResId;

    public Attraction(int id, String title, String description, String location, 
                     String ticketPrice, String openingHours, String culturalInfo, int imageResId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.location = location;
        this.ticketPrice = ticketPrice;
        this.openingHours = openingHours;
        this.culturalInfo = culturalInfo;
        this.imageResId = imageResId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public String getTicketPrice() {
        return ticketPrice;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public String getCulturalInfo() {
        return culturalInfo;
    }

    public int getImageResId() {
        return imageResId;
    }
}
