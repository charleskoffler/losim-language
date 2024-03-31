package org.simol.simolframework.java;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Simol Framework
 * 2.0 20240331 Addition of Abstraction, Comp_as_worker, and Model annotations. 
 * @author Charles Koffler
 *
 */

@Retention(RUNTIME)
@Target(TYPE)
public @interface Simu_real_world_obj {
	Role value() default Role.UNDEFINED;
}
