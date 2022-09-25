package com.google.android.apps.search.googleapp.search.srp.p10438h;

import java.util.Locale;
import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.h.c */
/* compiled from: PG */
public final /* synthetic */ class C137867c implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C137867c f375100a = new C137867c();

    private /* synthetic */ C137867c() {
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
        return "X-Speech-Requestid".toLowerCase(Locale.ROOT).equals(((String) ((Map.Entry) obj).getKey()).toLowerCase(Locale.ROOT));
    }
}
