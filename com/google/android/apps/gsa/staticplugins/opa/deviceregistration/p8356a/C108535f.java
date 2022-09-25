package com.google.android.apps.gsa.staticplugins.opa.deviceregistration.p8356a;

import java.util.NoSuchElementException;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.a.f */
/* compiled from: PG */
public final /* synthetic */ class C108535f implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ String f301953a;

    public /* synthetic */ C108535f(String str) {
        this.f301953a = str;
    }

    public final Object get() {
        return new NoSuchElementException(String.format("No device with HGS ID %s", new Object[]{this.f301953a}));
    }
}
