package com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9991a.p9992a.p9993a;

import com.google.android.apps.p471d.p472a.p473a.p475b.p476a.C9027a;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9991a.p9992a.C131595b;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50802cz;
import com.google.assistant.p3886c.C50818do;
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
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.a.a.a.a */
/* compiled from: PG */
public final class C131580a implements C131595b {

    /* renamed from: a */
    private final C58974d f359482a;

    /* renamed from: b */
    private final C50818do f359483b;

    public C131580a(C50818do doVar, C130603a aVar) {
        this.f359483b = doVar;
        this.f359482a = aVar.mo109739a("AirQualityTempParser");
    }

    /* renamed from: a */
    public final C50818do mo110198a() {
        if (this.f359483b.equals(C50818do.f132293H)) {
            return this.f359483b;
        }
        C50790cn cnVar = (C50790cn) this.f359483b.toBuilder();
        C50802cz czVar = this.f359483b.f132309f;
        if (czVar == null) {
            czVar = C50802cz.f132236g;
        }
        if ((this.f359483b.f132304a & 16) != 0 && !czVar.equals(C50802cz.f132236g)) {
            C50763a aVar = (C50763a) C50770h.f132124g.createBuilder();
            C50769g gVar = C50769g.DEFAULT;
            aVar.copyOnWrite();
            C50770h hVar = (C50770h) aVar.instance;
            hVar.f132127b = gVar.f132123h;
            hVar.f132126a |= 1;
            C50764b bVar = (C50764b) C50765c.f132101g.createBuilder();
            C50723h hVar2 = czVar.f132239b;
            if (hVar2 == null) {
                hVar2 = C50723h.f131999e;
            }
            bVar.copyOnWrite();
            C50765c cVar = (C50765c) bVar.instance;
            hVar2.getClass();
            cVar.f132104b = hVar2;
            cVar.f132103a |= 1;
            C50729n nVar = this.f359483b.f132314k;
            if (nVar == null) {
                nVar = C50729n.f132007g;
            }
            if (!nVar.equals(C50729n.f132007g)) {
                C50728m mVar = (C50728m) nVar.toBuilder();
                mVar.copyOnWrite();
                C50729n nVar2 = (C50729n) mVar.instance;
                nVar2.f132009a |= 32;
                nVar2.f132014f = false;
                nVar = (C50729n) mVar.build();
            }
            bVar.copyOnWrite();
            C50765c cVar2 = (C50765c) bVar.instance;
            nVar.getClass();
            cVar2.f132105c = nVar;
            cVar2.f132103a |= 2;
            C50733r rVar = this.f359483b.f132316m;
            if (rVar == null) {
                rVar = C50733r.f132021d;
            }
            bVar.copyOnWrite();
            C50765c cVar3 = (C50765c) bVar.instance;
            rVar.getClass();
            cVar3.f132106d = rVar;
            cVar3.f132103a |= 4;
            C50767e a = C131593n.m214002a(this.f359483b.f132307d, C9027a.AIR_QUALITY);
            bVar.copyOnWrite();
            C50765c cVar4 = (C50765c) bVar.instance;
            a.getClass();
            cVar4.f132107e = a;
            cVar4.f132103a |= 8;
            aVar.copyOnWrite();
            C50770h hVar3 = (C50770h) aVar.instance;
            C50765c cVar5 = (C50765c) bVar.build();
            cVar5.getClass();
            hVar3.f132129d = cVar5;
            hVar3.f132126a |= 4;
            cnVar.copyOnWrite();
            C50818do doVar = (C50818do) cnVar.instance;
            C50770h hVar4 = (C50770h) aVar.build();
            hVar4.getClass();
            doVar.f132299E = hVar4;
            doVar.f132304a |= 1073741824;
            ((C58970a) ((C58970a) this.f359482a.mo56224b()).mo56372aa(39102)).mo56387q("#getParsedCard: air quality card, cardId: %s", this.f359483b.f132307d);
        }
        cnVar.copyOnWrite();
        C50818do doVar2 = (C50818do) cnVar.instance;
        doVar2.f132309f = null;
        doVar2.f132304a &= -17;
        cnVar.copyOnWrite();
        C50818do doVar3 = (C50818do) cnVar.instance;
        doVar3.f132314k = null;
        doVar3.f132304a &= -513;
        cnVar.copyOnWrite();
        C50818do doVar4 = (C50818do) cnVar.instance;
        doVar4.f132316m = null;
        doVar4.f132304a &= -2049;
        return (C50818do) cnVar.build();
    }
}
