package com.google.android.apps.gsa.staticplugins.p7845do.p7846a;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.shared.p7066m.C90076ea;
import com.google.android.apps.gsa.shared.util.p7191w.C91144a;
import com.google.common.base.C58837ba;
import com.google.common.base.C58890d;
import java.util.List;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.do.a.af */
/* compiled from: PG */
final class C99906af extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ C99908ah f279477a;

    public C99906af(C99908ah ahVar) {
        this.f279477a = ahVar;
    }

    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        this.f279477a.f279483d.mo28212l("update canGoBack", new C99904ad(this, webView.canGoBack()));
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        webView.loadUrl("about:blank");
        this.f279477a.f279483d.mo28212l("update error", new C99905ae(this, i, str2));
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.f279477a.f279483d.mo28212l("update canGoBack", new C99903ac(this));
        C99908ah ahVar = this.f279477a;
        Uri parse = Uri.parse(str);
        String path = parse.getPath();
        if (ahVar.f279485f.mo79554e(parse, false) && path != null) {
            List<String> pathSegments = parse.getPathSegments();
            if (!C91144a.m148925b(parse, "accounts.google.com") || pathSegments.size() != 1 || !C58890d.m90990e(pathSegments.get(0), "ServiceLogin")) {
                if (C91144a.m148925b(parse, "google.com")) {
                    if (!pathSegments.isEmpty()) {
                        String str2 = pathSegments.get(0);
                        if (str2.equals("save") || str2.equals("collections")) {
                            String x = ahVar.f279492m.mo79758x(C90076ea.f249786g);
                            if (!C58837ba.m90859h(x)) {
                                webView.loadUrl(parse.buildUpon().appendQueryParameter("th", x).build().toString(), ahVar.mo91673f());
                                return false;
                            }
                            webView.loadUrl(parse.toString(), ahVar.mo91673f());
                        } else if (str2.equals("imgres")) {
                            webView.loadUrl(parse.buildUpon().appendQueryParameter("hl", Locale.getDefault().getLanguage()).build().toString());
                        } else if (ahVar.f279487h.mo79768h(path)) {
                            if (((C84486a) ahVar.f279497r.mo27525b()).mo78207n()) {
                                ahVar.f279491l.mo65089a(C99908ah.m165565e(Optional.m71637of(str)));
                            } else if (!ahVar.f279486g.mo56113h()) {
                                return false;
                            } else {
                                ahVar.f279483d.mo28212l("commit search url", new C99920l(ahVar, str));
                            }
                        } else if (str2.equals("maps")) {
                            ahVar.f279483d.mo28212l("launch maps", new C99923o(ahVar, parse));
                        }
                    } else if (((C84486a) ahVar.f279497r.mo27525b()).mo78207n()) {
                        ahVar.f279491l.mo65089a(C99908ah.m165565e(Optional.empty()));
                    } else if (!ahVar.f279486g.mo56113h()) {
                        return false;
                    } else {
                        ahVar.f279483d.mo28212l("start query edit", new C99917i(ahVar));
                    }
                    return true;
                }
            } else {
                ahVar.f279483d.mo28212l("launch sign in", new C99933y(ahVar));
                return true;
            }
        }
        ahVar.f279483d.mo28212l("open url in CCT", new C99910b(ahVar, parse));
        return true;
    }
}
