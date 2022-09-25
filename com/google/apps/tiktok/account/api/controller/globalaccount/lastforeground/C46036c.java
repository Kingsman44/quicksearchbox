package com.google.apps.tiktok.account.api.controller.globalaccount.lastforeground;

/* renamed from: com.google.apps.tiktok.account.api.controller.globalaccount.lastforeground.c */
/* compiled from: PG */
public final /* synthetic */ class C46036c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C46038e f120895a;

    /* renamed from: b */
    public final /* synthetic */ LifecycleAccountMonitor f120896b;

    public /* synthetic */ C46036c(C46038e eVar, LifecycleAccountMonitor lifecycleAccountMonitor) {
        this.f120895a = eVar;
        this.f120896b = lifecycleAccountMonitor;
    }

    public final void run() {
        C46038e eVar = this.f120895a;
        eVar.f120897a.set(this.f120896b);
    }
}
