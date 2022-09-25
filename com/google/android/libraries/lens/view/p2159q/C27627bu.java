package com.google.android.libraries.lens.view.p2159q;

import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24440ab;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24446ah;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24465t;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.q.bu */
/* compiled from: PG */
public final /* synthetic */ class C27627bu implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C24465t f75481a;

    public /* synthetic */ C27627bu(C24465t tVar) {
        this.f75481a = tVar;
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
        C24465t tVar = this.f75481a;
        C24440ab abVar = (C24440ab) obj;
        if (abVar == null) {
            return true;
        }
        C24465t tVar2 = abVar.f66920b;
        if (tVar2 == null) {
            tVar2 = C24465t.f66964f;
        }
        if (!tVar2.f66967b.equals(tVar.f66967b)) {
            return true;
        }
        C24446ah a = C24446ah.m45519a(abVar.f66922d);
        if (a == null) {
            a = C24446ah.STATUS_UNKNOWN;
        }
        return a.equals(C24446ah.STATUS_MODEL_UNKNOWN);
    }
}
