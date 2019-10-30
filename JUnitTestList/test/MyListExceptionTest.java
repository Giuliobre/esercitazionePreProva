import org.junit.BeforeClass;
import org.junit.Test;

public class MyListExceptionTest {
	
	
	private static MyList testList;
		
		@BeforeClass
		static public void init()
		{
			testList = new MyList();
		}
	
	@Test(expected = EqualsNumberException.class )
	public void doubleNumbersWorks()
	{
		testList.buffer.add(4);
		testList.buffer.add(4);
		testList.print();
		
		testList.doubleInside(4);
		
		
	}
	

}
