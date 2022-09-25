package com.google.android.apps.gsa.nga.engine.warmactions.p6258j;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.engine.am.y.c;
import com.google.android.apps.gsa.nga.engine.av.bh;
import com.google.android.apps.gsa.nga.engine.b.c.j;
import com.google.android.apps.gsa.nga.engine.p5913am.p5944y.C74977b;
import com.google.android.apps.gsa.nga.engine.p5913am.p5944y.C74978d;
import com.google.android.apps.gsa.nga.engine.p5964av.C75076bk;
import com.google.android.apps.gsa.nga.engine.p5964av.C75078bp;
import com.google.android.apps.gsa.nga.engine.p5964av.C75162p;
import com.google.android.apps.gsa.nga.engine.p5964av.C75163x;
import com.google.android.apps.gsa.nga.engine.recognition.C77889u;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6278c.C80150a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6278c.C80151b;
import com.google.android.apps.gsa.nga.shared.p6312ai.p6313a.C80633a;
import com.google.android.apps.gsa.nga.shared.p6312ai.p6313a.C80638b;
import com.google.android.apps.gsa.nga.shared.p6312ai.p6313a.C80642f;
import com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81047e;
import com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81048f;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.j.ac */
/* compiled from: PG */
public final class C79647ac extends C79646ab {

    /* renamed from: a */
    private static final e f218467a = e.be;

    /* renamed from: b */
    private static final C77889u f218468b = C77889u.SODA;

    /* renamed from: c */
    private final C80642f f218469c;

    public C79647ac(C80642f fVar) {
        this.f218469c = fVar;
    }

    /* renamed from: a */
    public final bh mo74178a(C79690bs bsVar) {
        C75162p g = C75076bk.m121347g();
        j a = bsVar.mo74193a();
        if (a != null) {
            C75162p pVar = g;
            pVar.f209594a = a;
            g.d(f218468b);
            g.c(f218467a);
            C74977b a2 = c.a();
            C74978d dVar = C75163x.f209600a;
            C80642f fVar = this.f218469c;
            C80633a aVar = (C80633a) C80638b.f221379o.createBuilder();
            C81047e eVar = (C81047e) C81048f.f222138d.createBuilder();
            C80150a aVar2 = (C80150a) C80151b.f219941c.createBuilder();
            aVar2.copyOnWrite();
            C80151b bVar = (C80151b) aVar2.instance;
            bVar.f219943a |= 1;
            bVar.f219944b = true;
            eVar.copyOnWrite();
            C80151b bVar2 = (C80151b) aVar2.build();
            bVar2.getClass();
            ((C81048f) eVar.instance).f222142c = bVar2;
            aVar.copyOnWrite();
            C80638b bVar3 = (C80638b) aVar.instance;
            C81048f fVar2 = (C81048f) eVar.build();
            fVar2.getClass();
            bVar3.f221384d = fVar2;
            bVar3.f221381a |= 4;
            a2.f209200a.d(dVar, fVar.mo74375a((C80638b) aVar.build()));
            a2.f209200a.d(C75078bp.f209367f, bsVar.mo74196d());
            pVar.f209595b = a2.mo71360a();
            return g;
        }
        throw new NullPointerException("Null candidateIdentifier");
    }
}
