import java.util.*;

public class BitOper {
    public void printBinaray(int data) {
	while (data != 0) {
	    char bit = (data&1 == 0) ? '0':'1';
	    data = data>>1;
	}
    }
    public static void main(String[] args) {
	int data1 = 0x1F3;	// 0x0111110011
	int data2 = 0x2C4;    	// 0x1010110100
	
	int bitResult;
	bitResult = data1 & data2;
	
    }
}
