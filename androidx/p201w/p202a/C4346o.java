package androidx.p201w.p202a;

import android.content.pm.PackageInfo;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: androidx.w.a.o */
/* compiled from: PG */
public final class C4346o {
    /* renamed from: a */
    public static PackageInfo m12474a() {
        return WebView.getCurrentWebViewPackage();
    }

    /* renamed from: b */
    public static WebChromeClient m12475b(WebView webView) {
        return webView.getWebChromeClient();
    }

    /* renamed from: c */
    public static WebViewClient m12476c(WebView webView) {
        return webView.getWebViewClient();
    }

    /* renamed from: d */
    public static void m12477d(WebSettings webSettings, boolean z) {
        webSettings.setSafeBrowsingEnabled(z);
    }

    /* renamed from: e */
    public static boolean m12478e(WebSettings webSettings) {
        return webSettings.getSafeBrowsingEnabled();
    }
}
