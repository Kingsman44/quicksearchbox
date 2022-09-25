package com.google.android.apps.search.googleapp.promomanager.p10372b;

import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63909aw;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63919bf;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.i */
/* compiled from: PG */
public final /* synthetic */ class C137014i implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f372890a;

    public /* synthetic */ C137014i(int i) {
        this.f372890a = i;
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
        int i = this.f372890a;
        C63909aw awVar = ((C63919bf) obj).f172848b;
        if (awVar == null) {
            awVar = C63909aw.f172816e;
        }
        return awVar.f172820c == i;
    }
}
