package com.google.android.libraries.assistant.ampactions;

import android.util.Log;
import com.google.android.libraries.assistant.ampactions.AmpWebView;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.libraries.assistant.ampactions.n */
/* compiled from: PG */
public final /* synthetic */ class C11041n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AmpWebView.AmpActionsHost f36272a;

    /* renamed from: b */
    public final /* synthetic */ String f36273b;

    public /* synthetic */ C11041n(AmpWebView.AmpActionsHost ampActionsHost, String str) {
        this.f36272a = ampActionsHost;
        this.f36273b = str;
    }

    public final void run() {
        AmpWebView.AmpActionsHost ampActionsHost = this.f36272a;
        String str = this.f36273b;
        try {
            AmpWebView.this.f36232e = new JSONObject(str);
        } catch (JSONException unused) {
            Log.e("AmpWebView", "Bad action state json: ".concat(String.valueOf(str)));
        }
    }
}
