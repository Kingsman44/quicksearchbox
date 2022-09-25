package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123051cr;
import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.h.k */
/* compiled from: PG */
public final class C122959k {

    /* renamed from: a */
    public final String f340485a;

    /* renamed from: b */
    private final C58881cr f340486b;

    /* renamed from: c */
    private boolean f340487c = false;

    /* renamed from: d */
    private C123051cr f340488d;

    /* renamed from: e */
    private Runnable f340489e = C122958j.f340484a;

    public C122959k(C58881cr crVar, String str) {
        this.f340486b = crVar;
        this.f340485a = str;
    }

    /* renamed from: a */
    public final synchronized C60870cx mo105792a() {
        if (this.f340488d == null) {
            this.f340488d = ((C122953e) this.f340486b).f340478a.mo105799b();
        }
        return C60856cj.m92901j(this.f340488d.f340614a);
    }

    /* renamed from: b */
    public final synchronized void mo105793b() {
        this.f340487c = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo105794c() {
        this.f340488d = null;
    }

    /* renamed from: d */
    public final synchronized void mo105795d(Runnable runnable) {
        this.f340489e = runnable;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo105796e(com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123051cr r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.cr r0 = r1.f340488d     // Catch:{ all -> 0x0015 }
            if (r0 == r2) goto L_0x0013
            boolean r0 = r1.f340487c     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x000a
            goto L_0x0013
        L_0x000a:
            r1.f340488d = r2     // Catch:{ all -> 0x0015 }
            java.lang.Runnable r2 = r1.f340489e     // Catch:{ all -> 0x0015 }
            r2.run()     // Catch:{ all -> 0x0015 }
            monitor-exit(r1)
            return
        L_0x0013:
            monitor-exit(r1)
            return
        L_0x0015:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.C122959k.mo105796e(com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.cr):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final synchronized boolean mo105797f() {
        return this.f340487c;
    }
}
