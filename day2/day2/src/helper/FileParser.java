package helper;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileParser {
    private static final String SPLITTER = " ";

    public static List<Integer[]> loadFile(String filepath){
        try{
            var inputStream = new FileInputStream(filepath);
            List<Integer[]> reports = new ArrayList<>();
            var reader = new BufferedReader(new InputStreamReader(inputStream));
            reader.lines().map(line -> line.split(SPLITTER)).forEach( report ->
               reports.add(Arrays.stream(report).map(Integer::valueOf).toArray(Integer[]::new))
            );
            return reports;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
