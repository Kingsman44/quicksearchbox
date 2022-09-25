package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.support.p031v4.app.C0167am;
import android.widget.CompoundButton;
import com.google.android.apps.gsa.assistant.settings.shared.i.a;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.c */
/* compiled from: PG */
public final /* synthetic */ class C9693c implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C9695e f33501a;

    public /* synthetic */ C9693c(C9695e eVar) {
        this.f33501a = eVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C0167am activity = this.f33501a.getActivity();
        if (activity != null) {
            a.a(activity, z);
        }
    }
}
