package com.example.klaviatureapp;

public class ColorChangeEvent {
    String color;

    public ColorChangeEvent(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
