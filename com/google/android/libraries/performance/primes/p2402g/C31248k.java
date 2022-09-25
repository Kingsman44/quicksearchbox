package com.google.android.libraries.performance.primes.p2402g;

import com.google.common.util.concurrent.C60856cj;
import dagger.C68214a;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.performance.primes.g.k */
/* compiled from: PG */
public final /* synthetic */ class C31248k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C31251n f84171a;

    /* renamed from: b */
    public final /* synthetic */ C68214a f84172b;

    /* renamed from: c */
    public final /* synthetic */ Executor f84173c;

    public /* synthetic */ C31248k(C31251n nVar, C68214a aVar, Executor executor) {
        this.f84171a = nVar;
        this.f84172b = aVar;
        this.f84173c = executor;
    }

    public final void run() {
        C31251n nVar = this.f84171a;
        C68214a aVar = this.f84172b;
        C60856cj.m92903l(new C31250m(nVar, aVar), this.f84173c);
    }
}
