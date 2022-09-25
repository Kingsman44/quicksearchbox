package com.google.android.apps.gsa.staticplugins.opa.webview;

import android.content.Context;
import android.support.p033v7.app.C0401v;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.C0826b;
import com.google.android.apps.gsa.search.core.C85757cq;
import com.google.android.apps.gsa.search.core.google.p6797g.C85985a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86130z;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.shared.p7030bj.C89688a;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.C91033e;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.material.p3505b.C44534d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.au */
/* compiled from: PG */
public final class C114206au implements C89688a {

    /* renamed from: a */
    public static final C59071e f316672a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.webview.au");

    /* renamed from: b */
    public final Context f316673b;

    /* renamed from: c */
    public final C22871g f316674c;

    /* renamed from: d */
    public final C22871g f316675d;

    /* renamed from: e */
    public final C22871g f316676e;

    /* renamed from: f */
    public final C86610af f316677f;

    /* renamed from: g */
    public final C68214a f316678g;

    /* renamed from: h */
    public final C114189ad f316679h;

    /* renamed from: i */
    public final C114238q f316680i;

    /* renamed from: j */
    public final C86124t f316681j;

    /* renamed from: k */
    public final C68214a f316682k;

    /* renamed from: l */
    public final C86130z f316683l;

    /* renamed from: m */
    public final C114196ak f316684m;

    /* renamed from: n */
    public boolean f316685n;

    /* renamed from: o */
    public C114188ac f316686o;

    /* renamed from: p */
    public C114195aj f316687p;

    /* renamed from: q */
    public boolean f316688q;

    /* renamed from: r */
    public Exception f316689r;

    /* renamed from: s */
    WebView f316690s;

    /* renamed from: t */
    boolean f316691t;

    /* renamed from: u */
    public final AtomicBoolean f316692u = new AtomicBoolean(false);

    /* renamed from: v */
    public final AtomicBoolean f316693v = new AtomicBoolean(false);

    /* renamed from: w */
    public final View.OnKeyListener f316694w = new C114203ar(this);

    /* renamed from: x */
    private final C85757cq f316695x;

    /* renamed from: y */
    private final C104149a f316696y;

    public C114206au(Context context, C22871g gVar, C22871g gVar2, C22871g gVar3, C86610af afVar, C68214a aVar, C114189ad adVar, C114238q qVar, C86124t tVar, C104149a aVar2, C85757cq cqVar, C68214a aVar3, C86130z zVar, C114196ak akVar) {
        this.f316673b = context;
        this.f316674c = gVar;
        this.f316675d = gVar2;
        this.f316676e = gVar3;
        this.f316677f = afVar;
        this.f316678g = aVar;
        this.f316679h = adVar;
        this.f316680i = qVar;
        this.f316681j = tVar;
        this.f316696y = aVar2;
        this.f316695x = cqVar;
        this.f316682k = aVar3;
        this.f316683l = zVar;
        this.f316684m = akVar;
    }

    /* renamed from: d */
    public static boolean m189467d(Throwable th) {
        if (th == null) {
            return false;
        }
        if (th.getClass().getName().contains("MissingWebViewPackageException")) {
            return true;
        }
        return m189467d(th.getCause());
    }

    /* renamed from: a */
    public final void mo83590a(String str) {
        WebView webView = this.f316690s;
        if (webView != null) {
            webView.evaluateJavascript(str, (ValueCallback) null);
        }
    }

    /* renamed from: b */
    public final void mo101260b() {
        ContextThemeWrapper contextThemeWrapper;
        OpaWebView opaWebView;
        String str;
        C22872h.m42742b(C0826b.class);
        C58976aa aaVar = C58975e.f156826a;
        if (this.f316690s == null) {
            C91033e eVar = new C91033e(this.f316673b);
            C90476a aVar = C91018d.f254254a;
            if (!this.f316696y.mo93971b()) {
                contextThemeWrapper = new ContextThemeWrapper(eVar, 2132149688);
            } else if (C44534d.m78715b()) {
                contextThemeWrapper = new ContextThemeWrapper(eVar, 2132149690);
            } else {
                contextThemeWrapper = new ContextThemeWrapper(eVar, 2132149689);
            }
            if (this.f316681j.mo79746e(C90014bt.f247413gg)) {
                opaWebView = (OpaWebView) LayoutInflater.from(contextThemeWrapper).cloneInContext(contextThemeWrapper).inflate(R.layout.opa_web_view, (ViewGroup) null, false);
            } else {
                opaWebView = new OpaWebView(contextThemeWrapper);
            }
            opaWebView.f316492a = ViewConfiguration.get(contextThemeWrapper).getScaledTouchSlop();
            opaWebView.f316499h = C85985a.m138246a(opaWebView.getContext().getResources());
            opaWebView.f316502k = this.f316681j.mo79746e(C90014bt.f247591jz);
            opaWebView.f316503l = this.f316681j.mo79746e(C90014bt.f247607kO);
            opaWebView.f316504m = this.f316681j.mo79743a(C90014bt.f247390gJ);
            this.f316690s = opaWebView;
            eVar.mo85312b(opaWebView);
            if (this.f316681j.mo79746e(C90014bt.f247230dI) && this.f316681j.mo79746e(C90014bt.f247413gg)) {
                C0401v.m1321C();
            }
            WebView webView = this.f316690s;
            webView.getClass();
            webView.setVerticalScrollBarEnabled(false);
            WebView webView2 = this.f316690s;
            webView2.getClass();
            webView2.setBackgroundColor(webView2.getResources().getColor(R.color.agsa_color_background));
            WebView webView3 = this.f316690s;
            webView3.getClass();
            WebSettings settings = webView3.getSettings();
            if (this.f316681j.mo79746e(C90014bt.f247055T)) {
                str = String.valueOf(this.f316695x.mo6453a()).concat(" OpaScreenful/0");
            } else {
                str = this.f316695x.mo6453a();
            }
            settings.setUserAgentString(str);
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(false);
            settings.setAllowFileAccess(false);
            settings.setGeolocationEnabled(true);
            settings.setMediaPlaybackRequiresUserGesture(false);
            settings.setMixedContentMode(2);
            settings.setForceDark(this.f316681j.mo79746e(C90014bt.f247714mP) ^ true ? 1 : 0);
            if (this.f316681j.mo79746e(C90014bt.f247240dS)) {
                this.f316686o = this.f316679h.mo101255a(this.f316683l);
                WebView webView4 = this.f316690s;
                webView4.getClass();
                webView4.setOnKeyListener(this.f316694w);
                WebView webView5 = this.f316690s;
                webView5.getClass();
                C114188ac acVar = this.f316686o;
                acVar.getClass();
                webView5.setWebViewClient(acVar);
                WebView webView6 = this.f316690s;
                webView6.getClass();
                webView6.setWebChromeClient(this.f316680i.mo101279a(webView6));
                C114195aj a = this.f316684m.mo101258a(this);
                this.f316687p = a;
                WebView webView7 = this.f316690s;
                webView7.getClass();
                a.mo101256a(webView7);
            }
            this.f316692u.set(true);
        }
    }

    /* renamed from: c */
    public final void mo101261c() {
        C58976aa aaVar = C58975e.f156826a;
        C22872h.m42742b(C0826b.class);
        if (!this.f316685n) {
            this.f316685n = true;
            if (this.f316681j.mo79746e(C90014bt.f247819of)) {
                WebView webView = this.f316690s;
                webView.getClass();
                webView.loadUrl("about:blank");
            }
            this.f316693v.set(true);
        }
    }
}
