package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c;

import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.provider.CalendarContract;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.C83738aj;
import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.smartspace.C92122r;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123787p;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131179d;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131253v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.assistant.p3886c.C50747bl;
import com.google.assistant.p3886c.C50749bn;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50792cp;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50795cs;
import com.google.assistant.p3886c.C50796ct;
import com.google.assistant.p3886c.C50801cy;
import com.google.assistant.p3886c.C50802cz;
import com.google.assistant.p3886c.C50804da;
import com.google.assistant.p3886c.C50806dc;
import com.google.assistant.p3886c.C50808de;
import com.google.assistant.p3886c.C50810dg;
import com.google.assistant.p3886c.C50811dh;
import com.google.assistant.p3886c.C50812di;
import com.google.assistant.p3886c.C50813dj;
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
import com.google.common.base.C58879cp;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import java.util.regex.Pattern;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.c.af */
/* compiled from: PG */
public final class C110541af {

    /* renamed from: a */
    public final C58974d f308172a;

    /* renamed from: b */
    public final C130895ag f308173b;

    /* renamed from: c */
    public final C83794j f308174c;

    /* renamed from: d */
    private final Context f308175d;

    /* renamed from: e */
    private final C86124t f308176e;

    /* renamed from: f */
    private final C21370a f308177f;

    /* renamed from: g */
    private final C42876ab f308178g;

    public C110541af(Context context, C86124t tVar, C21370a aVar, C42876ab abVar, C130895ag agVar, C83794j jVar, C83564a aVar2) {
        this.f308175d = context;
        this.f308176e = tVar;
        this.f308177f = aVar;
        this.f308178g = abVar;
        this.f308173b = agVar;
        this.f308174c = jVar;
        this.f308172a = aVar2.mo76900a("OpaCalHandler");
    }

    /* renamed from: a */
    public static int m184147a(C123787p pVar) {
        long millis = Duration.ofSeconds(pVar.f341954e).toMillis();
        String str = pVar.f341953d;
        return (str + millis + "17").hashCode();
    }

    /* renamed from: b */
    public final C50818do mo98760b(C83739ak akVar) {
        C123787p pVar;
        long j;
        C50723h hVar;
        C50720e eVar;
        Object obj;
        C50716a aVar;
        C50720e eVar2;
        C50731p pVar2;
        long j2;
        C83739ak akVar2 = akVar;
        C83738aj ajVar = akVar2.f228233b;
        if (ajVar == null) {
            ajVar = C83738aj.f228226c;
        }
        if (ajVar.f228228a == 6) {
            pVar = (C123787p) ajVar.f228229b;
        } else {
            pVar = C123787p.f341948n;
        }
        C123787p pVar3 = pVar;
        long epochSecond = Instant.ofEpochMilli(this.f308177f.mo26870b()).getEpochSecond();
        long j3 = pVar3.f341954e;
        if (this.f308174c.mo77176n()) {
            j = Duration.ofMinutes(this.f308174c.mo77165a()).getSeconds();
        } else {
            j = C131179d.f358773i;
        }
        if (j3 > epochSecond || epochSecond - j3 > j) {
            if (this.f308174c.mo77176n()) {
                j2 = Duration.ofMinutes(this.f308174c.mo77166b()).getSeconds();
            } else {
                j2 = C131179d.f358772h;
            }
            if (j3 < epochSecond || j3 - epochSecond > j2) {
                return null;
            }
        }
        boolean z = akVar2.f228244m;
        int a = m184147a(pVar3);
        long b = this.f308177f.mo26870b();
        long epochSecond2 = Instant.ofEpochMilli(b).getEpochSecond();
        long j4 = pVar3.f341954e;
        long epochMilli = Instant.ofEpochSecond(j4).toEpochMilli();
        long epochMilli2 = (pVar3.f341950a & 16) != 0 ? Instant.ofEpochSecond(pVar3.f341955f).toEpochMilli() : -1;
        long j5 = pVar3.f341951b;
        C110540ae aeVar = r0;
        boolean z2 = z;
        C60870cx d = this.f308178g.mo46042d();
        long j6 = epochMilli2;
        C110540ae aeVar2 = new C110540ae(this, j5, j4, epochSecond2);
        C60856cj.m92911t(d, aeVar, C60826bg.f164896a);
        ((C58970a) ((C58970a) this.f308172a.mo56224b()).mo56372aa(26574)).mo56360M("Building Smartspace calendar card with sync id: %s, event id: %s, title: %s and start time: %s", pVar3.f341960k, Long.valueOf(pVar3.f341952c), pVar3.f341953d, Long.valueOf(epochMilli));
        C50790cn cnVar = (C50790cn) C50818do.f132293H.createBuilder();
        cnVar.copyOnWrite();
        C50818do doVar = (C50818do) cnVar.instance;
        doVar.f132304a |= 4;
        doVar.f132307d = a;
        cnVar.copyOnWrite();
        C50818do doVar2 = (C50818do) cnVar.instance;
        doVar2.f132304a |= 1;
        doVar2.f132305b = false;
        cnVar.copyOnWrite();
        C50818do doVar3 = (C50818do) cnVar.instance;
        doVar3.f132304a |= 524288;
        doVar3.f132324u = true;
        C50792cp cpVar = C50792cp.PRIMARY;
        cnVar.copyOnWrite();
        C50818do doVar4 = (C50818do) cnVar.instance;
        doVar4.f132306c = cpVar.f132174e;
        doVar4.f132304a |= 2;
        C50717b bVar = (C50717b) C50720e.f131985f.createBuilder();
        String str = pVar3.f341953d;
        bVar.copyOnWrite();
        C50720e eVar3 = (C50720e) bVar.instance;
        str.getClass();
        eVar3.f131987a |= 1;
        eVar3.f131988b = str;
        C50722g gVar = C50722g.END;
        bVar.copyOnWrite();
        C50720e eVar4 = (C50720e) bVar.instance;
        eVar4.f131989c = gVar.f131998e;
        eVar4.f131987a |= 2;
        C50719d dVar = C50719d.FIXED_STRING;
        bVar.copyOnWrite();
        C50720e eVar5 = (C50720e) bVar.instance;
        eVar5.f131990d = dVar.f131984e;
        eVar5.f131987a |= 4;
        C50720e eVar6 = (C50720e) bVar.build();
        C50717b bVar2 = (C50717b) C50720e.f131985f.createBuilder();
        C50722g gVar2 = C50722g.UNSPECIFIED;
        bVar2.copyOnWrite();
        C50720e eVar7 = (C50720e) bVar2.instance;
        eVar7.f131989c = gVar2.f131998e;
        eVar7.f131987a |= 2;
        C50719d dVar2 = C50719d.EVENT_START_TIME;
        bVar2.copyOnWrite();
        C50720e eVar8 = (C50720e) bVar2.instance;
        eVar8.f131990d = dVar2.f131984e;
        eVar8.f131987a |= 4;
        bVar2.copyOnWrite();
        C50720e eVar9 = (C50720e) bVar2.instance;
        eVar9.f131987a |= 8;
        eVar9.f131991e = true;
        C50720e eVar10 = (C50720e) bVar2.build();
        C50716a aVar2 = (C50716a) C50723h.f131999e.createBuilder();
        String c = mo98761c(pVar3);
        aVar2.copyOnWrite();
        C50723h hVar2 = (C50723h) aVar2.instance;
        c.getClass();
        hVar2.f132001a |= 1;
        hVar2.f132002b = c;
        C50722g gVar3 = C50722g.UNSPECIFIED;
        aVar2.copyOnWrite();
        C50723h hVar3 = (C50723h) aVar2.instance;
        hVar3.f132003c = gVar3.f131998e;
        hVar3.f132001a |= 2;
        C50723h hVar4 = (C50723h) aVar2.build();
        C50716a aVar3 = (C50716a) C50723h.f131999e.createBuilder();
        if (C58879cp.m90962d(pVar3.f341956g)) {
            aVar3.copyOnWrite();
            C50723h hVar5 = (C50723h) aVar3.instance;
            hVar5.f132001a |= 1;
            hVar5.f132002b = "%1$s";
            aVar3.mo53428a(eVar6);
            aVar = aVar3;
            obj = "%1$s";
            eVar = eVar10;
            hVar = hVar4;
            eVar2 = eVar6;
        } else {
            String string = this.f308175d.getResources().getString(R.string.calendar_event_pre_static, new Object[]{"%1$s", "%2$s"});
            aVar3.copyOnWrite();
            C50723h hVar6 = (C50723h) aVar3.instance;
            string.getClass();
            hVar6.f132001a |= 1;
            hVar6.f132002b = string;
            aVar = aVar3;
            obj = "%1$s";
            eVar = eVar10;
            hVar = hVar4;
            CharSequence c2 = C131253v.m213756c(this.f308175d, epochMilli, b, this.f308176e.mo79746e(C90017bw.f247975bk));
            C50717b bVar3 = (C50717b) C50720e.f131985f.createBuilder();
            String obj2 = c2.toString();
            bVar3.copyOnWrite();
            C50720e eVar11 = (C50720e) bVar3.instance;
            obj2.getClass();
            eVar11.f131987a |= 1;
            eVar11.f131988b = obj2;
            C50722g gVar4 = C50722g.UNSPECIFIED;
            bVar3.copyOnWrite();
            C50720e eVar12 = (C50720e) bVar3.instance;
            eVar12.f131989c = gVar4.f131998e;
            eVar12.f131987a |= 2;
            C50719d dVar3 = C50719d.FIXED_STRING;
            bVar3.copyOnWrite();
            C50720e eVar13 = (C50720e) bVar3.instance;
            eVar13.f131990d = dVar3.f131984e;
            eVar13.f131987a |= 4;
            eVar2 = eVar6;
            aVar.mo53428a(eVar2);
            aVar.mo53428a((C50720e) bVar3.build());
        }
        C50722g gVar5 = C50722g.UNSPECIFIED;
        aVar.copyOnWrite();
        C50723h hVar7 = (C50723h) aVar.instance;
        hVar7.f132003c = gVar5.f131998e;
        hVar7.f132001a |= 2;
        C50801cy cyVar = (C50801cy) C50802cz.f132236g.createBuilder();
        cyVar.copyOnWrite();
        C50802cz czVar = (C50802cz) cyVar.instance;
        C50723h hVar8 = (C50723h) aVar.build();
        hVar8.getClass();
        czVar.f132239b = hVar8;
        czVar.f132238a |= 1;
        cyVar.copyOnWrite();
        C50802cz czVar2 = (C50802cz) cyVar.instance;
        hVar.getClass();
        C50723h hVar9 = hVar;
        czVar2.f132241d = hVar9;
        czVar2.f132238a |= 4;
        cnVar.copyOnWrite();
        C50818do doVar5 = (C50818do) cnVar.instance;
        C50802cz czVar3 = (C50802cz) cyVar.build();
        czVar3.getClass();
        doVar5.f132311h = czVar3;
        doVar5.f132304a |= 64;
        C50801cy cyVar2 = (C50801cy) C50802cz.f132236g.createBuilder();
        C50716a aVar4 = (C50716a) C50723h.f131999e.createBuilder();
        String string2 = this.f308175d.getResources().getString(R.string.calendar_event_pre, new Object[]{obj, "%2$s"});
        aVar4.copyOnWrite();
        C50723h hVar10 = (C50723h) aVar4.instance;
        string2.getClass();
        hVar10.f132001a |= 1;
        hVar10.f132002b = string2;
        aVar4.mo53428a(eVar2);
        aVar4.mo53428a(eVar);
        C50722g gVar6 = C50722g.UNSPECIFIED;
        aVar4.copyOnWrite();
        C50723h hVar11 = (C50723h) aVar4.instance;
        hVar11.f132003c = gVar6.f131998e;
        hVar11.f132001a |= 2;
        cyVar2.copyOnWrite();
        C50802cz czVar4 = (C50802cz) cyVar2.instance;
        C50723h hVar12 = (C50723h) aVar4.build();
        hVar12.getClass();
        czVar4.f132239b = hVar12;
        czVar4.f132238a |= 1;
        cyVar2.copyOnWrite();
        C50802cz czVar5 = (C50802cz) cyVar2.instance;
        hVar9.getClass();
        czVar5.f132241d = hVar9;
        czVar5.f132238a |= 4;
        cnVar.copyOnWrite();
        C50818do doVar6 = (C50818do) cnVar.instance;
        C50802cz czVar6 = (C50802cz) cyVar2.build();
        czVar6.getClass();
        doVar6.f132308e = czVar6;
        doVar6.f132304a |= 8;
        C50717b bVar4 = (C50717b) C50720e.f131985f.createBuilder();
        String str2 = pVar3.f341953d;
        bVar4.copyOnWrite();
        C50720e eVar14 = (C50720e) bVar4.instance;
        str2.getClass();
        eVar14.f131987a |= 1;
        eVar14.f131988b = str2;
        C50722g gVar7 = C50722g.END;
        bVar4.copyOnWrite();
        C50720e eVar15 = (C50720e) bVar4.instance;
        eVar15.f131989c = gVar7.f131998e;
        eVar15.f131987a |= 2;
        C50719d dVar4 = C50719d.FIXED_STRING;
        bVar4.copyOnWrite();
        C50720e eVar16 = (C50720e) bVar4.instance;
        eVar16.f131990d = dVar4.f131984e;
        eVar16.f131987a |= 4;
        bVar4.copyOnWrite();
        C50720e eVar17 = (C50720e) bVar4.instance;
        eVar17.f131987a |= 8;
        eVar17.f131991e = false;
        C50801cy cyVar3 = (C50801cy) C50802cz.f132236g.createBuilder();
        C50716a aVar5 = (C50716a) C50723h.f131999e.createBuilder();
        String string3 = this.f308175d.getResources().getString(R.string.calendar_event_during, new Object[]{obj});
        aVar5.copyOnWrite();
        C50723h hVar13 = (C50723h) aVar5.instance;
        string3.getClass();
        hVar13.f132001a |= 1;
        hVar13.f132002b = string3;
        aVar5.mo53428a((C50720e) bVar4.build());
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
        String c3 = mo98761c(pVar3);
        aVar6.copyOnWrite();
        C50723h hVar16 = (C50723h) aVar6.instance;
        c3.getClass();
        hVar16.f132001a |= 1;
        hVar16.f132002b = c3;
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
        C50818do doVar7 = (C50818do) cnVar.instance;
        C50802cz czVar9 = (C50802cz) cyVar3.build();
        czVar9.getClass();
        doVar7.f132309f = czVar9;
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
        C50794cr crVar = C50794cr.CALENDAR;
        cnVar.copyOnWrite();
        C50818do doVar9 = (C50818do) cnVar.instance;
        doVar9.f132315l = crVar.f132222T;
        doVar9.f132304a |= 1024;
        Intent data = new Intent("android.intent.action.VIEW").setData(ContentUris.withAppendedId(CalendarContract.Events.CONTENT_URI, pVar3.f341952c));
        data.putExtra("beginTime", epochMilli);
        long j7 = j6;
        if (j7 > 0) {
            data.putExtra("endTime", j7);
        }
        data.addFlags(268435457);
        if (this.f308176e.mo79746e(C89985ax.f246715aw)) {
            pVar2 = C50731p.START_ACTIVITY;
        } else {
            pVar2 = C50731p.BROADCAST;
        }
        Intent d2 = C92122r.m151186d(data, (String) null, (String) null, C50794cr.CALENDAR, pVar2, true);
        boolean z3 = !pVar3.f341962m;
        if (z3) {
            d2.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_IS_DATA_FROM_THIRD_PARTY_APP", true);
        }
        if (z2) {
            d2.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_IS_WORK_PROFILE", true);
        }
        C50732q qVar = (C50732q) C50733r.f132021d.createBuilder();
        qVar.copyOnWrite();
        C50733r rVar = (C50733r) qVar.instance;
        rVar.f132024b = pVar2.f132020d;
        rVar.f132023a |= 1;
        String uri = d2.toUri(1);
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
        doVar11.f132317n = b;
        cnVar.copyOnWrite();
        C50818do doVar12 = (C50818do) cnVar.instance;
        doVar12.f132304a |= 8192;
        doVar12.f132318o = epochMilli;
        if (j7 > epochMilli) {
            cnVar.copyOnWrite();
            C50818do doVar13 = (C50818do) cnVar.instance;
            doVar13.f132304a |= 16384;
            doVar13.f132319p = j7 - epochMilli;
        }
        C50795cs csVar = (C50795cs) C50796ct.f132223c.createBuilder();
        long millis = Duration.ofSeconds(C131179d.f358773i).toMillis();
        csVar.copyOnWrite();
        C50796ct ctVar = (C50796ct) csVar.instance;
        ctVar.f132225a |= 1;
        ctVar.f132226b = millis + epochMilli;
        cnVar.copyOnWrite();
        C50818do doVar14 = (C50818do) cnVar.instance;
        C50796ct ctVar2 = (C50796ct) csVar.build();
        ctVar2.getClass();
        doVar14.f132320q = ctVar2;
        doVar14.f132304a |= 32768;
        C50814dk dkVar = (C50814dk) C50817dn.f132287e.createBuilder();
        C50815dl dlVar = (C50815dl) C50816dm.f132281e.createBuilder();
        long millis2 = Duration.ofSeconds(C131179d.f358772h).toMillis();
        dlVar.copyOnWrite();
        C50816dm dmVar = (C50816dm) dlVar.instance;
        dmVar.f132283a |= 1;
        dmVar.f132284b = epochMilli - millis2;
        long millis3 = Duration.ofSeconds(C131179d.f358773i).toMillis();
        dlVar.copyOnWrite();
        C50816dm dmVar2 = (C50816dm) dlVar.instance;
        dmVar2.f132283a |= 2;
        dmVar2.f132285c = millis3 + epochMilli;
        dlVar.mo53468a(epochMilli);
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
        doVar17.f132304a |= C89885b.HTTP_VALUE;
        doVar17.f132323t = z3;
        cnVar.copyOnWrite();
        C50818do doVar18 = (C50818do) cnVar.instance;
        doVar18.f132304a |= C89885b.S3REQUEST_VALUE;
        doVar18.f132322s = z2;
        if (this.f308176e.mo79746e(C90017bw.f247969be) || this.f308176e.mo79746e(C89985ax.f246729l)) {
            C50812di diVar = (C50812di) C50813dj.f132278a.createBuilder();
            C62940bt btVar = C50749bn.f132064d;
            C50747bl blVar = (C50747bl) C50749bn.f132063c.createBuilder();
            blVar.copyOnWrite();
            C50749bn bnVar = (C50749bn) blVar.instance;
            pVar3.getClass();
            bnVar.f132067b = pVar3;
            bnVar.f132066a = 2;
            diVar.mo58885m(btVar, (C50749bn) blVar.build());
            C50813dj djVar = (C50813dj) diVar.build();
            cnVar.copyOnWrite();
            C50818do doVar19 = (C50818do) cnVar.instance;
            djVar.getClass();
            doVar19.f132329z = djVar;
            doVar19.f132304a |= 33554432;
        }
        if (this.f308176e.mo79746e(C90017bw.f247969be) && this.f308176e.mo79746e(C89985ax.f246735r) && !pVar3.f341953d.isEmpty()) {
            C50804da daVar = (C50804da) C50811dh.f132269h.createBuilder();
            daVar.copyOnWrite();
            C50811dh dhVar = (C50811dh) daVar.instance;
            dhVar.f132271a |= 1;
            dhVar.f132272b = "com.google.android.calendar";
            daVar.copyOnWrite();
            C50811dh dhVar2 = (C50811dh) daVar.instance;
            dhVar2.f132271a |= 2;
            dhVar2.f132273c = "REMINDERS";
            C50808de deVar = C50808de.NOTIFICATION_TITLE;
            daVar.copyOnWrite();
            C50811dh dhVar3 = (C50811dh) daVar.instance;
            dhVar3.f132274d = deVar.f132262d;
            dhVar3.f132271a |= 4;
            daVar.copyOnWrite();
            C50811dh dhVar4 = (C50811dh) daVar.instance;
            dhVar4.f132271a |= 8;
            dhVar4.f132275e = "[‪‫‬‎‏]*" + Pattern.quote(pVar3.f341953d) + "[‪‫‬‎‏]*";
            C50810dg dgVar = C50810dg.MATCH_ENTIRE;
            daVar.copyOnWrite();
            C50811dh dhVar5 = (C50811dh) daVar.instance;
            dhVar5.f132276f = dgVar.f132268d;
            dhVar5.f132271a |= 16;
            C50806dc dcVar = C50806dc.HIDE;
            daVar.copyOnWrite();
            C50811dh dhVar6 = (C50811dh) daVar.instance;
            dhVar6.f132277g = dcVar.f132256d;
            dhVar6.f132271a |= 32;
            cnVar.copyOnWrite();
            C50818do doVar20 = (C50818do) cnVar.instance;
            C50811dh dhVar7 = (C50811dh) daVar.build();
            dhVar7.getClass();
            doVar20.f132296B = dhVar7;
            doVar20.f132304a |= 134217728;
        }
        return (C50818do) cnVar.build();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo98761c(C123787p pVar) {
        CharSequence charSequence;
        C123787p pVar2 = pVar;
        String str = pVar2.f341956g;
        if (!C58879cp.m90962d(str)) {
            return str;
        }
        boolean e = this.f308176e.mo79746e(C90017bw.f247975bk);
        long b = this.f308177f.mo26870b();
        StringBuilder sb = new StringBuilder();
        long epochMilli = Instant.ofEpochSecond(pVar2.f341954e).toEpochMilli();
        long epochMilli2 = (pVar2.f341950a & 16) != 0 ? Instant.ofEpochSecond(pVar2.f341955f).toEpochMilli() : epochMilli;
        CharSequence c = C131253v.m213756c(this.f308175d, epochMilli, b, e);
        if ((pVar2.f341950a & 16) != 0) {
            if (C131253v.m213754a(epochMilli, epochMilli2)) {
                charSequence = C131253v.m213755b(this.f308175d, epochMilli2, e);
            } else {
                charSequence = C131253v.m213756c(this.f308175d, epochMilli2, b, e);
            }
            sb.append(this.f308175d.getString(R.string.calendar_event_time_range, new Object[]{c, charSequence}));
        } else {
            sb.append(c.toString());
        }
        return sb.toString();
    }
}
