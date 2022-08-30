import java.util.ArrayList;

public class HelloWorld {
    public static class InnerClass {
        public void print(String message) {
            
            ArrayList<String> list = new ArrayList<>();
            list.add(message);
            System.out.println(list.size());
        }
    }
    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
        innerClass.print("Hello World!");
    }
}
