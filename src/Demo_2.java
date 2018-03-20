import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Demo_2 {
	static int n,a,b,c,d,sum,temp,answer;
	static String opr;
	static PrintWriter pw;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input();
	}
	public static void input(){
//		try {
//			pw = new PrintWriter("result.txt");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		pw.write("\t201571030311\n");
//		pw.close();
		System.out.println("\t201571030311");
		System.out.println("***请输入要输入出题的道数***");
		Scanner s =new Scanner (System.in);
		n=s.nextInt();
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("result.txt"));
			bw.write("201571030311\n");
			for(int i =0;i<n;i++){
				output();
				System.out.println(opr+"=");
				System.out.println("请输入你的答案");
				answer=s.nextInt();
				if(answer==sum){
					System.out.println("恭喜你！算对了");
				}
				else{
					
					
					System.out.println("很抱歉你算错了！\t正确答案为："+sum);
				}
	        	bw.write(opr+"="+sum);
	        	bw.write("\n");
			}
            bw.close();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
		
		
	}
	public static void output(){
		//新产生的数字总是记为a;
		//确定第一个数字
		a=1+(int)(Math.random()*100);
		temp=1+(int)(Math.random()*4);
		switch(temp){
		//第一个符号为+号
		case 1:
			add();
		//确定第一个符号为-
		case 2:
			sub();
			break;
		case 3:
			rid();
			break;
		case 4:
			div();
			break;
			}
		}

	public static void add(){
		b=a;
		//确定第二个数字
			a=1+(int)(Math.random()*100);
			temp=1+(int)(Math.random()*4);
		
			switch(temp){
		//确定第二个符号为+
			case 1:
				
				c=a;
				//确定第三个数字
				a=1+(int)(Math.random()*100);
				temp=1+(int)(Math.random()*4);
				d=a;
				//确定第四个数字
				a=2+(int)(Math.random()*100);
				switch(temp){
				
//				//第三个符号为+号
//				case 1:
//					sum=a+b+c+d;
//					opr=a+"+"+b+"+"+c+"+"+d;
//					break;
//				//第三个符号为-号
				case 2:
					while(b+c+d<a)
						a=1+(int)(Math.random()*100);
						sum=b+c+d-a;
						opr=b+"+"+c+"+"+d+"-"+a;
						break;
				//第三个符号为*
				case 3:
					sum=b+c+d*a;
					opr=b+"+"+c+"+"+d+"*"+a;
					break;
				//第三个符号为/
				case 4:
					while(d<a||d%a!=0){
						d=1+(int)(Math.random()*100);
						a=1+(int)(Math.random()*100);
					}
					sum=b+c+d/a;
					opr=b+"+"+c+"+"+d+"/"+a;
					break;
				}
				//确定第二个符号为-
		case 2:
			while(b+c<d){
				d=1+(int)(Math.random()*100);
			}
			switch(temp){
			//确定第三个符号为+
				case 1:
					sum=a+b-c+d;
					opr=b+"+"+c+"-"+d+"+"+a;
					break;
			//第三个符号为-
				case 2:
					while(b+c-d<a){
						a=1+(int)(Math.random()*100);	
					}
					sum=b+c-d-a;
					opr=b+"+"+c+"-"+d+"-"+a;
						break;
			//确定第三个符号为*
				case 3:
					while(b+c<d*a)
					{
						a=1+(int)(Math.random()*100);
					}
					sum=b+c-d*a;
					opr=b+"+"+c+"-"+d+"*"+a;
					break;
			//确定第三个符号为/
				case 4:
					while(d<a&&d%a!=0){
						d=1+(int)(Math.random()*100);
						a=1+(int)(Math.random()*100);
						}
						sum=b+c-d/a;
						opr=b+"+"+c+"-"+d+"/"+a;
					break;
					}
				break;
			//确定第二个符号为*
			case 3:
				temp=1+(int)(Math.random()*4);
				switch(temp){
				//确定第三个符号为+
				case 1:
					sum=b+c*d+a;
					opr=b+"+"+c+"*"+d+"+"+a;
					break;
				//确定第三个符号为-
				case 2:
					while(b+c*d<a)
					{
						a=1+(int)(Math.random()*100);
					}
					sum=b+c*d-a;
					opr=b+"+"+c+"*"+d+"-"+a;
					break;
				case 3:
					sum=b+c*d*a;
					opr=b+"+"+c+"*"+d+"*"+a;
					break;
				case 4:
					while(c*d<a&&c*d%a!=0)
					{
						d=1+(int)(Math.random()*100);
						a=1+(int)(Math.random()*100);
					}
					sum = b+c*d/a;
					opr=b+"+"+c+"*"+d+"/"+a;
					break;
				}
				break;
		//确定第二个运算符为/
			case 4:
				while(c%d!=0)
				{
					c=1+(int)(Math.random()*100);
				}
				switch(temp){
				case 1:
					sum = b+c/d+a;
					opr=b+"+"+c+"/"+d+"+"+a;
					break;
				case 2:
					while(b+c/d<a)
					{
						a=1+(int)(Math.random()*100);
					}
					sum = b+c/d-a;
					opr=b+"+"+c+"/"+d+"-"+a;
					break;
				case 3:
					sum = b+c/d*a;
					opr=b+"+"+c+"/"+d+"*"+a;
					break;
				case 4:
					while(c/d%a!=0){
					a=1+(int)(Math.random()*100);
					}
					sum=b+c/d/a;
					opr=b+"+"+c+"/"+d+"/"+a;
					break;
				}
				break;
			}
		}
	public static void sub(){
		b=a;
		c=1+(int)(Math.random()*100);
		while(b<c){
			c=1+(int)(Math.random()*100);
		}
		temp=1+(int)(Math.random()*2);
		
		d=1+(int)(Math.random()*100);
		
		switch(temp){
		//确定第二个符号为+
		case 1:
			temp=1+(int)(Math.random()*4);
			switch(temp){
			//确定第三个符号为+
			case 1:
				a=1+(int)(Math.random()*100);
				sum = b-c+d+a;
				opr=b+"-"+c+"+"+d+"+"+a;
				break;
			case 2:
				a=1+(int)(Math.random()*100);
				while(b-c+d<a)
				{
					a=1+(int)(Math.random()*100);
				}
				sum= b-c+d-a;
				opr=b+"-"+c+"+"+d+"-"+a;
				break;
			case 3:
				a=1+(int)(Math.random()*100);
				sum = b-c+d*a;
				opr=b+"-"+c+"+"+d+"*"+a;
				break;
			case 4:
				a=1+(int)(Math.random()*100);
				while(d%a!=0){
					d=1+(int)(Math.random()*100);
					a=1+(int)(Math.random()*100);
				}
				sum = b-c+d/a;
				opr=b+"-"+c+"+"+d+"/"+a;
				break;
			}
			break;
		//第二位符号为-
		case 2:
			while(b-c<d){
				d=1+(int)(Math.random()*100);
			}
			temp=1+(int)(Math.random()*4);
			switch(temp){
			case 1:
				a=1+(int)(Math.random()*100);
				while(b-c<d){
					d=1+(int)(Math.random()*100);
				}
				sum =b-c-d+a;
				opr=b+"-"+c+"-"+d+"+"+a;
				break;
				//用乘法消除重复
			case 2:
				a=1+(int)(Math.random()*100);
				while(b-c<d){
					d=1+(int)(Math.random()*100);
				}
				sum =b-c-d+a;
				opr=b+"-"+c+"-"+d+"+"+a;
				break;
			case 3:
				a=1+(int)(Math.random()*100);
				while(b-c<d*a){
					a=1+(int)(Math.random()*100);
				}
				sum = b-c-d*a;
				opr=b+"-"+c+"-"+d+"*"+a;
				break;
			case 4:
				a=1+(int)(Math.random()*100);
				while(d%a!=0){
					while((b-c)<d%a){
					d=1+(int)(Math.random()*100);
					a=1+(int)(Math.random()*100);
					}
				}
				sum = b-c-d/a;
				opr=b+"-"+c+"-"+d+"/"+a;
				break;
			}
			break;

		}
	}
	public static void rid(){
		b=a;
		c=1+(int)(Math.random()*100);
		temp=1+(int)(Math.random()*4);
		d=1+(int)(Math.random()*100);
		switch(temp){
		case 1:
			a=1+(int)(Math.random()*100);
			temp=1+(int)(Math.random()*4);
			switch(temp){
			case 1:
				sum = b*c+d+a;
				opr=b+"*"+c+"+"+d+"+"+a;
				break;
			case 2:
				while(b*c+d<a)
				{
					a=1+(int)(Math.random()*100);
				}
				opr=b+"*"+c+"+"+d+"-"+a;
				break;
			case 3:
				sum = b*c+d*a;
				opr=b+"*"+c+"+"+d+"*"+a;
				break;
			case 4:
				while(d%a!=0&&d<a){
					d=1+(int)(Math.random()*100);
					a=1+(int)(Math.random()*100);
				}
				sum = b*c+d/a;
				opr=b+"*"+c+"+"+d+"/"+a;
				break;
			}
			break;
		case 2:
			while(b*c<d){
				d=1+(int)(Math.random()*100);
			}
			a=1+(int)(Math.random()*100);
			temp=1+(int)(Math.random()*4);
			switch(temp){
			case 1:
				sum=b*c-d+a;
				opr=b+"*"+c+"-"+d+"+"+a;
				break;
			case 2:
				while(b*c-d<a){
					a=1+(int)(Math.random()*100);
				}
				sum = b*c-d-a;
				opr=b+"*"+c+"-"+d+"-"+a;
				break;
			case 3:
				while(b*c<d*a){
					a=1+(int)(Math.random()*100);
				}
				sum = b*c-d*a;
				opr=b+"*"+c+"-"+d+"*"+a;
				break;
			case 4:
				while(d%a!=0&&d<a){
					while(b*c<d%a){
						a=1+(int)(Math.random()*100);
						d=1+(int)(Math.random()*100);
					}
				}
				sum = b*c-d/a;
				opr=b+"*"+c+"-"+d+"/"+a;
				break;
			}
			break;
		case 3:
			a=1+(int)(Math.random()*100);
			temp=1+(int)(Math.random()*3);
			switch(temp){
			case 1:
				sum=b*c*d+a;
				opr=b+"*"+c+"*"+d+"+"+a;
				break;
			case 2:
				while(b*c*d<a)
				{
					a=1+(int)(Math.random()*100);
				}
				sum=b*c*d-a;
				opr=b+"*"+c+"*"+d+"-"+a;
				break;
			case 3:
				while(b*c*d%a!=0){
					a=1+(int)(Math.random()*100);
					d=1+(int)(Math.random()*100);
				}
				sum = b*c*d/a;
				opr=b+"*"+c+"*"+d+"/"+a;
				break;
			}
			break;
		case 4:
			while(b*c<d&&b*c%d!=0){
				d=1+(int)(Math.random()*100);
			}
			a=1+(int)(Math.random()*100);
			temp=1+(int)(Math.random()*4);
			switch(temp){
			case 1:
				sum = b*c/d+a;
				opr=b+"*"+c+"/"+d+"+"+a;
				break;
			case 2:
				while(b*c/d<a){
					a=1+(int)(Math.random()*100);
				}
				sum = b*c/d-a;
				opr=b+"*"+c+"/"+d+"-"+a;
				break;
			case 3:
				sum = b*c/d*a;
				opr=b+"*"+c+"/"+d+"*"+a;
				break;
			case 4:
				while(b*c/d<a&&b*c/d%a!=0)
				{	
					c=1+(int)(Math.random()*100);
					d=1+(int)(Math.random()*100);
					a=1+(int)(Math.random()*100);
				}
				sum = b*c/d/a;
				opr=b+"*"+c+"/"+d+"/"+a;
				break;
			}
			break;
		}
	}
	public static void div(){
		b=a;
		c=1+(int)(Math.random()*100);
		while(b<c&&b%c!=0)
		{
			b=1+(int)(Math.random()*100);
			c=1+(int)(Math.random()*100);
		}
		temp=1+(int)(Math.random()*4);
		d=1+(int)(Math.random()*100);
		switch(temp){
		case 1:
			a=1+(int)(Math.random()*100);
			temp=1+(int)(Math.random()*4);
			switch(temp){
			case 1:
				sum = b/c+d+a;
				opr=b+"/"+c+"+"+d+"+"+a;
				break;
			case 2:
				while(b*c+d<a)
				{
					a=1+(int)(Math.random()*100);
				}
				opr=b+"/"+c+"+"+d+"-"+a;
				break;
			case 3:
				sum = b/c+d*a;
				opr=b+"/"+c+"+"+d+"*"+a;
				break;
			case 4:
				while(d%a!=0&&d<a){
					d=1+(int)(Math.random()*100);
					a=1+(int)(Math.random()*100);
				}
				sum = b/c+d/a;
				opr=b+"/"+c+"+"+d+"/"+a;
				break;
			}
			break;
		case 2:
			while(b*c<d){
				d=1+(int)(Math.random()*100);
			}
			a=1+(int)(Math.random()*100);
			temp=1+(int)(Math.random()*4);
			switch(temp){
			case 1:
				sum=b/c-d+a;
				opr=b+"/"+c+"-"+d+"+"+a;
				break;
			case 2:
				while(b/c-d<a){
					a=1+(int)(Math.random()*100);
				}
				sum = b/c-d-a;
				opr=b+"/"+c+"-"+d+"-"+a;
				break;
			case 3:
				while(b/c<d*a){
					a=1+(int)(Math.random()*100);
				}
				sum = b/c-d*a;
				opr=b+"/"+c+"-"+d+"*"+a;
				break;
			case 4:
				while(d%a!=0&&d<a){
					while(b/c<d%a){
						a=1+(int)(Math.random()*100);
						d=1+(int)(Math.random()*100);
					}
				}
				sum = b/c-d/a;
				opr=b+"/"+c+"-"+d+"/"+a;
				break;
			}
			break;
		case 3:
			a=1+(int)(Math.random()*100);
			temp=1+(int)(Math.random()*4);
			switch(temp){
			case 1:
				sum=b/c*d+a;
				opr=b+"/"+c+"*"+d+"+"+a;
				break;
			case 2:
				while(b/c*d<a)
				{
					a=1+(int)(Math.random()*100);
				}
				sum=b/c*d-a;
				opr=b+"/"+c+"*"+d+"-"+a;
				break;
			case 3:
				sum = b/c*d*a;
				opr=b+"/"+c+"*"+d+"*"+a;
				break;
			case 4:
				while(b/c*d%a!=0){
					a=1+(int)(Math.random()*100);
					d=1+(int)(Math.random()*100);
				}
				sum = b/c*d/a;
				opr=b+"/"+c+"*"+d+"/"+a;
				break;
			}
			break;
		case 4:
			while(b/c<d&&b/c%d!=0){
				d=1+(int)(Math.random()*100);
			}
			a=1+(int)(Math.random()*100);
			temp=1+(int)(Math.random()*3);
			switch(temp){
			case 1:
				sum = b/c/d+a;
				opr=b+"/"+c+"/"+d+"+"+a;
				break;
			case 2:
				while(b/c/d<a){
					a=1+(int)(Math.random()*100);
				}
				sum = b/c/d-a;
				opr=b+"/"+c+"/"+d+"-"+a;
				break;
			case 3:
				sum = b/c/d*a;
				opr=b+"/"+c+"/"+d+"*"+a;
				break;
			}
			break;
		}
	}
}
	
