package main.java;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Driver {

    public static void main(String[] args) throws IOException {

        // It will read the data from input file
        Reader readFile = new Reader();
        List<String> inputs = readFile.readFileData();

        // It will map the input data in a map to solve the problem
        Mapper mapper = new Mapper();

        // It stores each line except timestamp replacing one word of a sentence at a time to "." and storing that sentence in a key
        // and value will contain list of similar words having similar key
        Map<String,List<String>> distanceCombMap = new LinkedHashMap<>();

        // Storing above key with the list of exact word changed
        Map<String,List<String>> distanceMap = new LinkedHashMap<>();
        mapper.mapData(inputs,distanceCombMap,distanceMap);

        // It will fetch the map data and reduce that data and write into a file
        Writer writer = new Writer();
        writer.writeData(distanceCombMap,distanceMap);
    }

}