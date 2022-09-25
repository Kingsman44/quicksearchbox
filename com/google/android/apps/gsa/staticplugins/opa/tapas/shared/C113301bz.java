package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import com.google.assistant.p3781ad.p3789d.p3791b.C48670ae;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.bz */
/* compiled from: PG */
public final /* synthetic */ class C113301bz implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C113301bz f313768a = new C113301bz();

    private /* synthetic */ C113301bz() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (C48670ae) ((Map.Entry) obj).getKey();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
