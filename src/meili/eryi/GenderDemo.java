package meili.eryi;

//枚举中的方法测试
public class GenderDemo {
    public static void main(String[] args) {
        Gender gender = Gender.FEMALE;

        System.out.println("Code:"+gender.getCode());
        System.out.println("Text:"+gender.getText());

        Gender g = Gender.getGenderByCode("F");
        System.out.println("Gende by Code:"+g);
    }
}
