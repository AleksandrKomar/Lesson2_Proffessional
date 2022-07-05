package hometasks.task2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Введи 5 слов:");
        BufferedReader builder = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>(5);

        int i = 0;

        while (i < 5) {

            String ss = builder.readLine();
            //обход переноса строки
            if (ss == null || ss.length() == 0) continue;

            list.add(i, ss);
            i++;
        }

        builder.close();

        System.out.println("-----Вывод списка после ввода значений пользователем-----");
        for (String s : list) {
            System.out.println(s);
        }

        doubleValues(list);

        System.out.println("-----Вывод списка после удвоения-----");
        for (String s : list) {
            System.out.println(s);
        }

    }

    public static void doubleValues(ArrayList<String> list) {

        if (list == null) return;

        for (int j = 0; j < list.size(); j++) {
            String s = list.get(j);
            list.set(j, s.concat(s));
        }

    }

}
