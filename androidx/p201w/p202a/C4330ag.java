package androidx.p201w.p202a;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import androidx.p201w.C4374r;

/* renamed from: androidx.w.a.ag */
/* compiled from: PG */
public final class C4330ag extends WebViewRenderProcessClient {

    /* renamed from: a */
    private final C4374r f13954a;

    public C4330ag(C4374r rVar) {
        this.f13954a = rVar;
    }

    public final void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        C4374r rVar = this.f13954a;
        C4331ah.m12432a(webViewRenderProcess);
        rVar.mo9293a();
    }

    public final void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        C4374r rVar = this.f13954a;
        C4331ah.m12432a(webViewRenderProcess);
        rVar.mo9294b(webView);
    }
}
