package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.g.ak */
/* compiled from: PG */
public final /* synthetic */ class C101818ak implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C101824aq f283997a;

    public /* synthetic */ C101818ak(C101824aq aqVar) {
        this.f283997a = aqVar;
    }

    public final C60870cx apply(Object obj) {
        C89849ae aeVar;
        String str;
        C101824aq aqVar = this.f283997a;
        List list = (List) obj;
        aqVar.f284006b.f284135b = list;
        boolean z = false;
        if (list != null && !list.isEmpty()) {
            z = true;
        }
        C89859i iVar = (C89859i) aqVar.f284009e.mo27525b();
        if (z) {
            aeVar = C89849ae.VOICE_MATCH_UTTERANCE_FETCH_SUCCESS;
        } else {
            aeVar = C89849ae.VOICE_MATCH_UTTERANCE_FETCH_FAILED;
        }
        iVar.mo83702b(aeVar);
        C59104x b = C101824aq.f284005a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "UtteranceDownloader");
        C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(20681);
        if (list == null) {
            str = "null";
        } else {
            str = Integer.toString(list.size());
        }
        cVar.mo56389s("Utterances downloaded-%s", str);
        return C60856cj.m92900i(Boolean.valueOf(z));
    }
}
