package com.google.ads.interactivemedia.p367v3.internal;

import java.io.Serializable;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ask */
/* compiled from: PG */
final class ask extends asc implements Serializable {

    /* renamed from: a */
    static final ask f21498a = new ask();
    private static final long serialVersionUID = 0;

    private ask() {
    }

    private Object readResolve() {
        return f21498a;
    }

    /* renamed from: a */
    public final asc mo15341a() {
        return asb.f21474a;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        aqd.m19282j(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
