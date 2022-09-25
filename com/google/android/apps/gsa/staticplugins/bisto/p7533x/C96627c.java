package com.google.android.apps.gsa.staticplugins.bisto.p7533x;

import android.content.SharedPreferences;
import com.google.common.p4522b.C58322at;
import com.google.common.p4522b.C58459fv;
import com.google.common.p4522b.C58671nr;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.x.c */
/* compiled from: PG */
final class C96627c implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    final C58671nr f270316a = new C58459fv();

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        for (C96626b a : ((C58322at) this.f270316a).mo54986h(str)) {
            a.mo90287a();
        }
    }
}
