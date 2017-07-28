package org.lambda3.indra.core.filter;

import org.testng.Assert;

import org.testng.annotations.Test;
public class UppercaseFilterTest {

    @Test
    public void test() {
        UppercaseFilter filter = new UppercaseFilter();

        String term = "Capital";
        String word = "word";

        term = filter.filterTerm(term, word);
        System.out.print(term);
        Assert.assertFalse(term.contains("Capital"));
        Assert.assertFalse(term.contains("Passau University"));
        Assert.assertTrue(term.contains(""));




    }
}
