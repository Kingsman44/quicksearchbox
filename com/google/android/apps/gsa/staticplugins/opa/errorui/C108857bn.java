package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C83869ac;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83956t;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.bn */
/* compiled from: PG */
final class C108857bn extends C83869ac {

    /* renamed from: a */
    final /* synthetic */ C108858bo f302677a;

    public C108857bn(C108858bo boVar) {
        this.f302677a = boVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C83956t mo77207a() {
        Bundle bundle = new Bundle();
        bundle.putInt("enrollment_entry_id", this.f302677a.mo97231d());
        return C83875ai.m133540e(this.f302677a.f302680b, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo77208b() {
        return !this.f302677a.f302679a.mo100604a();
    }
}
