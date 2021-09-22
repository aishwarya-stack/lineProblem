import java.util.*;
class Equal
	{
		
		int x1, y1, x2, y2;
		int x3, y3, x4, y4;

		void insert(int p, int q, int r, int s, int a, int m, int n, int o)
		{
			x1 = p;
			y2 = q;
			x2 = r;
			y2 = s;
			x3 = a;
			y3 = m;
			x4 = n;
			y4 = o;

		}

		int checkDistanceOne()
		{
			int dis1 = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

			System.out.println("first line distance===>" + dis1);

			return dis1;
		}

		int checkDistanceTwo() 
		{

			int dis2 = (int) Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));

			System.out.println("Second line distance===>" + dis2);
			return dis2;
		}

	}

	public class LinePractice {
		

		public static void main(String[] args) {

			// TODO Auto-generated method stub
			System.out.println("Welcome to Line Comparison Computation Program on Master Branch");

			Equal equal = new Equal();
			// Equal equalnew=new Equal();
			equal.insert(10, 20, 30, 40, 50, 60, 70, 80);
			Integer line1 = equal.checkDistanceOne();
			Integer line2 = equal.checkDistanceTwo();
			int result = (line1.compareTo(line2));
			if (result > 0)
				System.out.println("line1 is greater than line2");
			else if (result < 0)
				System.out.println("line1 is less than line2");
			else
				System.out.println("line1 is equal to line2");

			/*
			 * Integer obj1 = new Integer(dis); Integer obj2 = new Integer(dis2);
			 * System.out.println(obj1.compareTo(obj2)); System.out.println(obj1.equals(obj2)); int retResult =
			 * obj1.compareTo(obj2); if(retResult > 0) {
			 * System.out.println("dis is greater than dis2"); } else if(retResult< 0) {
			 * System.out.println("dis is less than dis2"); } else { System.out.println("dis is equal to dis2");
			 * }
			 * 
			 */

		}
	}


