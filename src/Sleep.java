import java.util.ArrayList;

public class Sleep {
    private ArrayList<Double> lastSevenDays;
    private ArrayList<Integer> timetoSleep;
    //private ArrayList<Double> oldLastSevenDays;
    //private ArrayList<Integer> oldTimetoSleep;
    private double lastAssessment;
    private double regularity;
    public int getRegularity(){
        int compare = timetoSleep.get(3);
        int mark = 1;
        for(Integer day: timetoSleep) {
            if (((day + 1) >= compare) && ((day - 1) <= compare)) {
                mark += 1;
            }
        }
        return mark;
    }
    //public int compareTwoWeeks(ArrayList<Double> lastSevenDays, ArrayList<Integer> timetoSleep, )
    public Double getAverage() {
        double sum = 0.0;
        for(Double day: lastSevenDays) {
            sum += day;
        }
        return sum / 7;
    }
    public void addToday(Double todaySleep, Integer todayTime) {
        if (lastSevenDays.size() == 7) {
            lastSevenDays.remove(0);
        }
        if (timetoSleep.size() == 7) {
            timetoSleep.remove(0);
        }
        lastSevenDays.add(todaySleep);
        timetoSleep.add(todayTime);
    }
    public void printStats(double average, int regularity, double overallMark) {
        System.out.println("Your statistics for last seven days' sleep: \n\t" +
                "Average duration: " + average + "\n\t Regularity(from 1 to 8): " + regularity +
                "\n\t Overall mark (from 31.25 to 100): " + overallMark);
    }
    public double assessSleep(double average, int regularity, int age) {
        double overallMark;
        double durationMark = 0;
        if(age < 16) {
            if (average > 8.0 && average < 10.0) {
                durationMark = 10;
            } else {
                durationMark = 5;
            }
        } else if(age >= 16) {
            if (average > 7.0 && average < 9.5) {
                durationMark = 10;
            } else {
                durationMark = 5;
            }
        }
        overallMark = 6.25 * regularity + 5 * durationMark;
        lastAssessment = overallMark;
        return overallMark;
    }
}