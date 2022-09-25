package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.fd */
/* compiled from: PG */
final class C115790fd extends WebChromeClient {

    /* renamed from: a */
    final /* synthetic */ C115791fe f321067a;

    public C115790fd(C115791fe feVar) {
        this.f321067a = feVar;
    }

    public final void onProgressChanged(WebView webView, int i) {
        if (i == 100) {
            C115791fe feVar = this.f321067a;
            if (!feVar.f321078J) {
                feVar.f321078J = true;
                feVar.mo102253k();
            }
            i = 100;
        }
        C115791fe feVar2 = this.f321067a;
        if (((double) i) >= feVar2.f321098i && feVar2.f321075G.compareAndSet(false, true)) {
            this.f321067a.f321069A.setVisibility(0);
            this.f321067a.f321110u.setVisibility(8);
            this.f321067a.f321096g.mo101920D();
            this.f321067a.f321103n.setEnabled(true);
        }
    }
}
