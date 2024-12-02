package part1;

import helpers.FileParser;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println(parseFile());
    }

    public static int parseFile() {

        var lists = FileParser.parseFile("input.txt");
        Collections.sort(lists.get(0));
        Collections.sort(lists.get(1));
        int result = 0;
        for (int i = 0; i < lists.get(0).size(); i++) {
            var subtraction = Integer.parseInt(lists.get(0).get(i)) - Integer.parseInt(lists.get(1).get(i));
            if (subtraction < 0) {
                subtraction *= -1;
            }
            result += subtraction;
        }
        return result;
    }
}
