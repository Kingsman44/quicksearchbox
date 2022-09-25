package com.google.p386ak.p387a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.google.ak.a.a */
/* compiled from: PG */
public @interface C8264a {
    /* renamed from: a */
    Class mo17025a();

    /* renamed from: b */
    boolean mo17026b() default true;
}
