package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8503c;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113167by;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.assistant.p3825an.p3830c.p3831a.C49270ap;
import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.c.ae */
/* compiled from: PG */
public final /* synthetic */ class C111336ae implements Function {

    /* renamed from: a */
    public final /* synthetic */ C111346ao f309814a;

    /* renamed from: b */
    public final /* synthetic */ boolean f309815b;

    /* renamed from: c */
    public final /* synthetic */ C113405ep f309816c;

    /* renamed from: d */
    public final /* synthetic */ C49301bt f309817d;

    /* renamed from: e */
    public final /* synthetic */ Map f309818e;

    public /* synthetic */ C111336ae(C111346ao aoVar, boolean z, C113405ep epVar, C49301bt btVar, Map map) {
        this.f309814a = aoVar;
        this.f309815b = z;
        this.f309816c = epVar;
        this.f309817d = btVar;
        this.f309818e = map;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C111346ao aoVar = this.f309814a;
        boolean z = this.f309815b;
        C113405ep epVar = this.f309816c;
        C49301bt btVar = this.f309817d;
        Map map = this.f309818e;
        C49270ap apVar = (C49270ap) obj;
        return z ? ((C113167by) aoVar.f309840h.mo27525b()).mo99893a("buildSuggestionWrapperInternal", new C111387w(aoVar, epVar, btVar, apVar, map)) : aoVar.mo99110e(epVar, btVar, apVar.f127356b, apVar, 1.0d, map);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
