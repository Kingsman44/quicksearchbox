package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import org.json.JSONObject;

/* renamed from: com.google.ads.interactivemedia.v3.internal.v */
/* compiled from: PG */
public final class C7352v {

    /* renamed from: a */
    private static final C7352v f23996a = new C7352v();

    private C7352v() {
    }

    /* renamed from: a */
    public static C7352v m22064a() {
        return f23996a;
    }

    /* renamed from: b */
    public final void mo16599b(WebView webView, JSONObject jSONObject) {
        mo16604g(webView, "init", jSONObject);
    }

    /* renamed from: c */
    public final void mo16600c(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo16604g(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* renamed from: d */
    public final void mo16601d(WebView webView) {
        mo16604g(webView, "finishSession", new Object[0]);
    }

    /* renamed from: e */
    public final void mo16602e(WebView webView, String str) {
        mo16604g(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: f */
    public final void mo16603f(WebView webView, float f) {
        mo16604g(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo16604g(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            if (r6 > 0) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        sb.append("\"\"");
                    } else if (obj instanceof String) {
                        String obj2 = obj.toString();
                        if (obj2.startsWith("{")) {
                            sb.append(obj2);
                        } else {
                            sb.append('\"');
                            sb.append(obj2);
                            sb.append('\"');
                        }
                    } else {
                        sb.append(obj);
                    }
                    sb.append(",");
                }
                sb.setLength(sb.length() - 1);
            }
            sb.append(")}");
            String sb2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler == null || Looper.myLooper() == handler.getLooper()) {
                webView.loadUrl(sb2);
            } else {
                handler.post(new C7325u(webView, sb2));
            }
        } else {
            String concat = str.length() != 0 ? "The WebView is null for ".concat(str) : new String("The WebView is null for ");
            if (C6812b.f21577a.booleanValue() && !TextUtils.isEmpty(concat)) {
                Log.i("OMIDLIB", concat);
            }
        }
    }

    /* renamed from: h */
    public final void mo16605h(WebView webView, String str) {
        if (webView != null && !TextUtils.isEmpty((CharSequence) null)) {
            webView.loadUrl("javascript: null");
        }
    }
}
