package com.google.ads.interactivemedia.p367v3.internal;

import android.view.ViewGroup;
import android.webkit.WebView;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aob */
/* compiled from: PG */
public final class aob {

    /* renamed from: a */
    private final WebView f21092a;

    /* renamed from: b */
    private final ViewGroup f21093b;

    public aob(WebView webView, ViewGroup viewGroup) {
        this.f21092a = webView;
        this.f21093b = viewGroup;
    }

    /* renamed from: a */
    public final void mo15069a() {
        if (((ViewGroup) this.f21092a.getParent()) == null) {
            this.f21093b.addView(this.f21092a, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f21092a.setVisibility(0);
        this.f21093b.bringChildToFront(this.f21092a);
    }

    /* renamed from: b */
    public final void mo15070b() {
        this.f21092a.setVisibility(4);
    }
}
