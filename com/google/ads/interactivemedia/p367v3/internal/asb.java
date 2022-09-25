package com.google.ads.interactivemedia.p367v3.internal;

import java.io.Serializable;

/* renamed from: com.google.ads.interactivemedia.v3.internal.asb */
/* compiled from: PG */
final class asb extends asc implements Serializable {

    /* renamed from: a */
    static final asb f21474a = new asb();
    private static final long serialVersionUID = 0;

    private asb() {
    }

    private Object readResolve() {
        return f21474a;
    }

    /* renamed from: a */
    public final asc mo15341a() {
        return ask.f21498a;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        aqd.m19282j(comparable);
        aqd.m19282j(comparable2);
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
