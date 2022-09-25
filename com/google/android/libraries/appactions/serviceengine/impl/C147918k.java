package com.google.android.libraries.appactions.serviceengine.impl;

import android.content.Intent;
import android.content.pm.PackageManager;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.appactions.serviceengine.impl.k */
/* compiled from: PG */
public final /* synthetic */ class C147918k implements Function {

    /* renamed from: a */
    public final /* synthetic */ Intent f398996a;

    public /* synthetic */ C147918k(Intent intent) {
        this.f398996a = intent;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((PackageManager) obj).resolveActivity(this.f398996a, 65536);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
