package bupt.pojo;

public class AnnualProfit {
    private int year; //年份
    private float indexIncome;
    private float trendIncome;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getIndexIncome() {
        return indexIncome;
    }

    public void setIndexIncome(float indexIncome) {
        this.indexIncome = indexIncome;
    }

    public float getTrendIncome() {
        return trendIncome;
    }

    public void setTrendIncome(float trendIncome) {
        this.trendIncome = trendIncome;
    }
    @Override
    public String toString() {
        return "AnnualProfit [year=" + year + ", indexIncome=" + indexIncome + ", trendIncome=" + trendIncome + "]";
    }
}
