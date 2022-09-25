package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import p001a.p014d.p015a.p016a.C0081z;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.ef */
/* compiled from: PG */
public final /* synthetic */ class C123406ef implements Function {

    /* renamed from: a */
    public final /* synthetic */ C123459ge f341169a;

    public /* synthetic */ C123406ef(C123459ge geVar) {
        this.f341169a = geVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C0081z zVar = (C0081z) obj;
        Optional ofNullable = Optional.ofNullable((C123388do) this.f341169a.f341247a.f341301c.get(zVar));
        if (!ofNullable.isPresent()) {
            return C123377dd.m202731a(zVar);
        }
        return (C123388do) ofNullable.get();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
