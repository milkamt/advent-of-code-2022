package day01;

import java.util.ArrayList;
import java.util.List;

public class Elf {
    List<Integer> calories;

    public Elf() {
        calories = new ArrayList<>();
    }

    public Elf(List<Integer> calories) {
        this.calories = calories;
    }

    public List<Integer> getCalories() {
        return calories;
    }

    public void setCalories(List<Integer> calories) {
        this.calories = calories;
    }
}
