package meili.eryi;
/*在枚举中也可以有构造函数跟方法，仅仅构造初始化枚举内的对象外部不能调用*/
public enum Gender {

    MALE("M", "Male"), FEMALE("F", "Female");

    private String code;
    private String text;
    private Gender(String code, String text) {
        this.code = code;
        this.text = text;
    }

    public static Gender getGenderByCode(String code){
        for (Gender gender: Gender.values()
             ) {
            if(gender.code == code){
                return gender;
            }
        }
        return null;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
