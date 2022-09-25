package com.google.android.apps.gsa.nga.shared.p6358n;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80294ap;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.shared.n.e */
/* compiled from: PG */
public final /* synthetic */ class C81434e implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C80294ap f222843a;

    public /* synthetic */ C81434e(C80294ap apVar) {
        this.f222843a = apVar;
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
        C80294ap apVar = this.f222843a;
        C60870cx cxVar = C81442m.f222851a;
        return C80294ap.m128115a(((C80295aq) obj).f220359a) == apVar;
    }
}
