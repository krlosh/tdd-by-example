package guru.springframework;

public class Franc extends Money {

    public Franc(int amount) {
        super(amount);
    }

    Franc times(int multiplier) {
        return new Franc(this.amount * multiplier);
    }

}
