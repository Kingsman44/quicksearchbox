package com.google.android.apps.gsa.staticplugins.opa.webview;

import android.webkit.JavascriptInterface;
import com.google.android.apps.gsa.search.core.p6500ac.C84411o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7030bj.C89688a;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.libraries.gsa.p1876k.C22871g;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.ba */
/* compiled from: PG */
public final class C114217ba {

    /* renamed from: a */
    private final C22871g f316718a;

    /* renamed from: b */
    private final C84411o f316719b;

    /* renamed from: c */
    private final C89688a f316720c;

    /* renamed from: d */
    private final OpaWebView f316721d;

    /* renamed from: e */
    private final C68214a f316722e;

    public C114217ba(OpaWebView opaWebView, C89688a aVar, C22871g gVar, C84411o oVar, C68214a aVar2) {
        this.f316721d = opaWebView;
        this.f316718a = gVar;
        this.f316719b = oVar;
        this.f316720c = aVar;
        this.f316722e = aVar2;
    }

    /* renamed from: a */
    public final void mo101266a(boolean z) {
        this.f316721d.mo101225d(z, false);
        if (((C86124t) this.f316722e.mo27525b()).mo79746e(C90029ch.f248256aq)) {
            this.f316721d.mo101223c(z);
        }
    }

    @JavascriptInterface
    public void enterBasicMode(String str, String str2) {
        this.f316718a.mo28212l("enterBasicMode", new C114210ay(this));
        this.f316719b.mo77963a(str, str2, this.f316720c).mo77962d("{}");
    }

    @JavascriptInterface
    public void exitBasicMode(String str, String str2) {
        this.f316718a.mo28212l("exitBasicMode", new C114211az(this));
        this.f316719b.mo77963a(str, str2, this.f316720c).mo77962d("{}");
    }
}
