package com.google.ads.interactivemedia.p367v3.internal;

import java.util.concurrent.Delayed;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.ads.interactivemedia.v3.internal.atm */
/* compiled from: PG */
public final class atm extends atl implements ScheduledFuture, atr {

    /* renamed from: a */
    private final atr f21543a;

    /* renamed from: b */
    private final ScheduledFuture f21544b;

    protected atm(atr atr) {
        super((byte[]) null);
        this.f21543a = atr;
    }

    public atm(atr atr, ScheduledFuture scheduledFuture) {
        this(atr);
        this.f21544b = scheduledFuture;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo15222a() {
        return this.f21543a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final atr mo15415c() {
        return this.f21543a;
    }

    public boolean cancel(boolean z) {
        boolean cancel = mo15417d().cancel(z);
        if (cancel) {
            this.f21544b.cancel(z);
        }
        return cancel;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f21544b.compareTo((Delayed) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Future mo15417d() {
        return this.f21543a;
    }

    public long getDelay(TimeUnit timeUnit) {
        return this.f21544b.getDelay(timeUnit);
    }
}
