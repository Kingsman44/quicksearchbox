package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import com.google.android.apps.gsa.nga.engine.aj.y;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.aa */
/* compiled from: PG */
public final /* synthetic */ class C76771aa implements Function {

    /* renamed from: a */
    public final /* synthetic */ C76795ay f212147a;

    public /* synthetic */ C76771aa(C76795ay ayVar) {
        this.f212147a = ayVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Optional.ofNullable((y) this.f212147a.f212186h.get((String) obj));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
