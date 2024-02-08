import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();
        Map<String, Double> myCityTempMap = new HashMap<String, Double>();



        String city = "";

        while(!(city.equals("end"))) {
            System.out.println("Name a city, or type end to end");
            city = input.nextLine();
            if(city.equals("end"))
                break;
            cities.add(city);

        }

        System.out.println(cities);



        for (int i = 0; i < cities.size(); i++) {
            System.out.println("what is the first temp for " + cities.get(i));
            double num1 = input.nextInt();
            System.out.println("what is the second for " + cities.get(i));
            double num2 = input.nextInt();
            System.out.println("what is the third for " + cities.get(i));
            double num3 = input.nextInt();
            System.out.println("what is the fourth for " + cities.get(i));
            double num4 = input.nextInt();
            System.out.println("what is the fifth for " + cities.get(i));
            double num5 = input.nextInt();
            double average= mathStuff(num1, num2, num3, num4, num5)/5;
            temperatures.add(average);


        }


        for (int i = 0; i < temperatures.size(); i++){
            myCityTempMap.put(cities.get(i), temperatures.get(i));
        }

    mapPrint(myCityTempMap);


    }





    public static Scanner input = new Scanner(System.in);

    public static double mathStuff(double a, double b, double c, double d, double e){
       double numberThing = (a+b+c+d+e)/5;
       return numberThing;

    }

    public static void mapPrint (Map a){
        System.out.println(a);
    }


}




