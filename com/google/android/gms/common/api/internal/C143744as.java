package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.as */
/* compiled from: PG */
abstract class C143744as implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C143745at f389672b;

    public C143744as(C143745at atVar) {
        this.f389672b = atVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo119146a();

    public final void run() {
        Lock lock;
        this.f389672b.f389674b.lock();
        try {
            if (Thread.interrupted()) {
                lock = this.f389672b.f389674b;
            } else {
                mo119146a();
                lock = this.f389672b.f389674b;
            }
        } catch (RuntimeException e) {
            C143755bc bcVar = this.f389672b.f389673a;
            bcVar.f389728e.sendMessage(bcVar.f389728e.obtainMessage(2, e));
            lock = this.f389672b.f389674b;
        } catch (Throwable th) {
            this.f389672b.f389674b.unlock();
            throw th;
        }
        lock.unlock();
    }
}
