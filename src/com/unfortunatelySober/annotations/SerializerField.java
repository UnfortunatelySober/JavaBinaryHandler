package com.unfortunatelySober.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Cody on 11/12/2018.
 */

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface SerializerField {
    int order();
    String name() default "";
    String[] arguments() default {};
    SerializeFieldAction action() default SerializeFieldAction.BOTH;
}
