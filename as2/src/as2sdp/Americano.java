package as2sdp;

public class Americano extends Coffee {
    public Americano() {
        description = "Americano";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
