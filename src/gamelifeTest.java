import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class gamelifeTest {
	private static gamelife game=new gamelife();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testStartgame() {
		game.startgame(1, 10);
		game.startgame(10, 10);
		game.startgame(10, 100);
		assertEquals(true,game.result);
	}

}
