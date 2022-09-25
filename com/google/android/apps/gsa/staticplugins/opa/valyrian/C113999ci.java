package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.view.ViewTreeObserver;
import com.google.android.apps.gsa.staticplugins.opa.webview.OpaWebView;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ci */
/* compiled from: PG */
final class C113999ci implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C114071eg f315639a;

    public C113999ci(C114071eg egVar) {
        this.f315639a = egVar;
    }

    public final void onGlobalLayout() {
        this.f315639a.mo100994aT().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        C114071eg egVar = this.f315639a;
        OpaWebView opaWebView = egVar.f315824aH;
        if (opaWebView != null) {
            egVar.mo101021cW(opaWebView);
        }
    }
}
