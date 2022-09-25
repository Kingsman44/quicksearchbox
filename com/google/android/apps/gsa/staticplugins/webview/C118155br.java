package com.google.android.apps.gsa.staticplugins.webview;

import android.webkit.WebView;
import com.google.android.libraries.gsa.p1876k.C22870f;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.br */
/* compiled from: PG */
public final /* synthetic */ class C118155br implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C118163bz f327948a;

    public /* synthetic */ C118155br(C118163bz bzVar) {
        this.f327948a = bzVar;
    }

    public final void run() {
        C118163bz bzVar = this.f327948a;
        bzVar.f327963h = new WebView(bzVar.f327958c);
        bzVar.f327963h.getSettings().setJavaScriptEnabled(true);
        bzVar.mo103566b();
    }
}
