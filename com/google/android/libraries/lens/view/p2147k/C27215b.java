package com.google.android.libraries.lens.view.p2147k;

import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.lens.view.k.b */
/* compiled from: PG */
final class C27215b extends C27214a implements C60888db {

    /* renamed from: a */
    private final C60888db f74413a;

    public C27215b(C60888db dbVar) {
        super(dbVar);
        this.f74413a = dbVar;
    }

    /* renamed from: d */
    public final C60872cz schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f74413a.mo29164d(runnable, j, timeUnit);
    }

    /* renamed from: e */
    public final C60872cz schedule(Callable callable, long j, TimeUnit timeUnit) {
        return this.f74413a.mo29165e(callable, j, timeUnit);
    }

    /* renamed from: f */
    public final C60872cz scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f74413a.mo29166f(runnable, j, j2, timeUnit);
    }

    /* renamed from: g */
    public final C60872cz scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f74413a.mo29167g(runnable, j, j2, timeUnit);
    }
}
