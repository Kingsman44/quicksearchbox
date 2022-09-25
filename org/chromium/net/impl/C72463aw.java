package org.chromium.net.impl;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: org.chromium.net.impl.aw */
/* compiled from: PG */
final class C72463aw implements Executor {

    /* renamed from: a */
    final /* synthetic */ Executor f192821a;

    /* renamed from: b */
    final /* synthetic */ C72470bc f192822b;

    public C72463aw(C72470bc bcVar, Executor executor) {
        this.f192822b = bcVar;
        this.f192821a = executor;
    }

    public final void execute(Runnable runnable) {
        try {
            this.f192821a.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.f192822b.mo64221g(e);
        }
    }
}
