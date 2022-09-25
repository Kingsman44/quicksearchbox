package com.google.android.apps.gsa.staticplugins.opa.setupwizard;

import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C83873ag;
import com.google.android.apps.gsa.opaonboarding.C83907bm;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.setupwizard.w */
/* compiled from: PG */
final class C110499w extends C83873ag {

    /* renamed from: a */
    final /* synthetic */ C110500x f308058a;

    public C110499w(C110500x xVar) {
        this.f308058a = xVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Bundle mo77213a() {
        Bundle bundle = new Bundle();
        if (this.f308058a.f308060b.mo98725e()) {
            bundle.putBoolean("intent_extra_use_unicorn_flow", this.f308058a.f308060b.mo98725e());
            bundle.putString("intent_extra_given_name", this.f308058a.f308060b.mo98722b());
            bundle.putInt("intent_extra_standard_gender", this.f308058a.f308060b.mo98721a());
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final C83907bm mo77214j() {
        return new C110478ba();
    }
}
