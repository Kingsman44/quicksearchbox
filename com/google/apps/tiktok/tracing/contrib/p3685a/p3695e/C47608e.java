package com.google.apps.tiktok.tracing.contrib.p3685a.p3695e;

import android.graphics.Bitmap;
import android.os.Message;
import android.view.View;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47831fm;

/* renamed from: com.google.apps.tiktok.tracing.contrib.a.e.e */
/* compiled from: PG */
public final class C47608e extends WebChromeClient {

    /* renamed from: a */
    final /* synthetic */ WebChromeClient f123532a;

    /* renamed from: b */
    final /* synthetic */ C47609f f123533b;

    public C47608e(C47609f fVar, WebChromeClient webChromeClient) {
        this.f123533b = fVar;
        this.f123532a = webChromeClient;
    }

    public final Bitmap getDefaultVideoPoster() {
        return this.f123532a.getDefaultVideoPoster();
    }

    public final View getVideoLoadingProgressView() {
        return this.f123532a.getVideoLoadingProgressView();
    }

    public final void getVisitedHistory(ValueCallback valueCallback) {
        this.f123532a.getVisitedHistory(valueCallback);
    }

    public final void onCloseWindow(WebView webView) {
        if (C47831fm.m85027v()) {
            this.f123532a.onCloseWindow(webView);
            return;
        }
        C47538ax c = this.f123533b.f123534a.mo51613c("onCloseWindow");
        try {
            this.f123532a.onCloseWindow(webView);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47607d.m84697a(th, th);
        }
        throw th;
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        if (C47831fm.m85027v()) {
            return this.f123532a.onCreateWindow(webView, z, z2, message);
        }
        C47538ax c = this.f123533b.f123534a.mo51613c("onCreateWindow");
        try {
            boolean onCreateWindow = this.f123532a.onCreateWindow(webView, z, z2, message);
            if (c != null) {
                c.close();
            }
            return onCreateWindow;
        } catch (Throwable th) {
            C47607d.m84697a(th, th);
        }
        throw th;
    }

    public final void onGeolocationPermissionsHidePrompt() {
        if (C47831fm.m85027v()) {
            this.f123532a.onGeolocationPermissionsHidePrompt();
            return;
        }
        C47538ax c = this.f123533b.f123534a.mo51613c("onGeolocationPermissionsHidePrompt");
        try {
            this.f123532a.onGeolocationPermissionsHidePrompt();
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47607d.m84697a(th, th);
        }
        throw th;
    }

    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (C47831fm.m85027v()) {
            this.f123532a.onGeolocationPermissionsShowPrompt(str, callback);
            return;
        }
        C47538ax c = this.f123533b.f123534a.mo51613c("onGeolocationPermissionsShowPrompt");
        try {
            this.f123532a.onGeolocationPermissionsShowPrompt(str, callback);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47607d.m84697a(th, th);
        }
        throw th;
    }

    public final void onHideCustomView() {
        if (C47831fm.m85027v()) {
            this.f123532a.onHideCustomView();
            return;
        }
        C47538ax c = this.f123533b.f123534a.mo51613c("onHideCustomView");
        try {
            this.f123532a.onHideCustomView();
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47607d.m84697a(th, th);
        }
        throw th;
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (C47831fm.m85027v()) {
            return this.f123532a.onJsAlert(webView, str, str2, jsResult);
        }
        C47538ax c = this.f123533b.f123534a.mo51613c("onJsAlert");
        try {
            boolean onJsAlert = this.f123532a.onJsAlert(webView, str, str2, jsResult);
            if (c != null) {
                c.close();
            }
            return onJsAlert;
        } catch (Throwable th) {
            C47607d.m84697a(th, th);
        }
        throw th;
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        if (C47831fm.m85027v()) {
            return this.f123532a.onJsBeforeUnload(webView, str, str2, jsResult);
        }
        C47538ax c = this.f123533b.f123534a.mo51613c("onJsBeforeUnload");
        try {
            boolean onJsBeforeUnload = this.f123532a.onJsBeforeUnload(webView, str, str2, jsResult);
            if (c != null) {
                c.close();
            }
            return onJsBeforeUnload;
        } catch (Throwable th) {
            C47607d.m84697a(th, th);
        }
        throw th;
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (C47831fm.m85027v()) {
            return this.f123532a.onJsConfirm(webView, str, str2, jsResult);
        }
        C47538ax c = this.f123533b.f123534a.mo51613c("onJsConfirm");
        try {
            boolean onJsConfirm = this.f123532a.onJsConfirm(webView, str, str2, jsResult);
            if (c != null) {
                c.close();
            }
            return onJsConfirm;
        } catch (Throwable th) {
            C47607d.m84697a(th, th);
        }
        throw th;
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (C47831fm.m85027v()) {
            return this.f123532a.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
        C47538ax c = this.f123533b.f123534a.mo51613c("onJsPrompt");
        try {
            boolean onJsPrompt = this.f123532a.onJsPrompt(webView, str, str2, str3, jsPromptResult);
            if (c != null) {
                c.close();
            }
            return onJsPrompt;
        } catch (Throwable th) {
            C47607d.m84697a(th, th);
        }
        throw th;
    }

    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        if (C47831fm.m85027v()) {
            this.f123532a.onPermissionRequest(permissionRequest);
            return;
        }
        C47538ax c = this.f123533b.f123534a.mo51613c("onPermissionRequest");
        try {
            this.f123532a.onPermissionRequest(permissionRequest);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47607d.m84697a(th, th);
        }
        throw th;
    }

    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        if (C47831fm.m85027v()) {
            this.f123532a.onPermissionRequestCanceled(permissionRequest);
            return;
        }
        C47538ax c = this.f123533b.f123534a.mo51613c("onPermissionRequestCanceled");
        try {
            this.f123532a.onPermissionRequestCanceled(permissionRequest);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47607d.m84697a(th, th);
        }
        throw th;
    }

    public final void onProgressChanged(WebView webView, int i) {
        if (C47831fm.m85027v()) {
            this.f123532a.onProgressChanged(webView, i);
            return;
        }
        C47538ax c = this.f123533b.f123534a.mo51613c("onProgressChanged");
        try {
            this.f123532a.onProgressChanged(webView, i);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47607d.m84697a(th, th);
        }
        throw th;
    }

    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        if (C47831fm.m85027v()) {
            this.f123532a.onReceivedIcon(webView, bitmap);
            return;
        }
        C47538ax c = this.f123533b.f123534a.mo51613c("onReceivedIcon");
        try {
            this.f123532a.onReceivedIcon(webView, bitmap);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47607d.m84697a(th, th);
        }
        throw th;
    }

    public final void onReceivedTitle(WebView webView, String str) {
        if (C47831fm.m85027v()) {
            this.f123532a.onReceivedTitle(webView, str);
            return;
        }
        C47538ax c = this.f123533b.f123534a.mo51613c("onReceivedTitle");
        try {
            this.f123532a.onReceivedTitle(webView, str);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47607d.m84697a(th, th);
        }
        throw th;
    }

    public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        if (C47831fm.m85027v()) {
            this.f123532a.onReceivedTouchIconUrl(webView, str, z);
            return;
        }
        C47538ax c = this.f123533b.f123534a.mo51613c("onReceivedTouchIconUrl");
        try {
            this.f123532a.onReceivedTouchIconUrl(webView, str, z);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47607d.m84697a(th, th);
        }
        throw th;
    }

    public final void onRequestFocus(WebView webView) {
        if (C47831fm.m85027v()) {
            this.f123532a.onRequestFocus(webView);
            return;
        }
        C47538ax c = this.f123533b.f123534a.mo51613c("onRequestFocus");
        try {
            this.f123532a.onRequestFocus(webView);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47607d.m84697a(th, th);
        }
        throw th;
    }

    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        if (C47831fm.m85027v()) {
            this.f123532a.onShowCustomView(view, customViewCallback);
            return;
        }
        C47538ax c = this.f123533b.f123534a.mo51613c("onShowCustomView");
        try {
            this.f123532a.onShowCustomView(view, customViewCallback);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47607d.m84697a(th, th);
        }
        throw th;
    }

    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        if (C47831fm.m85027v()) {
            return this.f123532a.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
        C47538ax c = this.f123533b.f123534a.mo51613c("onShowFileChooser");
        try {
            boolean onShowFileChooser = this.f123532a.onShowFileChooser(webView, valueCallback, fileChooserParams);
            if (c != null) {
                c.close();
            }
            return onShowFileChooser;
        } catch (Throwable th) {
            C47607d.m84697a(th, th);
        }
        throw th;
    }
}
