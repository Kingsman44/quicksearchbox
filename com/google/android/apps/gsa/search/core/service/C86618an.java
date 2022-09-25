package com.google.android.apps.gsa.search.core.service;

import android.content.SharedPreferences;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.search.core.service.an */
/* compiled from: PG */
public final /* synthetic */ class C86618an implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C86626av f234000a;

    public /* synthetic */ C86618an(C86626av avVar) {
        this.f234000a = avVar;
    }

    public final void run() {
        SharedPreferences sharedPreferences = this.f234000a.f234025c.getSharedPreferences("consecutive_crash_stats", 4);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (!sharedPreferences.getBoolean("gsa_crashed_last_time", false)) {
            edit.putInt("consecutive_crash_count", 0);
        }
        edit.putBoolean("gsa_crashed_last_time", false);
        edit.apply();
    }
}
