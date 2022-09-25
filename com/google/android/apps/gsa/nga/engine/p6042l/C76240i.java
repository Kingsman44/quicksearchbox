package com.google.android.apps.gsa.nga.engine.p6042l;

import com.google.protos.p5129p.p5131b.C65849r;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.l.i */
/* compiled from: PG */
public final /* synthetic */ class C76240i implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C76240i f211253a = new C76240i();

    private /* synthetic */ C76240i() {
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
        return ((C65849r) obj).f179004a == 3;
    }
}
