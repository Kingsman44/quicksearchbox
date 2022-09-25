package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.ce */
/* compiled from: PG */
public final /* synthetic */ class C123351ce implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f341114a;

    /* renamed from: b */
    public final /* synthetic */ int f341115b;

    public /* synthetic */ C123351ce(int i, int i2) {
        this.f341114a = i;
        this.f341115b = i2;
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
        int i = this.f341114a;
        int i2 = this.f341115b;
        C80047aa aaVar = (C80047aa) obj;
        int i3 = C123377dd.f341141a;
        return aaVar.f219660d == i && aaVar.f219661e == i2;
    }
}
