package com.google.android.apps.gsa.staticplugins.p7845do.p7846a;

import android.net.Uri;
import android.webkit.WebView;
import com.google.android.apps.gsa.search.core.webview.GsaWebViewContainer;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.do.a.t */
/* compiled from: PG */
public final /* synthetic */ class C99928t implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C99908ah f279556a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f279557b;

    /* renamed from: c */
    public final /* synthetic */ Uri f279558c;

    public /* synthetic */ C99928t(C99908ah ahVar, C58833ax axVar, Uri uri) {
        this.f279556a = ahVar;
        this.f279557b = axVar;
        this.f279558c = uri;
    }

    public final void run() {
        WebView a;
        C99908ah ahVar = this.f279556a;
        C58833ax axVar = this.f279557b;
        Uri uri = this.f279558c;
        if (axVar.mo56113h() && (a = ((GsaWebViewContainer) axVar.mo56107c()).mo80858a()) != null) {
            a.loadUrl(uri.toString(), ahVar.mo91673f());
        }
    }
}
