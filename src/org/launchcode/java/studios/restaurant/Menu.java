package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private ArrayList<MenuItem> menuItems;
    private Date lastUpdated;

    public Menu() {
        this.menuItems = new ArrayList<>();
        this.lastUpdated = new Date(); // present time
    }

    // add new item
    public void add(MenuItem m) {
        if(!menuItems.contains(m)){
            menuItems.add(m);
            this.lastUpdated = new Date();
        }
    }

    // remove item
    public void remove(MenuItem m) {
        menuItems.remove(m);
        this.lastUpdated = new Date();
    }

    // last updated
    public Date getLastUpdated() {
        return lastUpdated;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuItems=" + menuItems +
                ", lastUpdated=" + lastUpdated +
                '}';
    }

}
