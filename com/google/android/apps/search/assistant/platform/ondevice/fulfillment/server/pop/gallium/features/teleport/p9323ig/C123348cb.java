package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.cb */
/* compiled from: PG */
public final /* synthetic */ class C123348cb implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C123427f f341111a;

    public /* synthetic */ C123348cb(C123427f fVar) {
        this.f341111a = fVar;
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
        return C123377dd.m202733c(this.f341111a, (C123386dm) obj).isPresent();
    }
}
