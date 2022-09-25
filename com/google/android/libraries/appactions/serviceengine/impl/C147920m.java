package com.google.android.libraries.appactions.serviceengine.impl;

import android.content.pm.ActivityInfo;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.appactions.serviceengine.impl.m */
/* compiled from: PG */
public final /* synthetic */ class C147920m implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C147920m f398998a = new C147920m();

    private /* synthetic */ C147920m() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((ActivityInfo) obj).packageName;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
