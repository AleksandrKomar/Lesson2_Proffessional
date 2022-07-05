package hometasks.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;

public class Main {

    private static final String FINISH = "end";

    public static void main(String[] args) throws IOException {

        System.out.println("\t\t\tВводите слова:" +
                "\nКогда введете 'end' - можно посмотреть результат.");

        BufferedReader builder = new BufferedReader(new InputStreamReader(System.in));

        Collection<String> list = new ArrayList<>();

        while (true) {

            String ss = builder.readLine();
            //обход переноса строки
            if (ss == null || ss.length() == 0) continue;

            if (ss.toLowerCase().trim().equals(FINISH)) break;

            list.add(ss);

        }

        builder.close();

        for (String s : list) {
            System.out.println(s);
        }

    }

}
