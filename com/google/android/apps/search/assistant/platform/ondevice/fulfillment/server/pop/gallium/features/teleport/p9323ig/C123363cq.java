package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.cq */
/* compiled from: PG */
public final /* synthetic */ class C123363cq implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C123388do f341127a;

    public /* synthetic */ C123363cq(C123388do doVar) {
        this.f341127a = doVar;
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
        C123388do doVar = this.f341127a;
        int i = C123377dd.f341141a;
        return Collection.EL.stream(doVar.mo105978b()).anyMatch(new C123348cb((C123427f) obj));
    }
}
