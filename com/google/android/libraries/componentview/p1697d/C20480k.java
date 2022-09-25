package com.google.android.libraries.componentview.p1697d;

import com.google.common.util.concurrent.SettableFuture;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.libraries.componentview.d.k */
/* compiled from: PG */
final class C20480k implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicInteger f57594a;

    /* renamed from: b */
    final /* synthetic */ SettableFuture f57595b;

    /* renamed from: c */
    final /* synthetic */ List f57596c;

    public C20480k(AtomicInteger atomicInteger, SettableFuture settableFuture, List list) {
        this.f57594a = atomicInteger;
        this.f57595b = settableFuture;
        this.f57596c = list;
    }

    public final void run() {
        if (this.f57594a.decrementAndGet() == 0) {
            this.f57595b.mo57356n(C20482m.m38439g(this.f57596c));
        }
    }
}
