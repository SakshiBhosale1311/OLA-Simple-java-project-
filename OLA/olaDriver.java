class olaDriver
{
	ola o;
	
	public void choose(ola o)//mimi,prime,sweden
	{
		this.o=o;
		if(o instanceof Mini)
		{
			Mini m1=(Mini)o;
			m1.bill();
		}
		else if(o instanceof Prime)
		{
			Prime p1=(Prime)o;
			p1.bill();
		}
		else if(o instanceof Sweden)
		{
			Sweden s1=(Sweden)o;
			s1.bill();
		}
		
	}
	
}