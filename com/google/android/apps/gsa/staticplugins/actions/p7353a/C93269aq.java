package com.google.android.apps.gsa.staticplugins.actions.p7353a;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.a.aq */
/* compiled from: PG */
public final class C93269aq {

    /* renamed from: a */
    public final Runnable f260056a;

    /* renamed from: b */
    public volatile long f260057b;

    /* renamed from: c */
    private ScheduledFuture f260058c;

    /* renamed from: d */
    private final int f260059d;

    /* renamed from: e */
    private final ScheduledExecutorService f260060e;

    public C93269aq(int i, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
        this.f260056a = runnable;
        this.f260059d = i;
        this.f260060e = scheduledExecutorService;
    }

    /* renamed from: a */
    public final void mo87598a() {
        this.f260057b = System.currentTimeMillis() + ((long) this.f260059d);
    }

    /* renamed from: b */
    public final void mo87599b() {
        try {
            this.f260058c = this.f260060e.schedule(new C93268ap(this), Math.max(1, this.f260057b - System.currentTimeMillis()), TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException unused) {
        }
    }

    /* renamed from: c */
    public final void mo87600c() {
        ScheduledFuture scheduledFuture = this.f260058c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.f260060e.shutdownNow();
    }
}
