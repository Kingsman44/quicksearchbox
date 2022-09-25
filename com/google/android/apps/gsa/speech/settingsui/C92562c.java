package com.google.android.apps.gsa.speech.settingsui;

import android.content.DialogInterface;
import android.preference.Preference;
import android.preference.SwitchPreference;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.c */
/* compiled from: PG */
final class C92562c implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SwitchPreference f258306a;

    /* renamed from: b */
    final /* synthetic */ Preference f258307b;

    /* renamed from: c */
    final /* synthetic */ C92564e f258308c;

    public C92562c(C92564e eVar, SwitchPreference switchPreference, Preference preference) {
        this.f258308c = eVar;
        this.f258306a = switchPreference;
        this.f258307b = preference;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f258308c.mo87348a(this.f258306a, this.f258307b.getKey(), false);
    }
}
