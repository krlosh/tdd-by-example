package guru.springframework;

public class Bank {
    public Money reduce(Expression expression, String toCurrency) {
        return expression.reduce(toCurrency);
    }
}
