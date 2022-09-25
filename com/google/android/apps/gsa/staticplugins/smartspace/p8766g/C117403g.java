package com.google.android.apps.gsa.staticplugins.smartspace.p8766g;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7019bc.C89407a;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.smartspace.C92097d;
import com.google.android.apps.gsa.smartspace.C92109e;
import com.google.android.apps.gsa.smartspace.C92122r;
import com.google.android.apps.gsa.staticplugins.smartspace.p8764e.C117383a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
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
import com.google.assistant.p3886c.p3888b.C50731p;
import com.google.assistant.p3886c.p3888b.C50732q;
import com.google.assistant.p3886c.p3888b.C50733r;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.g.g */
/* compiled from: PG */
public final class C117403g implements C117405i {

    /* renamed from: a */
    private static final C59071e f325907a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.smartspace.g.g");

    /* renamed from: b */
    private final C91189au f325908b;

    /* renamed from: c */
    private final Context f325909c;

    /* renamed from: d */
    private final C86124t f325910d;

    /* renamed from: e */
    private final C21370a f325911e;

    public C117403g(Context context, C91189au auVar, C86124t tVar, C21370a aVar) {
        this.f325909c = context;
        this.f325908b = auVar;
        this.f325910d = tVar;
        this.f325911e = aVar;
    }

    /* renamed from: a */
    public final C50818do mo103289a(C92109e eVar) {
        String str;
        String str2;
        C50731p pVar;
        C92109e eVar2 = eVar;
        int i = eVar2.f256809c;
        if (i <= 0) {
            return null;
        }
        int a = C92097d.m151127a(eVar2.f256814h);
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 == 1) {
            str2 = this.f325909c.getString(R.string.commute_eta_msg, new Object[]{"%1$s", "%2$s"});
            int i3 = i % 60;
            if (i >= 60) {
                int i4 = i / 60;
                if (i3 == 0) {
                    str = this.f325909c.getString(R.string.commute_eta_time_hour, new Object[]{Integer.toString(i4)});
                } else {
                    str = this.f325909c.getString(R.string.commute_eta_time_hour_minute, new Object[]{Integer.toString(i4), Integer.toString(i3)});
                }
            } else {
                str = this.f325909c.getString(R.string.commute_eta_time_minute, new Object[]{Integer.toString(i3)});
            }
        } else if (i2 != 2) {
            C59104x c = f325907a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SmartspaceCommuteIH");
            ((C59052c) ((C59052c) c).mo56372aa(33107)).mo56386p("Received commute update with unknown channel.");
            return null;
        } else {
            str2 = this.f325909c.getString(R.string.transit_eta_msg, new Object[]{"%2$s", "%1$s"});
            str = C89407a.m145418a(this.f325909c, TimeUnit.MINUTES.toMillis((long) i) + this.f325911e.mo26870b(), 0, false).toString();
        }
        long b = this.f325911e.mo26870b();
        C50790cn cnVar = (C50790cn) C50818do.f132293H.createBuilder();
        String str3 = eVar2.f256808b;
        int a2 = C92097d.m151127a(eVar2.f256814h);
        if (a2 == 0) {
            a2 = 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        sb.append(a2 - 1);
        int hashCode = sb.toString().hashCode();
        cnVar.copyOnWrite();
        C50818do doVar = (C50818do) cnVar.instance;
        doVar.f132304a |= 4;
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
        C50801cy cyVar = (C50801cy) C50802cz.f132236g.createBuilder();
        C50717b bVar = (C50717b) C50720e.f131985f.createBuilder();
        bVar.copyOnWrite();
        C50720e eVar3 = (C50720e) bVar.instance;
        str.getClass();
        eVar3.f131987a |= 1;
        eVar3.f131988b = str;
        C50722g gVar = C50722g.UNSPECIFIED;
        bVar.copyOnWrite();
        C50720e eVar4 = (C50720e) bVar.instance;
        eVar4.f131989c = gVar.f131998e;
        eVar4.f131987a |= 2;
        C50719d dVar = C50719d.FIXED_STRING;
        bVar.copyOnWrite();
        C50720e eVar5 = (C50720e) bVar.instance;
        eVar5.f131990d = dVar.f131984e;
        eVar5.f131987a |= 4;
        bVar.copyOnWrite();
        C50720e eVar6 = (C50720e) bVar.instance;
        eVar6.f131987a |= 8;
        eVar6.f131991e = false;
        C50717b bVar2 = (C50717b) C50720e.f131985f.createBuilder();
        String str4 = eVar2.f256808b;
        bVar2.copyOnWrite();
        C50720e eVar7 = (C50720e) bVar2.instance;
        str4.getClass();
        eVar7.f131987a |= 1;
        eVar7.f131988b = str4;
        C50722g gVar2 = C50722g.END;
        bVar2.copyOnWrite();
        C50720e eVar8 = (C50720e) bVar2.instance;
        eVar8.f131989c = gVar2.f131998e;
        eVar8.f131987a |= 2;
        C50719d dVar2 = C50719d.FIXED_STRING;
        bVar2.copyOnWrite();
        C50720e eVar9 = (C50720e) bVar2.instance;
        eVar9.f131990d = dVar2.f131984e;
        eVar9.f131987a |= 4;
        bVar2.copyOnWrite();
        C50720e eVar10 = (C50720e) bVar2.instance;
        eVar10.f131987a |= 8;
        eVar10.f131991e = false;
        C50716a aVar = (C50716a) C50723h.f131999e.createBuilder();
        aVar.copyOnWrite();
        C50723h hVar = (C50723h) aVar.instance;
        str2.getClass();
        hVar.f132001a |= 1;
        hVar.f132002b = str2;
        aVar.mo53428a((C50720e) bVar.build());
        aVar.mo53428a((C50720e) bVar2.build());
        C50722g gVar3 = C50722g.UNSPECIFIED;
        aVar.copyOnWrite();
        C50723h hVar2 = (C50723h) aVar.instance;
        hVar2.f132003c = gVar3.f131998e;
        hVar2.f132001a |= 2;
        cyVar.copyOnWrite();
        C50802cz czVar = (C50802cz) cyVar.instance;
        C50723h hVar3 = (C50723h) aVar.build();
        hVar3.getClass();
        czVar.f132239b = hVar3;
        czVar.f132238a |= 1;
        C50716a aVar2 = (C50716a) C50723h.f131999e.createBuilder();
        String str5 = eVar2.f256810d;
        aVar2.copyOnWrite();
        C50723h hVar4 = (C50723h) aVar2.instance;
        str5.getClass();
        hVar4.f132001a |= 1;
        hVar4.f132002b = str5;
        C50722g gVar4 = C50722g.UNSPECIFIED;
        aVar2.copyOnWrite();
        C50723h hVar5 = (C50723h) aVar2.instance;
        hVar5.f132003c = gVar4.f131998e;
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
        doVar4.f132309f = czVar3;
        doVar4.f132304a |= 16;
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
        C50794cr crVar = C50794cr.COMMUTE_TIME;
        cnVar.copyOnWrite();
        C50818do doVar6 = (C50818do) cnVar.instance;
        doVar6.f132315l = crVar.f132222T;
        doVar6.f132304a |= 1024;
        if (this.f325910d.mo79746e(C89985ax.f246715aw)) {
            pVar = C50731p.START_ACTIVITY;
        } else {
            pVar = C50731p.BROADCAST;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(eVar2.f256812f));
        intent.addFlags(268435457);
        Intent d = C92122r.m151186d(intent, (String) null, (String) null, C50794cr.COMMUTE_TIME, pVar, true);
        C50732q qVar = (C50732q) C50733r.f132021d.createBuilder();
        qVar.copyOnWrite();
        C50733r rVar = (C50733r) qVar.instance;
        rVar.f132024b = pVar.f132020d;
        rVar.f132023a |= 1;
        String uri = d.toUri(1);
        qVar.copyOnWrite();
        C50733r rVar2 = (C50733r) qVar.instance;
        uri.getClass();
        rVar2.f132023a = 2 | rVar2.f132023a;
        rVar2.f132025c = uri;
        cnVar.copyOnWrite();
        C50818do doVar7 = (C50818do) cnVar.instance;
        C50733r rVar3 = (C50733r) qVar.build();
        rVar3.getClass();
        doVar7.f132316m = rVar3;
        doVar7.f132304a |= 2048;
        cnVar.copyOnWrite();
        C50818do doVar8 = (C50818do) cnVar.instance;
        doVar8.f132304a |= 4096;
        doVar8.f132317n = b;
        cnVar.copyOnWrite();
        C50818do doVar9 = (C50818do) cnVar.instance;
        doVar9.f132304a |= 8192;
        doVar9.f132318o = b;
        long millis = TimeUnit.MINUTES.toMillis((long) i);
        cnVar.copyOnWrite();
        C50818do doVar10 = (C50818do) cnVar.instance;
        doVar10.f132304a |= 16384;
        doVar10.f132319p = millis;
        C50795cs csVar = (C50795cs) C50796ct.f132223c.createBuilder();
        long j = eVar2.f256813g;
        csVar.copyOnWrite();
        C50796ct ctVar = (C50796ct) csVar.instance;
        ctVar.f132225a |= 1;
        ctVar.f132226b = j;
        cnVar.copyOnWrite();
        C50818do doVar11 = (C50818do) cnVar.instance;
        C50796ct ctVar2 = (C50796ct) csVar.build();
        ctVar2.getClass();
        doVar11.f132320q = ctVar2;
        doVar11.f132304a |= 32768;
        cnVar.copyOnWrite();
        C50818do doVar12 = (C50818do) cnVar.instance;
        doVar12.f132304a |= 65536;
        doVar12.f132321r = true;
        cnVar.copyOnWrite();
        C50818do doVar13 = (C50818do) cnVar.instance;
        doVar13.f132304a |= 524288;
        doVar13.f132324u = true;
        return (C50818do) cnVar.build();
    }

    /* renamed from: b */
    public final C50794cr mo103282b() {
        return C50794cr.COMMUTE_TIME;
    }

    /* renamed from: c */
    public final C60870cx mo103283c(Object obj) {
        C117383a aVar;
        if (obj == null) {
            return C60856cj.m92900i(new C117383a());
        }
        C92109e eVar = (C92109e) obj;
        if (eVar.f256813g == 0) {
            return C60856cj.m92900i(new C117383a(C50794cr.COMMUTE_TIME));
        }
        if ((eVar.f256807a & 8) != 0) {
            Uri parse = Uri.parse(eVar.f256811e);
            SettableFuture settableFuture = new SettableFuture();
            C91189au auVar = this.f325908b;
            auVar.mo85428r(auVar.mo85417d(parse), "SmartspaceCommuteIH.ImageCallback", new C117402f(this, eVar, settableFuture));
            return settableFuture;
        }
        C50818do a = mo103289a(eVar);
        if (a != null) {
            aVar = new C117383a(a);
        } else {
            aVar = new C117383a();
        }
        return C60856cj.m92900i(aVar);
    }

    /* renamed from: e */
    public final boolean mo103285e(Object obj) {
        return obj instanceof C92109e;
    }
}
