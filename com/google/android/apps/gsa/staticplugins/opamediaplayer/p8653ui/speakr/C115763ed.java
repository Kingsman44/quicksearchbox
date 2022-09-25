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

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.ed */
/* compiled from: PG */
public final /* synthetic */ class C115763ed implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C115791fe f321031a;

    public /* synthetic */ C115763ed(C115791fe feVar) {
        this.f321031a = feVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        int i;
        C115791fe feVar = this.f321031a;
        C58833ax axVar = (C58833ax) obj;
        C58976aa aaVar = C58975e.f156826a;
        if (axVar.mo56113h()) {
            feVar.f321078J = false;
            WebView a = ((GsaWebViewContainer) axVar.mo56107c()).mo80858a();
            a.getClass();
            feVar.f321069A = a;
            feVar.f321080L = C58836b.f156633a;
            feVar.f321069A.setVerticalFadingEdgeEnabled(true);
            feVar.f321069A.setFadingEdgeLength(50);
            WebSettings settings = feVar.f321069A.getSettings();
            if (feVar.f321083O && (feVar.f321208b.getResources().getConfiguration().uiMode & 48) == 32) {
                i = 2;
            } else {
                i = 0;
            }
            settings.setForceDark(i);
            feVar.f321069A.addJavascriptInterface(feVar, "javaProxy");
            feVar.f321069A.setOnTouchListener(new C115776eq(feVar));
            feVar.f321069A.setFocusable(true);
            feVar.f321069A.setFocusableInTouchMode(true);
            feVar.f321069A.setWebViewClient(new C115789fc(feVar));
            feVar.f321069A.setWebChromeClient(new C115790fd(feVar));
            WebSettings settings2 = feVar.f321069A.getSettings();
            settings2.setJavaScriptEnabled(true);
            settings2.setLoadWithOverviewMode(true);
            settings2.setDomStorageEnabled(true);
            settings2.setUseWideViewPort(true);
            settings2.setAllowFileAccess(false);
            feVar.f321115z.removeAllViews();
            WebView webView = feVar.f321069A;
            if (!(webView == null || webView.getParent() == null)) {
                ((ViewGroup) feVar.f321069A.getParent()).removeView(feVar.f321069A);
            }
            feVar.f321115z.addView(feVar.f321069A);
            feVar.mo102254l();
        }
    }
}
