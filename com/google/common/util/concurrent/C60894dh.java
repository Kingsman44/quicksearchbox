package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.common.util.concurrent.dh */
/* compiled from: PG */
final class C60894dh extends C60891de implements C60888db {

    /* renamed from: a */
    final ScheduledExecutorService f164997a;

    public C60894dh(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.f164997a = scheduledExecutorService;
    }

    /* renamed from: d */
    public final C60872cz schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        C60915eb e = C60915eb.m93031e(runnable, (Object) null);
        return new C60892df(e, this.f164997a.schedule(e, j, timeUnit));
    }

    /* renamed from: e */
    public final C60872cz schedule(Callable callable, long j, TimeUnit timeUnit) {
        C60915eb ebVar = new C60915eb(callable);
        return new C60892df(ebVar, this.f164997a.schedule(ebVar, j, timeUnit));
    }

    /* renamed from: f */
    public final C60872cz scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        C60893dg dgVar = new C60893dg(runnable);
        return new C60892df(dgVar, this.f164997a.scheduleAtFixedRate(dgVar, j, j2, timeUnit));
    }

    /* renamed from: g */
    public final C60872cz scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        C60893dg dgVar = new C60893dg(runnable);
        return new C60892df(dgVar, this.f164997a.scheduleWithFixedDelay(dgVar, j, j2, timeUnit));
    }
}
