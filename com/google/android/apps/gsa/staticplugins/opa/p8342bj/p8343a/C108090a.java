package com.google.android.apps.gsa.staticplugins.opa.p8342bj.p8343a;

import android.accounts.Account;
import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assist.p503c.p504a.C9388a;
import com.google.android.apps.gsa.opa.p6451j.C83713a;
import com.google.android.apps.gsa.opa.smartspace.C83740al;
import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.opa.smartspace.C83798n;
import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.apps.gsa.opa.smartspace.p6456e.C83785c;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p7045k.C89796ad;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.deviceregistration.C108626cz;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109790aj;
import com.google.android.apps.gsa.staticplugins.smartspace.C117384f;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131179d;
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
import com.google.assistant.p3886c.p3888b.C50728m;
import com.google.assistant.p3886c.p3888b.C50729n;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4526f.p4534f.C59081b;
import com.google.common.util.concurrent.C60856cj;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bj.a.a */
/* compiled from: PG */
public final class C108090a extends C83713a {

    /* renamed from: a */
    private static final C59071e f300672a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.bj.a.a");

    /* renamed from: b */
    private final C68214a f300673b;

    /* renamed from: c */
    private final C68214a f300674c;

    /* renamed from: d */
    private final C68214a f300675d;

    /* renamed from: e */
    private final C68214a f300676e;

    public C108090a(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4) {
        this.f300673b = aVar;
        this.f300674c = aVar2;
        this.f300675d = aVar3;
        this.f300676e = aVar4;
    }

    /* renamed from: a */
    public final void mo77032a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((Map) it.next());
        }
        if (C108626cz.f302162a == null) {
            C108626cz.f302162a = new C108626cz();
        }
    }

    /* renamed from: b */
    public final void mo77033b(String str, int i) {
        C89796ad.m146181a().mo83644b(str, i);
    }

    /* renamed from: c */
    public final void mo77034c(Bundle bundle) {
        Bundle bundle2 = bundle;
        C117384f fVar = (C117384f) this.f300676e.mo27525b();
        C58976aa aaVar = C58975e.f156826a;
        C59081b.m91349a(C58979ad.FULL, "stack size");
        if (bundle2.getBoolean("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.TEST_REMINDER_EXTRA", false)) {
            C59104x b = C117384f.f325866a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SmartspaceTestEntryPoin");
            ((C59052c) ((C59052c) b).mo56372aa(32981)).mo56386p("sending reminders update");
            String string = bundle2.getString("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.TEST_REMINDER_TITLE");
            if (string == null) {
                string = BuildConfig.FLAVOR;
            }
            C50717b bVar = (C50717b) C50720e.f131985f.createBuilder();
            bVar.copyOnWrite();
            C50720e eVar = (C50720e) bVar.instance;
            eVar.f131987a |= 1;
            eVar.f131988b = string;
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
            long j = bundle2.getLong("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.TEST_REMINDER_DUEDATE_MILLIS");
            C50790cn cnVar = (C50790cn) C50818do.f132293H.createBuilder();
            cnVar.copyOnWrite();
            C50818do doVar = (C50818do) cnVar.instance;
            doVar.f132304a |= 4;
            doVar.f132307d = 112;
            C50792cp cpVar = C50792cp.PRIMARY;
            cnVar.copyOnWrite();
            C50818do doVar2 = (C50818do) cnVar.instance;
            doVar2.f132306c = cpVar.f132174e;
            doVar2.f132304a |= 2;
            cnVar.copyOnWrite();
            C50818do doVar3 = (C50818do) cnVar.instance;
            doVar3.f132304a |= 1;
            doVar3.f132305b = false;
            C50801cy cyVar = (C50801cy) C50802cz.f132236g.createBuilder();
            C50716a aVar = (C50716a) C50723h.f131999e.createBuilder();
            aVar.copyOnWrite();
            C50723h hVar = (C50723h) aVar.instance;
            hVar.f132001a |= 1;
            hVar.f132002b = "%1$s";
            aVar.mo53428a((C50720e) bVar.build());
            C50722g gVar2 = C50722g.UNSPECIFIED;
            aVar.copyOnWrite();
            C50723h hVar2 = (C50723h) aVar.instance;
            hVar2.f132003c = gVar2.f131998e;
            hVar2.f132001a |= 2;
            cyVar.copyOnWrite();
            C50802cz czVar = (C50802cz) cyVar.instance;
            C50723h hVar3 = (C50723h) aVar.build();
            hVar3.getClass();
            czVar.f132239b = hVar3;
            czVar.f132238a |= 1;
            cnVar.copyOnWrite();
            C50818do doVar4 = (C50818do) cnVar.instance;
            C50802cz czVar2 = (C50802cz) cyVar.build();
            czVar2.getClass();
            doVar4.f132311h = czVar2;
            doVar4.f132304a |= 64;
            C50728m mVar = (C50728m) C50729n.f132007g.createBuilder();
            mVar.copyOnWrite();
            C50729n nVar = (C50729n) mVar.instance;
            nVar.f132009a |= 1;
            nVar.f132010b = "com.google.android.apps.nexuslauncher.extra.SMARTSPACE_ICON";
            cnVar.copyOnWrite();
            C50818do doVar5 = (C50818do) cnVar.instance;
            C50729n nVar2 = (C50729n) mVar.build();
            nVar2.getClass();
            doVar5.f132314k = nVar2;
            doVar5.f132304a |= 512;
            C50794cr crVar = C50794cr.REMINDER;
            cnVar.copyOnWrite();
            C50818do doVar6 = (C50818do) cnVar.instance;
            doVar6.f132315l = crVar.f132222T;
            doVar6.f132304a |= 1024;
            long b2 = fVar.f325868c.mo26870b();
            cnVar.copyOnWrite();
            C50818do doVar7 = (C50818do) cnVar.instance;
            doVar7.f132304a |= 4096;
            doVar7.f132317n = b2;
            cnVar.copyOnWrite();
            C50818do doVar8 = (C50818do) cnVar.instance;
            doVar8.f132304a |= 8192;
            doVar8.f132318o = j;
            cnVar.copyOnWrite();
            C50818do doVar9 = (C50818do) cnVar.instance;
            doVar9.f132304a |= 16384;
            doVar9.f132319p = 0;
            C50795cs csVar = (C50795cs) C50796ct.f132223c.createBuilder();
            csVar.copyOnWrite();
            C50796ct ctVar = (C50796ct) csVar.instance;
            ctVar.f132225a |= 1;
            ctVar.f132226b = j;
            cnVar.copyOnWrite();
            C50818do doVar10 = (C50818do) cnVar.instance;
            C50796ct ctVar2 = (C50796ct) csVar.build();
            ctVar2.getClass();
            doVar10.f132320q = ctVar2;
            doVar10.f132304a |= 32768;
            C50818do doVar11 = (C50818do) cnVar.build();
            C83740al alVar = (C83740al) C83741am.f228248e.createBuilder();
            alVar.copyOnWrite();
            C83741am amVar = (C83741am) alVar.instance;
            doVar11.getClass();
            amVar.f228252c = doVar11;
            amVar.f228250a |= 4;
            C83785c cVar = fVar.f325867b;
            C83798n k = C83800p.m133473k();
            k.mo77043b((C83741am) alVar.build());
            try {
                if (C60856cj.m92909r(cVar.mo77123e(k.mo77042a())) == C118826c.f331422a) {
                    C59104x b3 = C117384f.f325866a.mo56224b();
                    b3.mo56378ag(C58975e.f156826a, "SmartspaceTestEntryPoin");
                    ((C59052c) ((C59052c) b3).mo56372aa(32982)).mo56386p("Done successfully");
                }
            } catch (ExecutionException e) {
                C59104x c = C117384f.f325866a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "SmartspaceTestEntryPoin");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(32983)).mo56386p("Future failed");
            }
        }
        if (bundle2.getBoolean("WEATHER_UPDATE", false)) {
            long b4 = fVar.f325868c.mo26870b();
            String string2 = bundle2.getString("WEATHER_TEXT");
            String string3 = bundle2.getString("WEATHER_ICON_URL");
            String string4 = bundle2.getString("WEATHER_DESCRIPTION");
            string2.getClass();
            string3.getClass();
            string4.getClass();
            C50790cn cnVar2 = (C50790cn) C50818do.f132293H.createBuilder();
            cnVar2.copyOnWrite();
            C50818do doVar12 = (C50818do) cnVar2.instance;
            doVar12.f132304a |= 4;
            doVar12.f132307d = 1905757503;
            cnVar2.copyOnWrite();
            C50818do doVar13 = (C50818do) cnVar2.instance;
            doVar13.f132304a |= 1;
            doVar13.f132305b = false;
            C50792cp cpVar2 = C50792cp.SECONDARY;
            cnVar2.copyOnWrite();
            C50818do doVar14 = (C50818do) cnVar2.instance;
            doVar14.f132306c = cpVar2.f132174e;
            doVar14.f132304a |= 2;
            C50801cy cyVar2 = (C50801cy) C50802cz.f132236g.createBuilder();
            C50716a aVar2 = (C50716a) C50723h.f131999e.createBuilder();
            aVar2.copyOnWrite();
            C50723h hVar4 = (C50723h) aVar2.instance;
            hVar4.f132001a |= 1;
            hVar4.f132002b = string2;
            C50722g gVar3 = C50722g.UNSPECIFIED;
            aVar2.copyOnWrite();
            C50723h hVar5 = (C50723h) aVar2.instance;
            hVar5.f132003c = gVar3.f131998e;
            hVar5.f132001a |= 2;
            cyVar2.copyOnWrite();
            C50802cz czVar3 = (C50802cz) cyVar2.instance;
            C50723h hVar6 = (C50723h) aVar2.build();
            hVar6.getClass();
            czVar3.f132239b = hVar6;
            czVar3.f132238a |= 1;
            cnVar2.copyOnWrite();
            C50818do doVar15 = (C50818do) cnVar2.instance;
            C50802cz czVar4 = (C50802cz) cyVar2.build();
            czVar4.getClass();
            doVar15.f132309f = czVar4;
            doVar15.f132304a |= 16;
            C50728m mVar2 = (C50728m) C50729n.f132007g.createBuilder();
            mVar2.copyOnWrite();
            C50729n nVar3 = (C50729n) mVar2.instance;
            nVar3.f132009a |= 1;
            nVar3.f132010b = "com.google.android.apps.nexuslauncher.extra.SMARTSPACE_ICON";
            mVar2.copyOnWrite();
            C50729n nVar4 = (C50729n) mVar2.instance;
            nVar4.f132009a |= 4;
            nVar4.f132011c = string3;
            mVar2.copyOnWrite();
            C50729n nVar5 = (C50729n) mVar2.instance;
            nVar5.f132009a |= 8;
            nVar5.f132012d = string4;
            cnVar2.copyOnWrite();
            C50818do doVar16 = (C50818do) cnVar2.instance;
            C50729n nVar6 = (C50729n) mVar2.build();
            nVar6.getClass();
            doVar16.f132314k = nVar6;
            doVar16.f132304a |= 512;
            C50794cr crVar2 = C50794cr.WEATHER;
            cnVar2.copyOnWrite();
            C50818do doVar17 = (C50818do) cnVar2.instance;
            doVar17.f132315l = crVar2.f132222T;
            doVar17.f132304a |= 1024;
            cnVar2.copyOnWrite();
            C50818do doVar18 = (C50818do) cnVar2.instance;
            doVar18.f132304a |= 4096;
            doVar18.f132317n = b4;
            cnVar2.copyOnWrite();
            C50818do doVar19 = (C50818do) cnVar2.instance;
            doVar19.f132304a |= 8192;
            doVar19.f132318o = b4;
            long j2 = C131179d.f358770f;
            cnVar2.copyOnWrite();
            C50818do doVar20 = (C50818do) cnVar2.instance;
            doVar20.f132304a |= 16384;
            doVar20.f132319p = j2;
            C50795cs csVar2 = (C50795cs) C50796ct.f132223c.createBuilder();
            long j3 = C131179d.f358771g;
            csVar2.copyOnWrite();
            C50796ct ctVar3 = (C50796ct) csVar2.instance;
            ctVar3.f132225a |= 1;
            ctVar3.f132226b = b4 + j3;
            cnVar2.copyOnWrite();
            C50818do doVar21 = (C50818do) cnVar2.instance;
            C50796ct ctVar4 = (C50796ct) csVar2.build();
            ctVar4.getClass();
            doVar21.f132320q = ctVar4;
            doVar21.f132304a |= 32768;
            C50818do doVar22 = (C50818do) cnVar2.build();
            C83740al alVar2 = (C83740al) C83741am.f228248e.createBuilder();
            alVar2.copyOnWrite();
            C83741am amVar2 = (C83741am) alVar2.instance;
            doVar22.getClass();
            amVar2.f228252c = doVar22;
            amVar2.f228250a |= 4;
            C83785c cVar2 = fVar.f325867b;
            C83798n k2 = C83800p.m133473k();
            k2.mo77043b((C83741am) alVar2.build());
            try {
                C60856cj.m92909r(cVar2.mo77124f(k2.mo77042a()));
                C118826c cVar3 = C118826c.f331422a;
            } catch (ExecutionException e2) {
                C59104x c2 = C117384f.f325866a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "SmartspaceTestEntryPoin");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(32986)).mo56386p("Future failed");
            }
        }
        if (bundle2.getBoolean("GENERIC_CARD_UPDATE", false)) {
            C59081b.m91349a(C58979ad.FULL, "stack size");
            C50794cr a = C50794cr.m85938a(bundle2.getInt("GENERIC_CARD_TYPE"));
            if (a == null) {
                a = C50794cr.CALENDAR;
            }
            String string5 = bundle2.getString("GENERIC_CARD_TITLE");
            String string6 = bundle2.getString("GENERIC_CARD_SUBTITLE");
            string5.getClass();
            string6.getClass();
            long b5 = fVar.f325868c.mo26870b();
            long millis = TimeUnit.MINUTES.toMillis(fVar.f325869d.mo79743a(C90014bt.f247695lx)) + b5;
            C50790cn cnVar3 = (C50790cn) C50818do.f132293H.createBuilder();
            cnVar3.copyOnWrite();
            C50818do doVar23 = (C50818do) cnVar3.instance;
            doVar23.f132304a |= 4;
            doVar23.f132307d = 1024;
            cnVar3.copyOnWrite();
            C50818do doVar24 = (C50818do) cnVar3.instance;
            doVar24.f132304a |= 1;
            doVar24.f132305b = false;
            C50792cp cpVar3 = C50792cp.PRIMARY;
            cnVar3.copyOnWrite();
            C50818do doVar25 = (C50818do) cnVar3.instance;
            doVar25.f132306c = cpVar3.f132174e;
            doVar25.f132304a |= 2;
            C50801cy cyVar3 = (C50801cy) C50802cz.f132236g.createBuilder();
            C50716a aVar3 = (C50716a) C50723h.f131999e.createBuilder();
            aVar3.copyOnWrite();
            C50723h hVar7 = (C50723h) aVar3.instance;
            hVar7.f132001a |= 1;
            hVar7.f132002b = string5;
            C50722g gVar4 = C50722g.END;
            aVar3.copyOnWrite();
            C50723h hVar8 = (C50723h) aVar3.instance;
            hVar8.f132003c = gVar4.f131998e;
            hVar8.f132001a |= 2;
            cyVar3.copyOnWrite();
            C50802cz czVar5 = (C50802cz) cyVar3.instance;
            C50723h hVar9 = (C50723h) aVar3.build();
            hVar9.getClass();
            czVar5.f132239b = hVar9;
            czVar5.f132238a |= 1;
            C50716a aVar4 = (C50716a) C50723h.f131999e.createBuilder();
            aVar4.copyOnWrite();
            C50723h hVar10 = (C50723h) aVar4.instance;
            hVar10.f132001a |= 1;
            hVar10.f132002b = string6;
            C50722g gVar5 = C50722g.END;
            aVar4.copyOnWrite();
            C50723h hVar11 = (C50723h) aVar4.instance;
            hVar11.f132003c = gVar5.f131998e;
            hVar11.f132001a |= 2;
            cyVar3.copyOnWrite();
            C50802cz czVar6 = (C50802cz) cyVar3.instance;
            C50723h hVar12 = (C50723h) aVar4.build();
            hVar12.getClass();
            czVar6.f132241d = hVar12;
            czVar6.f132238a |= 4;
            cnVar3.copyOnWrite();
            C50818do doVar26 = (C50818do) cnVar3.instance;
            C50802cz czVar7 = (C50802cz) cyVar3.build();
            czVar7.getClass();
            doVar26.f132312i = czVar7;
            doVar26.f132304a |= 128;
            C50801cy cyVar4 = (C50801cy) C50802cz.f132236g.createBuilder();
            C50716a aVar5 = (C50716a) C50723h.f131999e.createBuilder();
            aVar5.copyOnWrite();
            C50723h hVar13 = (C50723h) aVar5.instance;
            hVar13.f132001a |= 1;
            hVar13.f132002b = string5;
            C50722g gVar6 = C50722g.END;
            aVar5.copyOnWrite();
            C50723h hVar14 = (C50723h) aVar5.instance;
            hVar14.f132003c = gVar6.f131998e;
            hVar14.f132001a |= 2;
            cyVar4.copyOnWrite();
            C50802cz czVar8 = (C50802cz) cyVar4.instance;
            C50723h hVar15 = (C50723h) aVar5.build();
            hVar15.getClass();
            czVar8.f132239b = hVar15;
            czVar8.f132238a |= 1;
            C50716a aVar6 = (C50716a) C50723h.f131999e.createBuilder();
            aVar6.copyOnWrite();
            C50723h hVar16 = (C50723h) aVar6.instance;
            hVar16.f132001a |= 1;
            hVar16.f132002b = string6;
            C50722g gVar7 = C50722g.END;
            aVar6.copyOnWrite();
            C50723h hVar17 = (C50723h) aVar6.instance;
            hVar17.f132003c = gVar7.f131998e;
            hVar17.f132001a |= 2;
            cyVar4.copyOnWrite();
            C50802cz czVar9 = (C50802cz) cyVar4.instance;
            C50723h hVar18 = (C50723h) aVar6.build();
            hVar18.getClass();
            czVar9.f132241d = hVar18;
            czVar9.f132238a |= 4;
            cnVar3.copyOnWrite();
            C50818do doVar27 = (C50818do) cnVar3.instance;
            C50802cz czVar10 = (C50802cz) cyVar4.build();
            czVar10.getClass();
            doVar27.f132309f = czVar10;
            doVar27.f132304a |= 16;
            C50728m mVar3 = (C50728m) C50729n.f132007g.createBuilder();
            mVar3.copyOnWrite();
            C50729n nVar7 = (C50729n) mVar3.instance;
            nVar7.f132009a |= 1;
            nVar7.f132010b = "com.google.android.apps.nexuslauncher.extra.SMARTSPACE_ICON";
            cnVar3.copyOnWrite();
            C50818do doVar28 = (C50818do) cnVar3.instance;
            C50729n nVar8 = (C50729n) mVar3.build();
            nVar8.getClass();
            doVar28.f132314k = nVar8;
            doVar28.f132304a |= 512;
            cnVar3.copyOnWrite();
            C50818do doVar29 = (C50818do) cnVar3.instance;
            doVar29.f132315l = a.f132222T;
            doVar29.f132304a |= 1024;
            cnVar3.copyOnWrite();
            C50818do doVar30 = (C50818do) cnVar3.instance;
            doVar30.f132304a |= 4096;
            doVar30.f132317n = b5;
            cnVar3.copyOnWrite();
            C50818do doVar31 = (C50818do) cnVar3.instance;
            doVar31.f132304a |= 8192;
            doVar31.f132318o = b5;
            cnVar3.copyOnWrite();
            C50818do doVar32 = (C50818do) cnVar3.instance;
            doVar32.f132304a |= 16384;
            doVar32.f132319p = millis - b5;
            C50795cs csVar3 = (C50795cs) C50796ct.f132223c.createBuilder();
            csVar3.copyOnWrite();
            C50796ct ctVar5 = (C50796ct) csVar3.instance;
            ctVar5.f132225a |= 1;
            ctVar5.f132226b = millis;
            cnVar3.copyOnWrite();
            C50818do doVar33 = (C50818do) cnVar3.instance;
            C50796ct ctVar6 = (C50796ct) csVar3.build();
            ctVar6.getClass();
            doVar33.f132320q = ctVar6;
            doVar33.f132304a |= 32768;
            C50818do doVar34 = (C50818do) cnVar3.build();
            C83740al alVar3 = (C83740al) C83741am.f228248e.createBuilder();
            alVar3.copyOnWrite();
            C83741am amVar3 = (C83741am) alVar3.instance;
            doVar34.getClass();
            amVar3.f228252c = doVar34;
            amVar3.f228250a |= 4;
            C83785c cVar4 = fVar.f325867b;
            C83798n k3 = C83800p.m133473k();
            k3.mo77043b((C83741am) alVar3.build());
            try {
                C60856cj.m92909r(cVar4.mo77123e(k3.mo77042a()));
                C118826c cVar5 = C118826c.f331422a;
            } catch (ExecutionException e3) {
                C59104x c3 = C117384f.f325866a.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "SmartspaceTestEntryPoin");
                ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e3)).mo56372aa(32980)).mo56386p("Genric card update Future failed");
            }
        }
        if (bundle2.getBoolean("SHOW_SETTINGS", false)) {
            fVar.f325870e.mo86769g();
        }
    }

    /* renamed from: d */
    public final void mo77035d(boolean z, boolean z2) {
        Account a = ((C86054o) this.f300674c.mo27525b()).mo79668a();
        if (a == null) {
            ((C59052c) ((C59052c) f300672a.mo56225c()).mo56372aa(27989)).mo56386p("No account found on device. Not marking UDC complete.");
            return;
        }
        ((C109790aj) this.f300673b.mo27525b()).mo98130l(a, 3);
        if (z) {
            ((C59052c) ((C59052c) f300672a.mo56224b()).mo56372aa(27988)).mo56386p("Set Opt in for UDC.");
            ((C109790aj) this.f300673b.mo27525b()).mo98125g(a, z2);
        }
        ((C109790aj) this.f300673b.mo27525b()).mo98127i(a, 3);
    }

    /* renamed from: e */
    public final void mo77036e(boolean z) {
        if (z) {
            ((C9388a) this.f300675d.mo27525b()).mo17579a(false);
        } else {
            ((C9388a) this.f300675d.mo27525b()).mo17580b();
        }
    }
}
