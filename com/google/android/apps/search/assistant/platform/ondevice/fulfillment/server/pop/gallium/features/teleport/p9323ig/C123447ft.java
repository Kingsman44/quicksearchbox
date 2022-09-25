package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.common.base.C58817ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.ft */
/* compiled from: PG */
public final /* synthetic */ class C123447ft implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C123459ge f341227a;

    /* renamed from: b */
    public final /* synthetic */ C123427f f341228b;

    public /* synthetic */ C123447ft(C123459ge geVar, C123427f fVar) {
        this.f341227a = geVar;
        this.f341228b = fVar;
    }

    public final Object apply(Object obj) {
        C123459ge geVar = this.f341227a;
        C123427f fVar = this.f341228b;
        if (!((Boolean) obj).booleanValue()) {
            return Optional.empty();
        }
        return Optional.m71637of(geVar.f341250d.mo105911a("com.android.vending", fVar));
    }
}
