package com.google.android.apps.gsa.nga.engine.understanding;

import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.ar */
/* compiled from: PG */
public final /* synthetic */ class C78991ar implements Function {

    /* renamed from: a */
    public final /* synthetic */ C78989ap f217266a;

    public /* synthetic */ C78991ar(C78989ap apVar) {
        this.f217266a = apVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C78989ap apVar = this.f217266a;
        C79162t tVar = (C79162t) obj;
        C91142g gVar = (C91142g) apVar.f217263a.mo17428b();
        gVar.getClass();
        C22871g gVar2 = (C22871g) apVar.f217264b.mo17428b();
        gVar2.getClass();
        C83334w wVar = (C83334w) apVar.f217265c.mo17428b();
        wVar.getClass();
        tVar.getClass();
        return new C78988ao(gVar, gVar2, wVar, tVar);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
