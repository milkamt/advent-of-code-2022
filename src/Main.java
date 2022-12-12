import day03.RucksackSupplies;


public class Main {
    private static final RucksackSupplies rucksackSupplies = new RucksackSupplies();

    public static void main(String[] args) {

        // day 03 - part 1
        System.out.printf("Day 3 part 1 -> %d%n", rucksackSupplies.getSumOfPriorities(true));

        //day 03 - part 2
        System.out.printf("Day 3 part 2 -> %d%n", rucksackSupplies.getSumOfPriorities(false));
    }
}
