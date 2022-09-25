package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.accounts.Account;
import android.widget.CompoundButton;
import android.widget.Switch;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110361bt;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.aj */
/* compiled from: PG */
public final /* synthetic */ class C9655aj implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C9664as f33397a;

    /* renamed from: b */
    public final /* synthetic */ Switch f33398b;

    public /* synthetic */ C9655aj(C9664as asVar, Switch switchR) {
        this.f33397a = asVar;
        this.f33398b = switchR;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C9664as asVar = this.f33397a;
        Switch switchR = this.f33398b;
        Account a = asVar.f33410a.a();
        if (a != null) {
            if (z) {
                ((C110361bt) asVar.f33413d.mo27525b()).mo98590g(a.name, asVar.f33419j, true);
            } else {
                ((C110361bt) asVar.f33413d.mo27525b()).mo98590g(a.name, asVar.f33419j, false);
            }
            switchR.setChecked(z);
            asVar.f33422m.setEnabled(z);
        }
    }
}
