package org.chromium.weblayer;

import android.webkit.ValueCallback;

/* renamed from: org.chromium.weblayer.be */
/* compiled from: PG */
public final /* synthetic */ class C72596be implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ValueCallback f193137a;

    public /* synthetic */ C72596be(ValueCallback valueCallback) {
        this.f193137a = valueCallback;
    }

    public final void run() {
        this.f193137a.onReceiveValue((Object) null);
    }
}
