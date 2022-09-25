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

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.a.a.a.o */
/* compiled from: PG */
public final class C131594o implements C131595b {

    /* renamed from: a */
    private final C58974d f359549a;

    /* renamed from: b */
    private final C50818do f359550b;

    public C131594o(C50818do doVar, C130603a aVar) {
        this.f359550b = doVar;
        this.f359549a = aVar.mo109739a("WeatherTempParser");
    }

    /* renamed from: b */
    private static C50729n m214003b(C50729n nVar) {
        if (nVar.equals(C50729n.f132007g)) {
            return nVar;
        }
        C50728m mVar = (C50728m) nVar.toBuilder();
        mVar.copyOnWrite();
        C50729n nVar2 = (C50729n) mVar.instance;
        nVar2.f132009a |= 32;
        nVar2.f132014f = false;
        return (C50729n) mVar.build();
    }

    /* renamed from: a */
    public final C50818do mo110198a() {
        if (this.f359550b.equals(C50818do.f132293H)) {
            return this.f359550b;
        }
        C50790cn cnVar = (C50790cn) this.f359550b.toBuilder();
        C50818do doVar = this.f359550b;
        if ((doVar.f132304a & 1073741824) != 0) {
            C50770h hVar = doVar.f132299E;
            if (hVar == null) {
                hVar = C50770h.f132124g;
            }
            if (!hVar.equals(C50770h.f132124g)) {
                C50770h hVar2 = this.f359550b.f132299E;
                if (hVar2 == null) {
                    hVar2 = C50770h.f132124g;
                }
                C50763a aVar = (C50763a) hVar2.toBuilder();
                C50770h hVar3 = this.f359550b.f132299E;
                if (hVar3 == null) {
                    hVar3 = C50770h.f132124g;
                }
                C50765c cVar = hVar3.f132129d;
                if (cVar == null) {
                    cVar = C50765c.f132101g;
                }
                C50764b bVar = (C50764b) cVar.toBuilder();
                C50729n nVar = this.f359550b.f132314k;
                if (nVar == null) {
                    nVar = C50729n.f132007g;
                }
                C50729n b = m214003b(nVar);
                bVar.copyOnWrite();
                C50765c cVar2 = (C50765c) bVar.instance;
                b.getClass();
                cVar2.f132105c = b;
                cVar2.f132103a |= 2;
                aVar.copyOnWrite();
                C50770h hVar4 = (C50770h) aVar.instance;
                C50765c cVar3 = (C50765c) bVar.build();
                cVar3.getClass();
                hVar4.f132129d = cVar3;
                hVar4.f132126a |= 4;
                C50770h hVar5 = (C50770h) aVar.build();
                cnVar.copyOnWrite();
                C50818do doVar2 = (C50818do) cnVar.instance;
                hVar5.getClass();
                doVar2.f132299E = hVar5;
                doVar2.f132304a |= 1073741824;
                ((C58970a) ((C58970a) this.f359549a.mo56224b()).mo56372aa(39110)).mo56387q("#getParsedCard: weather card UI template data has been populated from the upstream, cardId: %s", this.f359550b.f132307d);
                return (C50818do) cnVar.build();
            }
        }
        C50802cz czVar = this.f359550b.f132309f;
        if (czVar == null) {
            czVar = C50802cz.f132236g;
        }
        if ((this.f359550b.f132304a & 16) != 0 && !czVar.equals(C50802cz.f132236g)) {
            C50763a aVar2 = (C50763a) C50770h.f132124g.createBuilder();
            C50769g gVar = C50769g.DEFAULT;
            aVar2.copyOnWrite();
            C50770h hVar6 = (C50770h) aVar2.instance;
            hVar6.f132127b = gVar.f132123h;
            hVar6.f132126a |= 1;
            C50764b bVar2 = (C50764b) C50765c.f132101g.createBuilder();
            C50723h hVar7 = czVar.f132239b;
            if (hVar7 == null) {
                hVar7 = C50723h.f131999e;
            }
            bVar2.copyOnWrite();
            C50765c cVar4 = (C50765c) bVar2.instance;
            hVar7.getClass();
            cVar4.f132104b = hVar7;
            cVar4.f132103a |= 1;
            C50729n nVar2 = this.f359550b.f132314k;
            if (nVar2 == null) {
                nVar2 = C50729n.f132007g;
            }
            C50729n b2 = m214003b(nVar2);
            bVar2.copyOnWrite();
            C50765c cVar5 = (C50765c) bVar2.instance;
            b2.getClass();
            cVar5.f132105c = b2;
            cVar5.f132103a |= 2;
            C50733r rVar = this.f359550b.f132316m;
            if (rVar == null) {
                rVar = C50733r.f132021d;
            }
            bVar2.copyOnWrite();
            C50765c cVar6 = (C50765c) bVar2.instance;
            rVar.getClass();
            cVar6.f132106d = rVar;
            cVar6.f132103a |= 4;
            C50767e a = C131593n.m214002a(this.f359550b.f132307d, C9027a.WEATHER);
            bVar2.copyOnWrite();
            C50765c cVar7 = (C50765c) bVar2.instance;
            a.getClass();
            cVar7.f132107e = a;
            cVar7.f132103a |= 8;
            aVar2.copyOnWrite();
            C50770h hVar8 = (C50770h) aVar2.instance;
            C50765c cVar8 = (C50765c) bVar2.build();
            cVar8.getClass();
            hVar8.f132129d = cVar8;
            hVar8.f132126a |= 4;
            cnVar.copyOnWrite();
            C50818do doVar3 = (C50818do) cnVar.instance;
            C50770h hVar9 = (C50770h) aVar2.build();
            hVar9.getClass();
            doVar3.f132299E = hVar9;
            doVar3.f132304a |= 1073741824;
            ((C58970a) ((C58970a) this.f359549a.mo56224b()).mo56372aa(39109)).mo56387q("#getParsedCard: weather card, cardId: %s", this.f359550b.f132307d);
        }
        return (C50818do) cnVar.build();
    }
}
