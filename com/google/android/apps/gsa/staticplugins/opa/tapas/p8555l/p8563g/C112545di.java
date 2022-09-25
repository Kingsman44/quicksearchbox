package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.di */
/* compiled from: PG */
public final /* synthetic */ class C112545di implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C112547dk f312120a;

    public /* synthetic */ C112545di(C112547dk dkVar) {
        this.f312120a = dkVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C112547dk dkVar = this.f312120a;
        C59104x d = C112548dl.f312130b.mo56226d();
        d.mo56378ag(C58975e.f156826a, "TapasSignalManagerV2Impl");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g((Exception) obj)).mo56372aa(27749)).mo56386p("Failed to update signal cache.");
        synchronized (dkVar) {
            if (dkVar.mo99581k(dkVar.f312128g.f312134f.mo26870b())) {
                dkVar.mo99575e(C48635bx.f125704d);
            } else {
                dkVar.mo99575e(dkVar.f312124c);
            }
        }
    }
}
