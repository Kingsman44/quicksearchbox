package com.google.android.apps.search.googleapp.search.srp;

import android.net.Uri;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.ad */
/* compiled from: PG */
public final /* synthetic */ class C137701ad implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C137711an f374534a;

    public /* synthetic */ C137701ad(C137711an anVar) {
        this.f374534a = anVar;
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
        return !this.f374534a.f374596o.mo114009c(Uri.parse((String) obj));
    }
}
