package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.cg */
/* compiled from: PG */
public final /* synthetic */ class C79224cg implements Function {

    /* renamed from: a */
    public final /* synthetic */ C79298f f217693a;

    public /* synthetic */ C79224cg(C79298f fVar) {
        this.f217693a = fVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C80047aa aaVar = (C80047aa) obj;
        return this.f217693a.mo73864j().substring(aaVar.f219660d, aaVar.f219661e);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
