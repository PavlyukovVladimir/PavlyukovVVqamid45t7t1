package ru.netology.stats;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    private int[] testSales;

    private StatsService service;

    @BeforeEach
    void setUp() {
        testSales = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        service = new StatsService();
    }

    @Test
    void sumSales() {
        int expected = 180;
        int actual = service.sumSales(testSales);
        assertEquals(expected, actual, "Сумма продаж не соответствует ожиданию");
    }

    @Test
    void averageSales() {
        double expected = 15.0;
        double actual = service.averageSales(testSales);
        assertEquals(expected, actual, "Средние продажи не соответствуют ожиданию");
    }

    @Test
    void maxSalesMonthNumber() {
        int expected = 8;
        int actual = service.maxSalesMonthNumber(testSales);
        assertEquals(expected, actual, "Номер месяца крайних максимальных продаж не соответствует ожиданию");
    }

    @Test
    void minSalesMonthNumber() {
        int expected = 8;
        int actual = service.maxSalesMonthNumber(testSales);
        assertEquals(expected, actual, "Номер месяца крайних минимальных продаж не соответствует ожиданию");
    }

    @Test
    void lessAverageSalesCount() {
        int expected = 5;
        int actual = service.lessAverageSalesCount(testSales);
        assertEquals(expected, actual, "Количество месяцев с продажами ниже среднего не соответствует ожиданию");
    }

    @Test
    void moreAverageSalesCount() {
        int expected = 5;
        int actual = service.moreAverageSalesCount(testSales);
        assertEquals(expected, actual, "Количество месяцев с продажами выше среднего не соответствует ожиданию");
    }
}