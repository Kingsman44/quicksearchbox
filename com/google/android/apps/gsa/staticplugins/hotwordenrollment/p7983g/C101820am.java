package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.g.am */
/* compiled from: PG */
public final /* synthetic */ class C101820am implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C101824aq f283999a;

    public /* synthetic */ C101820am(C101824aq aqVar) {
        this.f283999a = aqVar;
    }

    public final Object apply(Object obj) {
        C101824aq aqVar = this.f283999a;
        C59104x c = C101824aq.f284005a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "UtteranceDownloader");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(20682)).mo56386p("checkHomeUtterancesReady error!");
        aqVar.f284006b.f284134a.set(false);
        ((C89859i) aqVar.f284009e.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_UTTERANCE_FETCH_FAILED);
        return false;
    }
}
