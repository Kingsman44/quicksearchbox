package com.google.android.gms.cast.framework.p10772a.p10773a;

import android.content.SharedPreferences;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.cast.internal.C143566ae;

/* renamed from: com.google.android.gms.cast.framework.a.a.f */
/* compiled from: PG */
public final class C143387f {

    /* renamed from: a */
    public static final C143566ae f388862a = new C143566ae("ApplicationAnalyticsSession");

    /* renamed from: b */
    public static long f388863b = System.currentTimeMillis();

    /* renamed from: c */
    public String f388864c;

    /* renamed from: d */
    public String f388865d;

    /* renamed from: e */
    public long f388866e = f388863b;

    /* renamed from: f */
    public int f388867f = 1;

    /* renamed from: g */
    public String f388868g;

    /* renamed from: h */
    public int f388869h;

    /* renamed from: i */
    public String f388870i;

    /* renamed from: j */
    public boolean f388871j;

    /* renamed from: k */
    public int f388872k;

    private C143387f(boolean z) {
        this.f388871j = z;
    }

    /* renamed from: a */
    public static C143387f m232659a(boolean z) {
        C143387f fVar = new C143387f(z);
        f388863b++;
        return fVar;
    }

    /* renamed from: b */
    public static C143387f m232660b(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return null;
        }
        C143387f fVar = new C143387f(sharedPreferences.getBoolean("is_app_backgrounded", false));
        if (!sharedPreferences.contains("application_id")) {
            return null;
        }
        fVar.f388864c = sharedPreferences.getString("application_id", BuildConfig.FLAVOR);
        if (!sharedPreferences.contains("receiver_metrics_id")) {
            return null;
        }
        fVar.f388865d = sharedPreferences.getString("receiver_metrics_id", BuildConfig.FLAVOR);
        if (!sharedPreferences.contains("analytics_session_id")) {
            return null;
        }
        fVar.f388866e = sharedPreferences.getLong("analytics_session_id", 0);
        if (!sharedPreferences.contains("event_sequence_number")) {
            return null;
        }
        fVar.f388867f = sharedPreferences.getInt("event_sequence_number", 0);
        if (!sharedPreferences.contains("receiver_session_id")) {
            return null;
        }
        fVar.f388868g = sharedPreferences.getString("receiver_session_id", BuildConfig.FLAVOR);
        fVar.f388869h = sharedPreferences.getInt("device_capabilities", 0);
        fVar.f388870i = sharedPreferences.getString("device_model_name", BuildConfig.FLAVOR);
        fVar.f388872k = sharedPreferences.getInt("analytics_session_start_type", 0);
        return fVar;
    }
}
