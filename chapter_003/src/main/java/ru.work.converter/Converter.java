package ru.work.converter;


/**
 * Class Класс для конвертирования валют
 * @author Alex Ivts
 * @since 03.04.2019
 * @version 1
 */

public class Converter {


    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rurToEur(int value) {
        return value / 70;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары.
     */
    public int rurToUsd(int value) {
        return value / 60;
    }

    /**
     * Конвертируем евро в рубли.
     * @param value евро.
     * @return Рубли.
     */
    public int eurToRur(int value) {
        return value * 70;
    }

    /**
     * Конвертируем доллары в рубли.
     * @param value доллары.
     * @return Рубли.
     */
    public int usdToRur(int value) {
        return value * 60;
    }
}
