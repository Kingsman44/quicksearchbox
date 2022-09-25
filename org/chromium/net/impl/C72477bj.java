package org.chromium.net.impl;

import java.util.concurrent.Executor;

/* renamed from: org.chromium.net.impl.bj */
/* compiled from: PG */
final class C72477bj implements Executor {

    /* renamed from: a */
    final /* synthetic */ Executor f192846a;

    /* renamed from: b */
    final /* synthetic */ int f192847b;

    /* renamed from: c */
    final /* synthetic */ boolean f192848c;

    /* renamed from: d */
    final /* synthetic */ int f192849d;

    public C72477bj(Executor executor, int i, boolean z, int i2) {
        this.f192846a = executor;
        this.f192847b = i;
        this.f192848c = z;
        this.f192849d = i2;
    }

    public final void execute(Runnable runnable) {
        this.f192846a.execute(new C72471bd(this, runnable));
    }
}
