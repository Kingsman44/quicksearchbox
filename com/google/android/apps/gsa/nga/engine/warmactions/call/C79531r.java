package com.google.android.apps.gsa.nga.engine.warmactions.call;

import android.content.ComponentName;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.call.r */
/* compiled from: PG */
public final /* synthetic */ class C79531r implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C79531r f218246a = new C79531r();

    private /* synthetic */ C79531r() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((ComponentName) obj).getPackageName();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
