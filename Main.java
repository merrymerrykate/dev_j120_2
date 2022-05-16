package com.company;

public class Main {

    public static void main(String[] args) throws StringArrayException {
        String[] excArray1 = null;
        String[] excArray2 = new String[0];
        String[] defArray = {"Василий", "Иван", "Петр", "Геннадий", "Анна", "Наталия"};
        String def = "Лошауоатыт";

        String[] sortArray = StringService.sort(defArray, true);
        for (String word : sortArray) {
            System.out.print(word + " ");
        }
        System.out.println();
        sortArray = StringService.sort(defArray, false);
        for (String word : sortArray) {
            System.out.print(word + " ");
        }

        System.out.println();

        System.out.println(StringService.getCharStat(def));
    }
}
