package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.content.DialogInterface;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.n */
/* compiled from: PG */
public final /* synthetic */ class C9631n implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Preference f33335a;

    public /* synthetic */ C9631n(Preference preference) {
        this.f33335a = preference;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ((TwoStatePreference) this.f33335a).mo8391j(false);
    }
}
