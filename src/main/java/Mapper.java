package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Mapper {


    public void mapData(List<String> inputs,  Map<String, List<String>> distanceCombMap,Map<String,List<String>> distanceMap){


        try {
            for (String input : inputs) {
                String inputArr[] = input.split(" ");
                int count = 2;
                while (count < inputArr.length) {
                    StringBuilder builder = new StringBuilder();
                    for (int i = 2; i < inputArr.length; i++) {
                        if (count == i) {
                            builder.append(".");
                        } else {
                            builder.append(inputArr[i]);
                        }
                    }
                    String res = builder.toString();
                    if (distanceCombMap.get(res) == null) {
                        List<String> list = new ArrayList<>();
                        list.add(input);
                        distanceCombMap.put(res, list);
                        List<String> val = new ArrayList<>();
                        val.add(inputArr[count]);
                        distanceMap.put(res, val);
                    } else {
                        distanceCombMap.get(res).add(input);
                        distanceMap.get(res).add(inputArr[count]);
                    }
                    count++;
                }

            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
