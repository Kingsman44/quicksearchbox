package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.os.Bundle;
import androidx.preference.C4024t;
import androidx.preference.Preference;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.bn */
/* compiled from: PG */
public final /* synthetic */ class C9595bn implements C4024t {

    /* renamed from: a */
    public final /* synthetic */ C9619ck f33204a;

    public /* synthetic */ C9595bn(C9619ck ckVar) {
        this.f33204a = ckVar;
    }

    /* renamed from: b */
    public final boolean mo8421b(Preference preference) {
        C9619ck ckVar = this.f33204a;
        Bundle bundle = new Bundle();
        bundle.putString("key_device_id", ckVar.f33286t);
        ckVar.mo17789C("com.google.android.apps.gsa.assistant.settings.devices.bisto.BistoDeviceDiagnosticsFragment", bundle, "Device Diagnostics");
        return true;
    }
}
