package com.google.android.apps.search.assistant.verticals.p9880a.p9891g;

import android.app.DirectAction;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.g.j */
/* compiled from: PG */
public final /* synthetic */ class C130401j implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C130401j f357344a = new C130401j();

    private /* synthetic */ C130401j() {
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
        return ((DirectAction) obj).getId().equals("handover_result");
    }
}
