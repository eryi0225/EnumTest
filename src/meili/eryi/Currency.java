package meili.eryi;

/*在枚举类中可以重写继承自Object类中的toString方法*/
public enum Currency {
    VND, USD, EURO ;

    @Override
    public String toString() {
        if (this == VND) {
            return "Dong";
        } else if (this == USD) {
            return "Dola";
        }
        return super.toString();
    }

    public static void main(String[] args) {
        Currency money = Currency.USD;

        System.out.println("Money " + money);
        System.out.println("Money " + money.toString());
        System.out.println("VND " + Currency.VND);
        System.out.println("EURO " + Currency.EURO);
    }

}
