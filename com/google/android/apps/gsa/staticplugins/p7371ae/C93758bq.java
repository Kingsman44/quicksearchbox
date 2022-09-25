package com.google.android.apps.gsa.staticplugins.p7371ae;

import android.content.SharedPreferences;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.p1730f.C21370a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ae.bq */
/* compiled from: PG */
public final /* synthetic */ class C93758bq implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C21370a f261654a;

    /* renamed from: b */
    public final /* synthetic */ SharedPreferences f261655b;

    public /* synthetic */ C93758bq(C21370a aVar, SharedPreferences sharedPreferences) {
        this.f261654a = aVar;
        this.f261655b = sharedPreferences;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C21370a aVar = this.f261654a;
        SharedPreferences sharedPreferences = this.f261655b;
        long b = aVar.mo26870b();
        if (!sharedPreferences.contains("last_prompt_display_time_millis")) {
            return false;
        }
        long j = sharedPreferences.getLong("last_prompt_display_time_millis", 0);
        if (!sharedPreferences.getBoolean("last_prompt_was_accepted", false) || Math.abs(b - j) >= C93762bu.f261665a) {
            return false;
        }
        return true;
    }
}
