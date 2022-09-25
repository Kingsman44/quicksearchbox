package com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9224d;

import java.util.AbstractMap;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.i.c.b.d.o */
/* compiled from: PG */
public final /* synthetic */ class C121449o implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C121449o f337104a = new C121449o();

    private /* synthetic */ C121449o() {
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        return !((String) ((AbstractMap.SimpleEntry) obj).getKey()).isEmpty();
    }
}
