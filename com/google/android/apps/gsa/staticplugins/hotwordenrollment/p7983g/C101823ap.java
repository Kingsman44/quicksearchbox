package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7042i.C89784a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.g.ap */
/* compiled from: PG */
final class C101823ap implements C89784a {

    /* renamed from: a */
    final /* synthetic */ C89784a f284003a;

    /* renamed from: b */
    final /* synthetic */ C101824aq f284004b;

    public C101823ap(C101824aq aqVar, C89784a aVar) {
        this.f284004b = aqVar;
        this.f284003a = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo49086a(Object obj) {
        List list = (List) obj;
        this.f284004b.f284006b.f284135b = list;
        if (!list.isEmpty()) {
            ((C89859i) this.f284004b.f284009e.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_UTTERANCE_FETCH_SUCCESS);
        } else {
            ((C89859i) this.f284004b.f284009e.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_UTTERANCE_FETCH_FAILED);
        }
        C58976aa aaVar = C58975e.f156826a;
        Integer.toString(list.size());
        ((C101815ah) this.f284003a).mo92598b();
    }
}
