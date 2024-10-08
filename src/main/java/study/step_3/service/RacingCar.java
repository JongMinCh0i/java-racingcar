package study.step_3.service;

import java.util.Random;

public class RacingCar {

    private int distance = 0;
    private final Random random = new Random();

    public int drive(int bound, int condition) {
        if (canMove(bound, condition)) {
            move();
        }
        return distance;
    }

    public int getRandomValue(int bound) {
        return random.nextInt(bound);
    }

    private boolean canMove(int bound, int condition) {
        return getRandomValue(bound) >= condition;
    }

    private void move() {
        distance += 1;
    }
}
