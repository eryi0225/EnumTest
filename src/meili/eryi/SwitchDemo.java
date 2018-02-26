package meili.eryi;

//使用枚举来充当switch的条件语句

public class SwitchDemo {

    public static void main(String[] args) {
        WeekDay day = WeekDay.Monday;

        switch (day){
            case Monday:
                System.out.println("today is MONDAY");
                break;
            case SUNDAY:
                break;
            case SATURDAY:
                break;
            default:
                System.out.println("I don't Know!");
        }
    }
}
