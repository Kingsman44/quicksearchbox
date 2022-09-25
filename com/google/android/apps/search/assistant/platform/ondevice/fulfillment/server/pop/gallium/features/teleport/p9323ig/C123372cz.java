package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.cz */
/* compiled from: PG */
public final /* synthetic */ class C123372cz implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ double f341136a;

    public /* synthetic */ C123372cz(double d) {
        this.f341136a = d;
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
        double d = this.f341136a;
        int i = C123377dd.f341141a;
        return Double.compare(((C80047aa) obj).f219663g, d) > 0;
    }
}
