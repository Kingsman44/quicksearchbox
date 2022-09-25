package com.google.android.libraries.lens.sdk.intent;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.lens.sdk.intent.c */
/* compiled from: PG */
final class C24941c implements Future {

    /* renamed from: a */
    final /* synthetic */ C24942d f68067a;

    public C24941c(C24942d dVar) {
        this.f68067a = dVar;
    }

    /* renamed from: a */
    public final synchronized Integer get() {
        if (this.f68067a.f68069b == null) {
            wait();
        }
        return this.f68067a.f68069b;
    }

    /* renamed from: b */
    public final synchronized Integer get(long j, TimeUnit timeUnit) {
        if (this.f68067a.f68069b == null) {
            wait(timeUnit.toMillis(j));
        }
        return this.f68067a.f68069b;
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final synchronized boolean isDone() {
        return this.f68067a.f68069b != null;
    }
}
