package com.google.android.apps.gsa.nga.engine.warmactions.p6248a;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.a.bd */
/* compiled from: PG */
public final /* synthetic */ class C79435bd implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C79435bd f218102a = new C79435bd();

    private /* synthetic */ C79435bd() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = (String) obj;
        boolean z = true;
        if (!str.contains("youtube") && !str.contains("exoplayer") && !str.contains("spotify")) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
