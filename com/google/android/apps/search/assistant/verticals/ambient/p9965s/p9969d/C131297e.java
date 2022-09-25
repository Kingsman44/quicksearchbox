package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9969d;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123789r;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131246o;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9999e.C131658a;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50792cp;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50795cs;
import com.google.assistant.p3886c.C50796ct;
import com.google.assistant.p3886c.C50801cy;
import com.google.assistant.p3886c.C50802cz;
import com.google.assistant.p3886c.C50814dk;
import com.google.assistant.p3886c.C50815dl;
import com.google.assistant.p3886c.C50816dm;
import com.google.assistant.p3886c.C50817dn;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.p3888b.C50716a;
import com.google.assistant.p3886c.p3888b.C50722g;
import com.google.assistant.p3886c.p3888b.C50723h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.d.e */
/* compiled from: PG */
public final /* synthetic */ class C131297e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C131302j f358966a;

    /* renamed from: b */
    public final /* synthetic */ C123744bk f358967b;

    public /* synthetic */ C131297e(C131302j jVar, C123744bk bkVar) {
        this.f358966a = jVar;
        this.f358967b = bkVar;
    }

    public final C60870cx apply(Object obj) {
        C50818do doVar;
        C131302j jVar = this.f358966a;
        C123744bk bkVar = this.f358967b;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            C50790cn cnVar = (C50790cn) ((C50818do) optional.get()).toBuilder();
            jVar.f358976d.mo110132g(cnVar);
            return C60856cj.m92900i(Optional.m71637of((C50818do) cnVar.build()));
        }
        C131658a aVar = jVar.f358975c;
        if (bkVar.f341808c == 37) {
            C123789r rVar = (C123789r) bkVar.f341809d;
            String str = bkVar.f341812g;
            int i = bkVar.f341810e;
            C50790cn cnVar2 = (C50790cn) C50818do.f132293H.createBuilder();
            int b = C131246o.m213739b(str, i);
            long b2 = aVar.f359733b.mo26870b();
            long j = rVar.f341968d;
            if (j == 0) {
                j = b2;
            }
            long j2 = aVar.f359734c + j;
            cnVar2.copyOnWrite();
            C50818do doVar2 = (C50818do) cnVar2.instance;
            doVar2.f132304a |= 4;
            doVar2.f132307d = b;
            cnVar2.copyOnWrite();
            C50818do doVar3 = (C50818do) cnVar2.instance;
            doVar3.f132304a |= 1;
            doVar3.f132305b = false;
            C50792cp cpVar = C50792cp.PRIMARY;
            cnVar2.copyOnWrite();
            C50818do doVar4 = (C50818do) cnVar2.instance;
            doVar4.f132306c = cpVar.f132174e;
            doVar4.f132304a |= 2;
            cnVar2.copyOnWrite();
            C50818do doVar5 = (C50818do) cnVar2.instance;
            doVar5.f132304a |= 4096;
            doVar5.f132317n = b2;
            cnVar2.copyOnWrite();
            C50818do doVar6 = (C50818do) cnVar2.instance;
            doVar6.f132304a |= 8192;
            doVar6.f132318o = j;
            long j3 = aVar.f359734c;
            cnVar2.copyOnWrite();
            C50818do doVar7 = (C50818do) cnVar2.instance;
            doVar7.f132304a |= 16384;
            doVar7.f132319p = j3;
            C50801cy cyVar = (C50801cy) C50802cz.f132236g.createBuilder();
            C50716a aVar2 = (C50716a) C50723h.f131999e.createBuilder();
            String str2 = rVar.f341966b;
            aVar2.copyOnWrite();
            C50723h hVar = (C50723h) aVar2.instance;
            str2.getClass();
            hVar.f132001a |= 1;
            hVar.f132002b = str2;
            C50722g gVar = C50722g.UNSPECIFIED;
            aVar2.copyOnWrite();
            C50723h hVar2 = (C50723h) aVar2.instance;
            hVar2.f132003c = gVar.f131998e;
            hVar2.f132001a |= 2;
            cyVar.copyOnWrite();
            C50802cz czVar = (C50802cz) cyVar.instance;
            C50723h hVar3 = (C50723h) aVar2.build();
            hVar3.getClass();
            czVar.f132239b = hVar3;
            czVar.f132238a |= 1;
            C50716a aVar3 = (C50716a) C50723h.f131999e.createBuilder();
            String str3 = rVar.f341967c;
            aVar3.copyOnWrite();
            C50723h hVar4 = (C50723h) aVar3.instance;
            str3.getClass();
            hVar4.f132001a |= 1;
            hVar4.f132002b = str3;
            C50722g gVar2 = C50722g.UNSPECIFIED;
            aVar3.copyOnWrite();
            C50723h hVar5 = (C50723h) aVar3.instance;
            hVar5.f132003c = gVar2.f131998e;
            hVar5.f132001a |= 2;
            cyVar.copyOnWrite();
            C50802cz czVar2 = (C50802cz) cyVar.instance;
            C50723h hVar6 = (C50723h) aVar3.build();
            hVar6.getClass();
            czVar2.f132241d = hVar6;
            czVar2.f132238a |= 4;
            cnVar2.copyOnWrite();
            C50818do doVar8 = (C50818do) cnVar2.instance;
            C50802cz czVar3 = (C50802cz) cyVar.build();
            czVar3.getClass();
            doVar8.f132309f = czVar3;
            doVar8.f132304a |= 16;
            C50794cr crVar = C50794cr.FLIGHT_LANDING;
            cnVar2.copyOnWrite();
            C50818do doVar9 = (C50818do) cnVar2.instance;
            doVar9.f132315l = crVar.f132222T;
            doVar9.f132304a |= 1024;
            C50795cs csVar = (C50795cs) C50796ct.f132223c.createBuilder();
            csVar.copyOnWrite();
            C50796ct ctVar = (C50796ct) csVar.instance;
            ctVar.f132225a |= 1;
            ctVar.f132226b = j2;
            cnVar2.copyOnWrite();
            C50818do doVar10 = (C50818do) cnVar2.instance;
            C50796ct ctVar2 = (C50796ct) csVar.build();
            ctVar2.getClass();
            doVar10.f132320q = ctVar2;
            doVar10.f132304a |= 32768;
            C50814dk dkVar = (C50814dk) C50817dn.f132287e.createBuilder();
            C50815dl dlVar = (C50815dl) C50816dm.f132281e.createBuilder();
            dlVar.copyOnWrite();
            C50816dm dmVar = (C50816dm) dlVar.instance;
            dmVar.f132283a |= 1;
            dmVar.f132284b = j;
            dlVar.copyOnWrite();
            C50816dm dmVar2 = (C50816dm) dlVar.instance;
            dmVar2.f132283a |= 2;
            dmVar2.f132285c = j2;
            dlVar.mo53468a(j);
            C50816dm dmVar3 = (C50816dm) dlVar.build();
            dkVar.copyOnWrite();
            C50817dn dnVar = (C50817dn) dkVar.instance;
            dmVar3.getClass();
            dnVar.f132292d = dmVar3;
            dnVar.f132289a |= 8;
            C50817dn dnVar2 = (C50817dn) dkVar.build();
            cnVar2.copyOnWrite();
            C50818do doVar11 = (C50818do) cnVar2.instance;
            dnVar2.getClass();
            doVar11.f132295A = dnVar2;
            doVar11.f132304a |= 67108864;
            cnVar2.copyOnWrite();
            C50818do doVar12 = (C50818do) cnVar2.instance;
            doVar12.f132304a |= 65536;
            doVar12.f132321r = true;
            doVar = (C50818do) cnVar2.build();
        } else {
            C59104x d = C131658a.f359732a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SSFlightLandingIH");
            ((C59052c) ((C59052c) d).mo56372aa(39153)).mo56386p("proactive data doesn't contain flight landing data.");
            doVar = null;
        }
        Optional ofNullable = Optional.ofNullable(doVar);
        if (ofNullable.isPresent()) {
            return jVar.f358976d.mo110131e((C50818do) ofNullable.get());
        }
        return C60856cj.m92900i(ofNullable);
    }
}
