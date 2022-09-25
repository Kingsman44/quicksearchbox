package com.google.common.p4543n.p4546c;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.google.common.n.c.u */
/* compiled from: PG */
final class C59413u implements Executor {

    /* renamed from: a */
    final /* synthetic */ Executor f157625a;

    /* renamed from: b */
    final /* synthetic */ C59417y f157626b;

    public C59413u(C59417y yVar, Executor executor) {
        this.f157626b = yVar;
        this.f157625a = executor;
    }

    public final void execute(Runnable runnable) {
        try {
            this.f157625a.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.f157626b.mo57357o(e);
        }
    }
}
