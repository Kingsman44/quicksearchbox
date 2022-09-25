package com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp;

import android.app.Notification;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.i */
/* compiled from: PG */
public final /* synthetic */ class C122357i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C122360l f339250a;

    /* renamed from: b */
    public final /* synthetic */ Notification f339251b;

    public /* synthetic */ C122357i(C122360l lVar, Notification notification) {
        this.f339250a = lVar;
        this.f339251b = notification;
    }

    public final void run() {
        C122360l lVar = this.f339250a;
        lVar.f339256c.mo5003b((String) null, 1048576, this.f339251b);
    }
}
