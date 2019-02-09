package guru.springframework;

public abstract class Money {
    protected int amount;
    protected String currency;

    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }
    public static Money franc(int amount) {
        return new Franc(amount,"CHF");
    }

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency= currency;
    }

    public abstract Money times(int amount);

    @Override
    public boolean equals(Object obj) {
        return this.amount == ((Money) obj).amount && getClass().equals(obj.getClass());
    }

    public  String currency(){
        return this.currency;
    }
}
