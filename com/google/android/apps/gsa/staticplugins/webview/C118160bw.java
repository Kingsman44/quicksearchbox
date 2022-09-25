package com.google.android.apps.gsa.staticplugins.webview;

import android.webkit.ValueCallback;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.bw */
/* compiled from: PG */
public final /* synthetic */ class C118160bw implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ SettableFuture f327953a;

    public /* synthetic */ C118160bw(SettableFuture settableFuture) {
        this.f327953a = settableFuture;
    }

    public final void onReceiveValue(Object obj) {
        String str = (String) obj;
        this.f327953a.mo57356n(C118826c.f331422a);
    }
}
