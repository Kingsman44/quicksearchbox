package com.google.android.apps.gsa.staticplugins.actions.p7353a;

import java.io.File;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.a.n */
/* compiled from: PG */
public final /* synthetic */ class C93282n implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C93282n f260122a = new C93282n();

    private /* synthetic */ C93282n() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Long.valueOf(((File) obj).lastModified());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
