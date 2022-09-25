package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import java.util.List;
import p3186j$.util.function.IntPredicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.bz */
/* compiled from: PG */
public final /* synthetic */ class C123345bz implements IntPredicate {

    /* renamed from: a */
    public final /* synthetic */ List f341108a;

    public /* synthetic */ C123345bz(List list) {
        this.f341108a = list;
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return IntPredicate.CC.$default$and(this, intPredicate);
    }

    public final /* synthetic */ IntPredicate negate() {
        return IntPredicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ IntPredicate mo19598or(IntPredicate intPredicate) {
        return IntPredicate.CC.$default$or(this, intPredicate);
    }

    public final boolean test(int i) {
        return ((Boolean) this.f341108a.get(i)).booleanValue();
    }
}
