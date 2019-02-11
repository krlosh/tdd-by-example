package guru.springframework;

import java.util.HashMap;

public class Bank {

    private HashMap<Pair, Integer> rateMap = new HashMap<>();

    public Money reduce(Expression expression, String toCurrency) {
        return expression.reduce(this, toCurrency);
    }

    public int rate(String from, String to){
        if(from.equalsIgnoreCase(to)) {
            return 1;
        }
        Integer rate  = this.rateMap.get(new Pair(from, to));

        return rate;
        //return (from.equalsIgnoreCase("CHF") && to.equalsIgnoreCase("USD"))?2:1;
    }

    public void addRate(String from, String to, int rate) {
        this.rateMap.put(new Pair(from,to), rate);
    }
}
