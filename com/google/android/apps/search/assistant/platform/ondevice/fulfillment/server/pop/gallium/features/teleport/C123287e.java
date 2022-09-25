package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123065m;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.e */
/* compiled from: PG */
public final /* synthetic */ class C123287e implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Optional f341018a;

    public /* synthetic */ C123287e(Optional optional) {
        this.f341018a = optional;
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
        Optional optional = this.f341018a;
        int i = C123522k.f341328b;
        return ((String) optional.get()).equals(((C123065m) obj).mo105847b());
    }
}
