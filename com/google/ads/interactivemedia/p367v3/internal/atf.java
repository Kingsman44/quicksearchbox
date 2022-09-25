package com.google.ads.interactivemedia.p367v3.internal;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: com.google.ads.interactivemedia.v3.internal.atf */
/* compiled from: PG */
final class atf implements PrivilegedExceptionAction {
    /* renamed from: a */
    public static final Unsafe m19562a() {
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
        return m19562a();
    }
}
