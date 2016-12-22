package poctests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import poctests.category.FastTestCategory;

@Category({FastTestCategory.class})
public class AdderTest {
    @Test
    public void testSum() {
        Assert.assertTrue("Sum result", Adder.Sum(2,3) == 5);
    }
}