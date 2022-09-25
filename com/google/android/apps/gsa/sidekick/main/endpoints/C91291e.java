package com.google.android.apps.gsa.sidekick.main.endpoints;

import android.net.Uri;
import android.net.http.SslError;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.evernote.android.state.BuildConfig;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.sidekick.main.endpoints.e */
/* compiled from: PG */
final class C91291e extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ GoogleServiceWebviewWrapper f254788a;

    public C91291e(GoogleServiceWebviewWrapper googleServiceWebviewWrapper) {
        this.f254788a = googleServiceWebviewWrapper;
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        C59104x d = GoogleServiceWebviewWrapper.f254773a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "GoogleServiceWebviewWra");
        ((C59052c) ((C59052c) d).mo56372aa(11531)).mo56395y("Received error while loading page(%d):%s", i, str);
        GoogleServiceWebviewWrapper googleServiceWebviewWrapper = this.f254788a;
        googleServiceWebviewWrapper.mo85562a(googleServiceWebviewWrapper.f254778f);
        this.f254788a.finish();
    }

    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        C59104x d = GoogleServiceWebviewWrapper.f254773a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "GoogleServiceWebviewWra");
        ((C59052c) ((C59052c) d).mo56372aa(11532)).mo56386p("Auth error while loading page");
        Uri uri = this.f254788a.f254778f;
        GoogleServiceWebviewWrapper googleServiceWebviewWrapper = this.f254788a;
        googleServiceWebviewWrapper.mo85562a(googleServiceWebviewWrapper.f254778f);
        this.f254788a.finish();
    }

    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        C59104x d = GoogleServiceWebviewWrapper.f254773a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "GoogleServiceWebviewWra");
        ((C59052c) ((C59052c) d).mo56372aa(11534)).mo56386p("Login Request while loading page");
        GoogleServiceWebviewWrapper googleServiceWebviewWrapper = this.f254788a;
        googleServiceWebviewWrapper.mo85562a(googleServiceWebviewWrapper.f254778f);
        this.f254788a.finish();
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        C59104x d = GoogleServiceWebviewWrapper.f254773a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "GoogleServiceWebviewWra");
        ((C59052c) ((C59052c) d).mo56372aa(11535)).mo56386p("Ssl Error while loading page");
        sslErrorHandler.cancel();
        GoogleServiceWebviewWrapper googleServiceWebviewWrapper = this.f254788a;
        googleServiceWebviewWrapper.mo85562a(googleServiceWebviewWrapper.f254778f);
        this.f254788a.finish();
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C59071e eVar = GoogleServiceWebviewWrapper.f254773a;
        C58976aa aaVar = C58975e.f156826a;
        Uri parse = Uri.parse(str);
        if (parse == null) {
            return false;
        }
        if (GoogleServiceWebviewWrapper.f254774b.contains(parse.getScheme())) {
            this.f254788a.mo85562a(parse);
            return true;
        }
        String host = parse.getHost();
        if (host == null) {
            return false;
        }
        String path = parse.getPath();
        if (path == null) {
            path = BuildConfig.FLAVOR;
        }
        String concat = host.concat(path);
        if (concat.startsWith("accounts.google.")) {
            return false;
        }
        String[] strArr = this.f254788a.f254777e;
        if (strArr != null) {
            for (String str2 : strArr) {
                if (str2.equals("*") || concat.startsWith(str2)) {
                    return false;
                }
            }
        }
        this.f254788a.mo85562a(parse);
        return true;
    }
}
