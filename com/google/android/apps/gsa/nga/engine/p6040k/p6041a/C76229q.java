package com.google.android.apps.gsa.nga.engine.p6040k.p6041a;

import android.content.Intent;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.k.a.q */
/* compiled from: PG */
public final /* synthetic */ class C76229q implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C76231s f211241a;

    public /* synthetic */ C76229q(C76231s sVar) {
        this.f211241a = sVar;
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
        C76231s sVar = this.f211241a;
        return !sVar.f211244b.mo85405j(C90126fx.f251304gL) || ((Intent) obj).resolveActivity(sVar.f211243a.getPackageManager()) != null;
    }
}
