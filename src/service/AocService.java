package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AocService {
    public List<String> readInputToList(String filePath) {
        List<String> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while (br.ready()) {
                list.add(br.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    public List<Integer> convertStringToInt(List<String> s) {
        return s.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
