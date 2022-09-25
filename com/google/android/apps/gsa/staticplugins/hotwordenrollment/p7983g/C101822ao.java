package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.g.ao */
/* compiled from: PG */
public final /* synthetic */ class C101822ao implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C101824aq f284002a;

    public /* synthetic */ C101822ao(C101824aq aqVar) {
        this.f284002a = aqVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C101824aq aqVar = this.f284002a;
        C59104x c = C101824aq.f284005a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "UtteranceDownloader");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(20685)).mo56386p("checkHomeUtterancesReady error!");
        aqVar.f284006b.f284134a.set(false);
        ((C89859i) aqVar.f284009e.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_UTTERANCE_FETCH_FAILED);
    }
}
