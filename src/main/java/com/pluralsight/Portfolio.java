package com.pluralsight;

import java.util.ArrayList;

public class Portfolio implements Valuable {
    private String name;
    private String owner;
    private ArrayList<Valuable> valuables;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.valuables = new ArrayList<>();
    }

    public void addValuable(Valuable valuable) {
        valuables.add(valuable);

    }

    public ArrayList getAssets() {
        return valuables;
    }

    public ArrayList getMostValuable() {
        double higestvalue = 0;

        for (Valuable valuable : valuables) {
            if (valuable.getValue() > higestvalue) {
                higestvalue = valuable.getValue();
            }
//            return valuables;
        }
        System.out.println("Highest value: " + higestvalue);
        return valuables;
    }


    public ArrayList getLeastValuable() {
        if (valuables.isEmpty());
        Valuable leastValuable = valuables.get(0);

        for (Valuable valuable : valuables) {
            if (valuable.getValue() < leastValuable.getValue()) {
                leastValuable = valuable;
            }
        }
        System.out.println("Lowest value: "+leastValuable);
        return valuables;
    }

    @Override
    public double getValue() {
        double total = 0;
        for (Valuable valuable : valuables) {
            total += valuable.getValue();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Portfolio: " +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", valuables=" + valuables;
    }
}
