package com.google.android.apps.search.transcription.p10670f;

import com.google.android.apps.search.transcription.p10666b.C141758q;
import com.google.android.apps.search.transcription.p10666b.C141760s;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.transcription.f.bf */
/* compiled from: PG */
final class C141838bf implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C141839bg f384908a;

    public C141838bf(C141839bg bgVar) {
        this.f384908a = bgVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C141845bm.f384915a.mo56226d()).mo56382g(th)).mo56372aa(41894)).mo56386p("startDetection failed");
        C141760s sVar = th;
        while (true) {
            if (sVar != null) {
                if (C141760s.class.isInstance(sVar)) {
                    break;
                }
                sVar = sVar.getCause();
            } else {
                sVar = null;
                break;
            }
        }
        if (sVar instanceof C141760s) {
            ((C59052c) ((C59052c) ((C59052c) C141845bm.f384915a.mo56226d()).mo56382g(th)).mo56372aa(41896)).mo56386p("Transcription error");
            this.f384908a.f384912d.f384924j.mo116728b(sVar);
            return;
        }
        ((C59052c) ((C59052c) ((C59052c) C141845bm.f384915a.mo56226d()).mo56382g(th)).mo56372aa(41895)).mo56386p("Recognizer generic error");
        this.f384908a.f384912d.f384924j.mo116728b(new C141758q(1));
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        ((C59052c) ((C59052c) C141845bm.f384915a.mo56224b()).mo56372aa(41897)).mo56386p("startDetection successful");
    }
}
