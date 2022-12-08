import day01.ElfService;

public class Main {
    private static final ElfService elfService = new ElfService();
    public static void main(String[] args) {
        //day 01 - part 1
        System.out.printf("Day 1 part 1 -> %s%n", elfService.getBiggestAmountOfCalories());

        //day 01 - part 2
        System.out.printf("Day 1 part 2 -> %s%n", elfService.getSumOfThreeBiggestAmountOfCalories());
    }
}
