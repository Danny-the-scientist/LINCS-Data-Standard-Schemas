

package edu.miami.ccs.dcic.standards;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for the attributes of JSON Schema
 *
 * @author akoleti
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
public @interface Attributes {
    String $ref() default "";

    String id() default "";

    String title() default "";

    String description() default "";

    long maximum() default Long.MIN_VALUE;

    boolean exclusiveMaximum() default false;

    int minimum() default Integer.MAX_VALUE;

    boolean exclusiveMinimum() default false;

    String pattern() default "";

    String format() default "";

    boolean required() default false;

    String[] enums() default {};

    int minItems() default 0;

    long maxItems() default -1L;

    boolean uniqueItems() default false;

    int multipleOf() default 0;

    int minLength() default 0;

    long maxLength() default -1L;
    
    boolean readonly() default false;

    boolean additionalProperties() default true;
}
