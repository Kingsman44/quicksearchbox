package com.google.android.apps.gsa.assistant.settings.features.appactions.data;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.data.m */
/* compiled from: PG */
public final /* synthetic */ class C10355m implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f35041a;

    public /* synthetic */ C10355m(String str) {
        this.f35041a = str;
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
        return this.f35041a.equals(((C10339az) obj).mo18432b().f129507b);
    }
}
