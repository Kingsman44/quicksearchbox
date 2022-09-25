package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130701b;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.q */
/* compiled from: PG */
public final /* synthetic */ class C131062q implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C131071z f358500a;

    public /* synthetic */ C131062q(C131071z zVar) {
        this.f358500a = zVar;
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
        return this.f358500a.f358519h.f178307a.contains(((C130701b) obj).mo109797h());
    }
}
