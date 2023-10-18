package transmission;

public class AutomaticTransmission implements Transmission {

    private static int speed[];
    private int currentSpeed;
    private int gear;

    public AutomaticTransmission(int s1, int s2, int s3, int s4, int s5) {
        if (s1 <= 0 || s2 <= s1 || s3 <= s2 || s4 <= s3 || s5 <= s4) {
            throw new IllegalArgumentException();
        }
        speed = new int[] { s1, s2, s3, s4, s5 };
        currentSpeed = 0;
        gear = 0;
    }

    private void resetGear() {
        gear = 1;
        for (int i = 0; i < 5; i++) {
            if (currentSpeed >= speed[i]) {
                gear++;
            }
        }
    }

    public Transmission increaseSpeed() {
        currentSpeed += 2;
        resetGear();
        return this;
    }

    public Transmission decreaseSpeed() {
        if (currentSpeed < 2) {
            throw new IllegalStateException();
        }
        currentSpeed -= 2;
        resetGear();
        return this;
    }

    @Override
    public String toString() {
        return "Transmission (speed = " + currentSpeed + ", gear = " + gear + ")";
    }

    public int getSpeed() {
        return currentSpeed;
    }

    public int getGear() {
        return gear;
    }
}

