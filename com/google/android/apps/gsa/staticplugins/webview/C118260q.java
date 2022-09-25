package com.google.android.apps.gsa.staticplugins.webview;

import android.webkit.WebView;
import com.google.android.apps.gsa.search.core.p6805i.C86130z;
import com.google.android.apps.gsa.search.core.webview.C87263i;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.q */
/* compiled from: PG */
public final class C118260q {

    /* renamed from: a */
    public WebView f328306a;

    /* renamed from: b */
    public final C86130z f328307b;

    /* renamed from: c */
    public final C87263i f328308c;

    public C118260q(WebView webView, C86130z zVar, C87263i iVar) {
        this.f328306a = webView;
        this.f328307b = zVar;
        this.f328308c = iVar;
        webView.addJavascriptInterface(iVar, zVar.mo79764c(R.string.velvetgsabridge_interface_name));
    }
}
