package study.step_3.service;

public class RacingCar {

    private final RaceCondition raceCondition;
    private int distance;

    public RacingCar(RaceCondition randomRaceCondition) {
        this.raceCondition = randomRaceCondition;
        this.distance = 0;
    }

    public int drive(int bound, int condition) {
        if (raceCondition.canMove(bound, condition)) {
            move();
        }
        return distance;
    }

    private void move() {
        distance += 1;
    }
}
