package com.google.android.apps.gsa.nga.engine.warmactions.p6258j;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.j.o */
/* compiled from: PG */
public final /* synthetic */ class C79706o implements Function {

    /* renamed from: a */
    public final /* synthetic */ C79708q f218596a;

    /* renamed from: b */
    public final /* synthetic */ C79690bs f218597b;

    public /* synthetic */ C79706o(C79708q qVar, C79690bs bsVar) {
        this.f218596a = qVar;
        this.f218597b = bsVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C79708q qVar = this.f218596a;
        C79690bs bsVar = this.f218597b;
        return qVar.f218602d.mo71498a(qVar.f218601c.mo74178a(bsVar).g((C80401n) obj, bsVar.mo74199g()));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
