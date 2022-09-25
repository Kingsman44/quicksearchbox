package com.google.android.apps.gsa.nga.engine.warmactions.p6258j;

import com.google.speech.p5218j.C66915ee;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.j.am */
/* compiled from: PG */
public final /* synthetic */ class C79657am implements Function {

    /* renamed from: a */
    public final /* synthetic */ C79672ba f218479a;

    public /* synthetic */ C79657am(C79672ba baVar) {
        this.f218479a = baVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C79672ba baVar = this.f218479a;
        return baVar.f218497d.mo28202b("[NGA][WA] logWarmActionFulfillment", new C79665au(baVar, (C66915ee) obj));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
