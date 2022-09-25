package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import java.util.concurrent.locks.Lock;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.dl */
/* compiled from: PG */
public final /* synthetic */ class C61956dl implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Lock f167427a;

    public /* synthetic */ C61956dl(Lock lock) {
        this.f167427a = lock;
    }

    public final void run() {
        this.f167427a.unlock();
    }
}
