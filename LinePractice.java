import java.util.*;
public class LinePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.print("Welcome to Line Comparison Computation Program on Master Branch");
  
  int x1=4;
	int y1=0;
	int x2=8;
	int y2=9;
	int y4=4;
	int x3= 4;
	int x4 = 8;
	int y3=0;
	int a=10;
		
int dis=(int) Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

System.out.println("first line===>"+dis);

int dis2=(int) Math.sqrt((x4-x3)*(x4-x3) + (y4-y3)*(y4-y3));

System.out.println("two distance===>"+dis2);

Integer obj1 = new Integer(dis);
Integer obj2 = new Integer(dis2);
System.out.println(obj1.compareTo(obj2));
System.out.println(obj1.equals(obj2));
	}

}
