package com.google.p3723ar.core.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.CONSTRUCTOR})
/* renamed from: com.google.ar.core.annotations.UsedByReflection */
/* compiled from: PG */
public @interface UsedByReflection {
    String value();
}
