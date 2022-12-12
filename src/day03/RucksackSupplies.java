package day03;

import service.AocService;

import java.util.ArrayList;
import java.util.List;

public class RucksackSupplies {
    private final AocService aocService = new AocService();
    private final String INPUT_FILE = "src/inputs/inputDay03.txt";

    private final List<String> input;

    public RucksackSupplies() {
        this.input = aocService.readInputToList(INPUT_FILE);
    }

    private Character getCommonCharacter(String str1, String str2) {
        return str1.chars().mapToObj(c1 -> (char) c1)
                .filter(c1 -> str2.chars().mapToObj(c2 -> (char) c2).anyMatch(c2 -> c1 == c2))
                .findFirst()
                .orElse(null);
    }

    private Character getCommonCharacter(String str1, String str2, String str3) {
        for (int i = 0; i < str1.length(); i++) {
            if (str2.contains(""+str1.charAt(i)) && str3.contains(""+str1.charAt(i))) {
                return str1.charAt(i);
            }
        }
        return null;
    }

    private List<Character> getAllCommonCharacters() {
        List<Character> commonCharacters = new ArrayList<>();
        for (String line : input) {
            int lineLength = line.length();
            String firstHalf = line.substring(0, (lineLength/2));
            String secondHalf = line.substring(lineLength/2);

            commonCharacters.add(getCommonCharacter(firstHalf, secondHalf));
        }
        return commonCharacters;
    }

    private List<Character> getAllCommonCharactersForThreeLines() {
        List<Character> commonCharacter = new ArrayList<>();
        for (int i = 0; i < input.size() - 2; i+=3) {
            commonCharacter.add(getCommonCharacter(
                    input.get(i),
                    input.get(i+1),
                    input.get(i+2)
            ));
        }
        return commonCharacter;
    }

    public int getSumOfPriorities(boolean firstPart) {
        List<Character> commonCharacters = firstPart ? getAllCommonCharacters() : getAllCommonCharactersForThreeLines();
        int sum = 0;
        for (Character letter : commonCharacters) {
            if (Character.isUpperCase(letter)) {
                sum += letter - 'A' + 27;
            } else {
                sum += letter - 'a' + 1;
            }
        }
        return sum;
    }
}
