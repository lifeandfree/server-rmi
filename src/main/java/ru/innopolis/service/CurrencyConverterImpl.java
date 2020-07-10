package ru.innopolis.service;

import ru.innopolis.common.CurrencyConverter;
import ru.innopolis.common.Money;

/**
 * CurrencyConverterImpl.
 *
 * @author lifeandfree
 */
public class CurrencyConverterImpl implements CurrencyConverter {
    @Override
    public double convert(double sum) {
        System.out.println("convert");
        return sum*75;
    }

    @Override
    public Money convertMoney(Money money) {
        System.out.println("convertMoney");
        money.setCurrencyName("USD");
        money.setSum(money.getSum()*75);
        return money;
    }
}
