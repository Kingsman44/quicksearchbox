package com.google.android.apps.gsa.staticplugins.smartspace.p8768i;

import android.content.Intent;
import com.google.android.apps.gsa.shared.p7019bc.C89407a;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.apps.gsa.smartspace.C92122r;
import com.google.android.apps.gsa.staticplugins.smartspace.p8764e.C117383a;
import com.google.android.apps.gsa.staticplugins.smartspace.p8766g.C117405i;
import com.google.android.gms.reminders.model.Task;
import com.google.android.googlequicksearchbox.R;
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
import com.google.assistant.p3886c.p3888b.C50717b;
import com.google.assistant.p3886c.p3888b.C50719d;
import com.google.assistant.p3886c.p3888b.C50720e;
import com.google.assistant.p3886c.p3888b.C50722g;
import com.google.assistant.p3886c.p3888b.C50723h;
import com.google.assistant.p3886c.p3888b.C50728m;
import com.google.assistant.p3886c.p3888b.C50729n;
import com.google.assistant.p3886c.p3888b.C50731p;
import com.google.assistant.p3886c.p3888b.C50732q;
import com.google.assistant.p3886c.p3888b.C50733r;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.i.a */
/* compiled from: PG */
public final class C117426a implements C117405i {

    /* renamed from: a */
    private final C117427b f325930a;

    public C117426a(C117427b bVar) {
        this.f325930a = bVar;
    }

    /* renamed from: b */
    public final C50794cr mo103282b() {
        return C50794cr.REMINDER;
    }

    /* renamed from: c */
    public final C60870cx mo103283c(Object obj) {
        boolean z;
        C50731p pVar;
        if (obj == null) {
            return C60856cj.m92900i(new C117383a());
        }
        Task task = (Task) obj;
        C117427b bVar = this.f325930a;
        if (task.mo122063C() != null) {
            long b = bVar.f325932b.mo26870b();
            long longValue = task.mo122063C().longValue();
            if ((longValue <= b && b - longValue <= bVar.mo103296a()) || (longValue >= b && longValue - b <= bVar.mo103297b())) {
                C117427b bVar2 = this.f325930a;
                long b2 = bVar2.f325932b.mo26870b();
                long longValue2 = task.mo122063C().longValue();
                long millis = TimeUnit.MINUTES.toMillis(bVar2.f325933c.mo79743a(C90014bt.f247655lJ)) + longValue2;
                C50790cn cnVar = (C50790cn) C50818do.f132293H.createBuilder();
                int hashCode = (task.mo122077n().hashCode() + String.valueOf(longValue2)).hashCode();
                cnVar.copyOnWrite();
                C50818do doVar = (C50818do) cnVar.instance;
                doVar.f132304a = doVar.f132304a | 4;
                doVar.f132307d = hashCode;
                cnVar.copyOnWrite();
                C50818do doVar2 = (C50818do) cnVar.instance;
                doVar2.f132304a |= 1;
                doVar2.f132305b = false;
                C50792cp cpVar = C50792cp.PRIMARY;
                cnVar.copyOnWrite();
                C50818do doVar3 = (C50818do) cnVar.instance;
                doVar3.f132306c = cpVar.f132174e;
                doVar3.f132304a |= 2;
                C50717b bVar3 = (C50717b) C50720e.f131985f.createBuilder();
                String G = task.mo122067G();
                bVar3.copyOnWrite();
                C50720e eVar = (C50720e) bVar3.instance;
                G.getClass();
                eVar.f131987a |= 1;
                eVar.f131988b = G;
                C50722g gVar = C50722g.END;
                bVar3.copyOnWrite();
                C50720e eVar2 = (C50720e) bVar3.instance;
                eVar2.f131989c = gVar.f131998e;
                eVar2.f131987a |= 2;
                C50719d dVar = C50719d.FIXED_STRING;
                bVar3.copyOnWrite();
                C50720e eVar3 = (C50720e) bVar3.instance;
                eVar3.f131990d = dVar.f131984e;
                eVar3.f131987a |= 4;
                C50720e eVar4 = (C50720e) bVar3.build();
                C50717b bVar4 = (C50717b) C50720e.f131985f.createBuilder();
                C50722g gVar2 = C50722g.UNSPECIFIED;
                bVar4.copyOnWrite();
                C50720e eVar5 = (C50720e) bVar4.instance;
                eVar5.f131989c = gVar2.f131998e;
                eVar5.f131987a |= 2;
                C50719d dVar2 = C50719d.EVENT_START_TIME;
                bVar4.copyOnWrite();
                C50720e eVar6 = (C50720e) bVar4.instance;
                eVar6.f131990d = dVar2.f131984e;
                eVar6.f131987a |= 4;
                bVar4.copyOnWrite();
                C50720e eVar7 = (C50720e) bVar4.instance;
                eVar7.f131987a |= 8;
                eVar7.f131991e = true;
                C50720e eVar8 = (C50720e) bVar4.build();
                C50717b bVar5 = (C50717b) C50720e.f131985f.createBuilder();
                StringBuilder sb = new StringBuilder();
                long longValue3 = task.mo122063C().longValue();
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(longValue3);
                if (instance.get(13) > 0) {
                    instance.add(12, 1);
                    z = false;
                    instance.set(13, 0);
                    instance.set(14, 0);
                } else {
                    z = false;
                }
                C50717b bVar6 = bVar5;
                StringBuilder sb2 = sb;
                sb2.append(C89407a.m145418a(bVar2.f325931a, instance.getTimeInMillis(), z ? 1 : 0, z));
                String sb3 = sb2.toString();
                bVar6.copyOnWrite();
                C50717b bVar7 = bVar6;
                C50720e eVar9 = (C50720e) bVar7.instance;
                eVar9.f131987a |= 1;
                eVar9.f131988b = sb3;
                C50722g gVar3 = C50722g.END;
                bVar7.copyOnWrite();
                C50720e eVar10 = (C50720e) bVar7.instance;
                eVar10.f131989c = gVar3.f131998e;
                eVar10.f131987a |= 2;
                C50719d dVar3 = C50719d.FIXED_STRING;
                bVar7.copyOnWrite();
                C50720e eVar11 = (C50720e) bVar7.instance;
                eVar11.f131990d = dVar3.f131984e;
                eVar11.f131987a |= 4;
                C50720e eVar12 = (C50720e) bVar7.build();
                C50801cy cyVar = (C50801cy) C50802cz.f132236g.createBuilder();
                C50716a aVar = (C50716a) C50723h.f131999e.createBuilder();
                aVar.copyOnWrite();
                C50723h hVar = (C50723h) aVar.instance;
                hVar.f132001a |= 1;
                hVar.f132002b = "%1$s";
                aVar.mo53428a(eVar4);
                C50722g gVar4 = C50722g.UNSPECIFIED;
                aVar.copyOnWrite();
                C50723h hVar2 = (C50723h) aVar.instance;
                hVar2.f132003c = gVar4.f131998e;
                hVar2.f132001a |= 2;
                cyVar.copyOnWrite();
                C50802cz czVar = (C50802cz) cyVar.instance;
                C50723h hVar3 = (C50723h) aVar.build();
                hVar3.getClass();
                czVar.f132239b = hVar3;
                czVar.f132238a |= 1;
                C50716a aVar2 = (C50716a) C50723h.f131999e.createBuilder();
                long j = millis;
                String string = bVar2.f325931a.getString(R.string.reminder_subtitle, new Object[]{"%1$s"});
                aVar2.copyOnWrite();
                C50723h hVar4 = (C50723h) aVar2.instance;
                string.getClass();
                String str = "%1$s";
                hVar4.f132001a |= 1;
                hVar4.f132002b = string;
                aVar2.mo53428a(eVar12);
                C50722g gVar5 = C50722g.UNSPECIFIED;
                aVar2.copyOnWrite();
                C50723h hVar5 = (C50723h) aVar2.instance;
                hVar5.f132003c = gVar5.f131998e;
                hVar5.f132001a |= 2;
                cyVar.copyOnWrite();
                C50802cz czVar2 = (C50802cz) cyVar.instance;
                C50723h hVar6 = (C50723h) aVar2.build();
                hVar6.getClass();
                czVar2.f132241d = hVar6;
                czVar2.f132238a |= 4;
                cnVar.copyOnWrite();
                C50818do doVar4 = (C50818do) cnVar.instance;
                C50802cz czVar3 = (C50802cz) cyVar.build();
                czVar3.getClass();
                doVar4.f132311h = czVar3;
                doVar4.f132304a |= 64;
                C50801cy cyVar2 = (C50801cy) C50802cz.f132236g.createBuilder();
                C50716a aVar3 = (C50716a) C50723h.f131999e.createBuilder();
                String string2 = bVar2.f325931a.getString(R.string.reminder_event_pre, new Object[]{str, "%2$s"});
                aVar3.copyOnWrite();
                C50723h hVar7 = (C50723h) aVar3.instance;
                string2.getClass();
                hVar7.f132001a |= 1;
                hVar7.f132002b = string2;
                aVar3.mo53428a(eVar4);
                aVar3.mo53428a(eVar8);
                C50722g gVar6 = C50722g.UNSPECIFIED;
                aVar3.copyOnWrite();
                C50723h hVar8 = (C50723h) aVar3.instance;
                hVar8.f132003c = gVar6.f131998e;
                hVar8.f132001a |= 2;
                cyVar2.copyOnWrite();
                C50802cz czVar4 = (C50802cz) cyVar2.instance;
                C50723h hVar9 = (C50723h) aVar3.build();
                hVar9.getClass();
                czVar4.f132239b = hVar9;
                czVar4.f132238a |= 1;
                C50716a aVar4 = (C50716a) C50723h.f131999e.createBuilder();
                String string3 = bVar2.f325931a.getString(R.string.reminder_subtitle, new Object[]{str});
                aVar4.copyOnWrite();
                C50723h hVar10 = (C50723h) aVar4.instance;
                string3.getClass();
                hVar10.f132001a |= 1;
                hVar10.f132002b = string3;
                aVar4.mo53428a(eVar12);
                C50722g gVar7 = C50722g.UNSPECIFIED;
                aVar4.copyOnWrite();
                C50723h hVar11 = (C50723h) aVar4.instance;
                hVar11.f132003c = gVar7.f131998e;
                hVar11.f132001a |= 2;
                cyVar2.copyOnWrite();
                C50802cz czVar5 = (C50802cz) cyVar2.instance;
                C50723h hVar12 = (C50723h) aVar4.build();
                hVar12.getClass();
                czVar5.f132241d = hVar12;
                czVar5.f132238a |= 4;
                cnVar.copyOnWrite();
                C50818do doVar5 = (C50818do) cnVar.instance;
                C50802cz czVar6 = (C50802cz) cyVar2.build();
                czVar6.getClass();
                doVar5.f132308e = czVar6;
                doVar5.f132304a |= 8;
                C50801cy cyVar3 = (C50801cy) C50802cz.f132236g.createBuilder();
                C50716a aVar5 = (C50716a) C50723h.f131999e.createBuilder();
                aVar5.copyOnWrite();
                C50723h hVar13 = (C50723h) aVar5.instance;
                hVar13.f132001a |= 1;
                hVar13.f132002b = str;
                aVar5.mo53428a(eVar4);
                C50722g gVar8 = C50722g.UNSPECIFIED;
                aVar5.copyOnWrite();
                C50723h hVar14 = (C50723h) aVar5.instance;
                hVar14.f132003c = gVar8.f131998e;
                hVar14.f132001a |= 2;
                cyVar3.copyOnWrite();
                C50802cz czVar7 = (C50802cz) cyVar3.instance;
                C50723h hVar15 = (C50723h) aVar5.build();
                hVar15.getClass();
                czVar7.f132239b = hVar15;
                czVar7.f132238a |= 1;
                C50716a aVar6 = (C50716a) C50723h.f131999e.createBuilder();
                String string4 = bVar2.f325931a.getString(R.string.reminder_subtitle, new Object[]{str});
                aVar6.copyOnWrite();
                C50723h hVar16 = (C50723h) aVar6.instance;
                string4.getClass();
                hVar16.f132001a |= 1;
                hVar16.f132002b = string4;
                aVar6.mo53428a(eVar12);
                C50722g gVar9 = C50722g.UNSPECIFIED;
                aVar6.copyOnWrite();
                C50723h hVar17 = (C50723h) aVar6.instance;
                hVar17.f132003c = gVar9.f131998e;
                hVar17.f132001a |= 2;
                cyVar3.copyOnWrite();
                C50802cz czVar8 = (C50802cz) cyVar3.instance;
                C50723h hVar18 = (C50723h) aVar6.build();
                hVar18.getClass();
                czVar8.f132241d = hVar18;
                czVar8.f132238a |= 4;
                cnVar.copyOnWrite();
                C50818do doVar6 = (C50818do) cnVar.instance;
                C50802cz czVar9 = (C50802cz) cyVar3.build();
                czVar9.getClass();
                doVar6.f132312i = czVar9;
                doVar6.f132304a |= 128;
                C50801cy cyVar4 = (C50801cy) C50802cz.f132236g.createBuilder();
                C50716a aVar7 = (C50716a) C50723h.f131999e.createBuilder();
                String string5 = bVar2.f325931a.getString(R.string.reminder_event_during, new Object[]{str});
                aVar7.copyOnWrite();
                C50723h hVar19 = (C50723h) aVar7.instance;
                string5.getClass();
                hVar19.f132001a |= 1;
                hVar19.f132002b = string5;
                aVar7.mo53428a(eVar4);
                C50722g gVar10 = C50722g.UNSPECIFIED;
                aVar7.copyOnWrite();
                C50723h hVar20 = (C50723h) aVar7.instance;
                hVar20.f132003c = gVar10.f131998e;
                hVar20.f132001a |= 2;
                cyVar4.copyOnWrite();
                C50802cz czVar10 = (C50802cz) cyVar4.instance;
                C50723h hVar21 = (C50723h) aVar7.build();
                hVar21.getClass();
                czVar10.f132239b = hVar21;
                czVar10.f132238a |= 1;
                C50716a aVar8 = (C50716a) C50723h.f131999e.createBuilder();
                String string6 = bVar2.f325931a.getString(R.string.reminder_subtitle, new Object[]{str});
                aVar8.copyOnWrite();
                C50723h hVar22 = (C50723h) aVar8.instance;
                string6.getClass();
                hVar22.f132001a |= 1;
                hVar22.f132002b = string6;
                aVar8.mo53428a(eVar12);
                C50722g gVar11 = C50722g.UNSPECIFIED;
                aVar8.copyOnWrite();
                C50723h hVar23 = (C50723h) aVar8.instance;
                hVar23.f132003c = gVar11.f131998e;
                hVar23.f132001a |= 2;
                cyVar4.copyOnWrite();
                C50802cz czVar11 = (C50802cz) cyVar4.instance;
                C50723h hVar24 = (C50723h) aVar8.build();
                hVar24.getClass();
                czVar11.f132241d = hVar24;
                czVar11.f132238a |= 4;
                cnVar.copyOnWrite();
                C50818do doVar7 = (C50818do) cnVar.instance;
                C50802cz czVar12 = (C50802cz) cyVar4.build();
                czVar12.getClass();
                doVar7.f132309f = czVar12;
                doVar7.f132304a |= 16;
                C50728m mVar = (C50728m) C50729n.f132007g.createBuilder();
                mVar.copyOnWrite();
                C50729n nVar = (C50729n) mVar.instance;
                nVar.f132009a |= 1;
                nVar.f132010b = "com.google.android.apps.nexuslauncher.extra.SMARTSPACE_ICON";
                cnVar.copyOnWrite();
                C50818do doVar8 = (C50818do) cnVar.instance;
                C50729n nVar2 = (C50729n) mVar.build();
                nVar2.getClass();
                doVar8.f132314k = nVar2;
                doVar8.f132304a |= 512;
                C50794cr crVar = C50794cr.REMINDER;
                cnVar.copyOnWrite();
                C50818do doVar9 = (C50818do) cnVar.instance;
                doVar9.f132315l = crVar.f132222T;
                doVar9.f132304a |= 1024;
                Intent a = C92122r.m151184a(bVar2.f325933c.mo79758x(C90059dk.f249096bF));
                if (bVar2.f325933c.mo79746e(C89985ax.f246715aw)) {
                    pVar = C50731p.START_ACTIVITY;
                } else {
                    pVar = C50731p.BROADCAST;
                }
                Intent d = C92122r.m151186d(a, (String) null, (String) null, C50794cr.REMINDER, pVar, true);
                C50732q qVar = (C50732q) C50733r.f132021d.createBuilder();
                qVar.copyOnWrite();
                C50733r rVar = (C50733r) qVar.instance;
                rVar.f132024b = pVar.f132020d;
                rVar.f132023a |= 1;
                String uri = d.toUri(1);
                qVar.copyOnWrite();
                C50733r rVar2 = (C50733r) qVar.instance;
                uri.getClass();
                rVar2.f132023a |= 2;
                rVar2.f132025c = uri;
                cnVar.copyOnWrite();
                C50818do doVar10 = (C50818do) cnVar.instance;
                C50733r rVar3 = (C50733r) qVar.build();
                rVar3.getClass();
                doVar10.f132316m = rVar3;
                doVar10.f132304a |= 2048;
                cnVar.copyOnWrite();
                C50818do doVar11 = (C50818do) cnVar.instance;
                doVar11.f132304a |= 4096;
                doVar11.f132317n = b2;
                cnVar.copyOnWrite();
                C50818do doVar12 = (C50818do) cnVar.instance;
                doVar12.f132304a |= 8192;
                doVar12.f132318o = longValue2;
                long a2 = bVar2.mo103296a();
                cnVar.copyOnWrite();
                C50818do doVar13 = (C50818do) cnVar.instance;
                doVar13.f132304a |= 16384;
                doVar13.f132319p = a2;
                C50795cs csVar = (C50795cs) C50796ct.f132223c.createBuilder();
                csVar.copyOnWrite();
                C50796ct ctVar = (C50796ct) csVar.instance;
                ctVar.f132225a |= 1;
                long j2 = j;
                ctVar.f132226b = j2;
                cnVar.copyOnWrite();
                C50818do doVar14 = (C50818do) cnVar.instance;
                C50796ct ctVar2 = (C50796ct) csVar.build();
                ctVar2.getClass();
                doVar14.f132320q = ctVar2;
                doVar14.f132304a |= 32768;
                C50814dk dkVar = (C50814dk) C50817dn.f132287e.createBuilder();
                C50815dl dlVar = (C50815dl) C50816dm.f132281e.createBuilder();
                long b3 = bVar2.mo103297b();
                dlVar.copyOnWrite();
                C50816dm dmVar = (C50816dm) dlVar.instance;
                dmVar.f132283a |= 1;
                dmVar.f132284b = longValue2 - b3;
                dlVar.copyOnWrite();
                C50816dm dmVar2 = (C50816dm) dlVar.instance;
                dmVar2.f132283a |= 2;
                dmVar2.f132285c = j2;
                dlVar.mo53468a(longValue2);
                C50816dm dmVar3 = (C50816dm) dlVar.build();
                dkVar.copyOnWrite();
                C50817dn dnVar = (C50817dn) dkVar.instance;
                dmVar3.getClass();
                dnVar.f132292d = dmVar3;
                dnVar.f132289a |= 8;
                C50817dn dnVar2 = (C50817dn) dkVar.build();
                cnVar.copyOnWrite();
                C50818do doVar15 = (C50818do) cnVar.instance;
                dnVar2.getClass();
                doVar15.f132295A = dnVar2;
                doVar15.f132304a |= 67108864;
                cnVar.copyOnWrite();
                C50818do doVar16 = (C50818do) cnVar.instance;
                doVar16.f132304a |= 65536;
                doVar16.f132321r = true;
                cnVar.copyOnWrite();
                C50818do doVar17 = (C50818do) cnVar.instance;
                doVar17.f132304a |= 524288;
                doVar17.f132324u = true;
                C50818do doVar18 = (C50818do) cnVar.build();
                if (doVar18 != null) {
                    return C60856cj.m92900i(new C117383a(doVar18));
                }
                return C60856cj.m92900i(new C117383a());
            }
        }
        return C60856cj.m92900i(new C117383a(C50794cr.REMINDER));
    }

    /* renamed from: e */
    public final boolean mo103285e(Object obj) {
        return obj instanceof Task;
    }
}