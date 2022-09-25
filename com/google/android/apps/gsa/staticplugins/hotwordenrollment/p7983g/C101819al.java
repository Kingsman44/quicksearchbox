package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.g.al */
/* compiled from: PG */
public final /* synthetic */ class C101819al implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C101824aq f283998a;

    public /* synthetic */ C101819al(C101824aq aqVar) {
        this.f283998a = aqVar;
    }

    public final C60870cx apply(Object obj) {
        C101824aq aqVar = this.f283998a;
        Boolean bool = (Boolean) obj;
        C101860a aVar = aqVar.f284006b;
        aVar.f284134a.set(bool.booleanValue());
        C59104x b = C101824aq.f284005a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "UtteranceDownloader");
        ((C59052c) ((C59052c) b).mo56372aa(20680)).mo56389s("Cloud utterances are ready %b", bool);
        ((C89859i) aqVar.f284009e.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_UTTERANCE_FETCH_SUCCESS);
        return C60856cj.m92900i(bool);
    }
}
