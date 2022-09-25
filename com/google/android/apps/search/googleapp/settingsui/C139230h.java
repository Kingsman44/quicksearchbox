package com.google.android.apps.search.googleapp.settingsui;

import androidx.preference.C4023s;
import androidx.preference.Preference;
import com.google.android.apps.search.googleapp.p10536x.C139865b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.h */
/* compiled from: PG */
public final /* synthetic */ class C139230h implements C4023s {

    /* renamed from: a */
    public final /* synthetic */ C139231i f378677a;

    public /* synthetic */ C139230h(C139231i iVar) {
        this.f378677a = iVar;
    }

    /* renamed from: a */
    public final boolean mo8472a(Preference preference, Object obj) {
        C139231i iVar = this.f378677a;
        C139865b bVar = iVar.f378684g;
        bVar.getClass();
        SpinnerSwitchPreference spinnerSwitchPreference = iVar.f378691n;
        spinnerSwitchPreference.getClass();
        if (!bVar.mo111461k()) {
            spinnerSwitchPreference.f378423c = true;
            spinnerSwitchPreference.mo8317e();
        }
        boolean equals = Boolean.TRUE.equals(obj);
        iVar.f378687j.mo50445g(C46438d.m82810b(iVar.f378684g.mo111456f(equals)), new C46436b(Boolean.valueOf(equals)), iVar.f378682e);
        return false;
    }
}
