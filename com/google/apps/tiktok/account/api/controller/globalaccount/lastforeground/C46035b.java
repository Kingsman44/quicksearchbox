package com.google.apps.tiktok.account.api.controller.globalaccount.lastforeground;

import com.google.common.base.C58833ax;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.apps.tiktok.account.api.controller.globalaccount.lastforeground.b */
/* compiled from: PG */
public final /* synthetic */ class C46035b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C46038e f120893a;

    /* renamed from: b */
    public final /* synthetic */ LifecycleAccountMonitor f120894b;

    public /* synthetic */ C46035b(C46038e eVar, LifecycleAccountMonitor lifecycleAccountMonitor) {
        this.f120893a = eVar;
        this.f120894b = lifecycleAccountMonitor;
    }

    public final void run() {
        C46038e eVar = this.f120893a;
        LifecycleAccountMonitor lifecycleAccountMonitor = this.f120894b;
        if (((C46034a) eVar.f120897a.get()) == lifecycleAccountMonitor) {
            AtomicReference atomicReference = eVar.f120897a;
            C58833ax axVar = (C58833ax) lifecycleAccountMonitor.f120891a.get();
            atomicReference.set(new C46037d());
        }
    }
}
