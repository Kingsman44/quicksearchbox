package com.google.android.libraries.performance.primes.metrics.storage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31310m;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31311n;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31313p;
import com.google.android.libraries.performance.primes.p2398c.C31209a;
import com.google.android.libraries.performance.primes.p2398c.C31220b;
import com.google.android.libraries.performance.primes.p2402g.C31239b;
import com.google.common.util.concurrent.C60856cj;
import dagger.C68214a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.performance.primes.metrics.storage.s */
/* compiled from: PG */
final class C31577s extends C31575q implements C31209a.C31217h, C31313p {

    /* renamed from: a */
    public static final long f85007a = TimeUnit.HOURS.toMillis(12);

    /* renamed from: b */
    public final C31310m f85008b;

    /* renamed from: c */
    public final Application f85009c;

    /* renamed from: d */
    public final C68214a f85010d;

    /* renamed from: e */
    public final C31239b f85011e;

    /* renamed from: f */
    private final C31220b f85012f;

    /* renamed from: g */
    private final Executor f85013g;

    public C31577s(C31311n nVar, Context context, C31220b bVar, Executor executor, C68214a aVar, C31239b bVar2, C69464a aVar2) {
        this.f85008b = nVar.mo37026a(executor, aVar, aVar2);
        this.f85013g = executor;
        this.f85009c = (Application) context;
        this.f85010d = aVar;
        this.f85011e = bVar2;
        this.f85012f = bVar;
    }

    /* renamed from: b */
    private final void m58873b(boolean z) {
        C60856cj.m92905n(new C31576r(this, z), this.f85013g);
    }

    /* renamed from: d */
    public final void mo36944d(Activity activity) {
        this.f85012f.f84117a.mo36958b(this);
        m58873b(false);
    }

    /* renamed from: ll */
    public final void mo37265ll() {
        m58873b(true);
    }

    /* renamed from: ln */
    public final void mo29159ln() {
        this.f85012f.f84117a.mo36957a(this);
    }
}
