package com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8427c;

import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C83869ac;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.staticplugins.opa.errorui.C108849bf;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8435j.C110212j;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.c.z */
/* compiled from: PG */
public final class C110088z extends C83869ac {

    /* renamed from: a */
    private final C108849bf f306720a;

    /* renamed from: b */
    private final C110212j f306721b;

    public C110088z(C108849bf bfVar, C110212j jVar) {
        this.f306720a = bfVar;
        this.f306721b = jVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C83956t mo77207a() {
        Bundle bundle = new Bundle();
        bundle.putInt("enrollment_entry_id", 55);
        return C83875ai.m133540e(this.f306720a, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo77208b() {
        return this.f306721b.mo98473a(true);
    }
}
