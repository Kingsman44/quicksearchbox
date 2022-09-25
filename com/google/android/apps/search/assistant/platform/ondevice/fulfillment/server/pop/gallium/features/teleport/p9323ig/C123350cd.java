package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.cd */
/* compiled from: PG */
public final /* synthetic */ class C123350cd implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f341113a;

    public /* synthetic */ C123350cd(String str) {
        this.f341113a = str;
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
        String str = this.f341113a;
        int i = C123377dd.f341141a;
        return ((C123385dl) obj).mo105985b().startsWith(str);
    }
}
