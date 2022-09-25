package com.google.android.libraries.web.weblayer.p3446a;

import android.webkit.ValueCallback;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.libraries.web.weblayer.a.a */
/* compiled from: PG */
public final /* synthetic */ class C44114a implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ ValueCallback f114832a;

    public /* synthetic */ C44114a(ValueCallback valueCallback) {
        this.f114832a = valueCallback;
    }

    public final void onReceiveValue(Object obj) {
        ValueCallback valueCallback = this.f114832a;
        String str = (String) obj;
        try {
            valueCallback.onReceiveValue(new JSONObject("{\"result\":" + str + "}"));
        } catch (JSONException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
