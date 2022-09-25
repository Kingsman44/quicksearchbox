package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import android.content.res.Resources;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ct */
/* compiled from: PG */
public final /* synthetic */ class C113349ct implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ String f313873a;

    public /* synthetic */ C113349ct(String str) {
        this.f313873a = str;
    }

    public final Object get() {
        return new Resources.NotFoundException("No package found for the package name ".concat(String.valueOf(this.f313873a)));
    }
}
