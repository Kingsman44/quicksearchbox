package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7992a;

import android.support.p031v4.app.C0167am;
import com.google.android.apps.gsa.search.core.C85767f;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7988k.C101873d;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.speech.p5208h.C66595bu;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.a.g */
/* compiled from: PG */
public final /* synthetic */ class C101901g implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C101905k f284234a;

    public /* synthetic */ C101901g(C101905k kVar) {
        this.f284234a = kVar;
    }

    public final void run() {
        C101905k kVar = this.f284234a;
        if (kVar.f284240b.getContext() != null) {
            C0167am activity = kVar.f284240b.getActivity();
            if (activity != null) {
                kVar.f284255q.mo92666b(activity, kVar.f284256r);
            }
            if (!kVar.f284241c.mo70887e().mo70856e()) {
                ((C59052c) ((C59052c) C101905k.f284239a.mo56224b()).mo56372aa(20431)).mo56386p("Cloud Enrollment. Waiting Screen. Don't enroll DSP, only update Settings.");
                kVar.f284248j.mo92452a(kVar.f284253o.f257605d);
            }
            C88483e.m142828c(kVar.f284240b.getContext(), new C88489j(C87739bu.REFRESH_SERVICE_STATE).mo82013a());
            C85767f.m137817a(kVar.f284240b.getContext());
            kVar.f284243e.mo83702b(C89849ae.VOICE_MATCH_CLOUD_ENROLLMENT_COMPLETE);
            kVar.f284242d.f284134a.set(true);
            if (kVar.f284245g.mo83834w()) {
                kVar.f284258t.mo92524a(true, EventForDump.m147676e(8, "XGoogle cloud enrollment complete"));
            }
            C90875ai.m148465b(C101873d.m168557b(new C101897c(kVar)), kVar.f284255q.mo92665a(kVar.f284256r, (C66595bu) kVar.f284254p.f283245b.mo87020a().mo56111f()), kVar.f284249k, "Record Consent").mo85223a(C101873d.m168556a(new C101898d(kVar)));
        }
    }
}
