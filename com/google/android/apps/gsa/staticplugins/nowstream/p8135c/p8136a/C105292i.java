package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import com.google.android.apps.gsa.shared.p7020bd.C89408a;
import com.google.android.apps.p489g.p494d.C9250ee;
import com.google.android.apps.p489g.p494d.C9251ef;
import com.google.android.apps.p489g.p494d.C9268l;
import com.google.android.libraries.gsa.monet.shared.p1895e.C23109a;
import com.google.common.base.C58832aw;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62974ct;
import p5451f.p5452a.p5453a.p5454a.C69396ar;
import p5451f.p5452a.p5453a.p5454a.C69400av;
import p5451f.p5452a.p5453a.p5454a.C69421bp;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.i */
/* compiled from: PG */
public final /* synthetic */ class C105292i implements C23109a {

    /* renamed from: a */
    public final /* synthetic */ int f293777a;

    /* renamed from: b */
    public final /* synthetic */ C9268l f293778b;

    public /* synthetic */ C105292i(int i, C9268l lVar) {
        this.f293777a = i;
        this.f293778b = lVar;
    }

    /* renamed from: a */
    public final void mo28347a(Object obj) {
        C69400av avVar;
        int i = this.f293777a;
        C9268l lVar = this.f293778b;
        C105287ea eaVar = (C105287ea) obj;
        if (C58832aw.m90831a(eaVar.f293761b.mo94659d().f63720e, C9251ef.f31988f)) {
            C69396ar arVar = C69396ar.f185678d;
            try {
                C69396ar c = eaVar.f293762c.mo83327c(i);
                if (c.f185680a == 3) {
                    C9250ee eeVar = (C9250ee) C9251ef.f31988f.createBuilder();
                    eeVar.copyOnWrite();
                    C9251ef efVar = (C9251ef) eeVar.instance;
                    efVar.f31990a |= 1;
                    efVar.f31991b = i;
                    if (c.f185680a == 3) {
                        avVar = (C69400av) c.f185681b;
                    } else {
                        avVar = C69400av.f185693h;
                    }
                    eeVar.copyOnWrite();
                    C9251ef efVar2 = (C9251ef) eeVar.instance;
                    avVar.getClass();
                    efVar2.f31992c = avVar;
                    efVar2.f31990a |= 2;
                    eeVar.copyOnWrite();
                    C9251ef efVar3 = (C9251ef) eeVar.instance;
                    lVar.getClass();
                    efVar3.f31993d = lVar;
                    efVar3.f31990a |= 4;
                    C69421bp bpVar = c.f185682c;
                    if (bpVar == null) {
                        bpVar = C69421bp.f185742q;
                    }
                    boolean z = bpVar.f185749f;
                    eeVar.copyOnWrite();
                    C9251ef efVar4 = (C9251ef) eeVar.instance;
                    efVar4.f31990a |= 8;
                    efVar4.f31994e = z;
                    C9251ef efVar5 = (C9251ef) eeVar.build();
                    if (!C105287ea.m174879k(efVar5)) {
                        return;
                    }
                    if (eaVar.f293765f) {
                        eaVar.f293764e.add(efVar5);
                    } else {
                        eaVar.mo94706i(efVar5);
                    }
                } else {
                    ((C59052c) ((C59052c) C105287ea.f293760a.mo56225c()).mo56372aa(22291)).mo56386p("Mismatched TipType.");
                }
            } catch (C89408a | C62974ct e) {
                ((C59052c) ((C59052c) ((C59052c) C105287ea.f293760a.mo56225c()).mo56382g(e)).mo56372aa(22292)).mo56386p("Error fetching FeatureTip.");
            }
        }
    }
}
