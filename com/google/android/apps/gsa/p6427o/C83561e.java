package com.google.android.apps.gsa.p6427o;

import android.content.SharedPreferences;

/* renamed from: com.google.android.apps.gsa.o.e */
/* compiled from: PG */
public final class C83561e {

    /* renamed from: a */
    public final SharedPreferences f227870a;

    public C83561e(SharedPreferences sharedPreferences) {
        this.f227870a = sharedPreferences;
    }

    /* renamed from: a */
    public final boolean mo76896a() {
        if (!this.f227870a.getBoolean("use_custom_tabs", true) || !this.f227870a.getBoolean("use_google_app_browser", true)) {
            return false;
        }
        return true;
    }
}
