package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        SolarSystem andromeda = new SolarSystem();
        andromeda.sun = 1;
        andromeda.planet = 2;
        andromeda.moon = 4;

        FeatureSun mikeSun = new FeatureSun();
        mikeSun.color = "blue";
        mikeSun.heat = "60000003434kj";
        mikeSun.temp = "5 Celsius";
        mikeSun.radius = "0.0009";
        mikeSun.martialStatus = "single";

    }
}
