package com.google.apps.tiktok.tracing.contrib.p3685a.p3695e;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47831fm;

/* renamed from: com.google.apps.tiktok.tracing.contrib.a.e.h */
/* compiled from: PG */
public final class C47611h extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ WebViewClient f123535a;

    /* renamed from: b */
    final /* synthetic */ C47612i f123536b;

    public C47611h(C47612i iVar, WebViewClient webViewClient) {
        this.f123536b = iVar;
        this.f123535a = webViewClient;
    }

    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        C47538ax c = this.f123536b.f123537a.mo51613c("doUpdateVisitedHistory");
        try {
            this.f123535a.doUpdateVisitedHistory(webView, str, z);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47610g.m84698a(th, th);
        }
        throw th;
    }

    public final void onPageCommitVisible(WebView webView, String str) {
        C47538ax c = this.f123536b.f123537a.mo51613c("onPageCommitVisible");
        try {
            this.f123535a.onPageCommitVisible(webView, str);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47610g.m84698a(th, th);
        }
        throw th;
    }

    public final void onPageFinished(WebView webView, String str) {
        C47538ax c = this.f123536b.f123537a.mo51613c("onPageFinished");
        try {
            this.f123535a.onPageFinished(webView, str);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47610g.m84698a(th, th);
        }
        throw th;
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C47538ax c = this.f123536b.f123537a.mo51613c("onPageStarted");
        try {
            this.f123535a.onPageStarted(webView, str, bitmap);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47610g.m84698a(th, th);
        }
        throw th;
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        C47538ax c = this.f123536b.f123537a.mo51613c("legacy onReceivedError");
        try {
            this.f123535a.onReceivedError(webView, i, str, str2);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47610g.m84698a(th, th);
        }
        throw th;
    }

    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        C47538ax c = this.f123536b.f123537a.mo51613c("onReceivedHttpError");
        try {
            this.f123535a.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47610g.m84698a(th, th);
        }
        throw th;
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        C47538ax c = this.f123536b.f123537a.mo51613c("onReceivedSslError");
        try {
            this.f123535a.onReceivedSslError(webView, sslErrorHandler, sslError);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47610g.m84698a(th, th);
        }
        throw th;
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        C47538ax c = this.f123536b.f123537a.mo51613c("onRenderProcessGone");
        try {
            boolean onRenderProcessGone = this.f123535a.onRenderProcessGone(webView, renderProcessGoneDetail);
            if (c != null) {
                c.close();
            }
            return onRenderProcessGone;
        } catch (Throwable th) {
            C47610g.m84698a(th, th);
        }
        throw th;
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        C47538ax c = this.f123536b.f123537a.mo51613c("shouldInterceptRequest");
        try {
            WebResourceResponse shouldInterceptRequest = this.f123535a.shouldInterceptRequest(webView, webResourceRequest);
            if (c != null) {
                c.close();
            }
            return shouldInterceptRequest;
        } catch (Throwable th) {
            C47610g.m84698a(th, th);
        }
        throw th;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (C47831fm.m85027v()) {
            return this.f123535a.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        C47538ax c = this.f123536b.f123537a.mo51613c("shouldOverrideUrlLoading");
        try {
            boolean shouldOverrideUrlLoading = this.f123535a.shouldOverrideUrlLoading(webView, webResourceRequest);
            if (c != null) {
                c.close();
            }
            return shouldOverrideUrlLoading;
        } catch (Throwable th) {
            C47610g.m84698a(th, th);
        }
        throw th;
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        C47538ax c = this.f123536b.f123537a.mo51613c("onReceivedError");
        try {
            this.f123535a.onReceivedError(webView, webResourceRequest, webResourceError);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47610g.m84698a(th, th);
        }
        throw th;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (C47831fm.m85027v()) {
            return this.f123535a.shouldOverrideUrlLoading(webView, str);
        }
        C47538ax c = this.f123536b.f123537a.mo51613c("shouldOverrideUrlLoading");
        try {
            boolean shouldOverrideUrlLoading = this.f123535a.shouldOverrideUrlLoading(webView, str);
            if (c != null) {
                c.close();
            }
            return shouldOverrideUrlLoading;
        } catch (Throwable th) {
            C47610g.m84698a(th, th);
        }
        throw th;
    }
}
