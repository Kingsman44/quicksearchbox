package com.google.android.libraries.lens.view.p2159q;

import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24465t;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24471z;
import java.util.List;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.q.bt */
/* compiled from: PG */
public final /* synthetic */ class C27626bt implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ List f75480a;

    public /* synthetic */ C27626bt(List list) {
        this.f75480a = list;
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
        List list = this.f75480a;
        C24465t tVar = ((C24471z) obj).f66983b;
        if (tVar == null) {
            tVar = C24465t.f66964f;
        }
        return C27628bv.m51420c(tVar, list);
    }
}
