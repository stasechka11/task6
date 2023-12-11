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
    public int getMaxSalesMonthNumber(long[] monthSalesArray) {
        int maxSalesMonthNumber = 0;

        for (int i = 0; i < monthSalesArray.length; i++) {
            if (monthSalesArray[i] >= monthSalesArray[maxSalesMonthNumber]) {
                maxSalesMonthNumber = i;
            }
        }

        return maxSalesMonthNumber + 1;
    }

    //Метод расчета номера месяца, в котором был минимум продаж
    public int getMinSalesMonthNumber(long[] monthSalesArray) {
        int minMonthSalesNumber = 0;

        for (int i = 0; i < monthSalesArray.length; i++) {
            if (monthSalesArray[i] <= monthSalesArray[minMonthSalesNumber]) {
                minMonthSalesNumber = i;
            }
        }

        return minMonthSalesNumber + 1;
    }

    //Метод расчета количества месяцев, в которых продажи были ниже среднего
    public int getBelowAverageMonthCount(long[] monthSalesArray) {
        int belowAverageMonthCounter = 0;
        long averageSales = getAverageSales(monthSalesArray);

        for (long monthSales : monthSalesArray) {
            if (monthSales < averageSales) {
                belowAverageMonthCounter++;
            }
        }
        return belowAverageMonthCounter;
    }
}
