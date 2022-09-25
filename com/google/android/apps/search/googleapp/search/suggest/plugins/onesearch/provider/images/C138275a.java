package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images;

import com.google.common.util.concurrent.C60873d;
import com.google.common.util.concurrent.SettableFuture;
import org.chromium.net.UrlRequest;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images.a */
/* compiled from: PG */
public final /* synthetic */ class C138275a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SettableFuture f376215a;

    /* renamed from: b */
    public final /* synthetic */ UrlRequest f376216b;

    public /* synthetic */ C138275a(SettableFuture settableFuture, UrlRequest urlRequest) {
        this.f376215a = settableFuture;
        this.f376216b = urlRequest;
    }

    public final void run() {
        SettableFuture settableFuture = this.f376215a;
        UrlRequest urlRequest = this.f376216b;
        if (settableFuture.value instanceof C60873d.C60875b) {
            urlRequest.cancel();
        }
    }
}
