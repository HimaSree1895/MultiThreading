import java.io.*;
import java.util.*;
class HOD extends Thread
{
	Studentbuffer2 sb;
	int count;
	HOD(Studentbuffer2 sb,int count)
	{
		this.sb=sb;
		this.count=count;
	}
	public void run()
	{
		FileWriter fw=null;
		BufferedWriter bw=null;
		try
		{
			fw=new FileWriter("OutPass.txt",true);
			bw=new BufferedWriter(fw);
			for(int i=0;i<count;i++)
			{
				Student2 temp=sb.pop();
				System.out.println("Accessed:"+temp);
				if(temp.max_leave_days<=5)
				{
					bw.write(temp+"\n");
				}
				else
					System.out.println("Not allowed");
			}
			bw.close();
			fw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
