package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.os.Bundle;
import androidx.preference.C4024t;
import androidx.preference.Preference;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.q */
/* compiled from: PG */
public final /* synthetic */ class C9634q implements C4024t {

    /* renamed from: a */
    public final /* synthetic */ C9635r f33338a;

    public /* synthetic */ C9634q(C9635r rVar) {
        this.f33338a = rVar;
    }

    /* renamed from: b */
    public final boolean mo8421b(Preference preference) {
        C9635r rVar = this.f33338a;
        Bundle bundle = new Bundle();
        bundle.putString("key_device_id", rVar.f33340j);
        rVar.mo17789C("com.google.android.apps.gsa.assistant.settings.devices.bisto.BistoDeviceActionsSettingsFragment", bundle, "Device Actions");
        return true;
    }
}
