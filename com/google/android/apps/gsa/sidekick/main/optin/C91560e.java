package com.google.android.apps.gsa.sidekick.main.optin;

import android.accounts.Account;
import com.google.common.p4522b.C58495hd;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.sidekick.main.optin.e */
/* compiled from: PG */
public final /* synthetic */ class C91560e implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58495hd f255400a;

    public /* synthetic */ C91560e(C58495hd hdVar) {
        this.f255400a = hdVar;
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
        return ((Boolean) this.f255400a.getOrDefault((Account) obj, true)).booleanValue();
    }
}
