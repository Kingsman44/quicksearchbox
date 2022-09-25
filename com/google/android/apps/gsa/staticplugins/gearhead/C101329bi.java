package com.google.android.apps.gsa.staticplugins.gearhead;

import android.content.SharedPreferences;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.bi */
/* compiled from: PG */
final class C101329bi implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    final /* synthetic */ C101330bj f282809a;

    public C101329bi(C101330bj bjVar) {
        this.f282809a = bjVar;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        C101330bj bjVar = this.f282809a;
        if (bjVar.f282813c && bjVar.mo92249b()) {
            this.f282809a.mo92248a();
        }
    }
}
