package com.google.apps.tiktok.account.api.controller.globalaccount.lastforeground;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.apps.tiktok.account.api.controller.globalaccount.lastforeground.e */
/* compiled from: PG */
public final class C46038e {

    /* renamed from: a */
    public final AtomicReference f120897a = new AtomicReference(new C46037d());

    /* renamed from: b */
    private final Executor f120898b;

    public C46038e(Executor executor) {
        this.f120898b = new C60904dr(executor);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50178a(LifecycleAccountMonitor lifecycleAccountMonitor) {
        C46035b bVar = new C46035b(this, lifecycleAccountMonitor);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(bVar), this.f120898b), "Failed to remove foreground account.", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo50179b(LifecycleAccountMonitor lifecycleAccountMonitor) {
        C46036c cVar = new C46036c(this, lifecycleAccountMonitor);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(cVar), this.f120898b), "Failed to update foreground account.", new Object[0]);
    }
}
