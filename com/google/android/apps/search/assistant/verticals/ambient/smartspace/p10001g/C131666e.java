package com.google.android.apps.search.assistant.verticals.ambient.smartspace.p10001g;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.h.c.a;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123712af;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131246o;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131251t;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47810es;
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
import com.google.assistant.p3886c.p3888b.C50728m;
import com.google.assistant.p3886c.p3888b.C50729n;
import com.google.assistant.p3886c.p3888b.C50731p;
import com.google.assistant.p3886c.p3888b.C50732q;
import com.google.assistant.p3886c.p3888b.C50733r;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.net.URISyntaxException;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.g.e */
/* compiled from: PG */
public final class C131666e {

    /* renamed from: a */
    public static final C59071e f359749a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.ambient.smartspace.g.e");

    /* renamed from: b */
    public final Context f359750b;

    /* renamed from: c */
    private final boolean f359751c;

    /* renamed from: d */
    private final boolean f359752d;

    /* renamed from: e */
    private final C21370a f359753e;

    /* renamed from: f */
    private final C131251t f359754f;

    /* renamed from: g */
    private final C60887da f359755g;

    public C131666e(Context context, boolean z, boolean z2, C21370a aVar, C131251t tVar, C60887da daVar) {
        this.f359750b = context;
        this.f359751c = z;
        this.f359752d = z2;
        this.f359753e = aVar;
        this.f359754f = tVar;
        this.f359755g = daVar;
    }

    /* renamed from: b */
    private final C60870cx m214112b(int i) {
        C131662a aVar = new C131662a(this, i);
        return C60856cj.m92904m(C47810es.m84978r(aVar), this.f359755g);
    }

    /* renamed from: a */
    public final C60870cx mo110249a(C123712af afVar, String str, int i) {
        C50790cn cnVar = (C50790cn) C50818do.f132293H.createBuilder();
        int b = C131246o.m213739b(str, i);
        long b2 = this.f359753e.mo26870b();
        long j = afVar.f341709d;
        long j2 = "time".equals((String) C58557jl.m90131l(C58869cf.m90936b(new C58903m(':')).mo56153g(str))) ? afVar.f341715j : b2;
        C59071e eVar = f359749a;
        C59104x b3 = eVar.mo56224b();
        b3.mo56378ag(C58975e.f156826a, "SSHotelCheckInIH");
        ((C59052c) ((C59052c) b3).mo56372aa(39161)).mo56388r("#buildSmartspaceProtoForHotelCheckInUpdate() Expiration %s", j);
        cnVar.copyOnWrite();
        C50818do doVar = (C50818do) cnVar.instance;
        doVar.f132304a |= 4;
        doVar.f132307d = b;
        cnVar.copyOnWrite();
        C50818do doVar2 = (C50818do) cnVar.instance;
        doVar2.f132304a |= 1;
        doVar2.f132305b = false;
        C50792cp cpVar = C50792cp.PRIMARY;
        cnVar.copyOnWrite();
        C50818do doVar3 = (C50818do) cnVar.instance;
        doVar3.f132306c = cpVar.f132174e;
        doVar3.f132304a |= 2;
        cnVar.copyOnWrite();
        C50818do doVar4 = (C50818do) cnVar.instance;
        doVar4.f132304a |= 4096;
        doVar4.f132317n = b2;
        cnVar.copyOnWrite();
        C50818do doVar5 = (C50818do) cnVar.instance;
        doVar5.f132304a |= 8192;
        doVar5.f132318o = j2;
        cnVar.copyOnWrite();
        C50818do doVar6 = (C50818do) cnVar.instance;
        doVar6.f132304a |= 16384;
        doVar6.f132319p = j - b2;
        C50728m mVar = (C50728m) C50729n.f132007g.createBuilder();
        mVar.copyOnWrite();
        C50729n nVar = (C50729n) mVar.instance;
        nVar.f132009a |= 1;
        nVar.f132010b = "com.google.android.apps.nexuslauncher.extra.SMARTSPACE_ICON";
        cnVar.copyOnWrite();
        C50818do doVar7 = (C50818do) cnVar.instance;
        C50729n nVar2 = (C50729n) mVar.build();
        nVar2.getClass();
        doVar7.f132314k = nVar2;
        doVar7.f132304a |= 512;
        C50801cy cyVar = (C50801cy) C50802cz.f132236g.createBuilder();
        C50716a aVar = (C50716a) C50723h.f131999e.createBuilder();
        String str2 = afVar.f341707b;
        aVar.copyOnWrite();
        C50723h hVar = (C50723h) aVar.instance;
        str2.getClass();
        hVar.f132001a |= 1;
        hVar.f132002b = str2;
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
        String str3 = afVar.f341708c;
        aVar2.copyOnWrite();
        C50723h hVar4 = (C50723h) aVar2.instance;
        str3.getClass();
        hVar4.f132001a |= 1;
        hVar4.f132002b = str3;
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
        cnVar.copyOnWrite();
        C50818do doVar8 = (C50818do) cnVar.instance;
        C50802cz czVar3 = (C50802cz) cyVar.build();
        czVar3.getClass();
        doVar8.f132309f = czVar3;
        doVar8.f132304a |= 16;
        C50794cr crVar = C50794cr.HOTEL_CHECK_IN;
        cnVar.copyOnWrite();
        C50818do doVar9 = (C50818do) cnVar.instance;
        doVar9.f132315l = crVar.f132222T;
        doVar9.f132304a |= 1024;
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
        cnVar.copyOnWrite();
        C50818do doVar11 = (C50818do) cnVar.instance;
        doVar11.f132304a |= 65536;
        doVar11.f132321r = true;
        long j3 = afVar.f341715j;
        if (j3 != 0) {
            Instant ofEpochMilli = Instant.ofEpochMilli(j3);
            C50814dk dkVar = (C50814dk) C50817dn.f132287e.createBuilder();
            C50815dl dlVar = (C50815dl) C50816dm.f132281e.createBuilder();
            long epochMilli = ofEpochMilli.minus(Duration.ofHours(3)).toEpochMilli();
            dlVar.copyOnWrite();
            C50816dm dmVar = (C50816dm) dlVar.instance;
            dmVar.f132283a |= 1;
            dmVar.f132284b = epochMilli;
            long epochMilli2 = ofEpochMilli.plus(Duration.ofHours(1)).toEpochMilli();
            dlVar.copyOnWrite();
            C50816dm dmVar2 = (C50816dm) dlVar.instance;
            dmVar2.f132283a |= 2;
            dmVar2.f132285c = epochMilli2;
            dlVar.mo53468a(j3);
            dkVar.copyOnWrite();
            C50817dn dnVar = (C50817dn) dkVar.instance;
            C50816dm dmVar3 = (C50816dm) dlVar.build();
            dmVar3.getClass();
            dnVar.f132292d = dmVar3;
            dnVar.f132289a |= 8;
            cnVar.copyOnWrite();
            C50818do doVar12 = (C50818do) cnVar.instance;
            C50817dn dnVar2 = (C50817dn) dkVar.build();
            dnVar2.getClass();
            doVar12.f132295A = dnVar2;
            doVar12.f132304a |= 67108864;
        }
        if (this.f359752d && this.f359754f.mo110136l() && afVar.f341714i.equals("Airbnb")) {
            C59104x b4 = eVar.mo56224b();
            b4.mo56378ag(C58975e.f156826a, "SSHotelCheckInIH");
            ((C59052c) ((C59052c) b4).mo56372aa(39166)).mo56386p("#buildSmartspaceProtoForHotelCheckInUpdate() Airbnb tap target");
            return C60922j.m93044g(m214112b(R.drawable.quantum_gm_ic_hotel_white_24), C47810es.m84963c(new C131663b(cnVar)), this.f359755g);
        } else if (this.f359751c && (afVar.f341706a & 32) != 0 && !afVar.f341711f.isEmpty()) {
            C59104x b5 = eVar.mo56224b();
            b5.mo56378ag(C58975e.f156826a, "SSHotelCheckInIH");
            ((C59052c) ((C59052c) b5).mo56372aa(39164)).mo56386p("#buildSmartspaceProtoForHotelCheckInUpdate() Gmail tap target");
            try {
                Intent parseUri = Intent.parseUri(afVar.f341711f, 1);
                parseUri.addFlags(268435457);
                Intent a = a.a(parseUri, (String) null, C50794cr.HOTEL_CHECK_IN, C50731p.START_ACTIVITY);
                C50732q qVar = (C50732q) C50733r.f132021d.createBuilder();
                C50731p pVar = C50731p.START_ACTIVITY;
                qVar.copyOnWrite();
                C50733r rVar = (C50733r) qVar.instance;
                rVar.f132024b = pVar.f132020d;
                rVar.f132023a |= 1;
                String uri = a.toUri(1);
                qVar.copyOnWrite();
                C50733r rVar2 = (C50733r) qVar.instance;
                uri.getClass();
                rVar2.f132023a |= 2;
                rVar2.f132025c = uri;
                cnVar.copyOnWrite();
                C50818do doVar13 = (C50818do) cnVar.instance;
                C50733r rVar3 = (C50733r) qVar.build();
                rVar3.getClass();
                doVar13.f132316m = rVar3;
                doVar13.f132304a |= 2048;
            } catch (URISyntaxException e) {
                C59104x d = f359749a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "SSHotelCheckInIH");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(39165)).mo56389s("Unable to parse action_url: %s", afVar.f341711f);
            }
            return C60922j.m93044g(m214112b(R.drawable.quantum_gm_ic_gmail_white_24), C47810es.m84963c(new C131664c(cnVar)), this.f359755g);
        } else if ((afVar.f341706a & 16) == 0 || afVar.f341710e.isEmpty()) {
            C59104x d2 = eVar.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "SSHotelCheckInIH");
            ((C59052c) ((C59052c) d2).mo56372aa(39162)).mo56386p("#buildSmartspaceProtoForHotelCheckInUpdate() No tap target available.");
            return C60856cj.m92900i(Optional.empty());
        } else {
            C59104x b6 = eVar.mo56224b();
            b6.mo56378ag(C58975e.f156826a, "SSHotelCheckInIH");
            ((C59052c) ((C59052c) b6).mo56372aa(39163)).mo56386p("#buildSmartspaceProtoForHotelCheckInUpdate() Default tap target");
            return C60922j.m93044g(m214112b(R.drawable.quantum_gm_ic_hotel_white_24), C47810es.m84963c(new C131665d(afVar, cnVar)), this.f359755g);
        }
    }
}
