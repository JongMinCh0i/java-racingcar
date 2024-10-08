package study.step_3.service;

import java.util.Random;

public class RaceCondition {

    private final Random random = new Random();

    public int getRandomValue(int bound) {
        return random.nextInt(bound);
    }

    public boolean canMove(int bound, int condition) {
        return getRandomValue(bound) >= condition;
    }

}
