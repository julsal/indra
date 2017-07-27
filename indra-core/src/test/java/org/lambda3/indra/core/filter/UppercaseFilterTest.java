package org.lambda3.indra.core.filter;

import org.testng.Assert;

import org.testng.annotations.Test;
public class UppercaseFilterTest {

    @Test
    public void test() {
        UppercaseFilter filter = new UppercaseFilter();

        String term = "Capital";

        term = filter.filterTerm(term);
        System.out.print(term);
        Assert.assertFalse(term.contains("Capital"));
        Assert.assertFalse(term.contains("Passau University"));
        Assert.assertTrue(term.contains(""));




    }
}
