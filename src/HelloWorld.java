import java.util.ArrayList;

public class HelloWorld {
    public static class InnerClass {
        public void print(String message) {
            ArrayList<String> list = new ArrayList<>();
            System.out.println(message.length());
            System.out.println(message);
        }
    }
    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
        innerClass.print("Hello World!");
        innerClass.print("Goodbye!");
    }
}
