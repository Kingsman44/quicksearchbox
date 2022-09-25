package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C83869ac;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83956t;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.d */
/* compiled from: PG */
final class C108897d extends C83869ac {

    /* renamed from: a */
    final /* synthetic */ C108924e f302767a;

    public C108897d(C108924e eVar) {
        this.f302767a = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C83956t mo77207a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("allow_signed_out_mode", this.f302767a.f302852b.mo100633m());
        return C83875ai.m133540e(new C108870c(), bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo77208b() {
        return !this.f302767a.f302851a.mo77278a().mo56113h();
    }
}
