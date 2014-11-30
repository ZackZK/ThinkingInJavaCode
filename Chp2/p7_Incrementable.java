import java.util.*;

class StaticTest {
    static int i = 47;
}
class Incrementalbe {
    static void increment() {
	StaticTest.i++; 
    }
}

public class p7_Incrementable {
    public static void main(String[] args) {
	System.out.printf("StaticTest field i,  original value=%d\n", StaticTest.i);
	Incrementalbe.increment();
	System.out.printf("After calling Incrementalbe methold, value=%d", StaticTest.i);
    }
}
