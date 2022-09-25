package com.google.ads.interactivemedia.p367v3.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.ads.interactivemedia.v3.internal.atu */
/* compiled from: PG */
final class atu extends atj implements ScheduledExecutorService, ats {

    /* renamed from: a */
    final ScheduledExecutorService f21553a;

    public atu(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        aqd.m19282j(scheduledExecutorService);
        this.f21553a = scheduledExecutorService;
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        atw q = atw.m19633q(runnable, (Object) null);
        return new atm(q, this.f21553a.schedule(q, j, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        atw p = atw.m19632p(callable);
        return new atm(p, this.f21553a.schedule(p, j, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        att att = new att(runnable);
        return new atm(att, this.f21553a.scheduleAtFixedRate(att, j, j2, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        att att = new att(runnable);
        return new atm(att, this.f21553a.scheduleWithFixedDelay(att, j, j2, timeUnit));
    }
}
