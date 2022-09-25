package com.google.android.apps.gsa.nga.engine.grammar;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.grammar.q */
/* compiled from: PG */
public final /* synthetic */ class C76139q implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f211101a;

    public /* synthetic */ C76139q(String str) {
        this.f211101a = str;
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
        String str = this.f211101a;
        C76140r rVar = C76140r.GMAIL_IN_FG;
        return ((C76140r) obj).f211111i.equals(str);
    }
}
