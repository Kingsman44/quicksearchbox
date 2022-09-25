package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8503c;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.assistant.p3825an.p3830c.p3831a.C49271aq;
import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.c.af */
/* compiled from: PG */
public final /* synthetic */ class C111337af implements Function {

    /* renamed from: a */
    public final /* synthetic */ C111346ao f309819a;

    /* renamed from: b */
    public final /* synthetic */ boolean f309820b;

    /* renamed from: c */
    public final /* synthetic */ C113405ep f309821c;

    /* renamed from: d */
    public final /* synthetic */ Map f309822d;

    public /* synthetic */ C111337af(C111346ao aoVar, boolean z, C113405ep epVar, Map map) {
        this.f309819a = aoVar;
        this.f309820b = z;
        this.f309821c = epVar;
        this.f309822d = map;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C111346ao aoVar = this.f309819a;
        boolean z = this.f309820b;
        C113405ep epVar = this.f309821c;
        Map map = this.f309822d;
        C49301bt btVar = (C49301bt) obj;
        C49271aq aqVar = btVar.f127428d;
        if (aqVar == null) {
            aqVar = C49271aq.f127363b;
        }
        return Collection.EL.stream(aqVar.f127365a).map(new C111336ae(aoVar, z, epVar, btVar, map));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
