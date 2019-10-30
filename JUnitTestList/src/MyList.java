import java.util.ArrayList;

public class MyList {

	public ArrayList buffer;
	
	public MyList() {
		buffer = new ArrayList();
	}
	
	public int getElement(int index)
	{
		return (int) buffer.get(index);
	}
	
	public void riempiCon5elementi()
	{
		for(int i = 0; i < 5; i++)
		{
			buffer.add(i);
		}
	}
	
	
	
	public boolean isInside(int element)
	{
		for(int i = 0; i < buffer.size(); i++)
		{
			if(buffer.get(i).equals(element) )
				return true;
		}
		return false;
	}
	
	
	public void doubleInside(int element)
	{
		int cont = 0;
		for(int i = 0; i < buffer.size(); i++)
		{
			if(buffer.get(i).equals(element) )
				cont++;
		}
		if(cont >= 2 )
			throw new EqualsNumberException("ERROR");
		
		
	}
	
	
	
	public void print() {
		for(int i = 0; i < buffer.size(); i++)
		{
			System.out.println(buffer.get(i));
		}
	}
 }
