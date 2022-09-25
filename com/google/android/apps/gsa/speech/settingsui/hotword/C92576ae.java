package com.google.android.apps.gsa.speech.settingsui.hotword;

import android.content.DialogInterface;
import android.preference.SwitchPreference;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.hotword.ae */
/* compiled from: PG */
public final /* synthetic */ class C92576ae implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SwitchPreference f258347a;

    public /* synthetic */ C92576ae(SwitchPreference switchPreference) {
        this.f258347a = switchPreference;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SwitchPreference switchPreference = this.f258347a;
        int i2 = C92578ag.f258349a;
        switchPreference.setChecked(false);
    }
}
