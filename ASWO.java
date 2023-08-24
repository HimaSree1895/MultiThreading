import java.io.*;
import java.util.*;
class ASWO extends Thread
{
	Studentbuffer2 sb;
	int count;
	ASWO(Studentbuffer2 sb,int count)
	{
		this.sb=sb;
		this.count=count;
	}
	public void run()
	{
		BufferedReader br=null;
		try
		{
			br=new BufferedReader(new InputStreamReader(System.in));
			for(int i=0;i<count;i++)
			{
				System.out.println("Enter Student details:roll.no,max leave days and reason");
				String roll_no=br.readLine();
				int max_leave_days=Integer.parseInt(br.readLine());
				String reason=br.readLine();
				Student2 s2=new Student2(roll_no,max_leave_days,reason);
				sb.push(s2);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}		
