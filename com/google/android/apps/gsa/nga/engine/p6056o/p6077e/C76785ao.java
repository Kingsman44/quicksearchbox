package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import com.google.android.apps.gsa.nga.engine.aj.y;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.ao */
/* compiled from: PG */
public final /* synthetic */ class C76785ao implements Function {

    /* renamed from: a */
    public final /* synthetic */ C76795ay f212167a;

    public /* synthetic */ C76785ao(C76795ay ayVar) {
        this.f212167a = ayVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Optional.ofNullable((y) this.f212167a.f212187i.get((String) obj));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
