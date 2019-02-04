package com.company;
public class Main
{

    public static void main(String[] args)
    {

        Planet planet1 = new Planet("Pluto");
        Planet planet2 = new Planet("Mercury");
        Planet planet3 = new Planet("Venus");
        Planet planet4 = new Planet("Earth");
        Planet planet5 = new Planet("Mars");
        Planet planet6 = new Planet("Jupiter");
        Planet planet7 = new Planet("Saturn");
        Planet planet8 = new Planet("Uranus");
        Planet planet9 = new Planet("Neptune");

        Planet[] planets = new Planet[9];
        planets[0] = planet1;
        planets[1] = planet2;
        planets[2] = planet3;
        planets[3] = planet4;
        planets[4] = planet5;
        planets[5] = planet6;
        planets[6] = planet7;
        planets[7] = planet8;
        planets[8] = planet9;

        //System.out.println(planet1.getName());

        printArray(planets);
    }

   private static void printArray(Planet[] planets)
    {
        for (int i = 0; i < planets.length; i++ )
        {
            System.out.println(planets[i].getName());
        }

        /*for (Planet planet: planets)
        {
            String name = planet.getName();
            System.out.println(name);
        }
        */
    }

}
