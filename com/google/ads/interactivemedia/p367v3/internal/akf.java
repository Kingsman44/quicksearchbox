package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.akf */
/* compiled from: PG */
final class akf implements agu {
    /* renamed from: a */
    public final agt mo14748a(age age, akz akz) {
        Class<? super Enum> a = akz.mo14887a();
        if (!Enum.class.isAssignableFrom(a) || a == Enum.class) {
            return null;
        }
        if (!a.isEnum()) {
            a = a.getSuperclass();
        }
        return new akt(a);
    }
}
