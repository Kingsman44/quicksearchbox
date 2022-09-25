package com.google.android.apps.gsa.shared.util.p7159c.p7160a;

import com.google.common.base.C58881cr;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.shared.util.c.a.al */
/* compiled from: PG */
final class C90793al extends C90846f implements C90783ab {

    /* renamed from: b */
    private final ScheduledExecutorService f253901b;

    /* renamed from: c */
    private final C90815bg f253902c;

    public C90793al(ScheduledExecutorService scheduledExecutorService, C90815bg bgVar) {
        super(scheduledExecutorService, bgVar);
        this.f253901b = scheduledExecutorService;
        this.f253902c = bgVar;
    }

    /* renamed from: b */
    public final void mo85114b(C58881cr crVar, Runnable runnable, long j) {
        this.f253901b.schedule(new C90845e(this, this.f253902c.mo85156a(crVar, j), runnable), j, TimeUnit.MILLISECONDS);
    }
}
