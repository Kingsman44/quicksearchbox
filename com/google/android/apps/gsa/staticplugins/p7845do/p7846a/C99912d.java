package com.google.android.apps.gsa.staticplugins.p7845do.p7846a;

import android.webkit.WebView;
import com.google.android.apps.gsa.search.core.webview.GsaWebViewContainer;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.do.a.d */
/* compiled from: PG */
public final /* synthetic */ class C99912d implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C99908ah f279531a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f279532b;

    /* renamed from: c */
    public final /* synthetic */ String f279533c;

    public /* synthetic */ C99912d(C99908ah ahVar, C58833ax axVar, String str) {
        this.f279531a = ahVar;
        this.f279532b = axVar;
        this.f279533c = str;
    }

    public final void run() {
        WebView a;
        C99908ah ahVar = this.f279531a;
        C58833ax axVar = this.f279532b;
        String str = this.f279533c;
        if (axVar.mo56113h() && (a = ((GsaWebViewContainer) axVar.mo56107c()).mo80858a()) != null) {
            a.loadUrl(str, ahVar.mo91673f());
        }
    }
}
