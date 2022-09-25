package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.view.View;
import android.view.WindowInsets;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108226ax;
import com.google.android.apps.gsa.staticplugins.opa.webview.OpaWebView;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.an */
/* compiled from: PG */
public final /* synthetic */ class C113939an implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    public final /* synthetic */ C114071eg f315560a;

    /* renamed from: b */
    public final /* synthetic */ C108226ax f315561b;

    public /* synthetic */ C113939an(C114071eg egVar, C108226ax axVar) {
        this.f315560a = egVar;
        this.f315561b = axVar;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C114071eg egVar = this.f315560a;
        C108226ax axVar = this.f315561b;
        if (windowInsets.isVisible(8) && !axVar.mo96408u()) {
            egVar.f315902bl = true;
            egVar.f315853ak.mo100786j(true);
            egVar.mo100996aZ().setVisibility(8);
        }
        if (!windowInsets.isVisible(8) && egVar.f315902bl) {
            egVar.f315902bl = false;
            egVar.f315853ak.mo100796t(true);
            egVar.mo100996aZ().setVisibility(0);
        }
        view.setPaddingRelative(((!windowInsets.isVisible(8) || !axVar.mo96408u()) && egVar.mo101039dm()) ? egVar.mo100984aF() : 0, 0, 0, 0);
        if (egVar.mo101039dm()) {
            egVar.f315985u.setClipToOutline(!windowInsets.isVisible(8));
        }
        OpaWebView opaWebView = egVar.f315824aH;
        if (opaWebView != null) {
            egVar.mo101021cW(opaWebView);
        }
        return windowInsets;
    }
}
