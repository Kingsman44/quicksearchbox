package com.google.android.apps.gsa.staticplugins.p7967h;

import com.google.android.apps.gsa.p6487s3.C84295m;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4449cd.p4456g.p4457a.C57980f;
import com.google.speech.p5208h.C66610ch;
import com.google.speech.p5208h.C66611ci;

/* renamed from: com.google.android.apps.gsa.staticplugins.h.au */
/* compiled from: PG */
public final class C101458au implements C84295m {

    /* renamed from: a */
    final /* synthetic */ C57980f f283070a;

    public C101458au(C57980f fVar) {
        this.f283070a = fVar;
    }

    /* renamed from: a */
    public final void mo77831a(C90523o oVar) {
        C59104x c = C101459av.f283071a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ACS.ResponseHandler");
        C59052c cVar = (C59052c) ((C59052c) c).mo56382g(oVar);
        cVar.mo56380ai(C58979ad.FULL);
        ((C59052c) cVar.mo56372aa(13912)).mo56389s("#onFatalError: %s", oVar);
        this.f283070a.mo54585e(oVar);
    }

    /* renamed from: c */
    public final void mo77832c(C90523o oVar) {
        C59104x c = C101459av.f283071a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ACS.ResponseHandler");
        C59052c cVar = (C59052c) ((C59052c) c).mo56382g(oVar);
        cVar.mo56380ai(C58979ad.FULL);
        ((C59052c) cVar.mo56372aa(13913)).mo56389s("#onNonFatalError: %s", oVar);
    }

    /* renamed from: d */
    public final void mo77833d(C66611ci ciVar) {
        if (ciVar != null) {
            C66610ch a = C66610ch.m97260a(ciVar.f181209b);
            if (a == null) {
                a = C66610ch.IN_PROGRESS;
            }
            if (a == C66610ch.IN_PROGRESS) {
                C58976aa aaVar = C58975e.f156826a;
                this.f283070a.mo54583c(ciVar);
            }
            C66610ch a2 = C66610ch.m97260a(ciVar.f181209b);
            if (a2 == null) {
                a2 = C66610ch.IN_PROGRESS;
            }
            if (a2 == C66610ch.DONE_SUCCESS) {
                C58976aa aaVar2 = C58975e.f156826a;
                this.f283070a.mo54584d(false);
            }
        }
    }
}
