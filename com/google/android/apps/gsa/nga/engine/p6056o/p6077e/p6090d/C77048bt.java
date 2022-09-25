package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.engine.p5913am.p5921h.C74902be;
import java.util.Set;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.bt */
/* compiled from: PG */
public final /* synthetic */ class C77048bt implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Set f212658a;

    public /* synthetic */ C77048bt(Set set) {
        this.f212658a = set;
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
        return this.f212658a.contains(((C74902be) obj).mo71284c());
    }
}
