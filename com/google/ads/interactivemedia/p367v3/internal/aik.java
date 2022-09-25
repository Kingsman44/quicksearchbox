package com.google.ads.interactivemedia.p367v3.internal;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aik */
/* compiled from: PG */
final class aik implements agu {
    /* renamed from: a */
    public final agt mo14748a(age age, akz akz) {
        Type type;
        Type b = akz.mo14888b();
        if (b instanceof GenericArrayType) {
            type = ((GenericArrayType) b).getGenericComponentType();
        } else if (!(b instanceof Class)) {
            return null;
        } else {
            Class cls = (Class) b;
            if (!cls.isArray()) {
                return null;
            }
            type = cls.getComponentType();
        }
        return new ail(age, age.mo14704b(akz.m18867c(type)), aha.m18712c(type));
    }
}
