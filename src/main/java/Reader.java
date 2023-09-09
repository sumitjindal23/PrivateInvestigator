package main.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {


    public List<String> readFileData() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(
                "src/main/resource/input/private_investigator.txt"));
        List<String> inputs = new ArrayList<>();
        try {
            String line = reader.readLine();
            while (line != null) {
                inputs.add(line);
                line = reader.readLine();
            }
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }
        return inputs;
    }
}
