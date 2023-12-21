package org.example.oop;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс торгового автомата бутылочной воды
 */
public class Vendingmachineofbottleddrink implements Vendingmachine {
    List<Bottledrink> bottledrinkList = new ArrayList<>();

    /**
     * Переопределенный метод внесения продуктов в автомат
     */
    @Override
    public void initProduct() {
    }

    /**
     * Перегруженный метод внесения бутылочной воды
     *
     * @param bottle Лист экземпляров класса бутылочной воды
     */
    public void initProduct(List<Bottledrink> bottle) {
        this.bottledrinkList = bottle;
    }

    /**
     * Переопределенный метод получения продуктов из автомата
     *
     * @return null
     */
    @Override
    public String getProduct() {
        return null;
    }

    /**
     * Перегруженный метод получения бутилированной воды
     *
     * @param name наименование нужной воды
     * @return в строковом виде содержимое экземпляра класса BottleOfWater, или не найдено.
     */
    public String getProduct(String name) {
        for (Bottledrink el : bottledrinkList) {
            if (el.getName().equals(name)) return el.toString();
        }
        return "Не найдено";
    }
}
