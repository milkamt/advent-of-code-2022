package day02;

import service.AocService;

import java.util.List;

public class RockPaperScissors {
    private final AocService aocService = new AocService();
    private final String INPUT_FILE = "src/inputs/inputDay02.txt";

    private final List<String> input;

    public RockPaperScissors() {
        input = aocService.readInputToList(INPUT_FILE);
    }

    public int getScore() {
        int score = 0;

        for (String s : input) {
            String[] gameInputs = s.split("\\s");

            switch (gameInputs[0]) {
                case "A" -> {
                    if (gameInputs[1].equals("X")) {
                        score += 3;
                    }
                    if (gameInputs[1].equals("Y")) {
                        score += 4;
                    }
                    if (gameInputs[1].equals("Z")) {
                        score += 8;
                    }
                }
                case "B" -> {
                    if (gameInputs[1].equals("X")) {
                        score += 1;
                    }
                    if (gameInputs[1].equals("Y")) {
                        score += 5;
                    }
                    if (gameInputs[1].equals("Z")) {
                        score += 9;
                    }
                }
                case "C" -> {
                    if (gameInputs[1].equals("X")) {
                        score += 2;
                    }
                    if (gameInputs[1].equals("Y")) {
                        score += 6;
                    }
                    if (gameInputs[1].equals("Z")) {
                        score += 7;
                    }
                }
            }
        }
        return score;
    }
}
