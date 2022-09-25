package com.google.android.apps.gsa.nowoverlayservice;

import android.content.SharedPreferences;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.t */
/* compiled from: PG */
final class C83548t implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    final /* synthetic */ C83553y f227777a;

    public C83548t(C83553y yVar) {
        this.f227777a = yVar;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("GSAPrefs.google_account".equals(str)) {
            this.f227777a.mo76887l();
        }
    }
}
