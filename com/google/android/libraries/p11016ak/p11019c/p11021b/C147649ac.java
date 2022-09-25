package com.google.android.libraries.p11016ak.p11019c.p11021b;

import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.ak.c.b.ac */
/* compiled from: PG */
public final /* synthetic */ class C147649ac implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C147650ad f398491a;

    public /* synthetic */ C147649ac(C147650ad adVar) {
        this.f398491a = adVar;
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
        return ((Integer) ((Map.Entry) obj).getKey()).intValue() < this.f398491a.f398493a.mo124403a();
    }
}
