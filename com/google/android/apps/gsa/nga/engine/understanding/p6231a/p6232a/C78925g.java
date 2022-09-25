package com.google.android.apps.gsa.nga.engine.understanding.p6231a.p6232a;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.a.a.g */
/* compiled from: PG */
public final /* synthetic */ class C78925g implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C78925g f217151a = new C78925g();

    private /* synthetic */ C78925g() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int intValue = ((Integer) obj).intValue();
        boolean z = true;
        if (intValue < 377462873 && intValue != -1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
