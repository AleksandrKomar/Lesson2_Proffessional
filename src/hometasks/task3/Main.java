package hometasks.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {

//        Collection
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Collection<Integer> linkedList = new LinkedList<>();

        System.out.println("Сколько чисел вы хотите ввести?");

        int a = Integer.parseInt(String.valueOf(reader.readLine()));

        if (a <= 0) {
            System.out.println("Число должно быть больше 0.");
            return;
        }

        getIntegerList(a, linkedList, reader);

        reader.close();

        for (Integer temp : linkedList) {
            System.out.print(temp + ", ");
        }

        System.out.println("\nМинимальное число списка - " + getMinimum(linkedList));

    }


    static void getIntegerList(int a, Collection<Integer> list, BufferedReader reader) throws IOException, NumberFormatException {

        System.out.println("Веедите " + a + " чисел(о/а).");

        int count = 0;

        while (count < a) {
            try {

                list.add(Integer.parseInt(String.valueOf(reader.readLine())));
                count++;
            } catch (NumberFormatException ex) {
                //пропуск пустышки
            }

        }
    }

    static Integer getMinimum(Collection<Integer> list) {
        return Collections.min(list);
    }

}
