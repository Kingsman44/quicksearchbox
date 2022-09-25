package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.shared.p6976ag.p6980d.C89126b;
import com.google.android.apps.gsa.shared.p6976ag.p6980d.C89128d;
import com.google.assistant.p3745ab.C48305dd;
import com.google.assistant.p3897e.p3921j.p3926e.C51992gr;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.iz */
/* compiled from: PG */
public final /* synthetic */ class C109303iz implements Function {

    /* renamed from: a */
    public final /* synthetic */ C89126b f304484a;

    /* renamed from: b */
    public final /* synthetic */ C48305dd f304485b;

    public /* synthetic */ C109303iz(C89126b bVar, C48305dd ddVar) {
        this.f304484a = bVar;
        this.f304485b = ddVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return C89128d.m144984d((C51992gr) obj, this.f304484a, this.f304485b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
