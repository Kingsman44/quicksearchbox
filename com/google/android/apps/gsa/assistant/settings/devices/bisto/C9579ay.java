package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.content.DialogInterface;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.ay */
/* compiled from: PG */
public final /* synthetic */ class C9579ay implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C9619ck f33182a;

    /* renamed from: b */
    public final /* synthetic */ boolean f33183b;

    public /* synthetic */ C9579ay(C9619ck ckVar, boolean z) {
        this.f33182a = ckVar;
        this.f33183b = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C9619ck ckVar = this.f33182a;
        boolean z = this.f33183b;
        PersonalResultsSwitchPreference personalResultsSwitchPreference = ckVar.f33283q;
        if (personalResultsSwitchPreference != null) {
            personalResultsSwitchPreference.mo8391j(!z);
        }
    }
}
