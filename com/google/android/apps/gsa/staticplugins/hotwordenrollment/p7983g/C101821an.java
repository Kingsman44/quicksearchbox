package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7042i.C89784a;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.g.an */
/* compiled from: PG */
public final /* synthetic */ class C101821an implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C101824aq f284000a;

    /* renamed from: b */
    public final /* synthetic */ C89784a f284001b;

    public /* synthetic */ C101821an(C101824aq aqVar, C89784a aVar) {
        this.f284000a = aqVar;
        this.f284001b = aVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C101824aq aqVar = this.f284000a;
        C89784a aVar = this.f284001b;
        Boolean bool = (Boolean) obj;
        C101860a aVar2 = aqVar.f284006b;
        aVar2.f284134a.set(bool.booleanValue());
        C59104x b = C101824aq.f284005a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "UtteranceDownloader");
        ((C59052c) ((C59052c) b).mo56372aa(20684)).mo56389s("Cloud utterances are ready %b", bool);
        aVar.mo49086a(bool);
        ((C89859i) aqVar.f284009e.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_UTTERANCE_FETCH_SUCCESS);
    }
}
