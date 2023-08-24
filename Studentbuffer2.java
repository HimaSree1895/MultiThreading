class Studentbuffer2 
{
	Student2 s2;
	boolean status;
	synchronized void push(Student2 s2)
	{
		if(status)
		{
			try
			{
				wait();
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
		}
		this.s2=s2;
		System.out.println("Inserted:"+this.s2);
		status=true;
		notify();
	}
	synchronized Student2 pop()
	{
		if(!status)
		{
			try
			{
				wait();
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
		}
		status=false;
		notify();
		return this.s2;
	}
}
	
