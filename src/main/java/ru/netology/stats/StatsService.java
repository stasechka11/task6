package ru.netology.stats;

public class StatsService {
    //Метод расчета суммы всех продаж
    public long getTotalSales(long[] monthSalesArray) {
        long totalSales = 0;

        for (long monthSale : monthSalesArray) {
            totalSales += monthSale;
        }

        return totalSales;
    }

    //Метод расчета средней суммы продаж в месяц
    public long getAverageSales(long[] monthSalesArray) {
        return getTotalSales(monthSalesArray) / monthSalesArray.length;
    }

    //Метод расчета номера месяца, в котором был пик продаж
    public int getMaxSales(long[] monthSalesArray) {
        int maxMonth = 0;

        for (int i = 0; i < monthSalesArray.length; i++) {
            if (monthSalesArray[i] >= monthSalesArray[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }
}
