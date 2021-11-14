package ru.netology.stats;

public class StatsService {
    public int sum;
    public  int salesSum(int[] salesByMonth) {
        for (int monthSale : salesByMonth) {
            sum += monthSale;
        }
        return sum;
    }

    int averageSales;
    public int salesAverage(int[] salesByMonth) {
        StatsService statSum = new StatsService();
        averageSales = statSum.salesSum(salesByMonth) / salesByMonth.length;
        return averageSales;
    }

    int monthNumberForMax = 0;
    int maxSaleMonthNumber = 0;
    public int salesMax(int[] salesByMonth) {
        for (int month : salesByMonth) {
            if (month >= salesByMonth[maxSaleMonthNumber]) {
                maxSaleMonthNumber = monthNumberForMax;
            }
            monthNumberForMax++;
        }
        return ++maxSaleMonthNumber;
    }

    int monthNumberForMin;
    int minSaleMonthNumber = 0;
    public int salesMin(int[] salesByMonth) {
        for (int month : salesByMonth) {
            if (month <= salesByMonth[minSaleMonthNumber]) {
                minSaleMonthNumber = monthNumberForMin;
            }
            monthNumberForMin++;
        }
        return ++minSaleMonthNumber;
    }

    int countLowAverage;
    public  int countSalesLowAverage(int[] salesByMonth) {
        for (int month : salesByMonth) {
            if (month < salesAverage) {
                countLowAverage++;
            }
        }
        return countLowAverage;
    }

    int salesAverage = 15;
    int countUpperAverage;
    public  int countSalesUpperAverage(int[] salesByMonth) {
        for (int month : salesByMonth) {
            if (month > salesAverage) {
                countUpperAverage++;
            }
        }
        return countUpperAverage;
    }


}