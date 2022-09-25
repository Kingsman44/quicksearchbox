package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6093g;

import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.protos.p4883as.p4884a.C63775d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.g.ab */
/* compiled from: PG */
public final /* synthetic */ class C77310ab implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C76590bg f213221a;

    public /* synthetic */ C77310ab(C76590bg bgVar) {
        this.f213221a = bgVar;
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
        return C77317ai.m124085d((C63775d) obj, this.f213221a);
    }
}
