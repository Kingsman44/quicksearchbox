package com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10958b;

import com.google.android.apps.gsa.staticplugins.p7611bv.p7612a.C97257m;
import com.google.android.apps.gsa.staticplugins.p7611bv.p7612a.C97265u;
import com.google.common.util.concurrent.C60919g;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.ac.d.b.b.b.a */
/* compiled from: PG */
final class C147233a extends C60919g {

    /* renamed from: a */
    private final Executor f397478a;

    public C147233a(Executor executor) {
        this.f397478a = executor;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void execute(Runnable runnable) {
        C97265u.m160966e(((C97257m) this.f397478a).f271667a, runnable);
    }

    public final boolean isShutdown() {
        throw new UnsupportedOperationException();
    }

    public final boolean isTerminated() {
        throw new UnsupportedOperationException();
    }

    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
