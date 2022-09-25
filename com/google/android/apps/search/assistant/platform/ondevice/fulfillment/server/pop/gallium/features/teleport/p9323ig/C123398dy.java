package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import p001a.p014d.p015a.p016a.C0065j;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.dy */
/* compiled from: PG */
public final /* synthetic */ class C123398dy implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f341160a;

    /* renamed from: b */
    public final /* synthetic */ String f341161b;

    public /* synthetic */ C123398dy(String str, String str2) {
        this.f341160a = str;
        this.f341161b = str2;
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
        C0065j jVar = (C0065j) obj;
        return jVar.f178e.equals(this.f341160a) || jVar.f179f.equals(this.f341161b);
    }
}
