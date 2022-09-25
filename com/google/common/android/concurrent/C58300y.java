package com.google.common.android.concurrent;

import com.google.android.libraries.p1730f.C21370a;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.common.android.concurrent.y */
/* compiled from: PG */
final class C58300y implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SettableFuture f155859a;

    /* renamed from: b */
    final /* synthetic */ Runnable f155860b;

    /* renamed from: c */
    final /* synthetic */ AtomicReference f155861c;

    /* renamed from: d */
    final /* synthetic */ C60888db f155862d;

    /* renamed from: e */
    final /* synthetic */ long f155863e;

    /* renamed from: f */
    final /* synthetic */ long f155864f;

    /* renamed from: g */
    final /* synthetic */ C21370a f155865g;

    public C58300y(SettableFuture settableFuture, Runnable runnable, AtomicReference atomicReference, C60888db dbVar, long j, long j2, C21370a aVar) {
        this.f155859a = settableFuture;
        this.f155860b = runnable;
        this.f155861c = atomicReference;
        this.f155862d = dbVar;
        this.f155863e = j;
        this.f155864f = j2;
        this.f155865g = aVar;
    }

    public final void run() {
        long j;
        try {
            if (!this.f155859a.isDone()) {
                this.f155860b.run();
                SettableFuture settableFuture = new SettableFuture();
                this.f155861c.set(settableFuture);
                if (!this.f155859a.isDone()) {
                    C60888db dbVar = this.f155862d;
                    long j2 = this.f155863e;
                    long j3 = this.f155864f;
                    long c = this.f155865g.mo26871c();
                    if (c < j2) {
                        j = (j2 + j3) - c;
                    } else {
                        j = j3 - ((c - j2) % j3);
                    }
                    settableFuture.mo57358p(dbVar.mo29164d(this, j, TimeUnit.MILLISECONDS));
                }
            }
        } catch (Throwable th) {
            this.f155859a.mo57357o(th);
        }
    }

    public final String toString() {
        return this.f155860b.toString();
    }
}
