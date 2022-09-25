package com.google.android.libraries.performance.primes.metrics.p2410e;

import android.app.Activity;
import com.google.android.libraries.performance.primes.p2398c.C31209a;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.performance.primes.metrics.e.o */
/* compiled from: PG */
final class C31429o implements C31209a.C31217h {

    /* renamed from: a */
    final /* synthetic */ C60888db f84630a;

    /* renamed from: b */
    final /* synthetic */ C31433s f84631b;

    public C31429o(C31433s sVar, C60888db dbVar) {
        this.f84631b = sVar;
        this.f84630a = dbVar;
    }

    /* renamed from: d */
    public final void mo36944d(Activity activity) {
        String simpleName = activity.getClass().getSimpleName();
        this.f84631b.f84637a.mo37127a(3, simpleName);
        this.f84631b.mo37130a();
        this.f84631b.f84639c = this.f84630a.mo29164d(new C31428n(this, simpleName), 10, TimeUnit.SECONDS);
    }
}
