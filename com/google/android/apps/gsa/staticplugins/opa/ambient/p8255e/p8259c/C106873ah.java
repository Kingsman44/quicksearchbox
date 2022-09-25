package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import java.util.Set;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.ah */
/* compiled from: PG */
public final /* synthetic */ class C106873ah implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Set f297768a;

    public /* synthetic */ C106873ah(Set set) {
        this.f297768a = set;
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
        return !this.f297768a.contains((C106868ac) obj);
    }
}
