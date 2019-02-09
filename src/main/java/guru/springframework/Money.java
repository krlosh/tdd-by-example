package guru.springframework;

public abstract class Money {
    protected int amount;

    public static Money dollar(int amount) {
        return new Dollar(amount);
    }
    public static Money franc(int amount) {
        return new Franc(amount);
    }

    public Money(int amount) {
        this.amount = amount;
    }

    public abstract Money times(int amount);

    @Override
    public boolean equals(Object obj) {
        return this.amount == ((Money) obj).amount && getClass().equals(obj.getClass());
    }
}
