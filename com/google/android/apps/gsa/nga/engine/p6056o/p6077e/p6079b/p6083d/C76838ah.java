package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6083d;

import com.google.android.apps.gsa.nga.engine.am.h.df;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.d.ah */
/* compiled from: PG */
public final /* synthetic */ class C76838ah implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C76838ah f212241a = new C76838ah();

    private /* synthetic */ C76838ah() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = C76848ar.f212252b;
        String b = ((df) obj).b();
        if (b.isEmpty()) {
            return Optional.empty();
        }
        return Optional.m71637of("from:\"" + b + "\"");
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
