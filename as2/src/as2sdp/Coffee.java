package as2sdp;

public abstract class Coffee {
    String description = "Coffee";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
