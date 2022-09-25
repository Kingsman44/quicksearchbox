package com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8912b;

import com.google.android.apps.gsa.search.core.p6816p.C86227bj;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.android.libraries.gsa.p1876k.C22870f;

/* renamed from: com.google.android.apps.gsa.z.e.a.b.o */
/* compiled from: PG */
public final /* synthetic */ class C118974o implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C118976q f331759a;

    public /* synthetic */ C118974o(C118976q qVar) {
        this.f331759a = qVar;
    }

    public final void run() {
        C86227bj bjVar;
        C118976q qVar = this.f331759a;
        if (!qVar.f331778m) {
            if ((!qVar.f331777l && qVar.f331775j == null) || ((bjVar = qVar.f331775j) != null && !bjVar.mo79856I())) {
                qVar.mo104087v(C89849ae.VOICE_SEARCH_NETWORK_TIMEOUT);
                qVar.mo87095a(new C90523o(C89885b.RECOGNIZER_GENERAL_VOICE_SEARCH_TIMEOUT_VALUE));
            }
        }
    }
}
