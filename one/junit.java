package stusy.one;

import org.junit.Assert;
import org.junit.Test;


public class junit {
   
	Innertest in=new Innertest("1",3,7);
	@Test
	public void p(){
		in.print();
		Assert.assertEquals(10,in.sum() );
		
}
}
