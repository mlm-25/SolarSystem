package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        SolarSystem andromeda = new SolarSystem();
        andromeda.sun = 1;
        andromeda.planet = 2;
        andromeda.moon = 4;

        FeatureSun mikeSun = new FeatureSun();
        mikeSun.color = "Red";
        mikeSun.heat = "888881111111111111kj";
        mikeSun.temp = "600000454545454Kelvin";
        mikeSun.radius = "900000km";
        mikeSun.martialStatus = "in love with asghar";


        // adding planet 1 features
        Planet1 astro = new Planet1();
        astro.color = "grey";
        astro.relationshipStatus = "single";
        astro.size = "99889898989km";

        // planet 2 features
        Planet2 astro2 = new Planet2();
        astro2.color = "pink";
        astro2.size = "34343434333km";
        astro2.status = "same as MIKE's";


        Moon2 mooner = new Moon2();
        mooner.color = "noColor";
        mooner.size = "big";

        //moon 1 features
        Moon1 mooneyMike = new Moon1();
        mooneyMike.color = "red";
        mooneyMike.size = "negative";
        mooneyMike.rings = "6";
        mooneyMike.dob = "98";

        //mars
        Mars mars = new Mars();
        mars.color = "red";
        mars.size = "yes";

    }
}
