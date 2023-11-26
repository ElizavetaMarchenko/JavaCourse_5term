import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main{
    public static void main(String[] args){
        try{
            String className = "Lesson";
            String methodName = "getNumber";
            Class <?> clazz = Class.forName(className);
            Constructor<?> constructor = clazz.getConstructor(String.class, int.class);
            Object instance = constructor.newInstance("JAVA", 1);
            Method method = clazz.getMethod(methodName);
            method.invoke(instance);
        }
        catch (ClassNotFoundException e){
            System.err.println("Class does not exist: " + e.getMessage());

        }catch (NoSuchMethodException e){
            System.err.println("Method does not exist: " + e.getMessage());

        }catch (Exception e){
            System.err.println("Error! " + e.getMessage());

        }
    }
}