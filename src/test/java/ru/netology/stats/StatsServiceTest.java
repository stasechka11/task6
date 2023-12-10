package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldFindTotalSales() {
        StatsService statsService = new StatsService();

        long[] monthSalesArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedTotalSales = 180;
        long actualTotalSales = statsService.getTotalSales(monthSalesArray);

        Assertions.assertEquals(expectedTotalSales, actualTotalSales);
    }

    @Test
    public void shouldFindAverageSales() {
        StatsService statsService = new StatsService();

        long[] monthSalesArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverageSales = 15;
        long actualAverageSales = statsService.getAverageSales(monthSalesArray);

        Assertions.assertEquals(expectedAverageSales, actualAverageSales);
    }

    @Test
    public void shouldFindMaxMonth() {
        StatsService statsService = new StatsService();

        long[] monthSalesArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxSales = 8;
        int actualMaxSales = statsService.getMaxSales(monthSalesArray);

        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }
}
