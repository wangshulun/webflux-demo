package io.spring.workshop.stockquotes;

import lombok.Data;

import java.math.BigDecimal;
import java.math.MathContext;
import java.time.Instant;

@Data
public class Quote {

    private static final MathContext MATH_CONTEXT = new MathContext(2);

    private String ticker;

    private BigDecimal price;

    private Instant instant;

    public Quote() {
    }

    public Quote(String ticker, BigDecimal price) {
        this.ticker = ticker;
        this.price = price;
    }

    public Quote(String ticker, Double price) {
        this(ticker, new BigDecimal(price, MATH_CONTEXT));
    }

    @Override
    public String toString() {
        return "Quote{" +
                "ticker='" + ticker + '\'' +
                ", price=" + price +
                ", instant=" + instant +
                '}';
    }
}
