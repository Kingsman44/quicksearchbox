package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.m.e */
/* compiled from: PG */
public final /* synthetic */ class C111580e implements Function {

    /* renamed from: a */
    public final /* synthetic */ PackageManager f310310a;

    public /* synthetic */ C111580e(PackageManager packageManager) {
        this.f310310a = packageManager;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return this.f310310a.getApplicationIcon((ApplicationInfo) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
