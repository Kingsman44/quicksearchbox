package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.protos.p4985f.p5030q.C65159dt;
import com.google.protos.p4985f.p5030q.C65196fc;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.ai */
/* compiled from: PG */
public final /* synthetic */ class C122573ai implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C122573ai f339733a = new C122573ai();

    private /* synthetic */ C122573ai() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C65196fc fcVar = (C65196fc) obj;
        if (fcVar.f176456b == 3) {
            return Optional.m71637of((C65159dt) fcVar.f176457c);
        }
        return Optional.empty();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
