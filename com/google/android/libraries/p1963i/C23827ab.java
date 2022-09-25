package com.google.android.libraries.p1963i;

import com.google.common.util.concurrent.C60842bw;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60872cz;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.i.ab */
/* compiled from: PG */
final class C23827ab extends C60842bw implements C60872cz {

    /* renamed from: a */
    private final long f65246a;

    public C23827ab(C60870cx cxVar, long j) {
        super(cxVar);
        this.f65246a = j;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Delayed delayed = (Delayed) obj;
        if (delayed == this) {
            return 0;
        }
        return (getDelay(TimeUnit.NANOSECONDS) > delayed.getDelay(TimeUnit.NANOSECONDS) ? 1 : (getDelay(TimeUnit.NANOSECONDS) == delayed.getDelay(TimeUnit.NANOSECONDS) ? 0 : -1));
    }

    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.f65246a - System.nanoTime(), TimeUnit.NANOSECONDS);
    }
}
