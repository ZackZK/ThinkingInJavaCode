import java.util.*;

public class Compar {
    public static void main(String[] args) {
	Random rand = new Random();
	int forwardOne = rand.nextInt();
	while(true) {
	    int nextOne = rand.nextInt();
	    if (forwardOne > nextOne) {
		System.out.printf("%d > %d\n", forwardOne, nextOne);
	    }
	    else if (forwardOne == nextOne) {
		System.out.printf("%d = %d\n", forwardOne, nextOne);
	    }
	    else {
		System.out.printf("%d < %d\n", forwardOne, nextOne);
	    }
	    forwardOne = nextOne;
	}
    }
}
