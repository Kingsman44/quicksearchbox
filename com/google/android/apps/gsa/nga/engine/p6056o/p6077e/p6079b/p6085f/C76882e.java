package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6085f;

import com.google.android.apps.gsa.nga.engine.annotators.C74983ae;
import com.google.android.apps.gsa.nga.engine.annotators.C74989bu;
import com.google.android.apps.gsa.nga.engine.annotators.ak;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.f.e */
/* compiled from: PG */
public final /* synthetic */ class C76882e implements Function {

    /* renamed from: a */
    public final /* synthetic */ C76889l f212313a;

    /* renamed from: b */
    public final /* synthetic */ C74965n f212314b;

    public /* synthetic */ C76882e(C76889l lVar, C74965n nVar) {
        this.f212313a = lVar;
        this.f212314b = nVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C76889l lVar = this.f212313a;
        C74965n nVar = this.f212314b;
        String str = (String) obj;
        ak akVar = lVar.f212329c;
        C74989bu b = C74983ae.m121218b(nVar.mo71326a().b());
        Optional.empty();
        return C60922j.m93044g(akVar.b(str, b, Optional.empty(), Optional.m71637of(C76889l.f212327a)), new C76879b(str), C60826bg.f164896a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
