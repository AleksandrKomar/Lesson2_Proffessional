package hometasks.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите семьи и города:");

        Map<String, String> addresses = new HashMap<>();

        while (true) {

            String city = reader.readLine();

            if (city.isEmpty()) break;

            String name = reader.readLine();

            if (!city.isEmpty() && !name.isEmpty()) {
                addresses.put(city, name);
            } else break;
        }

        System.out.print("Введите город: = ");

        String tempCity = reader.readLine();

        reader.close();

        for (Map.Entry<String, String> temp : addresses.entrySet()) {

            if (tempCity.equals(temp.getKey())) {
                System.out.println(temp.getValue());
            }
        }
    }

}
