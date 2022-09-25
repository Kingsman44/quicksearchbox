package com.google.android.apps.gsa.staticplugins.opa.p8335be;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.store.C118332u;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.be.ar */
/* compiled from: PG */
public final /* synthetic */ class C107991ar implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C108013bm f300460a;

    public /* synthetic */ C107991ar(C108013bm bmVar) {
        this.f300460a = bmVar;
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
        return ((C118332u) obj).f328461b.startsWith(this.f300460a.f300494j.mo96371b(12, 27, BuildConfig.FLAVOR));
    }
}
