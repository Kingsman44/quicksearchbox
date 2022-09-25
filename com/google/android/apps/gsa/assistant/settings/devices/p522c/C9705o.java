package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.widget.CompoundButton;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.o */
/* compiled from: PG */
public final /* synthetic */ class C9705o implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C9711u f33535a;

    public /* synthetic */ C9705o(C9711u uVar) {
        this.f33535a = uVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C9711u uVar = this.f33535a;
        if (uVar.getActivity() != null) {
            uVar.f33543c.mo17661b(z, uVar.f33546f);
            uVar.mo17978a();
        }
    }
}
