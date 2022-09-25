package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.webkit.JavascriptInterface;
import android.widget.FrameLayout;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.f */
/* compiled from: PG */
final class C108338f {

    /* renamed from: a */
    final FrameLayout f301359a;

    public C108338f(FrameLayout frameLayout) {
        this.f301359a = frameLayout;
    }

    @JavascriptInterface
    public void adsFinishedRendering(int i) {
        if (i > 0) {
            this.f301359a.setClickable(true);
            this.f301359a.setFocusable(true);
        }
    }
}
