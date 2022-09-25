package com.google.android.apps.gsa.staticplugins.opaonboarding.entrypoint;

import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opaonboarding.entrypoint.b */
/* compiled from: PG */
final class C115878b implements C22868d {

    /* renamed from: a */
    final /* synthetic */ EnterOnboardingActivity f321332a;

    public C115878b(EnterOnboardingActivity enterOnboardingActivity) {
        this.f321332a = enterOnboardingActivity;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x c = EnterOnboardingActivity.f321324a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "EnterOnbActivity");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(30127)).mo56386p("onFailure");
        this.f321332a.mo102293a(false);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        this.f321332a.mo102293a(((Boolean) obj).booleanValue());
    }
}
