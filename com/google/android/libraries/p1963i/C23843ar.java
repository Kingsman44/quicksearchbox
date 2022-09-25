package com.google.android.libraries.p1963i;

import com.google.common.p4575r.C60761r;
import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.i.ar */
/* compiled from: PG */
final class C23843ar implements RunnableScheduledFuture {

    /* renamed from: a */
    private final RunnableScheduledFuture f65288a;

    public C23843ar(RunnableScheduledFuture runnableScheduledFuture) {
        this.f65288a = runnableScheduledFuture;
    }

    public final boolean cancel(boolean z) {
        return this.f65288a.cancel(z);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Delayed delayed = (Delayed) obj;
        if (this == delayed) {
            return 0;
        }
        if (delayed instanceof C23843ar) {
            return this.f65288a.compareTo(((C23843ar) delayed).f65288a);
        }
        return C60761r.m92755a(getDelay(TimeUnit.NANOSECONDS), delayed.getDelay(TimeUnit.NANOSECONDS));
    }

    public final Object get() {
        return this.f65288a.get();
    }

    public final long getDelay(TimeUnit timeUnit) {
        long delay = this.f65288a.getDelay(timeUnit);
        return TimeUnit.NANOSECONDS.convert(delay, timeUnit) > 2147483647999999999L ? timeUnit.convert(2147483647999999999L, TimeUnit.NANOSECONDS) : delay;
    }

    public final boolean isCancelled() {
        return this.f65288a.isCancelled();
    }

    public final boolean isDone() {
        return this.f65288a.isDone();
    }

    public final boolean isPeriodic() {
        return this.f65288a.isPeriodic();
    }

    public final void run() {
        this.f65288a.run();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return C23844as.m44393a(this.f65288a, j, timeUnit);
    }
}
