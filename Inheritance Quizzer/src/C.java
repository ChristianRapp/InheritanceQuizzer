
public class C extends B
	{

	public C(int i)
		{
		super(i);
		num = i;
		number = 14;
		}

	public String doesCThings()
	{
		return "C";
	}
	
	public String changeStr()
	{
		return super.changeStr();
	}
		
	}
