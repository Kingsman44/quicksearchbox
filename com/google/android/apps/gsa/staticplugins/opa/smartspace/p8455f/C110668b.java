package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8455f;

import com.google.android.apps.gsa.opa.smartspace.C83740al;
import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.opa.smartspace.C83798n;
import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50792cp;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50795cs;
import com.google.assistant.p3886c.C50796ct;
import com.google.assistant.p3886c.C50801cy;
import com.google.assistant.p3886c.C50802cz;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.p3888b.C50716a;
import com.google.assistant.p3886c.p3888b.C50717b;
import com.google.assistant.p3886c.p3888b.C50719d;
import com.google.assistant.p3886c.p3888b.C50720e;
import com.google.assistant.p3886c.p3888b.C50722g;
import com.google.assistant.p3886c.p3888b.C50723h;
import com.google.assistant.p3886c.p3888b.C50731p;
import com.google.assistant.p3886c.p3888b.C50732q;
import com.google.assistant.p3886c.p3888b.C50733r;
import com.google.assistant.p3994s.p3995a.C53175ed;
import com.google.assistant.p3994s.p3995a.C53422nh;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.time.LocalDate;
import p3186j$.time.LocalTime;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.f.b */
/* compiled from: PG */
public final /* synthetic */ class C110668b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C110679m f308385a;

    /* renamed from: b */
    public final /* synthetic */ LocalDate f308386b;

    public /* synthetic */ C110668b(C110679m mVar, LocalDate localDate) {
        this.f308385a = mVar;
        this.f308386b = localDate;
    }

    public final C60870cx apply(Object obj) {
        C50731p pVar;
        C110679m mVar = this.f308385a;
        LocalDate localDate = this.f308386b;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h() || mVar.mo98849d()) {
            C58833ax a = mVar.mo98846a((C53422nh) axVar.mo56109e(C53422nh.f140182m), localDate);
            if (!a.mo56113h()) {
                C59104x b = C110679m.f308400a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "EvtSuggsManager");
                ((C59052c) ((C59052c) b).mo56372aa(26629)).mo56386p("Cannot find the corresponding holiday from ZS response.");
                return C118826c.f331423b;
            }
            C110681o oVar = mVar.f308406f;
            C53175ed edVar = (C53175ed) a.mo56107c();
            if (!C110684r.m184383b(edVar)) {
                return C118826c.f331423b;
            }
            String a2 = C110684r.m184382a(edVar);
            Instant a3 = oVar.f308417f.mo57444a();
            Instant instant = oVar.f308417f.mo57445b(oVar.f308418g).mo43076f(LocalTime.MAX).atZone(oVar.f308418g).toInstant();
            Duration abs = Duration.between(a3, instant).abs();
            C50790cn cnVar = (C50790cn) C50818do.f132293H.createBuilder();
            int hashCode = edVar.f139360b.hashCode();
            cnVar.copyOnWrite();
            C50818do doVar = (C50818do) cnVar.instance;
            doVar.f132304a |= 4;
            doVar.f132307d = hashCode;
            C50794cr crVar = C50794cr.HOLIDAY_ALARMS;
            cnVar.copyOnWrite();
            C50818do doVar2 = (C50818do) cnVar.instance;
            doVar2.f132315l = crVar.f132222T;
            doVar2.f132304a |= 1024;
            cnVar.copyOnWrite();
            C50818do doVar3 = (C50818do) cnVar.instance;
            doVar3.f132304a |= 1;
            doVar3.f132305b = false;
            C50792cp cpVar = C50792cp.PRIMARY;
            cnVar.copyOnWrite();
            C50818do doVar4 = (C50818do) cnVar.instance;
            doVar4.f132306c = cpVar.f132174e;
            doVar4.f132304a |= 2;
            C50801cy cyVar = (C50801cy) C50802cz.f132236g.createBuilder();
            C50716a aVar = (C50716a) C50723h.f131999e.createBuilder();
            String string = oVar.f308413b.getResources().getString(R.string.tomorrow_holiday_text, new Object[]{"%1$s"});
            aVar.copyOnWrite();
            C50723h hVar = (C50723h) aVar.instance;
            string.getClass();
            hVar.f132001a |= 1;
            hVar.f132002b = string;
            C50717b bVar = (C50717b) C50720e.f131985f.createBuilder();
            bVar.copyOnWrite();
            C50720e eVar = (C50720e) bVar.instance;
            a2.getClass();
            eVar.f131987a |= 1;
            eVar.f131988b = a2;
            C50722g gVar = C50722g.END;
            bVar.copyOnWrite();
            C50720e eVar2 = (C50720e) bVar.instance;
            eVar2.f131989c = gVar.f131998e;
            eVar2.f131987a |= 2;
            C50719d dVar = C50719d.FIXED_STRING;
            bVar.copyOnWrite();
            C50720e eVar3 = (C50720e) bVar.instance;
            eVar3.f131990d = dVar.f131984e;
            eVar3.f131987a |= 4;
            bVar.copyOnWrite();
            C50720e eVar4 = (C50720e) bVar.instance;
            eVar4.f131987a |= 8;
            eVar4.f131991e = false;
            aVar.mo53428a((C50720e) bVar.build());
            cyVar.copyOnWrite();
            C50802cz czVar = (C50802cz) cyVar.instance;
            C50723h hVar2 = (C50723h) aVar.build();
            hVar2.getClass();
            czVar.f132239b = hVar2;
            czVar.f132238a |= 1;
            C50802cz czVar2 = (C50802cz) cyVar.build();
            cnVar.copyOnWrite();
            C50818do doVar5 = (C50818do) cnVar.instance;
            czVar2.getClass();
            doVar5.f132309f = czVar2;
            doVar5.f132304a |= 16;
            long epochMilli = a3.toEpochMilli();
            cnVar.copyOnWrite();
            C50818do doVar6 = (C50818do) cnVar.instance;
            doVar6.f132304a |= 8192;
            doVar6.f132318o = epochMilli;
            long millis = abs.toMillis();
            cnVar.copyOnWrite();
            C50818do doVar7 = (C50818do) cnVar.instance;
            doVar7.f132304a |= 16384;
            doVar7.f132319p = millis;
            C50795cs csVar = (C50795cs) C50796ct.f132223c.createBuilder();
            long epochMilli2 = instant.toEpochMilli();
            csVar.copyOnWrite();
            C50796ct ctVar = (C50796ct) csVar.instance;
            ctVar.f132225a |= 1;
            ctVar.f132226b = epochMilli2;
            cnVar.copyOnWrite();
            C50818do doVar8 = (C50818do) cnVar.instance;
            C50796ct ctVar2 = (C50796ct) csVar.build();
            ctVar2.getClass();
            doVar8.f132320q = ctVar2;
            doVar8.f132304a |= 32768;
            if (oVar.f308414c.mo79746e(C89985ax.f246715aw)) {
                pVar = C50731p.START_ACTIVITY;
            } else {
                pVar = C50731p.BROADCAST;
            }
            C50732q qVar = (C50732q) C50733r.f132021d.createBuilder();
            qVar.copyOnWrite();
            C50733r rVar = (C50733r) qVar.instance;
            rVar.f132024b = pVar.f132020d;
            rVar.f132023a |= 1;
            qVar.copyOnWrite();
            C50733r rVar2 = (C50733r) qVar.instance;
            rVar2.f132023a |= 2;
            rVar2.f132025c = "clock-app://com.google.android.deskclock/alarm";
            C50733r rVar3 = (C50733r) qVar.build();
            cnVar.copyOnWrite();
            C50818do doVar9 = (C50818do) cnVar.instance;
            rVar3.getClass();
            doVar9.f132316m = rVar3;
            doVar9.f132304a |= 2048;
            C50818do doVar10 = (C50818do) cnVar.build();
            C59104x b2 = C110681o.f308412a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "EvtSuggsProducer");
            ((C59052c) ((C59052c) b2).mo56372aa(26646)).mo56387q("Produce HOLIDAY_ALARMS card (ID: %s)", doVar10.f132307d);
            C83798n k = C83800p.m133473k();
            C83740al alVar = (C83740al) C83741am.f228248e.createBuilder();
            alVar.copyOnWrite();
            C83741am amVar = (C83741am) alVar.instance;
            doVar10.getClass();
            amVar.f228252c = doVar10;
            amVar.f228250a |= 4;
            k.mo77043b((C83741am) alVar.build());
            return oVar.f308415d.mo77123e(k.mo77042a());
        }
        C59104x b3 = C110679m.f308400a.mo56224b();
        b3.mo56378ag(C58975e.f156826a, "EvtSuggsManager");
        ((C59052c) ((C59052c) b3).mo56372aa(26630)).mo56386p("ZeroStateClientResponse not found in OpaStore.");
        return C118826c.f331423b;
    }
}
