package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.content.DialogInterface;
import android.preference.SwitchPreference;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.bo */
/* compiled from: PG */
final class C97991bo implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SwitchPreference f273625a;

    public C97991bo(SwitchPreference switchPreference) {
        this.f273625a = switchPreference;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f273625a.setChecked(false);
    }
}
