import java.util.*;

class MyClass{
    int intFiled;
    char charFiled;
}
public class p1_classFieldsInit {
    public static void main(String[] args) {
	MyClass test = new MyClass();
	System.out.printf("test Class field init: int=%d char=%c", test.intFiled, test.charFiled);
    }
}
