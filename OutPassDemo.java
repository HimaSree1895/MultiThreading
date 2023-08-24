import java.util.*;
class OutPassDemo
{
	public static void main(String args[])
	{
		Studentbuffer2 sb=new Studentbuffer2();
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter no.of students:");
		int n=scan.nextInt();
		ASWO a=new ASWO(sb,n);
		HOD h=new HOD(sb,n);
		a.start();
		h.start();
	}
}
