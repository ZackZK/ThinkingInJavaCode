import java.util.*;
import java.lang.*;

public class Prime{
    public static void main(String[] args) {
	for (int i=2; i<1000; i++) {
	    for(int j=2; j<=Math.sqrt(i); j++) {
		if (i%j == 0) {
		    System.out.printf("%d ", i);
		    break;
		}
	    }
	}
    }
}
