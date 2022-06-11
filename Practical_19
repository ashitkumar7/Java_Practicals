import java.io.*;

class Practical19

{

	public static void main(String args[])	{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		try

		{

			System.out.print("Number 1 : ");

			int p=Integer.parseInt(br.readLine());

			System.out.print("Number 2 : ");

			int q=Integer.parseInt(br.readLine());

			

			int r=p/q;

			System.out.println("Divisions : "+r);

			return;

		}

		catch(NumberFormatException ex)

		{

			System.out.println("Sorry!Only Numbers are allowed");

		}

		catch(ArithmeticException ex)

		{

			System.out.println("Sorry! Denominator cannot zero");

		}

		

		catch(Exception ex)

		{

			System.out.println("Some error has occurd. contact customer care at 8989898");

			//System.out.println(ex.toString());

			//ex.printStackTrace();

		}

		finally

		{

			System.out.println("Thanks");

		}

		

	}

}
