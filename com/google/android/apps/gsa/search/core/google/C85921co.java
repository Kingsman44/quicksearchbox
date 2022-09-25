package com.google.android.apps.gsa.search.core.google;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.search.core.google.co */
/* compiled from: PG */
public final /* synthetic */ class C85921co implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Optional f232304a;

    public /* synthetic */ C85921co(Optional optional) {
        this.f232304a = optional;
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
        Optional optional = this.f232304a;
        String str = (String) obj;
        return ((String) optional.get()).equals(str) || ((String) optional.get()).endsWith(".".concat(String.valueOf(str)));
    }
}
