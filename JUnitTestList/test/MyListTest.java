import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyListTest {

	private static MyList testList;
	
	@BeforeClass
	static public void init()
	{
		testList = new MyList();
	}
	
	/*
	@Test
	public void fiveElementsWorks()
	{
		
		testList.riempiCon5elementi();
		assertEquals(5,testList.buffer.size());
		
	}

	@Test
	public void addWorks()
	{
		
		testList.print();
		assertEquals(true,testList.isInside(0));
	}
	
	*/
	
	@Test(timeout = 100)
	public void evenWorks()
	{
		int cont = 0;
		for(int i = 0; i < 1000; i++)
			testList.buffer.add(i);
		
		for(int i = 0; i < testList.buffer.size(); i++)
		{
			
			if((int) testList.buffer.get(i) % 2 == 0)
			{
				cont++;
			}
		}
		
		assertEquals(500,cont);
			
		
	}
	
	
	
	
	
	
	
	
}
