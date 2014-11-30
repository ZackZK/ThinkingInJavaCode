import java.util.*;

class StaticFieldTest{
    static int count;
}

public class p8_StaticFieldTest{
    public static void main(String[] args) {
	StaticFieldTest one   = new StaticFieldTest();
	StaticFieldTest two   = new StaticFieldTest();
	StaticFieldTest three = new StaticFieldTest();
	
	System.out.println("******************************");
	System.out.printf("Static orinal value: class=%d one=%d two=%d three=%d\n",
			  StaticFieldTest.count, one.count, two.count, three.count);
	
	StaticFieldTest.count = 3;
	System.out.println("******************************");
	System.out.printf("After set to 3 value: class=%d one=%d two=%d three=%d\n",
			  StaticFieldTest.count, one.count, two.count, three.count);
	
	one.count = 12;
	System.out.println("******************************");
	System.out.printf("After set to 12 value: class=%d one=%d two=%d three=%d\n",
			  StaticFieldTest.count, one.count, two.count, three.count);
	
    }
}
