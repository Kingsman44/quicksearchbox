package com.google.android.apps.gsa.shared.p7042i;

import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.common.util.concurrent.C60873d;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.shared.i.b */
/* compiled from: PG */
public final class C89785b implements Future, C89784a {

    /* renamed from: a */
    public final SettableFuture f243013a = new SettableFuture();

    /* renamed from: a */
    public final void mo49086a(Object obj) {
        this.f243013a.mo57356n(obj);
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final Object get() {
        return C90877ak.m148472f(this.f243013a);
    }

    public final boolean isCancelled() {
        return this.f243013a.value instanceof C60873d.C60875b;
    }

    public final boolean isDone() {
        return this.f243013a.isDone();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return C90877ak.m148473g(this.f243013a, j, timeUnit);
    }
}
