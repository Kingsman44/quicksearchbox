package com.google.android.apps.gsa.shared.util.p7159c;

import com.google.common.base.C58881cr;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.shared.util.c.p */
/* compiled from: PG */
final class C90950p extends C90951q {

    /* renamed from: a */
    final /* synthetic */ Object f254153a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90950p(C58881cr crVar, Object obj) {
        super(crVar);
        this.f254153a = obj;
    }

    /* renamed from: b */
    public final void mo4106b(Runnable runnable, Executor executor) {
        executor.execute(runnable);
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    /* renamed from: d */
    public final void mo85245d() {
    }

    public final Object get() {
        return this.f254153a;
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.f254153a;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }
}
