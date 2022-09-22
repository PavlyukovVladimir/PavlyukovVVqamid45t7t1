package ru.netology.stats;

import java.util.Arrays;
import java.util.OptionalDouble;


public class StatsService {

    public int sumSales(int[] sales) {
        if (sales == null) {
            return 0;
        }
        if (sales.length == 0) {
            return 0;
        }
        return Arrays.stream(sales).sum();
    }

    public double averageSales(int[] sales) {
        if (sales == null) {
            return 0.0;
        }
        if (sales.length == 0) {
            return 0.0;
        }
        OptionalDouble average = Arrays.stream(sales).average();
        if (average.isEmpty()) {
            return 0.0;
        }
        return average.getAsDouble();
    }

    public int maxSalesMonthNumber(int[] sales) {
        if (sales == null) {
            return -1;
        }
        if (sales.length == 0) {
            return -1;
        }
        int maxSalesNumber = sales.length - 1;
        for (int i = maxSalesNumber; i >= 0; i--) {
            if (sales[i] > sales[maxSalesNumber]) {
                maxSalesNumber = i;
            }
        }
        return ++maxSalesNumber;
    }

    public int minSalesMonthNumber(int[] sales) {
        if (sales == null) {
            return -1;
        }
        if (sales.length == 0) {
            return -1;
        }
        int minSalesNumber = sales.length - 1;
        for (int i = minSalesNumber; i >= 0; i--) {
            if (sales[i] < sales[minSalesNumber]) {
                minSalesNumber = i;
            }
        }
        return ++minSalesNumber;
    }

    public int lessAverageSalesCount(int[] sales) {
        if (sales == null) {
            return 0;
        }
        int count = 0;
        double average = averageSales(sales);
        for (int i : sales) {
            if ((double) i < average) {
                count++;
            }
        }
        return count;
    }

    public int moreAverageSalesCount(int[] sales) {
        if (sales == null) {
            return 0;
        }
        int count = 0;
        double average = averageSales(sales);
        for (int i : sales) {
            if ((double) i > average) {
                count++;
            }
        }
        return count;
    }
}
