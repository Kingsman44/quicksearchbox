package com.google.frameworks.client.data.android;

import com.google.common.util.concurrent.C60873d;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UrlRequest;

/* renamed from: com.google.frameworks.client.data.android.t */
/* compiled from: PG */
final class C61619t implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SettableFuture f166490a;

    /* renamed from: b */
    final /* synthetic */ UrlRequest f166491b;

    public C61619t(SettableFuture settableFuture, UrlRequest urlRequest) {
        this.f166490a = settableFuture;
        this.f166491b = urlRequest;
    }

    public final void run() {
        AtomicInteger atomicInteger = C61359aa.f165925a;
        Object obj = this.f166490a.value;
        if (this.f166490a.value instanceof C60873d.C60875b) {
            this.f166491b.cancel();
        }
    }
}
