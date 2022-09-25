package com.google.frameworks.client.data.android;

import com.google.common.util.concurrent.SettableFuture;
import com.google.net.p4726a.p4727a.C62722b;
import org.chromium.net.CallbackException;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;

/* renamed from: com.google.frameworks.client.data.android.y */
/* compiled from: PG */
final class C61624y implements Runnable {

    /* renamed from: a */
    final /* synthetic */ CronetException f166497a;

    /* renamed from: b */
    final /* synthetic */ C61625z f166498b;

    public C61624y(C61625z zVar, CronetException cronetException) {
        this.f166498b = zVar;
        this.f166497a = cronetException;
    }

    public final void run() {
        C62722b bVar;
        SettableFuture settableFuture = this.f166498b.f166499a;
        CronetException cronetException = this.f166497a;
        if (cronetException instanceof CallbackException) {
            bVar = C62722b.INTERNAL;
        } else if (!(cronetException instanceof NetworkException) || ((NetworkException) cronetException).getErrorCode() != 11) {
            bVar = C62722b.UNAVAILABLE;
        } else {
            bVar = C62722b.UNKNOWN;
        }
        settableFuture.mo57357o(new C61361ac("Http networking stack error", cronetException, bVar));
    }
}
