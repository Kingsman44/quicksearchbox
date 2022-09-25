package com.google.android.apps.search.googleapp.p10117aa;

import com.google.apps.tiktok.account.data.C46108a;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.googleapp.aa.ay */
/* compiled from: PG */
public final /* synthetic */ class C133107ay implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C133107ay f362891a = new C133107ay();

    private /* synthetic */ C133107ay() {
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
        return ((C46108a) obj).mo50210b().f121165j.equals("pseudonymous");
    }
}
