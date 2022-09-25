package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.widget.CompoundButton;
import android.widget.Switch;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.am */
/* compiled from: PG */
public final /* synthetic */ class C108829am implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ Switch f302602a;

    public /* synthetic */ C108829am(Switch switchR) {
        this.f302602a = switchR;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Switch switchR = this.f302602a;
        int i = C108836at.f302614t;
        if (z) {
            switchR.setEnabled(true);
            return;
        }
        switchR.setChecked(false);
        switchR.setEnabled(false);
    }
}
