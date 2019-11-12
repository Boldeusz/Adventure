package com.example.test;

import java.util.HashMap;
import java.util.Map;

public class Location {

    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int location, String description) {
        this.locationID = location;
        this.description = description;
        this.exits = new HashMap<String, Integer>();
    }
    public void addExit(String direction, int location){
        exits.put(direction,location);
    }

    public int getLocation() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
