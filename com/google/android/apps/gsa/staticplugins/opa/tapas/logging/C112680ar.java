package com.google.android.apps.gsa.staticplugins.opa.tapas.logging;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.common.p4552o.p4553a.C59525cv;
import java.util.HashMap;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.logging.ar */
/* compiled from: PG */
public final /* synthetic */ class C112680ar implements Function {

    /* renamed from: a */
    public final /* synthetic */ HashMap f312322a;

    public /* synthetic */ C112680ar(HashMap hashMap) {
        this.f312322a = hashMap;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (C59525cv) this.f312322a.get((C113415ez) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
