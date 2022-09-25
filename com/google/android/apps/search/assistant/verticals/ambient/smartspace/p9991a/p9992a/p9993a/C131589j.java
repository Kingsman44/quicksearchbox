package com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9991a.p9992a.p9993a;

import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.apps.p471d.p472a.p473a.p475b.p476a.C9027a;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9991a.p9992a.C131595b;
import com.google.assistant.p3886c.C50753br;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50802cz;
import com.google.assistant.p3886c.C50813dj;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.C50844p;
import com.google.assistant.p3886c.p3888b.C50716a;
import com.google.assistant.p3886c.p3888b.C50723h;
import com.google.assistant.p3886c.p3888b.C50728m;
import com.google.assistant.p3886c.p3888b.C50729n;
import com.google.assistant.p3886c.p3888b.C50733r;
import com.google.assistant.p3886c.p3889c.C50763a;
import com.google.assistant.p3886c.p3889c.C50764b;
import com.google.assistant.p3886c.p3889c.C50765c;
import com.google.assistant.p3886c.p3889c.C50767e;
import com.google.assistant.p3886c.p3889c.C50769g;
import com.google.assistant.p3886c.p3889c.C50770h;
import com.google.assistant.p3886c.p3889c.C50775m;
import com.google.assistant.p3886c.p3889c.C50776n;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.a.a.a.j */
/* compiled from: PG */
public final class C131589j implements C131595b {

    /* renamed from: a */
    private final C58974d f359538a;

    /* renamed from: b */
    private final C50818do f359539b;

    public C131589j(C50818do doVar, C130603a aVar) {
        this.f359539b = doVar;
        this.f359538a = aVar.mo109739a("FlightTempParser");
    }

    /* renamed from: a */
    public final C50818do mo110198a() {
        Object obj;
        C50813dj djVar = this.f359539b.f132329z;
        if (djVar == null) {
            djVar = C50813dj.f132278a;
        }
        C62940bt r1 = C62942bv.checkIsLite(C50753br.f132074d);
        djVar.mo58887l(r1);
        Object l = djVar.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj = r1.f169969b;
        } else {
            obj = r1.mo58889c(l);
        }
        C50844p pVar = ((C50753br) obj).f132077b;
        if (pVar == null) {
            pVar = C50844p.f132387m;
        }
        C50775m mVar = (C50775m) C50776n.f132135c.createBuilder();
        C50716a aVar = (C50716a) C50723h.f131999e.createBuilder();
        String str = pVar.f132390b;
        aVar.copyOnWrite();
        C50723h hVar = (C50723h) aVar.instance;
        str.getClass();
        hVar.f132001a |= 1;
        hVar.f132002b = str;
        mVar.mo53455a(aVar);
        C50716a aVar2 = (C50716a) C50723h.f131999e.createBuilder();
        String str2 = pVar.f132391c;
        aVar2.copyOnWrite();
        C50723h hVar2 = (C50723h) aVar2.instance;
        str2.getClass();
        hVar2.f132001a |= 1;
        hVar2.f132002b = str2;
        mVar.mo53455a(aVar2);
        C50728m mVar2 = (C50728m) C50729n.f132007g.createBuilder();
        C63088z zVar = pVar.f132392d;
        mVar2.copyOnWrite();
        C50729n nVar = (C50729n) mVar2.instance;
        zVar.getClass();
        nVar.f132009a |= 16;
        nVar.f132013e = zVar;
        mVar.copyOnWrite();
        C50776n nVar2 = (C50776n) mVar.instance;
        C50729n nVar3 = (C50729n) mVar2.build();
        nVar3.getClass();
        C62971cq cqVar = nVar2.f132139b;
        if (!cqVar.mo58948c()) {
            nVar2.f132139b = C62942bv.mutableCopy(cqVar);
        }
        nVar2.f132139b.add(nVar3);
        C50776n nVar4 = (C50776n) mVar.build();
        C50764b bVar = (C50764b) C50765c.f132101g.createBuilder();
        C50733r rVar = this.f359539b.f132316m;
        if (rVar == null) {
            rVar = C50733r.f132021d;
        }
        bVar.copyOnWrite();
        C50765c cVar = (C50765c) bVar.instance;
        rVar.getClass();
        cVar.f132106d = rVar;
        cVar.f132103a |= 4;
        C50767e a = C131593n.m214002a(this.f359539b.f132307d, C9027a.FLIGHT);
        bVar.copyOnWrite();
        C50765c cVar2 = (C50765c) bVar.instance;
        a.getClass();
        cVar2.f132107e = a;
        cVar2.f132103a |= 8;
        C50765c cVar3 = (C50765c) bVar.build();
        C50764b bVar2 = (C50764b) C50765c.f132101g.createBuilder();
        C50729n nVar5 = this.f359539b.f132314k;
        if (nVar5 == null) {
            nVar5 = C50729n.f132007g;
        }
        bVar2.copyOnWrite();
        C50765c cVar4 = (C50765c) bVar2.instance;
        nVar5.getClass();
        cVar4.f132105c = nVar5;
        cVar4.f132103a |= 2;
        C50765c cVar5 = (C50765c) bVar2.build();
        C50763a aVar3 = (C50763a) C50770h.f132124g.createBuilder();
        C50769g gVar = C50769g.SUB_IMAGE;
        aVar3.copyOnWrite();
        C50770h hVar3 = (C50770h) aVar3.instance;
        hVar3.f132127b = gVar.f132123h;
        hVar3.f132126a |= 1;
        C50764b bVar3 = (C50764b) cVar3.toBuilder();
        C50802cz czVar = this.f359539b.f132309f;
        if (czVar == null) {
            czVar = C50802cz.f132236g;
        }
        C50723h hVar4 = czVar.f132239b;
        if (hVar4 == null) {
            hVar4 = C50723h.f131999e;
        }
        bVar3.copyOnWrite();
        C50765c cVar6 = (C50765c) bVar3.instance;
        hVar4.getClass();
        cVar6.f132104b = hVar4;
        cVar6.f132103a |= 1;
        aVar3.copyOnWrite();
        C50770h hVar5 = (C50770h) aVar3.instance;
        C50765c cVar7 = (C50765c) bVar3.build();
        cVar7.getClass();
        hVar5.f132128c = cVar7;
        hVar5.f132126a |= 2;
        C50764b bVar4 = (C50764b) cVar5.toBuilder();
        C50802cz czVar2 = this.f359539b.f132309f;
        if (czVar2 == null) {
            czVar2 = C50802cz.f132236g;
        }
        C50723h hVar6 = czVar2.f132241d;
        if (hVar6 == null) {
            hVar6 = C50723h.f131999e;
        }
        bVar4.copyOnWrite();
        C50765c cVar8 = (C50765c) bVar4.instance;
        hVar6.getClass();
        cVar8.f132104b = hVar6;
        cVar8.f132103a |= 1;
        aVar3.copyOnWrite();
        C50770h hVar7 = (C50770h) aVar3.instance;
        C50765c cVar9 = (C50765c) bVar4.build();
        cVar9.getClass();
        hVar7.f132129d = cVar9;
        hVar7.f132126a |= 4;
        aVar3.mo58885m(C50776n.f132136d, nVar4);
        C50770h hVar8 = (C50770h) aVar3.build();
        C50763a aVar4 = (C50763a) C50770h.f132124g.createBuilder();
        C50769g gVar2 = C50769g.SUB_IMAGE;
        aVar4.copyOnWrite();
        C50770h hVar9 = (C50770h) aVar4.instance;
        hVar9.f132127b = gVar2.f132123h;
        hVar9.f132126a |= 1;
        C50764b bVar5 = (C50764b) cVar3.toBuilder();
        C50802cz czVar3 = this.f359539b.f132308e;
        if (czVar3 == null) {
            czVar3 = C50802cz.f132236g;
        }
        C50723h hVar10 = czVar3.f132239b;
        if (hVar10 == null) {
            hVar10 = C50723h.f131999e;
        }
        bVar5.copyOnWrite();
        C50765c cVar10 = (C50765c) bVar5.instance;
        hVar10.getClass();
        cVar10.f132104b = hVar10;
        cVar10.f132103a |= 1;
        aVar4.copyOnWrite();
        C50770h hVar11 = (C50770h) aVar4.instance;
        C50765c cVar11 = (C50765c) bVar5.build();
        cVar11.getClass();
        hVar11.f132128c = cVar11;
        hVar11.f132126a |= 2;
        C50764b bVar6 = (C50764b) cVar5.toBuilder();
        C50802cz czVar4 = this.f359539b.f132308e;
        if (czVar4 == null) {
            czVar4 = C50802cz.f132236g;
        }
        C50723h hVar12 = czVar4.f132241d;
        if (hVar12 == null) {
            hVar12 = C50723h.f131999e;
        }
        bVar6.copyOnWrite();
        C50765c cVar12 = (C50765c) bVar6.instance;
        hVar12.getClass();
        cVar12.f132104b = hVar12;
        cVar12.f132103a |= 1;
        aVar4.copyOnWrite();
        C50770h hVar13 = (C50770h) aVar4.instance;
        C50765c cVar13 = (C50765c) bVar6.build();
        cVar13.getClass();
        hVar13.f132129d = cVar13;
        hVar13.f132126a |= 4;
        aVar4.mo58885m(C50776n.f132136d, nVar4);
        C50770h hVar14 = (C50770h) aVar4.build();
        C50763a aVar5 = (C50763a) C50770h.f132124g.createBuilder();
        C50769g gVar3 = C50769g.SUB_IMAGE;
        aVar5.copyOnWrite();
        C50770h hVar15 = (C50770h) aVar5.instance;
        hVar15.f132127b = gVar3.f132123h;
        hVar15.f132126a |= 1;
        C50764b bVar7 = (C50764b) cVar3.toBuilder();
        C50802cz czVar5 = this.f359539b.f132311h;
        if (czVar5 == null) {
            czVar5 = C50802cz.f132236g;
        }
        C50723h hVar16 = czVar5.f132239b;
        if (hVar16 == null) {
            hVar16 = C50723h.f131999e;
        }
        bVar7.copyOnWrite();
        C50765c cVar14 = (C50765c) bVar7.instance;
        hVar16.getClass();
        cVar14.f132104b = hVar16;
        cVar14.f132103a |= 1;
        aVar5.copyOnWrite();
        C50770h hVar17 = (C50770h) aVar5.instance;
        C50765c cVar15 = (C50765c) bVar7.build();
        cVar15.getClass();
        hVar17.f132128c = cVar15;
        hVar17.f132126a |= 2;
        C50764b bVar8 = (C50764b) cVar5.toBuilder();
        C50802cz czVar6 = this.f359539b.f132311h;
        if (czVar6 == null) {
            czVar6 = C50802cz.f132236g;
        }
        C50723h hVar18 = czVar6.f132241d;
        if (hVar18 == null) {
            hVar18 = C50723h.f131999e;
        }
        bVar8.copyOnWrite();
        C50765c cVar16 = (C50765c) bVar8.instance;
        hVar18.getClass();
        cVar16.f132104b = hVar18;
        cVar16.f132103a |= 1;
        aVar5.copyOnWrite();
        C50770h hVar19 = (C50770h) aVar5.instance;
        C50765c cVar17 = (C50765c) bVar8.build();
        cVar17.getClass();
        hVar19.f132129d = cVar17;
        hVar19.f132126a |= 4;
        aVar5.mo58885m(C50776n.f132136d, nVar4);
        C50770h hVar20 = (C50770h) aVar5.build();
        ((C58970a) ((C58970a) this.f359538a.mo56224b()).mo56372aa(39103)).mo56387q("#getParsedCard: flight card, cardId: %s", this.f359539b.f132307d);
        C50790cn cnVar = (C50790cn) this.f359539b.toBuilder();
        cnVar.copyOnWrite();
        C50818do doVar = (C50818do) cnVar.instance;
        hVar8.getClass();
        doVar.f132299E = hVar8;
        doVar.f132304a |= 1073741824;
        cnVar.copyOnWrite();
        C50818do doVar2 = (C50818do) cnVar.instance;
        hVar14.getClass();
        doVar2.f132298D = hVar14;
        doVar2.f132304a |= 536870912;
        cnVar.copyOnWrite();
        C50818do doVar3 = (C50818do) cnVar.instance;
        hVar20.getClass();
        doVar3.f132300F = hVar20;
        doVar3.f132304a |= LinearLayoutManager.INVALID_OFFSET;
        cnVar.copyOnWrite();
        C50818do doVar4 = (C50818do) cnVar.instance;
        doVar4.f132314k = null;
        doVar4.f132304a &= -513;
        cnVar.copyOnWrite();
        C50818do doVar5 = (C50818do) cnVar.instance;
        doVar5.f132309f = null;
        doVar5.f132304a &= -17;
        cnVar.copyOnWrite();
        C50818do doVar6 = (C50818do) cnVar.instance;
        doVar6.f132308e = null;
        doVar6.f132304a &= -9;
        cnVar.copyOnWrite();
        C50818do doVar7 = (C50818do) cnVar.instance;
        doVar7.f132311h = null;
        doVar7.f132304a &= -65;
        cnVar.copyOnWrite();
        C50818do doVar8 = (C50818do) cnVar.instance;
        doVar8.f132316m = null;
        doVar8.f132304a &= -2049;
        return (C50818do) cnVar.build();
    }
}
