package com.google.android.p10890h.p10891a.p10893b;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.h.a.b.b */
/* compiled from: PG */
public final class C146571b implements C146557a {

    /* renamed from: a */
    private final ScheduledExecutorService f395831a = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: a */
    public final void mo95062a(long j, Runnable runnable) {
        this.f395831a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }
}
