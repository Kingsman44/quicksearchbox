package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8502b;

import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a.C111649ad;
import com.google.assistant.p3858ar.p3859a.C49728r;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.b.n */
/* compiled from: PG */
public final /* synthetic */ class C111318n implements Function {

    /* renamed from: a */
    public final /* synthetic */ C111305ag f309771a;

    /* renamed from: b */
    public final /* synthetic */ C49728r f309772b;

    /* renamed from: c */
    public final /* synthetic */ C111649ad f309773c;

    /* renamed from: d */
    public final /* synthetic */ Map f309774d;

    public /* synthetic */ C111318n(C111305ag agVar, C49728r rVar, C111649ad adVar, Map map) {
        this.f309771a = agVar;
        this.f309772b = rVar;
        this.f309773c = adVar;
        this.f309774d = map;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C111305ag agVar = this.f309771a;
        return agVar.f309738h.mo99894b("getAppActionSuggestions", new C111327w(agVar, this.f309772b, (String) obj, this.f309773c, this.f309774d));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
