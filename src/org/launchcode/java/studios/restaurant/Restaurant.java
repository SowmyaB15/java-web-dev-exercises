package org.launchcode.java.studios.restaurant;

public class Restaurant {

    public static void main(String[] args) {

        Menu lunchMenu = new Menu(); //

        MenuItem item1 = new MenuItem("Gobi Manchurian", 11.99, "Cauliflower bites", "appetizer");
        MenuItem item2 = new MenuItem("Naan", 2.49, "Flat Bread", "main course");
        MenuItem item3 = new MenuItem("Palak Paneer", 13.99, "Paneer cooked in Spinach gravy", "main course");
        MenuItem item4 = new MenuItem("Mango Pastry", 4.99, "Mango Ice-cream cake", "dessert");

        // add menu items
        lunchMenu.add(item1);
        lunchMenu.add(item2);
        lunchMenu.add(item3);
        lunchMenu.add(item4);
        System.out.println("Entire Menu: " + lunchMenu);

        System.out.println("Individual menu item: " + item4);

        lunchMenu.remove(item2);
        System.out.println("Updated Menu: " + lunchMenu);

    }

}

