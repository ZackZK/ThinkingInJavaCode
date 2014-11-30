import java.util.*;

class StringUtil{
    static int storage(String s) {
	return s.length() * 2;
    }
}

public class p6_StringUtil {
    public static void main(String[] args) {
	String a = new String("0123456789");
	System.out.printf("String a length=%d, and storage size=%d", 
			   a.length(), StringUtil.storage(a));
    }
}
