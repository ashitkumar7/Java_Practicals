class Distance

{

	int feet;	double inch;

	

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

		Distance ob= new Distance();

		ob.input(5,7.0);

		ob.output(65);

	}

}
