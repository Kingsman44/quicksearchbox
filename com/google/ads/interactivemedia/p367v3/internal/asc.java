package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Comparator;

/* renamed from: com.google.ads.interactivemedia.v3.internal.asc */
/* compiled from: PG */
public abstract class asc implements Comparator {
    protected asc() {
    }

    /* renamed from: b */
    public static asc m19475b() {
        return asb.f21474a;
    }

    /* renamed from: c */
    public static asc m19476c(Comparator comparator) {
        if (comparator instanceof asc) {
            return (asc) comparator;
        }
        return new aqs(comparator);
    }

    /* renamed from: a */
    public asc mo15341a() {
        return new asl(this);
    }

    public abstract int compare(Object obj, Object obj2);
}
