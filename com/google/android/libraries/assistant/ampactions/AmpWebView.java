package com.google.android.libraries.assistant.ampactions;

import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.apps.gsa.staticplugins.p7932f.p7934b.C100685m;
import com.google.assistant.p3890d.p3891a.p3892a.C50856a;
import com.google.assistant.p3890d.p3891a.p3892a.C50857b;
import com.google.assistant.p3890d.p3891a.p3892a.C50858c;
import com.google.assistant.p3890d.p3891a.p3892a.C50859d;
import com.google.assistant.p3897e.p3921j.acy;
import java.security.SecureRandom;
import java.util.List;
import org.json.JSONObject;

/* compiled from: PG */
public final class AmpWebView {

    /* renamed from: g */
    private static final SecureRandom f36227g = new SecureRandom();

    /* renamed from: a */
    public final WebView f36228a;

    /* renamed from: b */
    public final Handler f36229b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    final String f36230c;

    /* renamed from: d */
    final AmpActionsHost f36231d;

    /* renamed from: e */
    public JSONObject f36232e;

    /* renamed from: f */
    public C100685m f36233f;

    /* compiled from: PG */
    class AmpActionsHost {
        public AmpActionsHost() {
        }

        @JavascriptInterface
        public void startHandshake() {
            AmpWebView.this.f36229b.post(new C11042o(this));
        }

        @JavascriptInterface
        public void updateActionState(String str, String str2) {
            if (AmpWebView.this.f36230c.equals(str)) {
                AmpWebView.this.f36229b.post(new C11041n(this, str2));
            }
        }
    }

    public AmpWebView(WebView webView) {
        this.f36228a = webView;
        byte[] bArr = new byte[16];
        f36227g.nextBytes(bArr);
        this.f36230c = Base64.encodeToString(bArr, 2);
        this.f36231d = new AmpActionsHost();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo19490a(acy acy, List list) {
        Log.d("AmpWebView", "Setting up the WebView");
        this.f36228a.setFocusable(true);
        this.f36228a.setFocusableInTouchMode(true);
        this.f36228a.addJavascriptInterface(this.f36231d, "ampActionsAndroidHost");
        WebSettings settings = this.f36228a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccess(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setSaveFormData(false);
        settings.setSupportMultipleWindows(false);
        settings.setSavePassword(false);
        WebView webView = this.f36228a;
        Log.d("AmpWebView", "Setting up the WebView Client");
        webView.setWebViewClient(new C11040m(list));
        C50856a aVar = (C50856a) C50857b.f132425c.createBuilder();
        aVar.copyOnWrite();
        ((C50857b) aVar.instance).f132427a = true;
        aVar.copyOnWrite();
        ((C50857b) aVar.instance).f132428b = 1;
        C50857b bVar = (C50857b) aVar.build();
        C50858c cVar = (C50858c) C50859d.f132429b.createBuilder();
        cVar.copyOnWrite();
        bVar.getClass();
        ((C50859d) cVar.instance).f132431a = bVar;
        this.f36228a.loadUrl(acy.f134863b, C11045r.m26134a(cVar));
    }
}
