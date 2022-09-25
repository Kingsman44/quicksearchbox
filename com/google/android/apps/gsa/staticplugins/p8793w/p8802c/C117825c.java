package com.google.android.apps.gsa.staticplugins.p8793w.p8802c;

import com.google.android.apps.gsa.search.core.carassistant.p6780c.C85700a;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.android.libraries.search.p2871b.p2895i.C37254c;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.c.c */
/* compiled from: PG */
public final class C117825c implements C37215b {

    /* renamed from: a */
    private final C58974d f327002a = C58974d.m91135i("FOAppflow");

    /* renamed from: b */
    private final C37215b f327003b;

    /* renamed from: c */
    private final C85700a f327004c;

    public C117825c(C37215b bVar, C85700a aVar) {
        this.f327003b = bVar;
        this.f327004c = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo19974a(C37254c cVar) {
        int i = cVar.mo40778b().f98906a;
        if (i == C37179a.f97694o.f99011a.f98876a.f98906a || i == C37179a.f97695p.f99011a.f98876a.f98906a) {
            this.f327004c.mo79322d(C89849ae.SPEECH_END_RECEIVED);
            this.f327004c.mo79322d(C89849ae.ESTIMATED_END_OF_SPEECH);
        } else if (i == C37179a.f97640e.f99011a.f98876a.f98906a) {
            this.f327004c.mo79322d(C89849ae.VOICE_SEARCH_NETWORK_RECOGNIZER_DONE);
        } else if (i == C37179a.f97685f.f99011a.f98876a.f98906a) {
            this.f327004c.mo79322d(C89849ae.VOICE_SEARCH_EMBEDDED_RECOGNIZER_DONE);
        }
        ((C58970a) ((C58970a) this.f327002a.mo56224b()).mo56372aa(18611)).mo56389s("Appflow logging: %s", cVar);
        return this.f327003b.mo19974a(cVar);
    }
}
