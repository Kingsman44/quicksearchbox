package androidx.p201w.p202a;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.p201w.C4361e;
import androidx.p201w.C4362f;
import androidx.p201w.C4363g;
import androidx.p201w.C4371o;

/* renamed from: androidx.w.a.m */
/* compiled from: PG */
public final class C4344m {
    /* renamed from: a */
    public static int m12444a(WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }

    /* renamed from: b */
    public static WebMessage m12445b(C4361e eVar) {
        WebMessagePort[] webMessagePortArr;
        String str = eVar.f13972a;
        C4363g[] gVarArr = eVar.f13973b;
        if (gVarArr == null) {
            webMessagePortArr = null;
        } else {
            int length = gVarArr.length;
            WebMessagePort[] webMessagePortArr2 = new WebMessagePort[length];
            for (int i = 0; i < length; i++) {
                webMessagePortArr2[i] = gVarArr[i].mo9284a();
            }
            webMessagePortArr = webMessagePortArr2;
        }
        return new WebMessage(str, webMessagePortArr);
    }

    /* renamed from: c */
    public static C4361e m12446c(WebMessage webMessage) {
        return new C4361e(webMessage.getData(), C4357z.m12502e(webMessage.getPorts()));
    }

    /* renamed from: d */
    public static CharSequence m12447d(WebResourceError webResourceError) {
        return webResourceError.getDescription();
    }

    /* renamed from: e */
    public static void m12448e(WebMessagePort webMessagePort) {
        webMessagePort.close();
    }

    /* renamed from: f */
    public static void m12449f(WebMessagePort webMessagePort, WebMessage webMessage) {
        webMessagePort.postMessage(webMessage);
    }

    /* renamed from: g */
    public static void m12450g(WebView webView, long j, C4371o oVar) {
        webView.postVisualStateCallback(j, new C4343l(oVar));
    }

    /* renamed from: h */
    public static void m12451h(WebView webView, WebMessage webMessage, Uri uri) {
        webView.postWebMessage(webMessage, uri);
    }

    /* renamed from: i */
    public static void m12452i(WebSettings webSettings, boolean z) {
        webSettings.setOffscreenPreRaster(z);
    }

    /* renamed from: j */
    public static void m12453j(WebMessagePort webMessagePort, C4362f fVar) {
        webMessagePort.setWebMessageCallback(new C4341j(fVar));
    }

    /* renamed from: k */
    public static void m12454k(WebMessagePort webMessagePort, C4362f fVar, Handler handler) {
        webMessagePort.setWebMessageCallback(new C4342k(fVar), handler);
    }

    /* renamed from: l */
    public static boolean m12455l(WebSettings webSettings) {
        return webSettings.getOffscreenPreRaster();
    }

    /* renamed from: m */
    public static WebMessagePort[] m12456m(WebView webView) {
        return webView.createWebMessageChannel();
    }
}
