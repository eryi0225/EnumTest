package meili.eryi.EnumReflect;

enum Serch{
    HITHER,YOU;
}

public class UpcastEnum {
    public static void main(String[] args) {
        Serch[] serches = Serch.values();
        Enum e = Serch.HITHER;
        for (Enum en: e.getClass().getEnumConstants()
             ) {
            System.out.println(en);
        }
    }
}
