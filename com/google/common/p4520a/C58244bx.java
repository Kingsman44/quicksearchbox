package com.google.common.p4520a;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: com.google.common.a.bx */
/* compiled from: PG */
final class C58244bx implements PrivilegedExceptionAction {
    /* renamed from: a */
    public static final Unsafe m89176a() {
        Class<Unsafe> cls = Unsafe.class;
        for (Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get((Object) null);
            if (cls.isInstance(obj)) {
                return cls.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    public final /* bridge */ /* synthetic */ Object run() {
        return m89176a();
    }
}
