package com.google.android.apps.search.assistant.verticals.ambient.p9944o.p9945a;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106593e;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8224k.C106575b;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8226m.C106587a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8226m.C106588b;
import com.google.android.apps.search.assistant.verticals.ambient.p10017u.C131834f;
import com.google.android.apps.search.assistant.verticals.ambient.p10017u.C131837i;
import com.google.assistant.p4016z.C53685aj;
import com.google.assistant.p4016z.C53686ak;
import com.google.assistant.p4016z.C53708bf;
import com.google.assistant.p4016z.C53713bk;
import com.google.assistant.p4016z.C53714bl;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.o.a.c */
/* compiled from: PG */
public final /* synthetic */ class C131104c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C131114m f358581a;

    /* renamed from: b */
    public final /* synthetic */ C53715bm f358582b;

    public /* synthetic */ C131104c(C131114m mVar, C53715bm bmVar) {
        this.f358581a = mVar;
        this.f358582b = bmVar;
    }

    public final C60870cx apply(Object obj) {
        C53715bm bmVar;
        C106575b bVar;
        C106588b bVar2;
        C131114m mVar = this.f358581a;
        C53715bm bmVar2 = this.f358582b;
        C106596h hVar = (C106596h) obj;
        C53714bl.m86892a(bmVar2.f141023a).name();
        C131834f fVar = mVar.f358598b;
        long j = hVar.f297215j;
        C53685aj ajVar = (C53685aj) C53686ak.f140913f.createBuilder();
        C63042fg c = fVar.mo110336c();
        ajVar.copyOnWrite();
        C53686ak akVar = (C53686ak) ajVar.instance;
        c.getClass();
        akVar.f140918d = c;
        akVar.f140915a |= 1;
        if (bmVar2.f141023a == 12) {
            C106587a aVar = (C106587a) ((C106588b) bmVar2.f141024b).toBuilder();
            aVar.copyOnWrite();
            ((C106588b) aVar.instance).f297187a = C106588b.emptyProtobufList();
            if (bmVar2.f141023a == 12) {
                bVar2 = (C106588b) bmVar2.f141024b;
            } else {
                bVar2 = C106588b.f297185b;
            }
            for (C53708bf b : bVar2.f297187a) {
                aVar.mo95583a(C131834f.m214313b(b));
            }
            C53713bk bkVar = (C53713bk) C53715bm.f141021c.createBuilder();
            bkVar.copyOnWrite();
            C53715bm bmVar3 = (C53715bm) bkVar.instance;
            C106588b bVar3 = (C106588b) aVar.build();
            bVar3.getClass();
            bmVar3.f141024b = bVar3;
            bmVar3.f141023a = 12;
            bmVar = (C53715bm) bkVar.build();
        } else {
            bmVar = bmVar2;
        }
        ajVar.copyOnWrite();
        C53686ak akVar2 = (C53686ak) ajVar.instance;
        bmVar.getClass();
        akVar2.f140917c = bmVar;
        akVar2.f140916b = 4;
        ajVar.copyOnWrite();
        C53686ak akVar3 = (C53686ak) ajVar.instance;
        akVar3.f140915a |= 2;
        akVar3.f140919e = j;
        fVar.f360045b.mo110321e((C53686ak) ajVar.build());
        C131834f fVar2 = mVar.f358598b;
        C131837i iVar = fVar2.f360045b;
        C53685aj ajVar2 = (C53685aj) C53686ak.f140913f.createBuilder();
        C63042fg c2 = fVar2.mo110336c();
        ajVar2.copyOnWrite();
        C53686ak akVar4 = (C53686ak) ajVar2.instance;
        c2.getClass();
        akVar4.f140918d = c2;
        akVar4.f140915a |= 1;
        C106593e eVar = (C106593e) hVar.toBuilder();
        eVar.copyOnWrite();
        ((C106596h) eVar.instance).f297214i = C106596h.emptyProtobufList();
        for (C53708bf b2 : hVar.f297214i) {
            C53708bf b3 = C131834f.m214313b(b2);
            eVar.copyOnWrite();
            C106596h hVar2 = (C106596h) eVar.instance;
            b3.getClass();
            hVar2.mo95586a();
            hVar2.f297214i.add(b3);
        }
        C106596h hVar3 = (C106596h) eVar.build();
        ajVar2.copyOnWrite();
        C53686ak akVar5 = (C53686ak) ajVar2.instance;
        hVar3.getClass();
        akVar5.f140917c = hVar3;
        akVar5.f140916b = 8;
        long j2 = hVar.f297215j;
        ajVar2.copyOnWrite();
        C53686ak akVar6 = (C53686ak) ajVar2.instance;
        akVar6.f140915a |= 2;
        akVar6.f140919e = j2;
        iVar.mo110321e((C53686ak) ajVar2.build());
        switch (C53714bl.m86892a(bmVar2.f141023a).ordinal()) {
            case 1:
            case 2:
            case 6:
            case 9:
                mVar.f358600d.mo110275c(bmVar2, hVar.f297215j);
                return C60866ct.f164955a;
            case 3:
            case 7:
            case 8:
            case 10:
                return mVar.f358605i.mo51512b(new C131110i(mVar, hVar, bmVar2), mVar.f358604h);
            case 4:
                if (bmVar2.f141023a == 7) {
                    bVar = (C106575b) bmVar2.f141024b;
                } else {
                    bVar = C106575b.f297162e;
                }
                if (bVar.f297167d) {
                    return mVar.f358605i.mo51512b(new C131109h(mVar, hVar, bmVar2), mVar.f358604h);
                }
                return C60866ct.f164955a;
            default:
                ((C58970a) ((C58970a) mVar.f358597a.mo56225c()).mo56372aa(39037)).mo56389s("Received unknown event: %s", C53714bl.m86892a(bmVar2.f141023a).name());
                return C60866ct.f164955a;
        }
    }
}
