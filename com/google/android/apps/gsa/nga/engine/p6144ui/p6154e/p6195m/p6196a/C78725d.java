package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6195m.p6196a;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6167b.C78245d;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.m.a.d */
/* compiled from: PG */
public final /* synthetic */ class C78725d implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C78726e f216724a;

    public /* synthetic */ C78725d(C78726e eVar) {
        this.f216724a = eVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C78726e eVar = this.f216724a;
        C78245d dVar = (C78245d) obj;
        int h = dVar.mo73179a().mo73175h();
        if (h == 0) {
            throw null;
        } else if (h == 3) {
            int h2 = dVar.mo73180b().mo73175h();
            if (h2 == 0) {
                throw null;
            } else if (h2 == 1 && !dVar.mo73181d()) {
                new C90873ag(eVar.f216727c.mo28210j(eVar.f216725a.mo74926o(), "[NGA] recordInvocation", new C78722a(eVar)), eVar.f216727c, "[NGA] OnboardingControllerImpl.updateIsPlateBounceOnboardingEnabled", new C78723b(eVar)).mo85223a(new C78724c(eVar));
            }
        }
    }
}
