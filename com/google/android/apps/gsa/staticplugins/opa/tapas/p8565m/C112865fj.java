package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import java.util.Locale;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.fj */
/* compiled from: PG */
public final /* synthetic */ class C112865fj implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f312823a;

    public /* synthetic */ C112865fj(String str) {
        this.f312823a = str;
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
        CharSequence charSequence = (CharSequence) obj;
        return charSequence != null && charSequence.toString().toLowerCase(Locale.getDefault()).equals(this.f312823a.toLowerCase(Locale.getDefault()));
    }
}
