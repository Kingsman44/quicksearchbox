package com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8912b;

import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.z.e.a.b.m */
/* compiled from: PG */
public final /* synthetic */ class C118972m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C118976q f331757a;

    public /* synthetic */ C118972m(C118976q qVar) {
        this.f331757a = qVar;
    }

    public final void run() {
        C118976q qVar = this.f331757a;
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 683;
        String b = C39191a.m68623b(qVar.f331773h);
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        b.getClass();
        ufVar2.f164093a |= 4;
        ufVar2.f164259n = b;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        qVar.mo104087v(C89849ae.VOICE_SEARCH_NO_SPEECH_DETECTED);
        qVar.f331767b.mo91309f(qVar.f331771f);
    }
}
