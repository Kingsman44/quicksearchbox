package com.google.android.libraries.appactions.serviceengine.p11037a;

import android.content.pm.ApplicationInfo;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.appactions.serviceengine.a.c */
/* compiled from: PG */
public final /* synthetic */ class C147865c implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C147865c f398892a = new C147865c();

    private /* synthetic */ C147865c() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Integer.valueOf(((ApplicationInfo) obj).icon);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
