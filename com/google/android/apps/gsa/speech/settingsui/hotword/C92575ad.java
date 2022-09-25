package com.google.android.apps.gsa.speech.settingsui.hotword;

import android.content.DialogInterface;
import android.preference.SwitchPreference;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.hotword.ad */
/* compiled from: PG */
public final /* synthetic */ class C92575ad implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SwitchPreference f258346a;

    public /* synthetic */ C92575ad(SwitchPreference switchPreference) {
        this.f258346a = switchPreference;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SwitchPreference switchPreference = this.f258346a;
        int i2 = C92578ag.f258349a;
        switchPreference.setChecked(true);
    }
}
