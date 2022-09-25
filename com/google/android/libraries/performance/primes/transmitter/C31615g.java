package com.google.android.libraries.performance.primes.transmitter;

import android.content.BroadcastReceiver;

/* renamed from: com.google.android.libraries.performance.primes.transmitter.g */
/* compiled from: PG */
public final /* synthetic */ class C31615g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BroadcastReceiver.PendingResult f85085a;

    public /* synthetic */ C31615g(BroadcastReceiver.PendingResult pendingResult) {
        this.f85085a = pendingResult;
    }

    public final void run() {
        this.f85085a.finish();
    }
}
