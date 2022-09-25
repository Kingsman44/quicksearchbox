package com.google.android.apps.search.googleapp.accounts.p10126ui;

import com.google.apps.tiktok.account.data.C46108a;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.t */
/* compiled from: PG */
public final /* synthetic */ class C133363t implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C133364u f363397a;

    public /* synthetic */ C133363t(C133364u uVar) {
        this.f363397a = uVar;
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
        return ((C46108a) obj).mo50209a().equals(this.f363397a.f363399a);
    }
}
