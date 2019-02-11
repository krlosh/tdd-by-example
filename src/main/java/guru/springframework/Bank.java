package guru.springframework;

import java.util.HashMap;

class Bank {

    private final HashMap<Pair, Integer> rateMap = new HashMap<>();

    Money reduce(Expression expression, String toCurrency) {
        return expression.reduce(this, toCurrency);
    }

    public int rate(String from, String to){
        if(from.equalsIgnoreCase(to)) {
            return 1;
        }
        return this.rateMap.get(new Pair(from, to));

    }

    public void addRate(String from, String to, int rate) {
        this.rateMap.put(new Pair(from,to), rate);
    }
}
