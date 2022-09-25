package com.google.android.libraries.notifications.platform.p2308b;

import com.google.common.util.concurrent.C60842bw;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60872cz;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.notifications.platform.b.i */
/* compiled from: PG */
final class C30069i extends C60842bw implements C60872cz {

    /* renamed from: a */
    private final long f81351a;

    public C30069i(C60870cx cxVar, long j) {
        super(cxVar);
        this.f81351a = j;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Delayed delayed = (Delayed) obj;
        if (delayed == this) {
            return 0;
        }
        return (getDelay(TimeUnit.NANOSECONDS) > delayed.getDelay(TimeUnit.NANOSECONDS) ? 1 : (getDelay(TimeUnit.NANOSECONDS) == delayed.getDelay(TimeUnit.NANOSECONDS) ? 0 : -1));
    }

    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.f81351a - System.nanoTime(), TimeUnit.NANOSECONDS);
    }
}
