package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.webview.OpaWebView;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.cq */
/* compiled from: PG */
final class C114007cq implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ C114071eg f315650a;

    public C114007cq(C114071eg egVar) {
        this.f315650a = egVar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C114071eg egVar = this.f315650a;
        OpaWebView opaWebView = egVar.f315824aH;
        if (opaWebView != null && i4 - i2 != i8 - i6) {
            egVar.mo101021cW(opaWebView);
        }
    }
}
