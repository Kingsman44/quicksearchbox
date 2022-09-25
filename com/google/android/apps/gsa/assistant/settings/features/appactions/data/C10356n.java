package com.google.android.apps.gsa.assistant.settings.features.appactions.data;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.data.n */
/* compiled from: PG */
public final /* synthetic */ class C10356n implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ long f35042a;

    public /* synthetic */ C10356n(long j) {
        this.f35042a = j;
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
        return this.f35042a == ((C10342bb) obj).mo18442a();
    }
}
