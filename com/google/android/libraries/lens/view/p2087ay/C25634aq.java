package com.google.android.libraries.lens.view.p2087ay;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.lens.view.p2056af.C25050av;
import com.google.android.libraries.lens.view.p2113h.p2114a.C26640a;
import com.google.android.libraries.lens.view.p2113h.p2114a.C26645f;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.aar;
import com.google.common.p4552o.aas;
import com.google.common.p4552o.aav;
import com.google.common.p4552o.aaw;
import com.google.common.p4552o.aax;
import com.google.common.p4552o.aay;

/* renamed from: com.google.android.libraries.lens.view.ay.aq */
/* compiled from: PG */
public final /* synthetic */ class C25634aq implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C25637at f69733a;

    public /* synthetic */ C25634aq(C25637at atVar) {
        this.f69733a = atVar;
    }

    public final void run() {
        C25637at atVar = this.f69733a;
        C25618aa aaVar = atVar.f69743e;
        atVar.f69743e = null;
        if (aaVar != null) {
            C25050av avVar = atVar.f69741c;
            C26645f d = aaVar.f69690h.mo31934d();
            C26645f d2 = aaVar.f69691i.mo31934d();
            ((C58970a) ((C58970a) C25618aa.f69683a.mo56224b()).mo56372aa(50233)).mo56354G("***** reportMergeLatencyStats: (%s) (%s)", d, d2);
            C26640a aVar = (C26640a) d;
            if (aVar.f72648c != 0) {
                C26640a aVar2 = (C26640a) d2;
                if (aVar2.f72648c != 0) {
                    aar aar = (aar) aas.f158145p.createBuilder();
                    aav aav = (aav) aaw.f158164d.createBuilder();
                    aax aax = (aax) aay.f158169d.createBuilder();
                    float f = aVar.f72646a;
                    aax.copyOnWrite();
                    aay aay = (aay) aax.instance;
                    aay.f158171a |= 1;
                    aay.f158172b = (long) (f * 1000.0f);
                    float f2 = aVar.f72647b;
                    aax.copyOnWrite();
                    aay aay2 = (aay) aax.instance;
                    aay2.f158171a |= 2;
                    aay2.f158173c = (long) (f2 * 1000.0f);
                    aay aay3 = (aay) aax.build();
                    aav.copyOnWrite();
                    aaw aaw = (aaw) aav.instance;
                    aay3.getClass();
                    aaw.f158167b = aay3;
                    aaw.f158166a |= 1;
                    aax aax2 = (aax) aay.f158169d.createBuilder();
                    float f3 = aVar2.f72646a;
                    aax2.copyOnWrite();
                    aay aay4 = (aay) aax2.instance;
                    aay4.f158171a |= 1;
                    aay4.f158172b = (long) (f3 * 1000.0f);
                    float f4 = aVar2.f72647b;
                    aax2.copyOnWrite();
                    aay aay5 = (aay) aax2.instance;
                    aay5.f158171a |= 2;
                    aay5.f158173c = (long) (f4 * 1000.0f);
                    aay aay6 = (aay) aax2.build();
                    aav.copyOnWrite();
                    aaw aaw2 = (aaw) aav.instance;
                    aay6.getClass();
                    aaw2.f158168c = aay6;
                    aaw2.f158166a |= 2;
                    aar.copyOnWrite();
                    aas aas = (aas) aar.instance;
                    aaw aaw3 = (aaw) aav.build();
                    aaw3.getClass();
                    aas.f158158l = aaw3;
                    aas.f158147a |= C89885b.S3REQUEST_VALUE;
                    aas aas2 = (aas) aar.build();
                    C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                    tzVar.copyOnWrite();
                    C60555uf ufVar = (C60555uf) tzVar.instance;
                    ufVar.f164093a |= 2;
                    ufVar.f164258m = 1438;
                    tzVar.copyOnWrite();
                    C60555uf ufVar2 = (C60555uf) tzVar.instance;
                    aas2.getClass();
                    ufVar2.f164197by = aas2;
                    ufVar2.f164253h |= 8;
                    avVar.mo30241a((C60555uf) tzVar.build());
                }
            }
        }
        if (atVar.f69744f != null) {
            C25663x xVar = atVar.f69744f;
            C58974d dVar = C25664y.f69785a;
            C25646g gVar = xVar.f69784a.f69796l;
            if (gVar.f69764a.mo56113h()) {
                ((C25644e) gVar.f69764a.mo56107c()).mo30764a();
            }
            if (gVar.f69765b.mo56113h()) {
                ((C25648i) gVar.f69765b.mo56107c()).f69766a.clear();
            }
            C25664y yVar = xVar.f69784a;
            if (yVar.f69799o) {
                yVar.f69787c = 0;
            }
        }
    }
}
