package com.xxxx.fastsz.test;

import com.xxxx.fastsz.annnotation.Complexity;
import com.xxxx.fastsz.annnotation.ComplexityLevel;

@Complexity(ComplexityLevel.VERY_SIMPLE)
public class SimpleAnnotationsTest {
	public SimpleAnnotationsTest() {
        super();
    }

    @Complexity() // this annotation type applies also to methods
                  // the default value 'ComplexityLevel.MEDIUM' is assumed
    public void theMethod() {
        System.out.println("consoleut");
    }
}
