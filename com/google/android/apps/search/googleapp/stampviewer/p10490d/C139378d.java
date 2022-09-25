package com.google.android.apps.search.googleapp.stampviewer.p10490d;

import com.google.p4017at.p4027c.p4031b.p4038c.p4039a.C53903o;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.d.d */
/* compiled from: PG */
public final /* synthetic */ class C139378d implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f379002a;

    public /* synthetic */ C139378d(String str) {
        this.f379002a = str;
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
        return ((C53903o) obj).f141441c.equals(this.f379002a);
    }
}
