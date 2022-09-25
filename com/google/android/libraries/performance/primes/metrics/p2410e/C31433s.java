package com.google.android.libraries.performance.primes.metrics.p2410e;

import com.google.android.libraries.performance.primes.p2398c.C31220b;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.ScheduledFuture;

/* renamed from: com.google.android.libraries.performance.primes.metrics.e.s */
/* compiled from: PG */
public final class C31433s {

    /* renamed from: d */
    private static final C31432r f84636d = C31427m.f84627a;

    /* renamed from: a */
    public volatile C31432r f84637a = f84636d;

    /* renamed from: b */
    public ScheduledFuture f84638b;

    /* renamed from: c */
    public ScheduledFuture f84639c;

    public C31433s(C31220b bVar, C60888db dbVar) {
        bVar.f84117a.mo36957a(new C31429o(this, dbVar));
        bVar.f84117a.mo36957a(new C31431q(this, dbVar));
    }

    /* renamed from: a */
    public final void mo37130a() {
        ScheduledFuture scheduledFuture = this.f84638b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f84638b = null;
        }
        ScheduledFuture scheduledFuture2 = this.f84639c;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.f84639c = null;
        }
    }
}
