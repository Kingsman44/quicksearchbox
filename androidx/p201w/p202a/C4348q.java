package androidx.p201w.p202a;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import androidx.p201w.C4374r;
import java.util.concurrent.Executor;

/* renamed from: androidx.w.a.q */
/* compiled from: PG */
public final class C4348q {
    @Deprecated
    /* renamed from: a */
    public static int m12486a(WebSettings webSettings) {
        return webSettings.getForceDark();
    }

    /* renamed from: b */
    public static WebViewRenderProcess m12487b(WebView webView) {
        return webView.getWebViewRenderProcess();
    }

    /* renamed from: c */
    public static WebViewRenderProcessClient m12488c(WebView webView) {
        return webView.getWebViewRenderProcessClient();
    }

    @Deprecated
    /* renamed from: d */
    public static void m12489d(WebSettings webSettings, int i) {
        webSettings.setForceDark(i);
    }

    /* renamed from: e */
    public static void m12490e(WebView webView, C4374r rVar) {
        webView.setWebViewRenderProcessClient(rVar != null ? new C4330ag(rVar) : null);
    }

    /* renamed from: f */
    public static void m12491f(WebView webView, Executor executor, C4374r rVar) {
        webView.setWebViewRenderProcessClient(executor, rVar != null ? new C4330ag(rVar) : null);
    }

    /* renamed from: g */
    public static boolean m12492g(WebViewRenderProcess webViewRenderProcess) {
        return webViewRenderProcess.terminate();
    }
}
