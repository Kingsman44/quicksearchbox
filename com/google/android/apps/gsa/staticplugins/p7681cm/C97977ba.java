package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.content.DialogInterface;
import android.preference.SwitchPreference;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.ba */
/* compiled from: PG */
public final /* synthetic */ class C97977ba implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C97980bd f273565a;

    /* renamed from: b */
    public final /* synthetic */ SwitchPreference f273566b;

    public /* synthetic */ C97977ba(C97980bd bdVar, SwitchPreference switchPreference) {
        this.f273565a = bdVar;
        this.f273566b = switchPreference;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C97980bd bdVar = this.f273565a;
        SwitchPreference switchPreference = this.f273566b;
        switchPreference.setChecked(false);
        bdVar.mo90863a(switchPreference, false);
        dialogInterface.dismiss();
    }
}
