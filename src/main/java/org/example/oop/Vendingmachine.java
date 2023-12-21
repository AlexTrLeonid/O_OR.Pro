package org.example.oop;

/**
 * Интерфейс торгового автомата
 */
public interface Vendingmachine {
    /**
     * Внесение продуктов в торговый автомат
     */
    void initProduct();

    /**
     * Получение продукта из торгового автомата
     *
     * @return строку
     */
    String getProduct();
}
