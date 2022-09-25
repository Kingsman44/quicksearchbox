package com.google.android.libraries.web.webview.contrib.stuckjs;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import androidx.p201w.C4372p;
import androidx.p201w.C4373q;
import androidx.p201w.C4374r;
import androidx.p201w.p202a.C4325ab;
import androidx.p201w.p202a.C4331ah;
import androidx.p201w.p202a.C4348q;
import com.google.apps.tiktok.tracing.C47810es;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.web.webview.contrib.stuckjs.c */
/* compiled from: PG */
final class C44391c extends C4374r {

    /* renamed from: a */
    private final Executor f115402a;

    /* renamed from: b */
    private final int f115403b;

    /* renamed from: c */
    private int f115404c = 0;

    public C44391c(StuckJsFeature stuckJsFeature, Executor executor) {
        this.f115402a = executor;
        this.f115403b = stuckJsFeature.mo47283d() / 5;
    }

    /* renamed from: a */
    public final void mo9293a() {
        this.f115404c = 0;
    }

    /* renamed from: b */
    public final void mo9294b(WebView webView) {
        WebViewRenderProcess webViewRenderProcess;
        int i = this.f115404c + 1;
        this.f115404c = i;
        if (i >= this.f115403b) {
            C4373q a = C4372p.m12522a(webView);
            if (!C4325ab.m12423b("WEB_VIEW_RENDERER_TERMINATE") || a == null || (webViewRenderProcess = (WebViewRenderProcess) ((C4331ah) a).f13956a.get()) == null || !C4348q.m12492g(webViewRenderProcess)) {
                this.f115402a.execute(C47810es.m84977q(C44390b.f115401a));
            }
        }
    }
}
