package com.google.android.apps.search.googleapp.search.suggest.p10449b;

import com.google.p395al.p417d.p418a.C8541au;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.b.u */
/* compiled from: PG */
public final /* synthetic */ class C138064u implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ long f375640a;

    public /* synthetic */ C138064u(long j) {
        this.f375640a = j;
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
        long j = this.f375640a;
        C8541au auVar = (C8541au) obj;
        return auVar.f29633a <= j && j <= auVar.f29634b;
    }
}
