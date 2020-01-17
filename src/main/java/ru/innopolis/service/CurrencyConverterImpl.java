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
        return sum*60;
    }

    @Override
    public Money convertMoney(Money money) {
        money.setCurrencyName("USD");
        money.setSum(money.getSum()*60);
        return money;
    }
}
