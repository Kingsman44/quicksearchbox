package com.google.android.apps.gsa.staticplugins.inappwebpage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.webkit.WebView;

/* renamed from: com.google.android.apps.gsa.staticplugins.inappwebpage.k */
/* compiled from: PG */
final class C102485k extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ WebView f286036a;

    /* renamed from: b */
    final /* synthetic */ C102488n f286037b;

    public C102485k(C102488n nVar, WebView webView) {
        this.f286037b = nVar;
        this.f286036a = webView;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f286036a.getAlpha() < 0.05f) {
            this.f286037b.f286043c.removeView(this.f286036a);
            this.f286036a.destroy();
        }
    }
}
