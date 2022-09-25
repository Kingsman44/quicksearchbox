package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.widget.CompoundButton;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.d */
/* compiled from: PG */
public final /* synthetic */ class C9694d implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C9695e f33502a;

    public /* synthetic */ C9694d(C9695e eVar) {
        this.f33502a = eVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C9695e eVar = this.f33502a;
        if (eVar.getActivity() != null) {
            eVar.f33504b.edit().putBoolean("speech_hotword_toast_debug", z).apply();
        }
    }
}
