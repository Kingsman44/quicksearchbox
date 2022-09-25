package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.ce */
/* compiled from: PG */
final class C115710ce extends WebChromeClient {

    /* renamed from: a */
    final /* synthetic */ C115711cf f320911a;

    public C115710ce(C115711cf cfVar) {
        this.f320911a = cfVar;
    }

    public final void onProgressChanged(WebView webView, int i) {
        if (i == 100) {
            C115711cf cfVar = this.f320911a;
            if (!cfVar.f320916D) {
                cfVar.f320916D = true;
                cfVar.mo102210k();
            }
            i = 100;
        }
        C115711cf cfVar2 = this.f320911a;
        if (((double) i) >= cfVar2.f320938i && cfVar2.f320913A.compareAndSet(false, true)) {
            this.f320911a.f320955z.setVisibility(0);
            this.f320911a.f320947r.setVisibility(8);
            this.f320911a.f320936g.mo101920D();
            this.f320911a.f320942m.setEnabled(true);
        }
    }
}
