package com.google.android.apps.gsa.nga.engine.warmactions.p6258j;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.j.i */
/* compiled from: PG */
public final /* synthetic */ class C79700i implements Function {

    /* renamed from: a */
    public final /* synthetic */ C79705n f218572a;

    /* renamed from: b */
    public final /* synthetic */ C79690bs f218573b;

    public /* synthetic */ C79700i(C79705n nVar, C79690bs bsVar) {
        this.f218572a = nVar;
        this.f218573b = bsVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C79705n nVar = this.f218572a;
        C79690bs bsVar = this.f218573b;
        return nVar.f218584g.mo71498a(nVar.f218582e.mo74178a(bsVar).g((C80401n) obj, bsVar.mo74199g()));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
