package com.google.android.libraries.gsa.conversation.p1850d;

import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.libraries.gsa.conversation.d.d */
/* compiled from: PG */
public final /* synthetic */ class C22554d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C22559i f62170a;

    /* renamed from: b */
    public final /* synthetic */ String f62171b;

    /* renamed from: c */
    public final /* synthetic */ long f62172c;

    /* renamed from: d */
    public final /* synthetic */ SettableFuture f62173d;

    public /* synthetic */ C22554d(C22559i iVar, String str, long j, SettableFuture settableFuture) {
        this.f62170a = iVar;
        this.f62171b = str;
        this.f62172c = j;
        this.f62173d = settableFuture;
    }

    public final void run() {
        C22559i iVar = this.f62170a;
        String str = this.f62171b;
        long j = this.f62172c;
        SettableFuture settableFuture = this.f62173d;
        iVar.f62188i = C58836b.f156633a;
        try {
            C58976aa aaVar = C58975e.f156826a;
            if (iVar.f62187h.mo56113h()) {
                ((WebView) iVar.f62187h.mo56107c()).destroy();
            }
            WebView webView = new WebView(iVar.f62183d);
            webView.setWillNotDraw(true);
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setDefaultTextEncodingName("UTF-8");
            settings.setAllowFileAccess(false);
            WebView.setWebContentsDebuggingEnabled(true);
            webView.setWebChromeClient(new C22557g(iVar));
            iVar.f62187h = C58833ax.m90834k(webView);
            webView.loadUrl("javascript:" + str);
            webView.evaluateJavascript("console.log(\"Initialization done.\")", new C22555e(iVar, j, settableFuture));
        } catch (Exception e) {
            C59104x c = C22559i.f62180a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "JavascriptRunner");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(48317)).mo56384n();
            iVar.f62185f.set(false);
            settableFuture.mo57356n(C58833ax.m90834k("Failed to initialize WebView: ".concat(String.valueOf(e.getMessage()))));
        }
    }
}
