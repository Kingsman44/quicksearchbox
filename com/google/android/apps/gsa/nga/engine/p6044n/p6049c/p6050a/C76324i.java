package com.google.android.apps.gsa.nga.engine.p6044n.p6049c.p6050a;

import com.google.android.apps.gsa.nga.engine.p6044n.p6049c.C76288a;
import com.google.android.apps.gsa.nga.engine.p6044n.p6054f.C76455a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80289ak;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5072a.p5073a.p5074a.p5075a.C65475b;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65768az;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.c.a.i */
/* compiled from: PG */
public final class C76324i implements C76288a {

    /* renamed from: a */
    private final C76455a f211394a;

    public C76324i(C76455a aVar) {
        this.f211394a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo72159a(C80295aq aqVar, C65475b bVar) {
        C80289ak akVar;
        if (aqVar.f220359a == 2) {
            akVar = (C80289ak) aqVar.f220360b;
        } else {
            akVar = C80289ak.f220317d;
        }
        int i = akVar.f220319a;
        if ((i & 1) == 0 || (i & 2) == 0) {
            return C60856cj.m92898g();
        }
        C76455a aVar = this.f211394a;
        C65753ak b = C65753ak.m96797b(akVar.f220320b);
        if (b == null) {
            b = C65753ak.UNKNOWN;
        }
        C65768az azVar = akVar.f220321c;
        if (azVar == null) {
            azVar = C65768az.f178793f;
        }
        return aVar.mo72195f(b, azVar, false);
    }

    /* renamed from: b */
    public final int mo72160b() {
        return 60004;
    }
}
