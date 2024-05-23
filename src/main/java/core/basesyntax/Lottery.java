package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BOUND = 100;

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), getRandomNumber());
    }

    private int getRandomNumber() {
        return random.nextInt(BOUND) + 1;
    }
}
