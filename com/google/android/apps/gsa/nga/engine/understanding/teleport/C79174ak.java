package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.ak */
/* compiled from: PG */
public final /* synthetic */ class C79174ak implements Function {

    /* renamed from: a */
    public final /* synthetic */ C79298f f217637a;

    public /* synthetic */ C79174ak(C79298f fVar) {
        this.f217637a = fVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C79298f fVar = this.f217637a;
        C80047aa aaVar = (C80047aa) obj;
        int i = C79204bn.f217670a;
        return ((C79316n) fVar).f217814a.substring(aaVar.f219660d, aaVar.f219661e);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
