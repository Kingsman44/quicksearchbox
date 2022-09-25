package com.google.android.apps.gsa.nga.engine.p6044n.p6049c.p6050a;

import com.google.android.apps.gsa.nga.engine.am.l.a.i;
import com.google.android.apps.gsa.nga.engine.am.l.c.r;
import com.google.android.apps.gsa.nga.engine.p6044n.p6049c.C76288a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80317bl;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18100a;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5072a.p5073a.p5074a.p5075a.C65475b;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.c.a.ap */
/* compiled from: PG */
public final class C76305ap implements C76288a {

    /* renamed from: a */
    private final r f211351a;

    public C76305ap(r rVar) {
        this.f211351a = rVar;
    }

    /* renamed from: a */
    public final C60870cx mo72159a(C80295aq aqVar, C65475b bVar) {
        C80317bl blVar;
        if (aqVar.f220359a == 10) {
            blVar = (C80317bl) aqVar.f220360b;
        } else {
            blVar = C80317bl.f220400f;
        }
        C18100a b = C18100a.m35256b(new i(blVar), blVar);
        r rVar = this.f211351a;
        C83320io ioVar = bVar.f177980a;
        if (ioVar == null) {
            ioVar = C83320io.f227132d;
        }
        return C118826c.m197213c(rVar.f(b, ioVar));
    }

    /* renamed from: b */
    public final int mo72160b() {
        return 60016;
    }
}
