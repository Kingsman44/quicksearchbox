package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7735b.p7736a;

import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.b.a.t */
/* compiled from: PG */
public final /* synthetic */ class C98930t implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C98932v f276472a;

    public /* synthetic */ C98930t(C98932v vVar) {
        this.f276472a = vVar;
    }

    public final void run() {
        C98932v vVar = this.f276472a;
        C58976aa aaVar = C58975e.f156826a;
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 683;
        String b = C39191a.m68623b(vVar.f276485h);
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        b.getClass();
        ufVar2.f164093a |= 4;
        ufVar2.f164259n = b;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        vVar.mo91351v(C89849ae.VOICE_SEARCH_NO_SPEECH_DETECTED);
        vVar.f276479b.mo91328f(vVar.f276483f);
    }
}
