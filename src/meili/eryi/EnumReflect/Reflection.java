package meili.eryi.EnumReflect;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

import static java.lang.Compiler.command;
import static sun.misc.Version.print;

public class Reflection {

    public static Set<String> analyze(Class<?> enumClass){
        System.out.println("------analyze"+enumClass+"--------");
        System.out.print("Interfaces");
        for (Type t:enumClass.getGenericInterfaces()
             ) {
            System.out.print(t);
        }
        System.out.println();
        System.out.print(enumClass.getSuperclass());
        System.out.println("Method");
        Set<String> methods = new TreeSet<String>();
        for (Method m:enumClass.getDeclaredMethods()
             ) {
            methods.add(m.getName());
        }
        System.out.println(methods);
        return methods;
    }

    public static void main(String[] args) {
        Set<String> exploreMethods = analyze(Explore.class);
        Set<String> enumMethods = analyze(Enum.class);
        System.out.println("enumMethods.containsAll(enumMethods)"+enumMethods.containsAll(enumMethods));
        System.out.println("Explore.removeAll(Enum)");
        exploreMethods.removeAll(enumMethods);
        System.out.println(exploreMethods);
        command("javap Explore");
    }


}
