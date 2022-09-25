package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8502b;

import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a.C111649ad;
import com.google.assistant.p3858ar.p3859a.C49728r;
import com.google.common.p4522b.C58370cn;
import com.google.common.util.concurrent.C60856cj;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.b.u */
/* compiled from: PG */
public final /* synthetic */ class C111325u implements Function {

    /* renamed from: a */
    public final /* synthetic */ C111305ag f309786a;

    /* renamed from: b */
    public final /* synthetic */ C49728r f309787b;

    /* renamed from: c */
    public final /* synthetic */ Map f309788c;

    public /* synthetic */ C111325u(C111305ag agVar, C49728r rVar, Map map) {
        this.f309786a = agVar;
        this.f309787b = rVar;
        this.f309788c = map;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C111305ag agVar = this.f309786a;
        C49728r rVar = this.f309787b;
        Map map = this.f309788c;
        C111649ad adVar = (C111649ad) obj;
        String str = rVar.f128342b;
        String str2 = adVar.f310418c;
        return agVar.f309732b.mo28209i(C60856cj.m92906o((List) Collection.EL.stream(adVar.f310417b).map(new C111318n(agVar, rVar, adVar, map)).collect(C58370cn.f155946a)), "flatten the suggestion list", C111319o.f309775a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
