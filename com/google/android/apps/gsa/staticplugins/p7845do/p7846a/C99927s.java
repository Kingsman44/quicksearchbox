package com.google.android.apps.gsa.staticplugins.p7845do.p7846a;

import android.net.Uri;
import android.webkit.WebView;
import com.google.android.apps.gsa.search.core.webview.GsaWebViewContainer;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.base.C58833ax;
import com.google.common.p4574q.C60740s;
import com.google.common.p4574q.C60741t;

/* renamed from: com.google.android.apps.gsa.staticplugins.do.a.s */
/* compiled from: PG */
public final /* synthetic */ class C99927s implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C99908ah f279553a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f279554b;

    /* renamed from: c */
    public final /* synthetic */ boolean f279555c;

    public /* synthetic */ C99927s(C99908ah ahVar, C58833ax axVar, boolean z) {
        this.f279553a = ahVar;
        this.f279554b = axVar;
        this.f279555c = z;
    }

    public final void run() {
        WebView a;
        String url;
        C99908ah ahVar = this.f279553a;
        C58833ax axVar = this.f279554b;
        boolean z = this.f279555c;
        if (axVar.mo56113h() && (a = ((GsaWebViewContainer) axVar.mo56107c()).mo80858a()) != null && (url = a.getUrl()) != null) {
            if (z) {
                boolean equals = "1".equals(Uri.parse(url).getQueryParameter("cs"));
                if (!ahVar.f279496q || equals) {
                    C60741t a2 = C60741t.m92704a(C60740s.m92701a(url));
                    a2.mo57137c("cs", new String[0]);
                    url = a2.mo57139d().toString();
                } else {
                    Uri.Builder buildUpon = Uri.parse(url).buildUpon();
                    buildUpon.appendQueryParameter("cs", "1");
                    url = buildUpon.toString();
                }
            }
            a.loadUrl(url, ahVar.mo91673f());
        }
    }
}
