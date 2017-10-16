import java.util.*;
//int 轉萬國碼(char)
public class Main {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
		String x = in.next();
		int a= Integer.valueOf(x,16); //轉16進位
		System.out.println((char)a);         //轉字
	}
}
