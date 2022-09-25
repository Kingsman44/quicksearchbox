package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7973a;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.a.z */
/* compiled from: PG */
public final /* synthetic */ class C101544z implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C101544z f283369a = new C101544z();

    private /* synthetic */ C101544z() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C59104x c = C101510ae.f283274a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "HomeEnrollTaskRunner");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Throwable) obj)).mo56372aa(20298)).mo56386p("#startRetrainEnrollment failed due to failure sending utterances to S3.");
        return C101511af.UPLOAD_UTTERANCES_FAILED;
    }
}
