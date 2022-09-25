package com.google.firebase.iid;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.iid.s */
/* compiled from: PG */
final class C61227s {

    /* renamed from: a */
    public static final long f165616a = TimeUnit.DAYS.toMillis(7);

    /* renamed from: b */
    final String f165617b;

    /* renamed from: c */
    final String f165618c;

    /* renamed from: d */
    final long f165619d;

    private C61227s(String str, String str2, long j) {
        this.f165617b = str;
        this.f165618c = str2;
        this.f165619d = j;
    }

    /* renamed from: a */
    static C61227s m93622a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new C61227s(str, (String) null, 0);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C61227s(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            Log.w("FirebaseInstanceId", "Failed to parse token: ".concat(e.toString()));
            return null;
        }
    }

    /* renamed from: b */
    static String m93623b(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.w("FirebaseInstanceId", "Failed to encode token: ".concat(e.toString()));
            return null;
        }
    }
}
