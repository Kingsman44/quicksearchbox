package com.google.android.apps.search.googleapp.incognito.p10329g;

import android.app.Dialog;
import androidx.biometric.C0900ad;

/* renamed from: com.google.android.apps.search.googleapp.incognito.g.i */
/* compiled from: PG */
final class C136319i extends C0900ad {

    /* renamed from: a */
    final /* synthetic */ C136320j f371169a;

    public C136319i(C136320j jVar) {
        this.f371169a = jVar;
    }

    /* renamed from: a */
    public final void mo3530a(int i) {
        if ((i == 5 || i == 10) && this.f371169a.mo112915b() == null) {
            this.f371169a.mo112917d(false, false);
        }
        this.f371169a.mo112918e(-1);
    }

    /* renamed from: b */
    public final void mo3531b() {
        Dialog dialog = this.f371169a.f371172c.getDialog();
        dialog.getClass();
        dialog.dismiss();
        this.f371169a.mo112918e(-1);
    }
}
