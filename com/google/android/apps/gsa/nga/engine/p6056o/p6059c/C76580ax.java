package com.google.android.apps.gsa.nga.engine.p6056o.p6059c;

import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.c.ax */
/* compiled from: PG */
public final /* synthetic */ class C76580ax implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C76580ax f211820a = new C76580ax();

    private /* synthetic */ C76580ax() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Collection.EL.stream((List) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
