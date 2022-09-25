package com.google.android.apps.gsa.staticplugins.opa.samson.p8435j;

import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C83869ac;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.staticplugins.opa.errorui.C108849bf;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.j.f */
/* compiled from: PG */
final class C110208f extends C83869ac {

    /* renamed from: a */
    final /* synthetic */ C110211i f307091a;

    public C110208f(C110211i iVar) {
        this.f307091a = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C83956t mo77207a() {
        Bundle bundle = new Bundle();
        bundle.putInt("enrollment_entry_id", 48);
        this.f307091a.f307101h.edit().putBoolean("opa_hotword_training_seen_on_dock", true).apply();
        this.f307091a.f307101h.edit().putBoolean("opa_hotword_training_force_seen", false).apply();
        return C83875ai.m133540e(new C108849bf(), bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo77208b() {
        return this.f307091a.f307094a.mo98473a(true);
    }
}
