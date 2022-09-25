package com.google.common.p4543n.p4546c;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60873d;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.common.n.c.v */
/* compiled from: PG */
final class C59414v implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SettableFuture f157627a;

    /* renamed from: b */
    final /* synthetic */ C59417y f157628b;

    public C59414v(C59417y yVar, SettableFuture settableFuture) {
        this.f157628b = yVar;
        this.f157627a = settableFuture;
    }

    public final void run() {
        try {
            if (!(this.f157627a.value instanceof C60873d.C60875b) && C60856cj.m92909r(this.f157627a) == C59417y.f157632b) {
                return;
            }
        } catch (ExecutionException unused) {
        }
        this.f157628b.mo57358p(this.f157627a);
    }
}
