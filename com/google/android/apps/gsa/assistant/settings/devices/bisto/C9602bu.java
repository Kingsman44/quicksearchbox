package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.os.Bundle;
import androidx.preference.C4024t;
import androidx.preference.Preference;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.bu */
/* compiled from: PG */
public final /* synthetic */ class C9602bu implements C4024t {

    /* renamed from: a */
    public final /* synthetic */ C9619ck f33211a;

    public /* synthetic */ C9602bu(C9619ck ckVar) {
        this.f33211a = ckVar;
    }

    /* renamed from: b */
    public final boolean mo8421b(Preference preference) {
        C9619ck ckVar = this.f33211a;
        Bundle bundle = new Bundle();
        bundle.putString("key_device_id", ckVar.f33286t);
        ckVar.mo17788B("com.google.android.apps.gsa.assistant.settings.devices.bisto.BistoAudioOutputOptionsFragment", bundle, R.string.bisto_audio_output_options_pref_title);
        return true;
    }
}
