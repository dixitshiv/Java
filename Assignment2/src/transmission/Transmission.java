package transmission;
public interface Transmission {
    public Transmission increaseSpeed();

    public Transmission decreaseSpeed();

    public int getGear();

    public int getSpeed();
}