package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        StringBuilder resultBuilder = new StringBuilder();
        char symbol = input.charAt(0);
        int counter = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
            } else {
                if (counter == 1) {
                    resultBuilder.append(symbol);
                } else {
                    resultBuilder.append(symbol).append(counter);
                }
                symbol = input.charAt(i);
                counter = 1;
            }
        }
        if (counter == 1) {
            resultBuilder.append(symbol);
        } else {
            resultBuilder.append(symbol).append(counter);
        }
        return resultBuilder.toString();
    }
}
