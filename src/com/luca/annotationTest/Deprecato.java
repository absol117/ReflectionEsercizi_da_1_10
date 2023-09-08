package com.luca.annotationTest;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.ANNOTATION_TYPE,ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD})
public @interface Deprecato {
    String since() default "";
    boolean forRemoval() default false;
}
