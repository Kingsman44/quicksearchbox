package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.ep */
/* compiled from: PG */
public final /* synthetic */ class C123416ep implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C123459ge f341186a;

    /* renamed from: b */
    public final /* synthetic */ C123427f f341187b;

    public /* synthetic */ C123416ep(C123459ge geVar, C123427f fVar) {
        this.f341186a = geVar;
        this.f341187b = fVar;
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
        C123459ge geVar = this.f341186a;
        C123427f fVar = this.f341187b;
        C80047aa aaVar = (C80047aa) obj;
        Optional i = C123459ge.m202807i(aaVar);
        if (!i.isPresent()) {
            return false;
        }
        return Collection.EL.stream(geVar.mo106011b((C123503i) i.get()).f118c).map(new C123406ef(geVar)).map(new C123407eg(fVar)).filter(C123453fz.f341237a).map(C123408eh.f341171a).anyMatch(new C123409ei(aaVar));
    }
}
