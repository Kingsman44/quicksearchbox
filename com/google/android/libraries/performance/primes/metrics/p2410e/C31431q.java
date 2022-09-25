package com.google.android.libraries.performance.primes.metrics.p2410e;

import android.app.Activity;
import com.google.android.libraries.performance.primes.p2398c.C31209a;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.performance.primes.metrics.e.q */
/* compiled from: PG */
final class C31431q implements C31209a.C31218i {

    /* renamed from: a */
    final /* synthetic */ C60888db f84634a;

    /* renamed from: b */
    final /* synthetic */ C31433s f84635b;

    public C31431q(C31433s sVar, C60888db dbVar) {
        this.f84635b = sVar;
        this.f84634a = dbVar;
    }

    /* renamed from: c */
    public final void mo36945c(Activity activity) {
        String simpleName = activity.getClass().getSimpleName();
        this.f84635b.f84637a.mo37127a(4, simpleName);
        this.f84635b.mo37130a();
        this.f84635b.f84638b = this.f84634a.mo29164d(new C31430p(this, simpleName), 10, TimeUnit.SECONDS);
    }
}
