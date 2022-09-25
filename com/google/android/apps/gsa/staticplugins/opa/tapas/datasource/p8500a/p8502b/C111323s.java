package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8502b;

import com.google.assistant.p3781ad.p3789d.p3791b.C48670ae;
import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.assistant.p3858ar.p3859a.C49728r;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.b.s */
/* compiled from: PG */
public final /* synthetic */ class C111323s implements Function {

    /* renamed from: a */
    public final /* synthetic */ C111305ag f309780a;

    /* renamed from: b */
    public final /* synthetic */ C49728r f309781b;

    /* renamed from: c */
    public final /* synthetic */ String f309782c;

    /* renamed from: d */
    public final /* synthetic */ String f309783d;

    /* renamed from: e */
    public final /* synthetic */ Map f309784e;

    public /* synthetic */ C111323s(C111305ag agVar, C49728r rVar, String str, String str2, Map map) {
        this.f309780a = agVar;
        this.f309781b = rVar;
        this.f309782c = str;
        this.f309783d = str2;
        this.f309784e = map;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C111305ag agVar = this.f309780a;
        C49728r rVar = this.f309781b;
        String str = this.f309782c;
        String str2 = this.f309783d;
        Map map = this.f309784e;
        C49301bt btVar = (C49301bt) obj;
        String str3 = rVar.f128342b;
        C48670ae a = agVar.f309733c.mo99018a(btVar.f127426b);
        return agVar.f309732b.mo28209i(agVar.f309732b.mo28210j(agVar.f309732b.mo28209i(agVar.f309734d.mo98998c(str), "transform from tuples to prefilled params.", new C111312h(str2)), "build wrappers with prefilled params", new C111313i(agVar, rVar, str2, btVar, a, map)), "Remove failed converts", new C111314j(agVar));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
