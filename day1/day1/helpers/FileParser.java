package helpers;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileParser {

    private static final String SPLITTER = " {3}";

    public static List<List<String>> parseFile(String filepath){
        try{
            InputStream file = new FileInputStream(filepath);
            BufferedReader reader = new BufferedReader(new InputStreamReader(file));
            ArrayList<String> leftList = new ArrayList<>();
            ArrayList<String> rightList = new ArrayList<>();
            reader.lines().map(line -> line.split(SPLITTER)).forEach(results -> {
                leftList.add(results[0]);
                rightList.add(results[1]);
            });
            return List.of(leftList,rightList);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
