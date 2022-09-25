package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m.p8516a;

import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a.C111648ac;
import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a.C111649ad;
import com.google.protos.p4985f.p5046x.C65379d;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.m.a.b */
/* compiled from: PG */
public final /* synthetic */ class C111569b implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C111569b f310291a = new C111569b();

    private /* synthetic */ C111569b() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C65379d dVar = (C65379d) obj;
        C111648ac acVar = (C111648ac) C111649ad.f310414d.createBuilder();
        String str = dVar.f177779b;
        acVar.copyOnWrite();
        C111649ad adVar = (C111649ad) acVar.instance;
        str.getClass();
        adVar.f310416a |= 1;
        adVar.f310418c = str;
        acVar.mo99201a(dVar.f177781d);
        return (C111649ad) acVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
