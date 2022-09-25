package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.common.util.concurrent.db */
/* compiled from: PG */
public interface C60888db extends ScheduledExecutorService, C60887da {
    /* renamed from: d */
    C60872cz mo29164d(Runnable runnable, long j, TimeUnit timeUnit);

    /* renamed from: e */
    C60872cz mo29165e(Callable callable, long j, TimeUnit timeUnit);

    /* renamed from: f */
    C60872cz mo29166f(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    /* renamed from: g */
    C60872cz mo29167g(Runnable runnable, long j, long j2, TimeUnit timeUnit);
}
