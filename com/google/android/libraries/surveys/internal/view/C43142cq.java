package com.google.android.libraries.surveys.internal.view;

import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import com.google.p4281bu.p4282a.C56493ad;

/* renamed from: com.google.android.libraries.surveys.internal.view.cq */
/* compiled from: PG */
public final class C43142cq extends C43131cf {

    /* renamed from: c */
    private final C56493ad f112827c;

    public C43142cq(C56493ad adVar) {
        this.f112827c = adVar;
        this.f112810b = 5;
    }

    /* renamed from: a */
    public final Fragment mo46158a(Integer num, int i) {
        C56493ad adVar = this.f112827c;
        C43145ct ctVar = new C43145ct();
        Bundle bundle = new Bundle();
        if (num != null) {
            bundle.putInt("DisplayLogoResId", num.intValue());
        }
        bundle.putByteArray("Completion", adVar.toByteArray());
        ctVar.setArguments(bundle);
        return ctVar;
    }
}
