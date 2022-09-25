package com.google.common.util.concurrent;

import java.io.Closeable;
import java.util.concurrent.Executor;

/* renamed from: com.google.common.util.concurrent.z */
/* compiled from: PG */
final class C60938z implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C60817ay f165052a;

    /* renamed from: b */
    final /* synthetic */ Executor f165053b;

    public C60938z(C60817ay ayVar, Executor executor) {
        this.f165052a = ayVar;
        this.f165053b = executor;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        this.f165052a.f164884b.f164859a.mo57268a((Closeable) obj, this.f165053b);
    }
}
