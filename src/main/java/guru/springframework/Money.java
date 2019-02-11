package guru.springframework;

public class Money implements Expression {
    protected int amount;
    protected String currency;

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

    public Money times(int multiplier) {
        return new Money(this.amount* multiplier, this.currency);
    }

    @Override
    public boolean equals(Object obj) {
        Money money = ((Money) obj);
        return this.amount == money.amount && this.currency == money.currency;
    }

    @Override
    public Money reduce(Bank bank, String to) {
        Integer rate = bank.rate(this.currency, to);
        return new Money(this.amount/rate, to);
    }

    public  String currency(){
        return this.currency;
    }

    public Expression plus(Money addendum) {
        return new Sum(this, addendum);
    }
}
