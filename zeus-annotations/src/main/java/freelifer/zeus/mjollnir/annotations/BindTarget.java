package freelifer.zeus.mjollnir.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author zhukun on 2017/6/2.
 */
@Target({FIELD})
@Retention(RUNTIME)
@Documented
public @interface BindTarget {
}