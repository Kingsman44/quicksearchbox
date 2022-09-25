package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7973a;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92362c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.a.p */
/* compiled from: PG */
public final /* synthetic */ class C101534p implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C101510ae f283358a;

    public /* synthetic */ C101534p(C101510ae aeVar) {
        this.f283358a = aeVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C101510ae aeVar = this.f283358a;
        C59104x c = C101510ae.f283274a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "HomeEnrollTaskRunner");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(20309)).mo56386p("#startFreshEnrollment failed due to failure sending utterances to S3");
        aeVar.f283275b.mo87025f(C92362c.UPLOAD_ENROLLMENT);
    }
}
