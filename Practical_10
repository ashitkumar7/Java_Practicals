class Distance

{

	int feet;	double inch;

	

	public Distance()

	{

		

	}

	

	public Distance(int f,double i){

		feet=f;

		inch=i;

		System.out.print("\nBefore Conversion => "+feet+"feet "+inch+"inch");

	}

	

	public Distance(Distance s){

		System.out.print("\n\nCopy Constructor");

		feet=s.feet;

		inch=s.inch;

		System.out.print("\nBefore Conversion => "+feet+"feet "+inch+"inch");

	}

	

	void input(int feet,double inch){

		this.feet=feet;

		this.inch=inch;

		System.out.print("Before Conversion => "+feet+"feet "+inch+"inch");

	}

	

	void output(int length){

		feet=(int)(length/(12*2.54));

		inch=((length-feet*12*2.54)/2.54);

		System.out.print("\nAfter Conversion => ");

		System.out.print(length+"c.m. = "+feet+"feet "+inch+"inch");

	}

}

class Practical9

{

	public static void main(String args[])

	{

		Distance ob1= new Distance();

		ob1.input(5,7.0);

		ob1.output(65);

		

		System.out.print("\n\nParametrized Constructor");

		Distance ob2=new Distance(7,9.0);

		Distance ob3=new Distance(ob1);

	}

}
