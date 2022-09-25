package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.content.Intent;
import androidx.preference.C4024t;
import androidx.preference.Preference;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.ak */
/* compiled from: PG */
public final /* synthetic */ class C9565ak implements C4024t {

    /* renamed from: a */
    public final /* synthetic */ C9569ao f33140a;

    public /* synthetic */ C9565ak(C9569ao aoVar) {
        this.f33140a = aoVar;
    }

    /* renamed from: b */
    public final boolean mo8421b(Preference preference) {
        C9569ao aoVar = this.f33140a;
        Intent intent = new Intent("bisto_apply_ota");
        intent.putExtra("key_device_id", aoVar.f33147l);
        aoVar.mo17875a(intent);
        return true;
    }
}
