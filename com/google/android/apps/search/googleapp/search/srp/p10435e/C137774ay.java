package com.google.android.apps.search.googleapp.search.srp.p10435e;

import java.util.Map;
import p3186j$.util.function.Predicate;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.e.ay */
/* compiled from: PG */
final class C137774ay implements Predicate {

    /* renamed from: a */
    public static final C137774ay f374795a = new C137774ay();

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

    public final /* bridge */ /* synthetic */ boolean test(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        C69664n.m101061g(entry, "cgiParam");
        return C69664n.m101066l(entry.getKey(), "gs_lp") && ((CharSequence) entry.getValue()).length() > 0;
    }
}
