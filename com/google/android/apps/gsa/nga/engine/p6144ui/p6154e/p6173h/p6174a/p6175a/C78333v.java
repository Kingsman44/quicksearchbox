package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6175a;

import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80581o;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80590x;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.IntPredicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.a.v */
/* compiled from: PG */
public final /* synthetic */ class C78333v implements IntPredicate {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f215654a;

    public /* synthetic */ C78333v(C58485gu guVar) {
        this.f215654a = guVar;
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return IntPredicate.CC.$default$and(this, intPredicate);
    }

    public final /* synthetic */ IntPredicate negate() {
        return IntPredicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ IntPredicate mo19598or(IntPredicate intPredicate) {
        return IntPredicate.CC.$default$or(this, intPredicate);
    }

    public final boolean test(int i) {
        C58485gu guVar = this.f215654a;
        C59071e eVar = C78335x.f215657a;
        C80590x xVar = C80590x.LENS;
        C80590x a = C80590x.m128211a(((C80581o) guVar.get(i)).f221191a);
        if (a == null) {
            a = C80590x.UNRECOGNIZED;
        }
        return xVar.equals(a);
    }
}
