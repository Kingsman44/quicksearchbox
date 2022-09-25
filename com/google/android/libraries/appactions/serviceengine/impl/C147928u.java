package com.google.android.libraries.appactions.serviceengine.impl;

import android.content.pm.PackageManager;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.appactions.serviceengine.impl.u */
/* compiled from: PG */
public final /* synthetic */ class C147928u implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f399006a;

    public /* synthetic */ C147928u(String str) {
        this.f399006a = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        try {
            return Optional.ofNullable(((PackageManager) obj).getApplicationInfo(this.f399006a, 0));
        } catch (PackageManager.NameNotFoundException unused) {
            return Optional.empty();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
