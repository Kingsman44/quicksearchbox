package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C83869ac;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83956t;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.bh */
/* compiled from: PG */
final class C108851bh extends C83869ac {

    /* renamed from: a */
    final /* synthetic */ C108853bj f302664a;

    public C108851bh(C108853bj bjVar) {
        this.f302664a = bjVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C83956t mo77207a() {
        Bundle bundle = new Bundle();
        bundle.putInt("enrollment_entry_id", this.f302664a.f302666a.mo77193a());
        return C83875ai.m133540e(new C108849bf(), bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo77208b() {
        return !this.f302664a.f302668c.mo100604a();
    }
}
