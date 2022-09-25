package com.google.android.libraries.appactions.serviceengine.impl;

import android.content.pm.ApplicationInfo;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.appactions.serviceengine.impl.v */
/* compiled from: PG */
public final /* synthetic */ class C147929v implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C147929v f399007a = new C147929v();

    private /* synthetic */ C147929v() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(((ApplicationInfo) obj).enabled);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
