package com.google.android.apps.gsa.staticplugins.opa.smartspace;

import com.google.android.apps.gsa.opa.smartspace.C83733ae;
import com.google.android.apps.gsa.opa.smartspace.C83734af;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.i */
/* compiled from: PG */
public final /* synthetic */ class C110698i implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C110698i f308461a = new C110698i();

    private /* synthetic */ C110698i() {
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
        int a = C83733ae.m133320a(((C83734af) obj).f228220c);
        return a == 0 || a == 1;
    }
}
