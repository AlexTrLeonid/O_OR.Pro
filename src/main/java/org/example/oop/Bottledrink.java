package org.example.oop;

import java.math.BigDecimal;

/**
 * Класс Бутылочных напитков
 */
public class Bottledrink extends Drinks {
    /**
     * Перегруженный конструктор класса Бутылочный напиток
     *
     * @param name   Наименование напитка
     * @param price  Стоимость напитка
     * @param volume Объем напитка
     */
    public Bottledrink(String name, BigDecimal price, Double volume) {
        super(name, price, volume);
    }
}
