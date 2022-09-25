package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7505g;

import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.p10712d.C142403ea;
import com.google.android.p10712d.C142411ei;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.g.c */
/* compiled from: PG */
public final class C95642c implements C95640a {

    /* renamed from: b */
    private static final Duration f267683b = Duration.ofMinutes(30);

    /* renamed from: a */
    public boolean f267684a;

    /* renamed from: c */
    private final ScheduledExecutorService f267685c;

    /* renamed from: d */
    private final C68214a f267686d;

    /* renamed from: e */
    private final C95355bf f267687e;

    /* renamed from: f */
    private ScheduledFuture f267688f;

    public C95642c(ScheduledExecutorService scheduledExecutorService, C68214a aVar, C95355bf bfVar) {
        this.f267685c = scheduledExecutorService;
        this.f267686d = aVar;
        this.f267687e = bfVar;
        bfVar.mo89274o(this);
        mo89605c();
        mo89607d();
    }

    /* renamed from: e */
    private final void m158362e(byte[] bArr, int i) {
        C58976aa aaVar = C58975e.f156826a;
        this.f267687e.mo89257D(5, i - 1, bArr);
    }

    /* renamed from: b */
    public final void mo89603b() {
        m158362e(C142403ea.f386410a.toByteArray(), 3);
    }

    /* renamed from: c */
    public final void mo89605c() {
        this.f267688f = this.f267685c.schedule(new C95641b(this), f267683b.toMillis(), TimeUnit.MILLISECONDS);
    }

    public final synchronized void close() {
        this.f267684a = true;
        this.f267687e.mo89276q(this);
        ScheduledFuture scheduledFuture = this.f267688f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    /* renamed from: d */
    public final void mo89607d() {
        m158362e(C142411ei.f386423a.toByteArray(), 16);
    }

    /* renamed from: ip */
    public final void mo89286ip(String str, boolean z) {
        if (z && !this.f267684a) {
            ((C89492cd) this.f267686d.mo27525b()).mo83396al(str, (Boolean) null);
            mo89603b();
            mo89607d();
        }
    }
}
