package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8005g;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92360b;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92362c;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7988k.C101873d;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47815ex;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.p5208h.C66595bu;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.g.g */
/* compiled from: PG */
final class C102039g implements C92360b {

    /* renamed from: a */
    final /* synthetic */ C47816ey f284686a;

    /* renamed from: b */
    final /* synthetic */ C102042j f284687b;

    public C102039g(C102042j jVar, C47816ey eyVar) {
        this.f284687b = jVar;
        this.f284686a = eyVar;
    }

    /* renamed from: a */
    public final void mo64728a(C92362c cVar) {
        C59104x d = C102042j.f284688a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ProgressUpdateFrag");
        ((C59052c) ((C59052c) d).mo56372aa(20524)).mo56389s("#onError [state: %s]", cVar);
    }

    /* renamed from: b */
    public final void mo64729b(C92362c cVar) {
        C59104x b = C102042j.f284688a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ProgressUpdateFrag");
        ((C59052c) ((C59052c) b).mo56372aa(20525)).mo56389s("#onUpdate [state: %s, progress update screen.", cVar);
        C47573bx a = this.f284686a.mo51644a();
        try {
            C92362c cVar2 = C92362c.LINK_ACCOUNT;
            if (cVar.ordinal() != 5) {
                C59104x b2 = C102042j.f284688a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "ProgressUpdateFrag");
                ((C59052c) ((C59052c) b2).mo56372aa(20526)).mo56386p("No-op enrollment update.");
            } else {
                this.f284687b.f284698k.mo83702b(C89849ae.VOICE_MATCH_CLOUD_ENROLLMENT_COMPLETE);
                C102042j jVar = this.f284687b;
                C90875ai.m148465b(C101873d.m168557b(new C102037e(this)), jVar.f284702o.mo92665a(jVar.f284691d, (C66595bu) jVar.f284701n.f283245b.mo87020a().mo56111f()), this.f284687b.f284697j, "Record Consent").mo85223a(C101873d.m168556a(new C102038f(this)));
            }
            C47831fm.m85013h(((C47815ex) a).f123840a);
            return;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
