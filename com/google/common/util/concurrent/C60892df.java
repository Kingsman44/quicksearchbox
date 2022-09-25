package com.google.common.util.concurrent;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.common.util.concurrent.df */
/* compiled from: PG */
final class C60892df extends C60842bw implements C60872cz {

    /* renamed from: a */
    private final ScheduledFuture f164995a;

    public C60892df(C60870cx cxVar, ScheduledFuture scheduledFuture) {
        super(cxVar);
        this.f164995a = scheduledFuture;
    }

    public final boolean cancel(boolean z) {
        boolean cancel = super.cancel(z);
        if (cancel) {
            this.f164995a.cancel(z);
        }
        return cancel;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f164995a.compareTo((Delayed) obj);
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.f164995a.getDelay(timeUnit);
    }
}
