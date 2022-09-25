package com.google.android.apps.gsa.staticplugins.opa.webview;

import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.google.android.apps.gsa.search.core.webview.C87273s;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.logging.Level;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.p */
/* compiled from: PG */
public final class C114237p extends WebChromeClient {

    /* renamed from: a */
    private static final C59071e f316787a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.webview.p");

    /* renamed from: b */
    private final WebView f316788b;

    /* renamed from: c */
    private final C87273s f316789c;

    public C114237p(C87273s sVar, WebView webView) {
        webView.getClass();
        this.f316788b = webView;
        this.f316789c = sVar;
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        Level level;
        int i = C114236o.f316786a[consoleMessage.messageLevel().ordinal()];
        if (i != 1) {
            level = i != 2 ? Level.FINE : Level.WARNING;
        } else {
            level = Level.SEVERE;
        }
        if (level == Level.SEVERE) {
            WebView webView = this.f316788b;
            ((C59052c) f316787a.mo56223a(level).mo56372aa(28779)).mo56361N("WebView=%s, Url=%s, Source=%s, Line=%d, Message=%s", webView, webView.getUrl(), consoleMessage.sourceId(), Integer.valueOf(consoleMessage.lineNumber()), consoleMessage.message());
        }
        return true;
    }

    public final void onGeolocationPermissionsHidePrompt() {
        this.f316789c.f235728d = null;
    }

    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        this.f316789c.mo80920b(str, callback);
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return false;
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return false;
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return false;
    }
}
