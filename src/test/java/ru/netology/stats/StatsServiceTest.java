package ru.netology.stats;

import org.junit.jupiter.api.Test;

import java.security.SecureRandom;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    @Test
    public void checkSalesSum() {
        StatsService statSum = new StatsService();
        int expected = 180;
        int actual = statSum.salesSum(salesByMonth);
        assertEquals(expected, actual);
    }
    @Test
    public void checkSalesAverage() {
        StatsService statsAverage = new StatsService();
        int expected = 15;
        int actual = statsAverage.salesAverage(salesByMonth);
        assertEquals(expected, actual);
    }

    @Test
    public void checkSalesMax() {
        StatsService statMax = new StatsService();
        int expected = 8;
        int actual = statMax.salesMax(salesByMonth);
        assertEquals(expected, actual);
    }

    @Test
    public void checkSalesMin() {
        StatsService statMin = new StatsService();
        int expected = 9;
        int actual = statMin.salesMin(salesByMonth);
        assertEquals(expected, actual);
    }

    @Test
    public void checkSalesLowAverage() {
        StatsService statLowAverage = new StatsService();
        int expected = 5;
        int actual = statLowAverage.countSalesLowAverage(salesByMonth);
        assertEquals(expected, actual);
    }

    @Test
    public void checkSalesUpperAverage() {
        StatsService statUpperAverage = new StatsService();
        int expected = 5;
        int actual = statUpperAverage.countSalesUpperAverage(salesByMonth);
        assertEquals(expected, actual);
    }
}