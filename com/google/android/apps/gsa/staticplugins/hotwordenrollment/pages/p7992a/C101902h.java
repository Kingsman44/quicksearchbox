package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7992a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.a.h */
/* compiled from: PG */
public final /* synthetic */ class C101902h implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C101905k f284235a;

    public /* synthetic */ C101902h(C101905k kVar) {
        this.f284235a = kVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C101905k kVar = this.f284235a;
        Exception exc = (Exception) obj;
        ((C59052c) ((C59052c) C101905k.f284239a.mo56225c()).mo56372aa(20432)).mo56386p("EnrollmentRunner failed for cloud utterances");
        kVar.f284251m.mo84668b(4, EventForDump.m147676e(8, String.format("Phone cloud enrollment failed. Ran TISID enrollment: %b", new Object[]{Boolean.valueOf(kVar.f284245g.mo83850M())})), BuildConfig.FLAVOR);
        kVar.f284243e.mo83702b(C89849ae.VOICE_MATCH_CLOUD_ENROLLMENT_FAILED);
        kVar.f284242d.f284134a.set(false);
        kVar.f284247i.mo92568a(kVar.f284256r);
        kVar.f284243e.mo83702b(C89849ae.DELETE_UTTERANCES_ON_CLOUD_ENROLLMENT_FAILURE);
        C101905k.m168602a(kVar.f284240b);
    }
}
