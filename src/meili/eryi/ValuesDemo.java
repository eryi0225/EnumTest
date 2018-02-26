package meili.eryi;
//获取枚举的元素
public class ValuesDemo {
    public static void main(String[] args) {
        WeekDay[] weekDays = WeekDay.values();
        for (WeekDay w:weekDays
             ) {
            System.out.println(w);
        }
    }
}
