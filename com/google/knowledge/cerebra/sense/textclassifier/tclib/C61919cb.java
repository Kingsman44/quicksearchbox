package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import java.util.concurrent.locks.Lock;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.cb */
/* compiled from: PG */
public final /* synthetic */ class C61919cb implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Lock f167393a;

    public /* synthetic */ C61919cb(Lock lock) {
        this.f167393a = lock;
    }

    public final void run() {
        this.f167393a.unlock();
    }
}
