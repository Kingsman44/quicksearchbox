package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6083d;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.d.af */
/* compiled from: PG */
public final /* synthetic */ class C76836af implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C76836af f212238a = new C76836af();

    private /* synthetic */ C76836af() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = (String) obj;
        int i = C76848ar.f212252b;
        return str.equals("attachment") ? "has:attachment" : "in:".concat(String.valueOf(str));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
