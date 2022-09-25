package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6089c;

import com.google.android.apps.gsa.nga.engine.am.g.c;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.c.m */
/* compiled from: PG */
public final /* synthetic */ class C76969m implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C76969m f212487a = new C76969m();

    private /* synthetic */ C76969m() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        try {
            return Stream.CC.m71935of(c.a((String) obj));
        } catch (IllegalArgumentException unused) {
            return Stream.CC.empty();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
