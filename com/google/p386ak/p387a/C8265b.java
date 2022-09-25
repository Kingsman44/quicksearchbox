package com.google.p386ak.p387a;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.google.ak.a.b */
/* compiled from: PG */
public @interface C8265b {
    /* renamed from: a */
    String mo17027a();

    /* renamed from: b */
    String[] mo17028b() default {};
}
