package com.google.android.libraries.appactions.serviceengine.impl;

import android.content.pm.PackageManager;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.appactions.serviceengine.impl.q */
/* compiled from: PG */
public final /* synthetic */ class C147924q implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f399003a;

    public /* synthetic */ C147924q(String str) {
        this.f399003a = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        try {
            return Optional.ofNullable(((PackageManager) obj).getPackageInfo(this.f399003a, 0));
        } catch (PackageManager.NameNotFoundException unused) {
            return Optional.empty();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
