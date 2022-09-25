package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g;

import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48634bw;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.cy */
/* compiled from: PG */
public final /* synthetic */ class C112534cy implements Function {

    /* renamed from: a */
    public final /* synthetic */ C112548dl f312107a;

    public /* synthetic */ C112534cy(C112548dl dlVar) {
        this.f312107a = dlVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C112548dl dlVar = this.f312107a;
        Map.Entry entry = (Map.Entry) obj;
        C121537f fVar = C112548dl.f312129a;
        String name = ((C48634bw) entry.getKey()).name();
        return (C112547dk) fVar.mo105235d("signalProvider_".concat(String.valueOf(name)), new C112528cs(dlVar, entry));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
