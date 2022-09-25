package androidx.p201w.p202a;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.chromium.support_lib_boundary.p5648a.C72563b;

/* renamed from: androidx.w.a.af */
/* compiled from: PG */
public final class C4329af implements C4328ae {

    /* renamed from: a */
    final WebViewProviderFactoryBoundaryInterface f13953a;

    public C4329af(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f13953a = webViewProviderFactoryBoundaryInterface;
    }

    /* renamed from: a */
    public final StaticsBoundaryInterface mo9268a() {
        return (StaticsBoundaryInterface) C72563b.m107251a(StaticsBoundaryInterface.class, this.f13953a.getStatics());
    }

    /* renamed from: b */
    public final WebViewProviderBoundaryInterface mo9269b(WebView webView) {
        return (WebViewProviderBoundaryInterface) C72563b.m107251a(WebViewProviderBoundaryInterface.class, this.f13953a.createWebView(webView));
    }

    /* renamed from: c */
    public final WebkitToCompatConverterBoundaryInterface mo9270c() {
        return (WebkitToCompatConverterBoundaryInterface) C72563b.m107251a(WebkitToCompatConverterBoundaryInterface.class, this.f13953a.getWebkitToCompatConverter());
    }

    /* renamed from: d */
    public final String[] mo9271d() {
        return this.f13953a.getSupportedFeatures();
    }
}
