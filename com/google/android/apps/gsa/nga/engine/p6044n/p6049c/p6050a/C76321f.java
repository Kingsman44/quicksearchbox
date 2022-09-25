package com.google.android.apps.gsa.nga.engine.p6044n.p6049c.p6050a;

import com.google.android.apps.gsa.nga.engine.p6044n.p6049c.C76288a;
import com.google.android.apps.gsa.nga.engine.p6044n.p6054f.C76455a;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80472k;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80526w;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80527x;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80285ag;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6284f.C80406b;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5072a.p5073a.p5074a.p5075a.C65475b;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.c.a.f */
/* compiled from: PG */
public final class C76321f implements C76288a {

    /* renamed from: a */
    private final C76455a f211392a;

    public C76321f(C76455a aVar) {
        this.f211392a = aVar;
    }

    /* renamed from: b */
    public final int mo72160b() {
        return 60019;
    }

    /* renamed from: a */
    public final C60870cx mo72159a(C80295aq aqVar, C65475b bVar) {
        C80285ag agVar;
        if (aqVar.f220359a != 18) {
            return C60856cj.m92899h(new Exception("GellerDeleteOp is not set."));
        }
        C76455a aVar = this.f211392a;
        C80472k kVar = (C80472k) C80136bn.f219915c.createBuilder();
        C80526w wVar = (C80526w) C80527x.f221059c.createBuilder();
        if (aqVar.f220359a == 18) {
            agVar = (C80285ag) aqVar.f220360b;
        } else {
            agVar = C80285ag.f220305b;
        }
        C80406b bVar2 = agVar.f220307a;
        if (bVar2 == null) {
            bVar2 = C80406b.f220674f;
        }
        wVar.copyOnWrite();
        C80527x xVar = (C80527x) wVar.instance;
        bVar2.getClass();
        xVar.f221062b = bVar2;
        xVar.f221061a |= 1;
        kVar.copyOnWrite();
        C80136bn bnVar = (C80136bn) kVar.instance;
        C80527x xVar2 = (C80527x) wVar.build();
        xVar2.getClass();
        bnVar.f219918b = xVar2;
        bnVar.f219917a = 11;
        return C118826c.m197213c(aVar.mo72193d((C80136bn) kVar.build(), Optional.empty()));
    }
}
