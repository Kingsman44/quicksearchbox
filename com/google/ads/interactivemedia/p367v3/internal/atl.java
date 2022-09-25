package com.google.ads.interactivemedia.p367v3.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.ads.interactivemedia.v3.internal.atl */
/* compiled from: PG */
public abstract class atl extends aqx implements Future, atr {
    protected atl() {
    }

    protected atl(byte[] bArr) {
        this();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo15222a() {
        throw null;
    }

    /* renamed from: b */
    public void mo15391b(Runnable runnable, Executor executor) {
        mo15415c().mo15391b(runnable, executor);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract atr mo15415c();

    public boolean cancel(boolean z) {
        return mo15417d().cancel(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public /* bridge */ /* synthetic */ Future mo15417d() {
        throw null;
    }

    public final Object get() {
        return mo15417d().get();
    }

    public final boolean isCancelled() {
        return mo15417d().isCancelled();
    }

    public final boolean isDone() {
        return mo15417d().isDone();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return mo15417d().get(j, timeUnit);
    }
}
