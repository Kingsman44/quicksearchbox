package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.os.Bundle;
import androidx.preference.C4024t;
import androidx.preference.Preference;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.be */
/* compiled from: PG */
public final /* synthetic */ class C9586be implements C4024t {

    /* renamed from: a */
    public final /* synthetic */ C9619ck f33192a;

    public /* synthetic */ C9586be(C9619ck ckVar) {
        this.f33192a = ckVar;
    }

    /* renamed from: b */
    public final boolean mo8421b(Preference preference) {
        C9619ck ckVar = this.f33192a;
        Bundle bundle = new Bundle();
        bundle.putString("key_device_id", ckVar.f33286t);
        ckVar.mo17789C("com.google.android.apps.gsa.assistant.settings.devices.bisto.BistoOtaSettingsFragment", bundle, "OTA extended control");
        return true;
    }
}
