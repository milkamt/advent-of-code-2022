import day01.ElfService;
import day02.RockPaperScissors;

public class Main {
    private static final ElfService elfService = new ElfService();
    private static final RockPaperScissors rockPaperScissors = new RockPaperScissors();
    public static void main(String[] args) {
        //day 01 - part 1
        System.out.printf("Day 1 part 1 -> %s%n", elfService.getBiggestAmountOfCalories());

        //day 01 - part 2
        System.out.printf("Day 1 part 2 -> %s%n", elfService.getSumOfThreeBiggestAmountOfCalories());

        //day 02
        System.out.printf("Day 2 -> %s%n", rockPaperScissors.getScore());
    }
}
