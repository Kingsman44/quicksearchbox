package com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8427c;

import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.staticplugins.opa.errorui.C108924e;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110402b;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.c.u */
/* compiled from: PG */
public final class C110083u extends C84036z {

    /* renamed from: a */
    private final C110082t f306705a;

    /* renamed from: b */
    private final C108924e f306706b;

    /* renamed from: c */
    private final C110402b f306707c;

    public C110083u(C108924e eVar, C110402b bVar, C110082t tVar) {
        this.f306706b = eVar;
        this.f306707c = bVar;
        this.f306705a = tVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        if (!this.f306707c.mo98629a()) {
            return C58485gu.m89845m();
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("key_track_opt_out", true);
        C110082t tVar = this.f306705a;
        tVar.f306702a = bundle;
        return C58485gu.m89847o(this.f306706b, tVar);
    }
}
