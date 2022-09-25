package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8464o;

import android.content.Intent;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.smartspace.C92122r;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123759bz;
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
import com.google.assistant.p3886c.p3888b.C50722g;
import com.google.assistant.p3886c.p3888b.C50723h;
import com.google.assistant.p3886c.p3888b.C50728m;
import com.google.assistant.p3886c.p3888b.C50729n;
import com.google.assistant.p3886c.p3888b.C50731p;
import com.google.assistant.p3886c.p3888b.C50732q;
import com.google.assistant.p3886c.p3888b.C50733r;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.o.a */
/* compiled from: PG */
public final class C110842a {

    /* renamed from: a */
    private final C86124t f308814a;

    /* renamed from: b */
    private final C21370a f308815b;

    /* renamed from: c */
    private final C83794j f308816c;

    public C110842a(C86124t tVar, C21370a aVar, C83794j jVar) {
        this.f308814a = tVar;
        this.f308815b = aVar;
        this.f308816c = jVar;
    }

    /* renamed from: a */
    public final C50818do mo98895a(C123759bz bzVar, int i) {
        C50731p pVar;
        long b = this.f308815b.mo26870b();
        long j = bzVar.f341872d;
        if (!this.f308816c.mo77184w()) {
            i = String.valueOf(bzVar.f341870b).concat(String.valueOf(bzVar.f341871c)).hashCode();
        }
        C50790cn cnVar = (C50790cn) C50818do.f132293H.createBuilder();
        cnVar.copyOnWrite();
        C50818do doVar = (C50818do) cnVar.instance;
        doVar.f132304a |= 4;
        doVar.f132307d = i;
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
        C50716a aVar = (C50716a) C50723h.f131999e.createBuilder();
        String str = bzVar.f341870b;
        aVar.copyOnWrite();
        C50723h hVar = (C50723h) aVar.instance;
        str.getClass();
        hVar.f132001a |= 1;
        hVar.f132002b = str;
        C50722g gVar = C50722g.END;
        aVar.copyOnWrite();
        C50723h hVar2 = (C50723h) aVar.instance;
        hVar2.f132003c = gVar.f131998e;
        hVar2.f132001a |= 2;
        cyVar.copyOnWrite();
        C50802cz czVar = (C50802cz) cyVar.instance;
        C50723h hVar3 = (C50723h) aVar.build();
        hVar3.getClass();
        czVar.f132239b = hVar3;
        czVar.f132238a |= 1;
        C50716a aVar2 = (C50716a) C50723h.f131999e.createBuilder();
        String str2 = bzVar.f341871c;
        aVar2.copyOnWrite();
        C50723h hVar4 = (C50723h) aVar2.instance;
        str2.getClass();
        hVar4.f132001a |= 1;
        hVar4.f132002b = str2;
        C50722g gVar2 = C50722g.END;
        aVar2.copyOnWrite();
        C50723h hVar5 = (C50723h) aVar2.instance;
        hVar5.f132003c = gVar2.f131998e;
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
        C50794cr crVar = C50794cr.TIPS;
        cnVar.copyOnWrite();
        C50818do doVar6 = (C50818do) cnVar.instance;
        doVar6.f132315l = crVar.f132222T;
        doVar6.f132304a |= 1024;
        if (this.f308814a.mo79746e(C89985ax.f246715aw)) {
            pVar = C50731p.START_ACTIVITY;
        } else {
            pVar = C50731p.BROADCAST;
        }
        Intent intent = new Intent("com.google.android.apps.tips.action.SMART_SPACE");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addFlags(268435457);
        Intent d = C92122r.m151186d(intent, (String) null, (String) null, C50794cr.TIPS, pVar, false);
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
        cnVar.copyOnWrite();
        C50818do doVar10 = (C50818do) cnVar.instance;
        doVar10.f132304a |= 16384;
        doVar10.f132319p = j - b;
        C50795cs csVar = (C50795cs) C50796ct.f132223c.createBuilder();
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
        return (C50818do) cnVar.build();
    }
}
