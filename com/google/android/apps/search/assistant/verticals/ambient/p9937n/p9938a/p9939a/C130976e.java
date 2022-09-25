package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9938a.p9939a;

import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130701b;
import p3186j$.time.Duration;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.a.a.e */
/* compiled from: PG */
public final /* synthetic */ class C130976e implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C130984m f358346a;

    public /* synthetic */ C130976e(C130984m mVar) {
        this.f358346a = mVar;
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
        return this.f358346a.f358360d.compareTo((Duration) ((C130701b) obj).mo109794e().orElse(Duration.ZERO)) <= 0;
    }
}
