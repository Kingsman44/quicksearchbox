package com.google.android.apps.gsa.nga.engine.p6044n.p6049c.p6050a;

import com.google.android.apps.gsa.nga.engine.am.ah;
import com.google.android.apps.gsa.nga.engine.am.an;
import com.google.android.apps.gsa.nga.engine.p6044n.p6049c.C76288a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80283ae;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5072a.p5073a.p5074a.p5075a.C65475b;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.c.a.d */
/* compiled from: PG */
public final class C76319d implements C76288a {

    /* renamed from: a */
    private final an f211391a;

    public C76319d(an anVar) {
        this.f211391a = anVar;
    }

    /* renamed from: a */
    public final C60870cx mo72159a(C80295aq aqVar, C65475b bVar) {
        C80283ae aeVar;
        an anVar = this.f211391a;
        if (aqVar.f220359a == 20) {
            aeVar = (C80283ae) aqVar.f220360b;
        } else {
            aeVar = C80283ae.f220302b;
        }
        return anVar.d.mo28201a("[NGA] TorchManager.setEnabled", new ah(anVar, aeVar.f220304a));
    }

    /* renamed from: b */
    public final int mo72160b() {
        return 60020;
    }
}
