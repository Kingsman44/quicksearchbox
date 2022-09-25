package com.google.android.apps.gsa.speech.settingsui;

import android.content.DialogInterface;
import android.preference.Preference;
import android.preference.SwitchPreference;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.d */
/* compiled from: PG */
final class C92563d implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SwitchPreference f258309a;

    /* renamed from: b */
    final /* synthetic */ Preference f258310b;

    /* renamed from: c */
    final /* synthetic */ C92564e f258311c;

    public C92563d(C92564e eVar, SwitchPreference switchPreference, Preference preference) {
        this.f258311c = eVar;
        this.f258309a = switchPreference;
        this.f258310b = preference;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f258311c.mo87348a(this.f258309a, this.f258310b.getKey(), true);
    }
}
