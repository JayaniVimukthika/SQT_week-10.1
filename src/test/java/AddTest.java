import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.Test;

class AddTest {

	@Test
	public void testAddValidNum1Num2() {
		assert.assertEquals(MathUtil.addd(1,2),3);
	}

}
