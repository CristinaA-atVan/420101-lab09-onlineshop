import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SalesItemTest.
 *
 * @author  mik
 * @version 0.1
 */
public class SalesItemTest
{
    /**
     * Default constructor for test class SalesItemTest
     */
    public SalesItemTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    /**
     * Test that a comment can be added, and that the comment count is correct afterwards.
     */
    @Test
    public void testAddComment()
    {
        SalesItem salesIte1 = new SalesItem("Brain surgery for Dummies", 21998);
        assertEquals(true, salesIte1.addComment("James Duckling", "This book is great. I perform brain surgery every week now.", 4));
        assertEquals(1, salesIte1.getNumberOfComments());
    }

    /**
     * Test that a comment using an illegal rating value is rejected.
     */
    @Test
    public void testIllegalRating()
    {
        SalesItem salesIte1 = new SalesItem("Java For Complete Idiots, Vol 2", 19900);
        assertEquals(false, salesIte1.addComment("Joshua Black", "Not worth the money. The font is too small.", -5));
    }

    /**
     * Test that a sales item is correctly initialised (name and price).
     */
    @Test
    public void testInit()
    {
        SalesItem salesIte1 = new SalesItem("test name", 1000);
        assertEquals("test name", salesIte1.getName());
        assertEquals(1000, salesIte1.getPrice());
    }
    
    /**
     * Test that addCommment returns false if a comment from the same author exists.
     * Answer to Question 15.
     */
    @Test
    public void testDuplicateAuthor()
    {
        SalesItem salesIte1 = new SalesItem("How To Cook Eggs", 36699);
        assertEquals(true, salesIte1.addComment("Eric Greggson", "Amazing guide, but the cost could be a lot lower.", 3));
        assertEquals(false, salesIte1.addComment("Eric Greggson", "I wish the price was lower", 3));
    }
    
    /**
     * Check to see if 0 and 6 are invalid ratings.
     * Answer to Question 16.
     */
    @Test
    public void testBoundaries()
    {
        SalesItem salesIte1 = new SalesItem("Controversial Book", 198400);
        assertEquals(false, salesIte1.addComment("Patricia Positive", "Amazing book!", 6));
        assertEquals(false, salesIte1.addComment("Nancy Negative", "Horrible book.", 0));
    }
    
    /**
     * Checks if findMostHelpfulComment() works as intended.
     * Answer to Question 19.
     */
    @Test
    public void testFindMostHelpfulComment() {
        SalesItem salesIte1 = new SalesItem("Dummy Item", 100);
        salesIte1.addComment("Person A", "Very helpful review", 5);
        salesIte1.upvoteComment(0);
        salesIte1.addComment("Person B", "Average review", 3);
        salesIte1.addComment("Person C", "Very horrible review", 1);
        salesIte1.downvoteComment(2);
        assertEquals(salesIte1.comments.get(0), salesIte1.findMostHelpfulComment());
    }
}
