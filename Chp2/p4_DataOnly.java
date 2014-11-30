import java.util.*;

class DataOnly {
    int i;
    double d;
    boolean b;

}
public class p4_DataOnly {
    public static void main(String[] args) {
	DataOnly myObject = new DataOnly();
	myObject.i = 47;
	myObject.d = 1.1;
	myObject.b = false;
	System.out.println("DataOnly fields: ");
	System.out.printf("   i: %d\n   d: %f\n   b: %b", myObject.i, 
			  myObject.d, myObject.b);
    }
}
