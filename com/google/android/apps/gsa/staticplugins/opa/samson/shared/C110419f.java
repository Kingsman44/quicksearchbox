package com.google.android.apps.gsa.staticplugins.opa.samson.shared;

import android.content.SharedPreferences;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.shared.f */
/* compiled from: PG */
public final class C110419f {

    /* renamed from: a */
    public final SharedPreferences f307772a;

    public C110419f(SharedPreferences sharedPreferences) {
        this.f307772a = sharedPreferences;
    }

    /* renamed from: a */
    public final void mo98654a(boolean z, String str) {
        this.f307772a.edit().putBoolean("key_personal_response_has_shown".concat(String.valueOf(str)), z).apply();
    }
}
