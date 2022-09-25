package com.google.android.apps.gsa.nga.engine.p6044n.p6049c.p6050a;

import com.google.android.apps.gsa.nga.engine.am.m.b.d;
import com.google.android.apps.gsa.nga.engine.am.m.b.t;
import com.google.android.apps.gsa.nga.engine.p6044n.p6049c.C76288a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80317bl;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80319bn;
import com.google.android.apps.gsa.nga.shared.p6350k.C81338a;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1493b.C18029ck;
import com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18100a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5072a.p5073a.p5074a.p5075a.C65475b;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.c.a.ar */
/* compiled from: PG */
public final class C76307ar implements C76288a {

    /* renamed from: a */
    public static final C58974d f211353a = C58974d.m91136j();

    /* renamed from: b */
    private final t f211354b;

    public C76307ar(t tVar) {
        this.f211354b = tVar;
    }

    /* renamed from: c */
    private static C18100a m122911c(C80317bl blVar) {
        return C18100a.m35256b(new C76306aq(blVar), blVar);
    }

    /* renamed from: a */
    public final C60870cx mo72159a(C80295aq aqVar, C65475b bVar) {
        C80319bn bnVar;
        C60870cx cxVar;
        if (aqVar.f220359a == 21) {
            bnVar = (C80319bn) aqVar.f220360b;
        } else {
            bnVar = C80319bn.f220407d;
        }
        C80317bl blVar = bnVar.f220410b;
        if (blVar == null) {
            blVar = C80317bl.f220400f;
        }
        C18100a c = m122911c(blVar);
        C80317bl blVar2 = bnVar.f220411c;
        if (blVar2 == null) {
            blVar2 = C80317bl.f220400f;
        }
        C18029ck ckVar = new C18029ck(m122911c(blVar2), bnVar.f220409a, c, "TELEPORT");
        t tVar = this.f211354b;
        C83320io ioVar = bVar.f177980a;
        if (ioVar == null) {
            ioVar = C83320io.f227132d;
        }
        synchronized (tVar.f) {
            C60870cx cxVar2 = tVar.g;
            if (cxVar2 == null) {
                cxVar = C60856cj.m92899h(C81338a.m129378a(5));
            } else {
                cxVar = tVar.e.mo28210j(cxVar2, "[NGA] DynamicActionSender: waiting for list of dynamic actions (for execution)", new d(tVar, ckVar, ioVar));
            }
        }
        return C118826c.m197213c(cxVar);
    }

    /* renamed from: b */
    public final int mo72160b() {
        return 60021;
    }
}
