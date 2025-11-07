

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CommentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CommentTest
{
    /**
     * Default constructor for test class CommentTest
     */
    public CommentTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    /**
     * Check if a comment's author is stored correctly.
     * Answer to Question 18.
     */
    @Test
    public void testAuthorSaved()
    {
        Comment comment1 = new Comment("author", "comment", 5);
        assertEquals("author", comment1.getAuthor());
    }
    
    /**
     * Check if a comment's upvote is stored correctly.
     * Answer to Question 18.
     */
    @Test
    public void testUpvoteSaved()
    {
        Comment comment1 = new Comment("author", "comment", 5);
        comment1.upvote();
        assertEquals(1, comment1.getVoteCount());
    }
    
    /**
     * Check if a comment's downvote is stored correctly.
     * Answer to Question 18.
     */
    @Test
    public void testDownvoteSaved()
    {
        Comment comment1 = new Comment("author", "comment", 5);
        comment1.downvote();
        assertEquals(-1, comment1.getVoteCount());
    }
}
