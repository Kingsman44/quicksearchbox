package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.apps.gsa.search.core.webview.GsaWebViewContainer;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.ax */
/* compiled from: PG */
public final /* synthetic */ class C115675ax implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C115711cf f320867a;

    public /* synthetic */ C115675ax(C115711cf cfVar) {
        this.f320867a = cfVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C115711cf cfVar = this.f320867a;
        C58833ax axVar = (C58833ax) obj;
        C58976aa aaVar = C58975e.f156826a;
        if (axVar.mo56113h()) {
            cfVar.f320916D = false;
            WebView a = ((GsaWebViewContainer) axVar.mo56107c()).mo80858a();
            a.getClass();
            cfVar.f320955z = a;
            cfVar.f320918F = C58836b.f156633a;
            cfVar.f320955z.addJavascriptInterface(cfVar, "javaProxy");
            cfVar.f320955z.setOnTouchListener(new C115677az(cfVar));
            cfVar.f320955z.setFocusable(true);
            cfVar.f320955z.setFocusableInTouchMode(true);
            cfVar.f320955z.setWebViewClient(new C115709cd(cfVar));
            cfVar.f320955z.setWebChromeClient(new C115710ce(cfVar));
            WebSettings settings = cfVar.f320955z.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setLoadWithOverviewMode(true);
            settings.setDomStorageEnabled(true);
            settings.setUseWideViewPort(true);
            settings.setAllowFileAccess(false);
            cfVar.f320954y.removeAllViews();
            WebView webView = cfVar.f320955z;
            if (!(webView == null || webView.getParent() == null)) {
                ((ViewGroup) cfVar.f320955z.getParent()).removeView(cfVar.f320955z);
            }
            cfVar.f320954y.addView(cfVar.f320955z);
            cfVar.mo102211l();
        }
    }
}
