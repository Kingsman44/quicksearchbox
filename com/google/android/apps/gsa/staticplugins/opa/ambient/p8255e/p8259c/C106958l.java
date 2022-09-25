package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130701b;
import p3186j$.time.Duration;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.l */
/* compiled from: PG */
public final /* synthetic */ class C106958l implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Duration f297919a;

    public /* synthetic */ C106958l(Duration duration) {
        this.f297919a = duration;
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
        return this.f297919a.compareTo((Duration) ((C130701b) obj).mo109794e().orElse(Duration.ZERO)) <= 0;
    }
}
