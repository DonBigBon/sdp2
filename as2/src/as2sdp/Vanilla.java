package as2sdp;

public class Vanilla extends CondimentDecorator {
    public Vanilla(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Vanilla";
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.75;
    }
}