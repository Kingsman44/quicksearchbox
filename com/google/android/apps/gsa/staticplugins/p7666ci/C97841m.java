package com.google.android.apps.gsa.staticplugins.p7666ci;

import android.content.ComponentName;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.m */
/* compiled from: PG */
public final /* synthetic */ class C97841m implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C97841m f273208a = new C97841m();

    private /* synthetic */ C97841m() {
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
