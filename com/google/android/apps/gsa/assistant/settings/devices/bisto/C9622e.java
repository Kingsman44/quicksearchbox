package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.preference.C4024t;
import androidx.preference.Preference;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.e */
/* compiled from: PG */
public final /* synthetic */ class C9622e implements C4024t {

    /* renamed from: a */
    public final /* synthetic */ C9624g f33313a;

    public /* synthetic */ C9622e(C9624g gVar) {
        this.f33313a = gVar;
    }

    /* renamed from: b */
    public final boolean mo8421b(Preference preference) {
        C9624g gVar = this.f33313a;
        Context context = gVar.f32988d;
        String str = gVar.f33317k;
        ComponentName componentName = new ComponentName(context, "com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.HerbieAudioTestingActivity");
        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
        context.startActivity(new Intent().setComponent(componentName).putExtra("key_device_id", str).addFlags(268468224));
        return true;
    }
}
