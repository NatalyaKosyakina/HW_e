package org.example.HWe3;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = false;
        System.out.println("Требуется ввести данные: Форматы данных:\n" +
                "фамилия, имя, отчество - строки\n" +
                "дата рождения - строка формата dd.mm.yyyy\n" +
                "номер телефона - целое беззнаковое число без форматирования\n" +
                "пол - символ латиницей f или m. ");
        Scanner scanner = new Scanner(System.in);
        User user = new User();

        while (!flag) {
            String data = scanner.nextLine();
            if (data.contains(" ")) {
                String[] parts = data.split(" ");
                for (int i = 0; i < parts.length; i++) {
                    user.define(parts[i]);
                }
            } else {
                user.define(data);
            }
            flag = user.checkComplete();
            if (!flag){
                user.whatToAdd();            }
            System.out.println(user);
        }
        user.save();
    }

}