import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();





        String city = "";

        while(!(city.equals("end"))) {
            System.out.println("Name a city, or end to end");
            city = input.nextLine();
            cities.add(city);
        }

        for (int i = 0; i < cities.size(); i++) {
            System.out.println("what is the first temp");

        }

        cities.removeLast();
        System.out.println(cities);


        Map<String, ArrayList<Double>> myCityTempMap = new HashMap<>();

    }





    public static Scanner input = new Scanner(System.in);


    }




