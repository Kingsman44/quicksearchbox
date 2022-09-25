package com.google.android.apps.search.assistant.libraries.p8942a.p8944b.p8945a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import com.google.android.libraries.search.logging.p3041d.C39141kp;

/* renamed from: com.google.android.apps.search.assistant.libraries.a.b.a.a */
/* compiled from: PG */
public final class C119205a {

    /* renamed from: a */
    public final C39141kp f332448a;

    /* renamed from: b */
    public final String f332449b;

    /* renamed from: c */
    private final Context f332450c;

    public C119205a(Context context, C39141kp kpVar, String str) {
        this.f332450c = context;
        this.f332448a = kpVar;
        this.f332449b = str;
    }

    /* renamed from: a */
    public final int mo104243a() {
        return Settings.Secure.getInt(this.f332450c.getContentResolver(), "content_capture_enabled", -1);
    }

    /* renamed from: b */
    public final String mo104244b() {
        try {
            return this.f332450c.getPackageManager().getPackageInfo("com.google.android.as", 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "UNKNOWN";
        }
    }
}
