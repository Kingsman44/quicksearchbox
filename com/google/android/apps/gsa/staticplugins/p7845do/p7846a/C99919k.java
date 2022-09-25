package com.google.android.apps.gsa.staticplugins.p7845do.p7846a;

import android.webkit.WebView;
import com.google.android.apps.gsa.search.core.webview.GsaWebViewContainer;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.do.a.k */
/* compiled from: PG */
public final /* synthetic */ class C99919k implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C58833ax f279540a;

    public /* synthetic */ C99919k(C58833ax axVar) {
        this.f279540a = axVar;
    }

    public final void run() {
        WebView a;
        C58833ax axVar = this.f279540a;
        if (axVar.mo56113h() && (a = ((GsaWebViewContainer) axVar.mo56107c()).mo80858a()) != null) {
            a.loadUrl("about:blank");
        }
    }
}
