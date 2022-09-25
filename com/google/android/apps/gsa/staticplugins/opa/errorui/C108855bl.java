package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C83869ac;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83956t;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.bl */
/* compiled from: PG */
final class C108855bl extends C83869ac {

    /* renamed from: a */
    final /* synthetic */ C108858bo f302675a;

    public C108855bl(C108858bo boVar) {
        this.f302675a = boVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C83956t mo77207a() {
        Bundle bundle = new Bundle();
        bundle.putInt("enrollment_entry_id", this.f302675a.mo97231d());
        return C83875ai.m133540e(new C108862bs(), bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo77208b() {
        return true;
    }
}
