package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.os.Bundle;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.cb */
/* compiled from: PG */
public final /* synthetic */ class C9610cb implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C9619ck f33222a;

    public /* synthetic */ C9610cb(C9619ck ckVar) {
        this.f33222a = ckVar;
    }

    public final void run() {
        C9619ck ckVar = this.f33222a;
        Bundle bundle = new Bundle();
        bundle.putString("bisto_device_id", ckVar.f33286t);
        ckVar.mo17788B("com.google.android.apps.gsa.assistant.settings.devices.bisto.BistoLicensesFragment", bundle, R.string.bisto_device_open_source_licenses);
    }
}
