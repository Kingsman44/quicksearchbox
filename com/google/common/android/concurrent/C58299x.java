package com.google.common.android.concurrent;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.common.android.concurrent.x */
/* compiled from: PG */
public final /* synthetic */ class C58299x implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f155858a;

    public /* synthetic */ C58299x(AtomicReference atomicReference) {
        this.f155858a = atomicReference;
    }

    public final void run() {
        ((Future) this.f155858a.get()).cancel(false);
    }
}
