package poctests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import poctests.category.SlowTestCategory;

@Category({SlowTestCategory.class})
public class SubtractorTest {
    @Test
    public void testSum() {
        Assert.assertTrue("Sum result", Subtractor.Subtract(-5, 5) == 0);
    }
}