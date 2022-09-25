package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112036an;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.gy */
/* compiled from: PG */
public final /* synthetic */ class C112596gy implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C112596gy f312194a = new C112596gy();

    private /* synthetic */ C112596gy() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C112036an anVar = (C112036an) obj;
        int i = C112621hu.f312223b;
        Optional b = anVar.mo99340b("trigger_time");
        Objects.requireNonNull(anVar);
        return (Stream) b.flatMap(new C112603hc(anVar)).map(C112613hm.f312215a).orElse(Stream.CC.empty());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
