package com.google.android.apps.gsa.nga.engine.understanding.p6236c;

import com.google.android.apps.gsa.nga.engine.annotators.C74984ah;
import com.google.common.p4522b.C58495hd;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.c.d */
/* compiled from: PG */
public final /* synthetic */ class C79021d implements Function {

    /* renamed from: a */
    public final /* synthetic */ C58495hd f217313a;

    public /* synthetic */ C79021d(C58495hd hdVar) {
        this.f217313a = hdVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = C79028k.f217326a;
        return Optional.ofNullable((C74984ah) this.f217313a.get((String) obj));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
