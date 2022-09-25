package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8260d;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.C106864c;
import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.d.h */
/* compiled from: PG */
public final /* synthetic */ class C106997h implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f298005a;

    public /* synthetic */ C106997h(int i) {
        this.f298005a = i;
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
        Map.Entry entry = (Map.Entry) obj;
        return !((C106864c) entry.getValue()).mo95699d() && C106991b.m177717a(((C106864c) entry.getValue()).mo95697b()) == this.f298005a;
    }
}
