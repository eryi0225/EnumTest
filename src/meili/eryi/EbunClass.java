package meili.eryi;


public class EbunClass {

    public static void main(String[] args) {
        for (Shrubbery s:Shrubbery.values()
             ) {

            System.out.println(s+"orider:"+s.ordinal());
            System.out.println(s.compareTo(Shrubbery.CEAWING));
            System.out.println(s.equals(Shrubbery.CEAWING));
            System.out.println(s==Shrubbery.CEAWING);
            System.out.println(s.getClass());
            System.out.println(s.getDeclaringClass());
            System.out.println(s.name());
            System.out.println("-------------------");
        }
    }

}
