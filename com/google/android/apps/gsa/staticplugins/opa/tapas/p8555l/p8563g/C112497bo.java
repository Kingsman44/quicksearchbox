package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g;

import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48634bw;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.bo */
/* compiled from: PG */
public final /* synthetic */ class C112497bo implements Function {

    /* renamed from: a */
    public final /* synthetic */ C112519cj f312032a;

    public /* synthetic */ C112497bo(C112519cj cjVar) {
        this.f312032a = cjVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C112519cj cjVar = this.f312032a;
        Map.Entry entry = (Map.Entry) obj;
        C121537f fVar = C112519cj.f312068a;
        String name = ((C48634bw) entry.getKey()).name();
        return (C112518ci) fVar.mo105235d("signalProvider_".concat(String.valueOf(name)), new C112489bg(cjVar, entry));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
