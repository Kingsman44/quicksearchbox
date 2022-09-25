package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7973a;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92362c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.a.v */
/* compiled from: PG */
public final /* synthetic */ class C101540v implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C101510ae f283365a;

    public /* synthetic */ C101540v(C101510ae aeVar) {
        this.f283365a = aeVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C101510ae aeVar = this.f283365a;
        C59104x b = C101510ae.f283274a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HomeEnrollTaskRunner");
        ((C59052c) ((C59052c) b).mo56372aa(20304)).mo56386p("#runVerifyEnrollment - Success");
        aeVar.f283275b.mo87026g(C92362c.CLOUD_ENROLLMENT_COMPLETED);
    }
}
