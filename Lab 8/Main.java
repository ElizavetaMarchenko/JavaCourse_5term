import java.lang.reflect.*;
public class Main {
    public static void printClassInfo(Class<?> clazz) {
        System.out.println("Class Name: " + clazz.getName());

        int modifiers = clazz.getModifiers();
        System.out.println("Modifiers: " + Modifier.toString(modifiers));

        Class<?> superClass = clazz.getSuperclass();
        if (superClass != null) {
            System.out.println("Superclass: " + superClass.getName());
        }

        Class<?>[] interfaces = clazz.getInterfaces();
        if (interfaces.length > 0) {
            System.out.print("Implemented Interfaces: ");
            for (Class<?> iface : interfaces) {
                System.out.print(iface.getName() + ", ");
            }
            System.out.println();
        }

        Field[] fields = clazz.getDeclaredFields();
        if (fields.length > 0) {
            System.out.println("Fields:");
            for (Field field : fields) {
                System.out.println("  " + field.getName() + " : " + field.getType().getName());
            }
        }

        Method[] methods = clazz.getDeclaredMethods();
        for (var method : methods)
        {
            System.out.println("Method name : " + method.getName());
            System.out.println("Return type : " +
                    method.getReturnType().getName());

            Class<?>[] params = method.getParameterTypes();
            System.out.print("Parameters : ");
            for (var paramType : params)
                System.out.print(" " + paramType.getName());
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Class<?> JAVA = Lesson.class;
        printClassInfo(JAVA);
    }
}