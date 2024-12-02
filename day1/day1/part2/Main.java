package part2;

import helpers.FileParser;

import java.util.Collections;


public class Main {

    public static void main(String[] args) {
        System.out.println(parseFile());
    }

    public static int parseFile() {
        var lists = FileParser.parseFile("input.txt");
        int similarityScore = 0;
        for (String s : lists.get(0)) {
            similarityScore = similarityScore + (Integer.parseInt(s) * Collections.frequency(lists.get(1), s));
        }
        return similarityScore;
    }
}
