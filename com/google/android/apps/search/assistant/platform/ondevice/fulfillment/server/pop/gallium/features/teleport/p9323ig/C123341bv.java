package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.bv */
/* compiled from: PG */
public final /* synthetic */ class C123341bv implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f341100a;

    /* renamed from: b */
    public final /* synthetic */ int f341101b;

    public /* synthetic */ C123341bv(int i, int i2) {
        this.f341100a = i;
        this.f341101b = i2;
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
        int i = this.f341100a;
        int i2 = this.f341101b;
        C80047aa aaVar = (C80047aa) obj;
        int i3 = C123377dd.f341141a;
        return aaVar.f219660d == i && aaVar.f219661e == i2;
    }
}
