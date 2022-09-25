package com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp;

import android.app.Notification;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.j */
/* compiled from: PG */
public final /* synthetic */ class C122358j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C122360l f339252a;

    /* renamed from: b */
    public final /* synthetic */ Notification f339253b;

    public /* synthetic */ C122358j(C122360l lVar, Notification notification) {
        this.f339252a = lVar;
        this.f339253b = notification;
    }

    public final void run() {
        C122360l lVar = this.f339252a;
        lVar.f339256c.mo5003b((String) null, 1048576, this.f339253b);
    }
}
