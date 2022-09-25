package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.protos.p4985f.p5030q.C65159dt;
import com.google.protos.p4985f.p5030q.C65184er;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.w */
/* compiled from: PG */
public final /* synthetic */ class C123559w implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C123559w f341422a = new C123559w();

    private /* synthetic */ C123559w() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C65184er erVar = (C65184er) obj;
        if (erVar.f176400a == 3) {
            return Optional.m71637of((C65159dt) erVar.f176401b);
        }
        return Optional.empty();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
