package com.google.common.util.concurrent;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* renamed from: com.google.common.util.concurrent.cu */
/* compiled from: PG */
final class C60867cu extends AbstractOwnableSynchronizer implements Runnable {

    /* renamed from: a */
    private final C60869cw f164958a;

    public C60867cu(C60869cw cwVar) {
        this.f164958a = cwVar;
    }

    /* renamed from: a */
    public final void mo57346a(Thread thread) {
        super.setExclusiveOwnerThread(thread);
    }

    public final void run() {
    }

    public final String toString() {
        return this.f164958a.toString();
    }
}
