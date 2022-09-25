package com.google.p3723ar.imp.core.web;

import android.util.Log;
import android.webkit.ValueCallback;

/* renamed from: com.google.ar.imp.core.web.f */
/* compiled from: PG */
public final /* synthetic */ class C47976f implements ValueCallback {

    /* renamed from: a */
    public static final /* synthetic */ C47976f f124174a = new C47976f();

    private /* synthetic */ C47976f() {
    }

    public final void onReceiveValue(Object obj) {
        if (!((String) obj).equals("true")) {
            Log.e("ImpWeb Error", "Failed to evaluateJavascript in postMessage call to JS.");
        }
    }
}
