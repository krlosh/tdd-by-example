package guru.springframework;

public class Money implements Expression {
    final int amount;
    private final String currency;

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }
    public static Money franc(int amount) {
        return new Money(amount,"CHF");
    }

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency= currency;
    }

    public Expression times(int multiplier) {
        return new Money(this.amount* multiplier, this.currency);
    }

    @Override
    public boolean equals(Object obj) {
        Money money = ((Money) obj);
        return this.amount == money.amount && this.currency.equals(money.currency);
    }

    @Override
    public Money reduce(Bank bank, String to) {
        int rate = bank.rate(this.currency, to);
        return new Money(this.amount/rate, to);
    }

    public  String currency(){
        return this.currency;
    }

    public Expression plus(Expression addendum) {
        return new Sum(this, addendum);
    }
}
