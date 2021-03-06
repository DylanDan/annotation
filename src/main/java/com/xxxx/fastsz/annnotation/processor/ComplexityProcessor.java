package com.xxxx.fastsz.annnotation.processor;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic.Kind;

import com.xxxx.fastsz.annnotation.Complexity;

/**
 * https://deors.wordpress.com/2011/10/31/annotation-generators/
 * https://github.com/deors/deors.demos.annotations
 * @author Dylan.Dan
 *
 */
@SupportedAnnotationTypes("com.xxxx.fastsz.annnotation.Complexity")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class ComplexityProcessor extends AbstractProcessor {
	
	 public ComplexityProcessor() {
         super();
     }

	@Override
	public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
		for (Element elem : roundEnv.getElementsAnnotatedWith(Complexity.class)) {
	        Complexity complexity = elem.getAnnotation(Complexity.class);
	        String message = "annotation found in " + elem.getSimpleName()
	                       + " with complexity " + complexity.value();
	        processingEnv.getMessager().printMessage(Kind.NOTE, message);
	    }
		return false;
	}

}
