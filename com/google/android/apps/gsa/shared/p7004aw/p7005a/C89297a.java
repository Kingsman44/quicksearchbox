package com.google.android.apps.gsa.shared.p7004aw.p7005a;

import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8923a.C119091p;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.shared.aw.a.a */
/* compiled from: PG */
public final /* synthetic */ class C89297a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ long f242107a;

    public /* synthetic */ C89297a(long j) {
        this.f242107a = j;
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
        long j = this.f242107a;
        C119091p pVar = (C119091p) obj;
        return pVar.mo104167f() <= j && pVar.mo104165e() >= j;
    }
}
