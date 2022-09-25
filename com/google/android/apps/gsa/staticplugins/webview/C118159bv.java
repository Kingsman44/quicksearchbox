package com.google.android.apps.gsa.staticplugins.webview;

import android.app.ActivityManager;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.bv */
/* compiled from: PG */
public final /* synthetic */ class C118159bv implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C118159bv f327952a = new C118159bv();

    private /* synthetic */ C118159bv() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(((ActivityManager.RunningAppProcessInfo) obj).importance >= 400);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
