package main.java;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.util.List;
import java.util.Map;

public class Writer {


    public void writeData(Map<String, List<String>> distanceCombMap, Map<String,List<String>> distanceMap) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(new File("src/main/resource/output/private_investigator.txt").toPath())));
        try {
            for(Map.Entry<String,List<String>> e : distanceCombMap.entrySet()){
                if(e.getValue().size()>1){
                    e.getValue().forEach(s -> {
                        try {
                            bw.write(s);
                            bw.newLine();
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    });
                    bw.write("The changing word was:"+String.join(",", distanceMap.get(e.getKey())));
                    bw.newLine();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bw.close();
        }
    }
}
