package meili.eryi;

public class Timetable {

    public static String getJob(int dayInWeek){

            if (dayInWeek == WeekDayConstants.MONDAY
                    || dayInWeek == WeekDayConstants.SUNDAY) {
                return "Nothing";
            }
            return "Coding";
    }

    public static String getEnumJob(WeekDay weekDay){
        if(weekDay == WeekDay.SATURDAY || weekDay == WeekDay.SUNDAY){
            return "Nothing";
        }else {
            return "Codeing";
        }
    }


    public static void main(String[] args) {
        int day = 2;
        String str = Timetable.getJob(day);
        String str2 = Timetable.getEnumJob(WeekDay.Monday);
        System.out.println(str2);
        System.out.printf(str);
    }

}
