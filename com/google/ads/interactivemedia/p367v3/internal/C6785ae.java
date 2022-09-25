package com.google.ads.interactivemedia.p367v3.internal;

import android.webkit.WebView;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ae */
/* compiled from: PG */
final class C6785ae implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C6786af f20399a;

    /* renamed from: b */
    private final WebView f20400b;

    public C6785ae(C6786af afVar) {
        this.f20399a = afVar;
        this.f20400b = afVar.f20496a;
    }

    public final void run() {
        this.f20400b.destroy();
    }
}
