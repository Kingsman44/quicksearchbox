package com.google.android.apps.gsa.staticplugins.smartspace.p8761b;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.opa.smartspace.C83738aj;
import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.smartspace.C92122r;
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
import com.google.assistant.p3886c.p3888b.C50722g;
import com.google.assistant.p3886c.p3888b.C50723h;
import com.google.assistant.p3886c.p3888b.C50728m;
import com.google.assistant.p3886c.p3888b.C50729n;
import com.google.assistant.p3886c.p3888b.C50731p;
import com.google.assistant.p3886c.p3888b.C50732q;
import com.google.assistant.p3886c.p3888b.C50733r;
import com.google.assistant.p3994s.p3995a.C53165du;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.b.b */
/* compiled from: PG */
public final class C117353b {

    /* renamed from: a */
    public final C91189au f325779a;

    /* renamed from: b */
    private final Context f325780b;

    /* renamed from: c */
    private final C86124t f325781c;

    /* renamed from: d */
    private final C21370a f325782d;

    public C117353b(Context context, C91189au auVar, C86124t tVar, C21370a aVar) {
        this.f325780b = context;
        this.f325779a = auVar;
        this.f325781c = tVar;
        this.f325782d = aVar;
    }

    /* renamed from: b */
    private final C50802cz m195017b(C53165du duVar) {
        String str;
        C50801cy cyVar = (C50801cy) C50802cz.f132236g.createBuilder();
        C50716a aVar = (C50716a) C50723h.f131999e.createBuilder();
        if (duVar.f139341b) {
            str = this.f325780b.getString(R.string.own_birthday_title);
        } else {
            str = this.f325780b.getString(R.string.vip_birthday_title, new Object[]{duVar.f139340a});
        }
        aVar.copyOnWrite();
        C50723h hVar = (C50723h) aVar.instance;
        str.getClass();
        hVar.f132001a |= 1;
        hVar.f132002b = str;
        C50722g gVar = C50722g.UNSPECIFIED;
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
        String string = this.f325780b.getResources().getString(R.string.birthday_subtitle);
        aVar2.copyOnWrite();
        C50723h hVar4 = (C50723h) aVar2.instance;
        string.getClass();
        hVar4.f132001a = 1 | hVar4.f132001a;
        hVar4.f132002b = string;
        C50722g gVar2 = C50722g.UNSPECIFIED;
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
        return (C50802cz) cyVar.build();
    }

    /* renamed from: a */
    public final C50818do mo103275a(C83739ak akVar) {
        C53165du duVar;
        int i;
        C50731p pVar;
        C83738aj ajVar = akVar.f228233b;
        if (ajVar == null) {
            ajVar = C83738aj.f228226c;
        }
        if (ajVar.f228228a == 5) {
            duVar = (C53165du) ajVar.f228229b;
        } else {
            duVar = C53165du.f139338g;
        }
        long b = this.f325782d.mo26870b();
        long j = duVar.f139343d;
        if (!duVar.f139345f.isEmpty()) {
            i = duVar.f139345f.hashCode();
        } else {
            i = duVar.f139340a.hashCode();
        }
        if (this.f325781c.mo79746e(C89985ax.f246715aw)) {
            pVar = C50731p.START_ACTIVITY;
        } else {
            pVar = C50731p.BROADCAST;
        }
        Intent d = C92122r.m151186d((Intent) null, (String) null, Integer.toString(i), C50794cr.BIRTHDAY, pVar, true);
        String str = akVar.f228242k;
        if (!str.isEmpty()) {
            d.putExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.ZERO_STATE_DEEP_LINK_ID_EXTRA", str);
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
        C50802cz b2 = m195017b(duVar);
        cnVar.copyOnWrite();
        C50818do doVar4 = (C50818do) cnVar.instance;
        b2.getClass();
        doVar4.f132312i = b2;
        doVar4.f132304a |= 128;
        C50802cz b3 = m195017b(duVar);
        cnVar.copyOnWrite();
        C50818do doVar5 = (C50818do) cnVar.instance;
        b3.getClass();
        doVar5.f132309f = b3;
        doVar5.f132304a |= 16;
        C50728m mVar = (C50728m) C50729n.f132007g.createBuilder();
        mVar.copyOnWrite();
        C50729n nVar = (C50729n) mVar.instance;
        nVar.f132009a |= 1;
        nVar.f132010b = "com.google.android.apps.nexuslauncher.extra.SMARTSPACE_ICON";
        cnVar.copyOnWrite();
        C50818do doVar6 = (C50818do) cnVar.instance;
        C50729n nVar2 = (C50729n) mVar.build();
        nVar2.getClass();
        doVar6.f132314k = nVar2;
        doVar6.f132304a |= 512;
        C50794cr crVar = C50794cr.BIRTHDAY;
        cnVar.copyOnWrite();
        C50818do doVar7 = (C50818do) cnVar.instance;
        doVar7.f132315l = crVar.f132222T;
        doVar7.f132304a |= 1024;
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
        C50818do doVar8 = (C50818do) cnVar.instance;
        C50733r rVar3 = (C50733r) qVar.build();
        rVar3.getClass();
        doVar8.f132316m = rVar3;
        doVar8.f132304a |= 2048;
        cnVar.copyOnWrite();
        C50818do doVar9 = (C50818do) cnVar.instance;
        doVar9.f132304a |= 4096;
        doVar9.f132317n = b;
        cnVar.copyOnWrite();
        C50818do doVar10 = (C50818do) cnVar.instance;
        doVar10.f132304a |= 8192;
        doVar10.f132318o = b;
        cnVar.copyOnWrite();
        C50818do doVar11 = (C50818do) cnVar.instance;
        doVar11.f132304a |= 16384;
        doVar11.f132319p = j - b;
        C50795cs csVar = (C50795cs) C50796ct.f132223c.createBuilder();
        csVar.copyOnWrite();
        C50796ct ctVar = (C50796ct) csVar.instance;
        ctVar.f132225a |= 1;
        ctVar.f132226b = j;
        cnVar.copyOnWrite();
        C50818do doVar12 = (C50818do) cnVar.instance;
        C50796ct ctVar2 = (C50796ct) csVar.build();
        ctVar2.getClass();
        doVar12.f132320q = ctVar2;
        doVar12.f132304a |= 32768;
        cnVar.copyOnWrite();
        C50818do doVar13 = (C50818do) cnVar.instance;
        doVar13.f132304a |= 65536;
        doVar13.f132321r = true;
        cnVar.copyOnWrite();
        C50818do doVar14 = (C50818do) cnVar.instance;
        doVar14.f132304a |= 524288;
        doVar14.f132324u = true;
        return (C50818do) cnVar.build();
    }
}
