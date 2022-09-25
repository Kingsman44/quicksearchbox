package com.google.android.apps.gsa.staticplugins.opa.util;

import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81570m;
import com.google.android.apps.gsa.nga.shared.p6407v.C83278h;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.apps.gsa.sidekick.shared.p7253n.C91876a;
import com.google.assistant.p3745ab.p3771w.C48414a;
import com.google.assistant.p3745ab.p3771w.C48420g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.ahi;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.cr */
/* compiled from: PG */
public final class C113863cr {

    /* renamed from: a */
    public long f315277a = C90719ac.f253778a.f253779b.nextLong();

    /* renamed from: b */
    private final C58833ax f315278b;

    /* renamed from: c */
    private final C58833ax f315279c;

    /* renamed from: d */
    private final C58833ax f315280d;

    public C113863cr(C58833ax axVar, C58833ax axVar2, C58833ax axVar3) {
        this.f315279c = axVar2;
        this.f315278b = axVar;
        this.f315280d = axVar3;
    }

    /* renamed from: c */
    private final C60555uf m188492c(C60555uf ufVar) {
        C60548tz tzVar;
        ahi ahi = (ahi) this.f315278b.mo56106b(C113862cq.f315276a).mo56109e(ahi.NON_ELIGIBLE_NGA_DISABLED);
        if (ufVar == null) {
            tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            ufVar2.f164093a |= 2;
            ufVar2.f164258m = 472;
        } else {
            tzVar = (C60548tz) ufVar.toBuilder();
        }
        Optional a = ((C81570m) ((C58847bk) this.f315279c).f156646a).mo75183a();
        if (a.isPresent()) {
            C58976aa aaVar = C58975e.f156826a;
            a.get();
            long longValue = ((Long) a.get()).longValue();
            tzVar.copyOnWrite();
            C60555uf ufVar3 = (C60555uf) tzVar.instance;
            ufVar3.f164256k |= 2;
            ufVar3.f164210cK = longValue;
        }
        tzVar.copyOnWrite();
        C60555uf ufVar4 = (C60555uf) tzVar.instance;
        ufVar4.f164236cn = ahi.f158764y;
        ufVar4.f164255j |= 16;
        if (this.f315280d.mo56113h()) {
            C48420g b = ((C83278h) this.f315280d.mo56107c()).mo75573b();
            tzVar.copyOnWrite();
            C60555uf ufVar5 = (C60555uf) tzVar.instance;
            b.getClass();
            ufVar5.f164237co = b;
            ufVar5.f164255j |= 32;
        } else {
            C48414a aVar = (C48414a) C48420g.f125128f.createBuilder();
            aVar.copyOnWrite();
            C48420g gVar = (C48420g) aVar.instance;
            gVar.f125131b = ahi.f158764y;
            gVar.f125130a |= 1;
            tzVar.copyOnWrite();
            C60555uf ufVar6 = (C60555uf) tzVar.instance;
            C48420g gVar2 = (C48420g) aVar.build();
            gVar2.getClass();
            ufVar6.f164237co = gVar2;
            ufVar6.f164255j |= 32;
        }
        return (C60555uf) tzVar.build();
    }

    /* renamed from: a */
    public final void mo100721a(long j, long j2, C60321oe oeVar) {
        if (oeVar != null) {
            C58976aa aaVar = C58975e.f156826a;
            C91876a.m150548b(j2, j, this.f315277a, m188492c((C60555uf) null), oeVar);
        }
    }

    /* renamed from: b */
    public final void mo100722b(long j, long j2, C60555uf ufVar, C60321oe oeVar) {
        if (oeVar != null) {
            C58976aa aaVar = C58975e.f156826a;
            C91876a.m150548b(j2, j, this.f315277a, m188492c(ufVar), oeVar);
        }
    }
}
