package com.google.ads.interactivemedia.p367v3.internal;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* renamed from: com.google.ads.interactivemedia.v3.internal.agx */
/* compiled from: PG */
final class agx implements GenericArrayType, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final Type f20635a;

    public agx(Type type) {
        this.f20635a = aha.m18711b(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && aha.m18713d(this, (GenericArrayType) obj);
    }

    public final Type getGenericComponentType() {
        return this.f20635a;
    }

    public final int hashCode() {
        return this.f20635a.hashCode();
    }

    public final String toString() {
        return String.valueOf(aha.m18714e(this.f20635a)).concat("[]");
    }
}
