package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import p001a.p014d.p015a.p016a.C0071p;
import p001a.p014d.p015a.p016a.C0072q;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.ed */
/* compiled from: PG */
public final /* synthetic */ class C123404ed implements Function {

    /* renamed from: a */
    public final /* synthetic */ boolean f341167a;

    public /* synthetic */ C123404ed(boolean z) {
        this.f341167a = z;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        boolean z = this.f341167a;
        int a = C0071p.m31a(((C0072q) obj).f201c);
        boolean z2 = true;
        if (a != 0 && a == 3 && !z) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
