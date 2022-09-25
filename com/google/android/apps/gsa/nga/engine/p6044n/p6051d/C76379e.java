package com.google.android.apps.gsa.nga.engine.p6044n.p6051d;

import com.google.android.apps.gsa.nga.engine.annotators.C74989bu;
import com.google.android.apps.gsa.nga.engine.annotators.ak;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.d.e */
/* compiled from: PG */
public final /* synthetic */ class C76379e implements Function {

    /* renamed from: a */
    public final /* synthetic */ C76390p f211511a;

    /* renamed from: b */
    public final /* synthetic */ Optional f211512b;

    public /* synthetic */ C76379e(C76390p pVar, Optional optional) {
        this.f211511a = pVar;
        this.f211512b = optional;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C76390p pVar = this.f211511a;
        Optional optional = this.f211512b;
        ak akVar = pVar.f211525c;
        Optional.empty();
        return akVar.c((String) obj, (C74989bu) optional.map(C76384j.f211517a).map(C76385k.f211518a).orElseGet(C76386l.f211519a));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
