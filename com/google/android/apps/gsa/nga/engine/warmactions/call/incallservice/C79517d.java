package com.google.android.apps.gsa.nga.engine.warmactions.call.incallservice;

import android.content.ComponentName;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.call.incallservice.d */
/* compiled from: PG */
public final /* synthetic */ class C79517d implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C79517d f218223a = new C79517d();

    private /* synthetic */ C79517d() {
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
