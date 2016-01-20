
public class B extends A
	{
	protected int number;
	public B(int i)
		{
		num = 10*i;
		number = 15;
		}
		
	public B()
		{
		
		}
	
	public int getANum()
	{
		return 17;
	}
	
	public String changeStr()
	{
		str = "STR2";
		return str;
		
	}
	
	public String doAThing()
	{
		return "ABC";
	}

	public int getNumber()
		{
			return number;
		}

	public void setNumber(int number)
		{
			this.number = number;
		}
		
	}
