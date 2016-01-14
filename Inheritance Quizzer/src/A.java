
public class A
	{
	protected int num;
	protected String str;
	
	public A(int i)
		{
		num = 5*i;		
		}
	
	public A()
		{
		num = 10;
		}
	
	public String party()
		{
		return "Party";
		}
	
	public int getANum()
		{
		return 5;
		}
	
	public String changeStr()
	{
		str = "STR1";
		return str;
	}

	public int getNum()
		{
			return num;
		}

	public void setNum(int num)
		{
			this.num = num;
		}

	public String getStr()
		{
			return str;
		}

	public void setStr(String str)
		{
			this.str = str;
		}
		
		
	}
