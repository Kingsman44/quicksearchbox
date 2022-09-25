package com.google.common.util.concurrent;

import com.google.common.p4522b.C58443ff;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.common.util.concurrent.bv */
/* compiled from: PG */
public abstract class C60841bv extends C58443ff implements Future {
    protected C60841bv() {
    }

    public boolean cancel(boolean z) {
        return mo57321d().cancel(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract Future mo57321d();

    public Object get() {
        return mo57321d().get();
    }

    /* access modifiers changed from: protected */
    /* renamed from: hU */
    public /* bridge */ /* synthetic */ Object mo5948hU() {
        throw null;
    }

    public final boolean isCancelled() {
        return mo57321d().isCancelled();
    }

    public final boolean isDone() {
        return mo57321d().isDone();
    }

    public Object get(long j, TimeUnit timeUnit) {
        return mo57321d().get(j, timeUnit);
    }
}
