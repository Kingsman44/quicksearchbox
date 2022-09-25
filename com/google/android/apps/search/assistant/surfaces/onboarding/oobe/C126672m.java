package com.google.android.apps.search.assistant.surfaces.onboarding.oobe;

import android.widget.CompoundButton;
import android.widget.Switch;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.oobe.m */
/* compiled from: PG */
public final /* synthetic */ class C126672m implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ Switch f348822a;

    public /* synthetic */ C126672m(Switch switchR) {
        this.f348822a = switchR;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Switch switchR = this.f348822a;
        if (z) {
            switchR.setEnabled(true);
            return;
        }
        switchR.setChecked(false);
        switchR.setEnabled(false);
    }
}
