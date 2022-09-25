package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8504b;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.b.p */
/* compiled from: PG */
public final /* synthetic */ class C111412p implements Function {

    /* renamed from: a */
    public final /* synthetic */ C111419w f309972a;

    public /* synthetic */ C111412p(C111419w wVar) {
        this.f309972a = wVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C60870cx cxVar;
        C111419w wVar = this.f309972a;
        C111418v vVar = (C111418v) obj;
        C22871g gVar = wVar.f309981b;
        String c = vVar.mo99130c();
        if (wVar.f309982c.mo79746e(C90063do.f249497ee)) {
            cxVar = wVar.f309986g.mo99926c(c);
        } else {
            cxVar = wVar.f309986g.mo99925b(c);
        }
        return gVar.mo28209i(cxVar, "get app label", new C111415s(wVar, vVar));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
