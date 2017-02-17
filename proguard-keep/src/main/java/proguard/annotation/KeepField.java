package proguard.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PACKAGE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * Created by huiyh on 2016/11/25.
 */
@Retention(CLASS)
@Target({PACKAGE,TYPE,ANNOTATION_TYPE,FIELD})
public @interface KeepField {
}
