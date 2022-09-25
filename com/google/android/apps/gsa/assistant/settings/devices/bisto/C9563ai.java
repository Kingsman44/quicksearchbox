package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.content.Intent;
import androidx.preference.C4024t;
import androidx.preference.Preference;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.ai */
/* compiled from: PG */
public final /* synthetic */ class C9563ai implements C4024t {

    /* renamed from: a */
    public final /* synthetic */ C9569ao f33138a;

    public /* synthetic */ C9563ai(C9569ao aoVar) {
        this.f33138a = aoVar;
    }

    /* renamed from: b */
    public final boolean mo8421b(Preference preference) {
        this.f33138a.mo17875a(new Intent("action_abort_ota"));
        return true;
    }
}
