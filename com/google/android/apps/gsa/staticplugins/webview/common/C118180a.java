package com.google.android.apps.gsa.staticplugins.webview.common;

import android.graphics.Bitmap;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.common.a */
/* compiled from: PG */
public class C118180a extends WebChromeClient {

    /* renamed from: c */
    public WebChromeClient f328090c = new WebChromeClient();

    public final Bitmap getDefaultVideoPoster() {
        return this.f328090c.getDefaultVideoPoster();
    }

    public final View getVideoLoadingProgressView() {
        return this.f328090c.getVideoLoadingProgressView();
    }

    public final void getVisitedHistory(ValueCallback valueCallback) {
        this.f328090c.getVisitedHistory(valueCallback);
    }

    public void onCloseWindow(WebView webView) {
        this.f328090c.onCloseWindow(webView);
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return this.f328090c.onConsoleMessage(consoleMessage);
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        return this.f328090c.onCreateWindow(webView, z, z2, message);
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        this.f328090c.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
    }

    public void onGeolocationPermissionsHidePrompt() {
        this.f328090c.onGeolocationPermissionsHidePrompt();
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        this.f328090c.onGeolocationPermissionsShowPrompt(str, callback);
    }

    public final void onHideCustomView() {
        this.f328090c.onHideCustomView();
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return this.f328090c.onJsAlert(webView, str, str2, jsResult);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return this.f328090c.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return this.f328090c.onJsConfirm(webView, str, str2, jsResult);
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return this.f328090c.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    public final boolean onJsTimeout() {
        return this.f328090c.onJsTimeout();
    }

    public void onPermissionRequest(PermissionRequest permissionRequest) {
        this.f328090c.onPermissionRequest(permissionRequest);
    }

    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        this.f328090c.onPermissionRequestCanceled(permissionRequest);
    }

    public void onProgressChanged(WebView webView, int i) {
        this.f328090c.onProgressChanged(webView, i);
    }

    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        this.f328090c.onReceivedIcon(webView, bitmap);
    }

    public final void onReceivedTitle(WebView webView, String str) {
        this.f328090c.onReceivedTitle(webView, str);
    }

    public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        this.f328090c.onReceivedTouchIconUrl(webView, str, z);
    }

    public final void onRequestFocus(WebView webView) {
        this.f328090c.onRequestFocus(webView);
    }

    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        this.f328090c.onShowCustomView(view, i, customViewCallback);
    }

    public boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return this.f328090c.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }

    public final void onConsoleMessage(String str, int i, String str2) {
        this.f328090c.onConsoleMessage(str, i, str2);
    }

    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.f328090c.onShowCustomView(view, customViewCallback);
    }
}
