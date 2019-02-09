package guru.springframework;

public class Money {
    protected int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object obj) {
        return this.amount == ((Money) obj).amount && getClass().equals(obj.getClass());
    }
}
