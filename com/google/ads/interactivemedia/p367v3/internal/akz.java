package com.google.ads.interactivemedia.p367v3.internal;

import com.google.ads.interactivemedia.p367v3.impl.data.C6731ax;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: com.google.ads.interactivemedia.v3.internal.akz */
/* compiled from: PG */
public final class akz {

    /* renamed from: a */
    final Class f20845a;

    /* renamed from: b */
    final Type f20846b;

    /* renamed from: c */
    final int f20847c;

    protected akz() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        this.f20846b = aha.m18711b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        throw null;
    }

    /* renamed from: c */
    public static akz m18867c(Type type) {
        return new akz(type);
    }

    /* renamed from: d */
    public static akz m18868d(Class cls) {
        return new akz(cls);
    }

    /* renamed from: a */
    public final Class mo14887a() {
        return this.f20845a;
    }

    /* renamed from: b */
    public final Type mo14888b() {
        return this.f20846b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof akz) && aha.m18713d(this.f20846b, ((akz) obj).f20846b);
    }

    public final int hashCode() {
        return this.f20847c;
    }

    public final String toString() {
        return aha.m18714e(this.f20846b);
    }

    public akz(Type type) {
        C6731ax.m18030f(type);
        Type b = aha.m18711b(type);
        this.f20846b = b;
        this.f20845a = aha.m18712c(b);
        this.f20847c = b.hashCode();
    }
}
