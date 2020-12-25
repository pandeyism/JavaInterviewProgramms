package pkg1;

public class ArmstrongNumber {
	//Given Number is 153,407,0,370,371
	//1*1*1=1, 5*5*5=125, 3*3*3=27
	//1+125+27=153
	
	public static void isArmStrongNumber(int num) {
		
		System.out.println("Given number is : " + num);
		int cube=0;
		int r;
		int t;
		t=num;
	
		while(num>0) {
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
		}
			if(t==cube) {
				System.out.println("This is an Armstrong Number");
			}else {
				System.out.println("This is not an Armstrong Number");
			}
		}
	

	
	
	
	public static void main(String[] args) {
		isArmStrongNumber(153);
		isArmStrongNumber(151);
		isArmStrongNumber(1);
		isArmStrongNumber(407);
		
	}

}
