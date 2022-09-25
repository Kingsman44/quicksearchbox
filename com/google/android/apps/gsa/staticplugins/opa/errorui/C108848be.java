package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C83873ag;
import com.google.android.apps.gsa.opaonboarding.C83903bi;
import com.google.android.apps.gsa.opaonboarding.C83904bj;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.be */
/* compiled from: PG */
public final class C108848be extends C83873ag implements C83904bj {

    /* renamed from: a */
    private final C69464a f302657a;

    /* renamed from: b */
    private final Bundle f302658b;

    /* renamed from: c */
    private C108849bf f302659c;

    public C108848be(C69464a aVar, Bundle bundle) {
        this.f302657a = aVar;
        this.f302658b = bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Bundle mo77213a() {
        Bundle bundle = new Bundle();
        bundle.putInt("enrollment_entry_id", this.f302658b.getInt("entry_id", 0));
        return bundle;
    }

    /* renamed from: b */
    public final C83903bi mo77310b() {
        C108849bf bfVar = this.f302659c;
        return C83903bi.m133649e(bfVar == null ? 1 : bfVar.f302662c, (Intent) null);
    }

    /* renamed from: i */
    public final C83903bi mo77311i() {
        return mo77310b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final C83907bm mo77214j() {
        C108849bf bfVar = (C108849bf) this.f302657a.mo17428b();
        this.f302659c = bfVar;
        return bfVar;
    }
}
