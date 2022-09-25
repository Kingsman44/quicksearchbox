package com.google.android.libraries.web.webview.p3472b.p3473a;

import android.webkit.ValueCallback;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.libraries.web.webview.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C44343a implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ ValueCallback f115322a;

    public /* synthetic */ C44343a(ValueCallback valueCallback) {
        this.f115322a = valueCallback;
    }

    public final void onReceiveValue(Object obj) {
        ValueCallback valueCallback = this.f115322a;
        String str = (String) obj;
        try {
            valueCallback.onReceiveValue(new JSONObject("{\"result\":" + str + "}"));
        } catch (JSONException e) {
            throw new IllegalStateException("Malformed response from WebView", e);
        }
    }
}
