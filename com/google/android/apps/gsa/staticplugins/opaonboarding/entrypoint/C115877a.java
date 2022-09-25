package com.google.android.apps.gsa.staticplugins.opaonboarding.entrypoint;

import com.google.android.apps.gsa.search.core.C84413ad;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.libraries.gsa.p1876k.C22862b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opaonboarding.entrypoint.a */
/* compiled from: PG */
public final /* synthetic */ class C115877a implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ EnterOnboardingActivity f321331a;

    public /* synthetic */ C115877a(EnterOnboardingActivity enterOnboardingActivity) {
        this.f321331a = enterOnboardingActivity;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        boolean z;
        EnterOnboardingActivity enterOnboardingActivity = this.f321331a;
        if (enterOnboardingActivity.getCallingPackage() == null || !"com.google.android.googlequicksearchbox".equals(enterOnboardingActivity.getCallingPackage())) {
            C90476a aVar = (C90476a) enterOnboardingActivity.f321328e.mo27525b();
            z = ((C84413ad) enterOnboardingActivity.f321327d.mo27525b()).mo77970g(enterOnboardingActivity);
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
