package day01;

import service.AocService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class ElfService {
    private List<Elf> elves;
    private List<Integer> sum;

    private final AocService aocService = new AocService();
    private final String INPUT_FILE = "src/inputs/inputDay01.txt";

    public ElfService() {
        setUpElves();
        setSums();
    }

    private void setUpElves() {
        elves = new ArrayList<>();

        List<String> input = aocService.readInputToList(INPUT_FILE);
        List<String> calories = new ArrayList<>();

        for (String s : input) {
            if (s.matches("\\s*")) {
                elves.add(new Elf(aocService.convertStringToInt(calories)));
                calories.clear();
            } else {
                calories.add(s);
            }
        }
    }

    private void setSums() {
        sum = new ArrayList<>();
        for (Elf elf : elves) {
            sum.add(
                    elf.getCalories().stream().mapToInt(j -> j).sum());
        }
    }

    public int getBiggestAmountOfCalories() {
        return sum.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElseThrow(NoSuchElementException::new);
    }

    public int getSumOfThreeBiggestAmountOfCalories() {
        return sum.stream()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .limit(3)
                .sum();
    }
}
