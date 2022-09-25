package com.google.android.apps.gsa.shared.util.p7159c.p7160a;

import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.shared.util.c.a.bl */
/* compiled from: PG */
final class C90820bl implements C90783ab {

    /* renamed from: a */
    public final Executor f253977a;

    /* renamed from: b */
    private final ScheduledExecutorService f253978b;

    public C90820bl(ScheduledExecutorService scheduledExecutorService) {
        this.f253978b = scheduledExecutorService;
        this.f253977a = new C60904dr(scheduledExecutorService);
    }

    /* renamed from: a */
    public final void mo85115a(C58881cr crVar, Runnable runnable) {
        this.f253977a.execute(runnable);
    }

    /* renamed from: b */
    public final void mo85114b(C58881cr crVar, Runnable runnable, long j) {
        this.f253978b.schedule(new C90819bk(this, runnable), j, TimeUnit.MILLISECONDS);
    }
}
