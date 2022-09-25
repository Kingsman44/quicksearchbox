package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.de */
/* compiled from: PG */
public final /* synthetic */ class C123378de implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f341143a;

    /* renamed from: b */
    public final /* synthetic */ int f341144b;

    public /* synthetic */ C123378de(int i, int i2) {
        this.f341143a = i;
        this.f341144b = i2;
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
        C80047aa aaVar = (C80047aa) obj;
        return aaVar.f219660d >= this.f341143a && aaVar.f219661e <= this.f341144b;
    }
}
