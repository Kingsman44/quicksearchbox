package androidx.p201w.p202a;

import android.os.Looper;
import android.webkit.TracingConfig;
import android.webkit.TracingController;
import android.webkit.WebView;
import androidx.p201w.C4360d;
import java.io.OutputStream;
import java.util.concurrent.Executor;

/* renamed from: androidx.w.a.p */
/* compiled from: PG */
public final class C4347p {
    /* renamed from: a */
    public static Looper m12479a(WebView webView) {
        return webView.getWebViewLooper();
    }

    /* renamed from: b */
    public static TracingController m12480b() {
        return TracingController.getInstance();
    }

    /* renamed from: c */
    public static ClassLoader m12481c() {
        return WebView.getWebViewClassLoader();
    }

    /* renamed from: d */
    public static void m12482d(String str) {
        WebView.setDataDirectorySuffix(str);
    }

    /* renamed from: e */
    public static void m12483e(TracingController tracingController, C4360d dVar) {
        new TracingConfig.Builder();
        throw null;
    }

    /* renamed from: f */
    public static boolean m12484f(TracingController tracingController) {
        return tracingController.isTracing();
    }

    /* renamed from: g */
    public static boolean m12485g(TracingController tracingController, OutputStream outputStream, Executor executor) {
        return tracingController.stop(outputStream, executor);
    }
}
