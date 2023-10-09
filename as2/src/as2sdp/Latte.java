package as2sdp;

public class Latte extends Coffee {
    public Latte() {
        description = "Latte";
    }

    @Override
    public double cost() {
        return 2.49;
    }
}
