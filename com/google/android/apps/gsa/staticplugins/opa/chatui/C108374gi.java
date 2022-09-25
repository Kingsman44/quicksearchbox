package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.gi */
/* compiled from: PG */
final class C108374gi extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ C108375gj f301426a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108374gi(C108375gj gjVar, Handler handler) {
        super(handler);
        this.f301426a = gjVar;
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        this.f301426a.post(new C108373gh(this));
    }
}
