package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112036an;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.hq */
/* compiled from: PG */
public final /* synthetic */ class C112617hq implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C112617hq f312219a = new C112617hq();

    private /* synthetic */ C112617hq() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = C112621hu.f312223b;
        return (Stream) ((C112036an) obj).mo99340b("duration").map(C112620ht.f312222a).map(C112590gs.f312188a).map(C112591gt.f312189a).orElse(Stream.CC.empty());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
