package com.google.android.apps.gsa.staticplugins.p7714cv.p7723g;

import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.speech.C90532c;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7718b.C98716b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.recognizer.p5233a.C67463k;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.g.f */
/* compiled from: PG */
public final class C98759f implements C98769p {

    /* renamed from: a */
    private final C98716b f275880a;

    public C98759f(C98716b bVar) {
        this.f275880a = bVar;
    }

    /* renamed from: b */
    public final void mo91292a(C90532c cVar) {
        int i = cVar.f253274c;
        C67463k a = C67463k.m97475a(cVar.f253085a.f183359b);
        if (a == null) {
            a = C67463k.START_OF_SPEECH;
        }
        if (i == 1 || i == 7) {
            if (a == C67463k.START_OF_SPEECH) {
                C89949q.m146523g(178);
            } else if (a == C67463k.END_OF_SPEECH) {
                C89949q.m146523g(180);
            }
        } else if (i == 2) {
            if (a == C67463k.START_OF_SPEECH) {
                C89949q.m146523g(179);
            } else if (a == C67463k.END_OF_SPEECH || a == C67463k.END_OF_UTTERANCE) {
                C89949q.m146523g(181);
            }
            i = 2;
        }
        C58976aa aaVar = C58975e.f156826a;
        this.f275880a.mo91275a(i, cVar);
    }
}
