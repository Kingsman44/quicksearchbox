package com.google.android.libraries.appactions.serviceengine.impl;

import android.content.pm.PackageInfo;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.appactions.serviceengine.impl.r */
/* compiled from: PG */
public final /* synthetic */ class C147925r implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C147925r f399004a = new C147925r();

    private /* synthetic */ C147925r() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Long.valueOf(((PackageInfo) obj).getLongVersionCode());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
