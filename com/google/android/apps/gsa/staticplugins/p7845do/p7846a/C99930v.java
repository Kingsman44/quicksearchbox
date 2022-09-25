package com.google.android.apps.gsa.staticplugins.p7845do.p7846a;

import android.net.Uri;
import android.webkit.WebView;
import com.google.android.apps.gsa.search.core.webview.GsaWebViewContainer;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.do.a.v */
/* compiled from: PG */
public final /* synthetic */ class C99930v implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C99908ah f279561a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f279562b;

    /* renamed from: c */
    public final /* synthetic */ Uri f279563c;

    public /* synthetic */ C99930v(C99908ah ahVar, C58833ax axVar, Uri uri) {
        this.f279561a = ahVar;
        this.f279562b = axVar;
        this.f279563c = uri;
    }

    public final void run() {
        WebView a;
        C99908ah ahVar = this.f279561a;
        C58833ax axVar = this.f279562b;
        Uri uri = this.f279563c;
        if (axVar.mo56113h() && (a = ((GsaWebViewContainer) axVar.mo56107c()).mo80858a()) != null && "about:blank".equals(a.getUrl())) {
            a.loadUrl(uri.toString(), ahVar.mo91673f());
        }
    }
}
