package com.google.android.apps.gsa.nga.shared.p6321am.p6322a;

import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Future;

/* renamed from: com.google.android.apps.gsa.nga.shared.am.a.ap */
/* compiled from: PG */
final class C80901ap implements Runnable {

    /* renamed from: a */
    C60870cx f221869a;

    /* renamed from: b */
    Future f221870b;

    public C80901ap(C60870cx cxVar, Future future) {
        this.f221869a = cxVar;
        this.f221870b = future;
    }

    public final void run() {
        C80905at.m128765i(this.f221869a, this.f221870b);
        this.f221869a = null;
        this.f221870b = null;
    }
}
