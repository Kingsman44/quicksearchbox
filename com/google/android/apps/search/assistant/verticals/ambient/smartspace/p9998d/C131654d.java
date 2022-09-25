package com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9998d;

import android.content.Context;
import android.content.res.Resources;
import com.google.assistant.p3886c.C50752bq;
import com.google.assistant.p3886c.C50753br;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50801cy;
import com.google.assistant.p3886c.C50802cz;
import com.google.assistant.p3886c.C50812di;
import com.google.assistant.p3886c.C50813dj;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.C50844p;
import com.google.assistant.p3886c.p3888b.C50716a;
import com.google.assistant.p3886c.p3888b.C50717b;
import com.google.assistant.p3886c.p3888b.C50719d;
import com.google.assistant.p3886c.p3888b.C50720e;
import com.google.assistant.p3886c.p3888b.C50722g;
import com.google.assistant.p3886c.p3888b.C50723h;
import com.google.assistant.p3886c.p3888b.C50728m;
import com.google.assistant.p3886c.p3888b.C50729n;
import com.google.assistant.p3994s.p3995a.C53187ep;
import com.google.assistant.p3994s.p3995a.C53190es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.d.d */
/* compiled from: PG */
public final /* synthetic */ class C131654d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C131655e f359711a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f359712b;

    /* renamed from: c */
    public final /* synthetic */ C50790cn f359713c;

    /* renamed from: d */
    public final /* synthetic */ C53190es f359714d;

    /* renamed from: e */
    public final /* synthetic */ boolean f359715e;

    /* renamed from: f */
    public final /* synthetic */ C60870cx f359716f;

    public /* synthetic */ C131654d(C131655e eVar, C60870cx cxVar, C50790cn cnVar, C53190es esVar, boolean z, C60870cx cxVar2) {
        this.f359711a = eVar;
        this.f359712b = cxVar;
        this.f359713c = cnVar;
        this.f359714d = esVar;
        this.f359715e = z;
        this.f359716f = cxVar2;
    }

    public final Object call() {
        C131655e eVar = this.f359711a;
        C60870cx cxVar = this.f359712b;
        C50790cn cnVar = this.f359713c;
        C53190es esVar = this.f359714d;
        boolean z = this.f359715e;
        C60870cx cxVar2 = this.f359716f;
        C50752bq bqVar = (C50752bq) C50753br.f132073c.createBuilder();
        C50844p pVar = (C50844p) C60856cj.m92909r(cxVar);
        bqVar.copyOnWrite();
        C50753br brVar = (C50753br) bqVar.instance;
        pVar.getClass();
        brVar.f132077b = pVar;
        brVar.f132076a |= 1;
        C50753br brVar2 = (C50753br) bqVar.build();
        Context context = eVar.f359718a;
        boolean z2 = eVar.f359728k;
        C50801cy cyVar = (C50801cy) C50802cz.f132236g.createBuilder();
        C50716a aVar = (C50716a) C50723h.f131999e.createBuilder();
        String string = context.getResources().getString(C131655e.m214092a(esVar), new Object[]{"%1$s"});
        aVar.copyOnWrite();
        C50723h hVar = (C50723h) aVar.instance;
        string.getClass();
        hVar.f132001a |= 1;
        hVar.f132002b = string;
        C53187ep epVar = esVar.f139402g;
        if (epVar == null) {
            epVar = C53187ep.f139383h;
        }
        aVar.mo53428a(C131655e.m214094c(epVar.f139386b));
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
        C50723h d = C131655e.m214095d(context, esVar, z, z2);
        cyVar.copyOnWrite();
        C50802cz czVar2 = (C50802cz) cyVar.instance;
        d.getClass();
        czVar2.f132241d = d;
        czVar2.f132238a |= 4;
        C50802cz czVar3 = (C50802cz) cyVar.build();
        cnVar.copyOnWrite();
        C50818do doVar = (C50818do) cnVar.instance;
        C50818do doVar2 = C50818do.f132293H;
        czVar3.getClass();
        doVar.f132309f = czVar3;
        doVar.f132304a |= 16;
        Context context2 = eVar.f359718a;
        boolean z3 = eVar.f359728k;
        C50801cy cyVar2 = (C50801cy) C50802cz.f132236g.createBuilder();
        C50717b bVar = (C50717b) C50720e.f131985f.createBuilder();
        C50722g gVar2 = C50722g.UNSPECIFIED;
        bVar.copyOnWrite();
        C50720e eVar2 = (C50720e) bVar.instance;
        eVar2.f131989c = gVar2.f131998e;
        eVar2.f131987a |= 2;
        C50719d dVar = C50719d.EVENT_START_TIME;
        bVar.copyOnWrite();
        C50720e eVar3 = (C50720e) bVar.instance;
        eVar3.f131990d = dVar.f131984e;
        eVar3.f131987a |= 4;
        bVar.copyOnWrite();
        C50720e eVar4 = (C50720e) bVar.instance;
        eVar4.f131987a |= 8;
        eVar4.f131991e = true;
        C50720e eVar5 = (C50720e) bVar.build();
        C50716a aVar2 = (C50716a) C50723h.f131999e.createBuilder();
        Resources resources = context2.getResources();
        int a = C131655e.m214092a(esVar);
        Object[] objArr = new Object[1];
        C53187ep epVar2 = esVar.f139402g;
        if (epVar2 == null) {
            epVar2 = C53187ep.f139383h;
        }
        objArr[0] = epVar2.f139386b;
        String string2 = resources.getString(a, objArr);
        aVar2.copyOnWrite();
        C50723h hVar4 = (C50723h) aVar2.instance;
        string2.getClass();
        hVar4.f132001a |= 1;
        hVar4.f132002b = string2;
        C53187ep epVar3 = esVar.f139401f;
        if (epVar3 == null) {
            epVar3 = C53187ep.f139383h;
        }
        aVar2.mo53428a(C131655e.m214094c(epVar3.f139386b));
        Resources resources2 = context2.getResources();
        int a2 = C131655e.m214092a(esVar);
        Object[] objArr2 = new Object[1];
        C53187ep epVar4 = esVar.f139402g;
        if (epVar4 == null) {
            epVar4 = C53187ep.f139383h;
        }
        objArr2[0] = epVar4.f139386b;
        aVar2.mo53428a(C131655e.m214094c(resources2.getString(a2, objArr2)));
        aVar2.mo53428a(eVar5);
        C50722g gVar3 = C50722g.UNSPECIFIED;
        aVar2.copyOnWrite();
        C50723h hVar5 = (C50723h) aVar2.instance;
        hVar5.f132003c = gVar3.f131998e;
        hVar5.f132001a |= 2;
        cyVar2.copyOnWrite();
        C50802cz czVar4 = (C50802cz) cyVar2.instance;
        C50723h hVar6 = (C50723h) aVar2.build();
        hVar6.getClass();
        czVar4.f132239b = hVar6;
        czVar4.f132238a |= 1;
        C50723h d2 = C131655e.m214095d(context2, esVar, z, z3);
        cyVar2.copyOnWrite();
        C50802cz czVar5 = (C50802cz) cyVar2.instance;
        d2.getClass();
        czVar5.f132241d = d2;
        czVar5.f132238a |= 4;
        C50802cz czVar6 = (C50802cz) cyVar2.build();
        cnVar.copyOnWrite();
        C50818do doVar3 = (C50818do) cnVar.instance;
        czVar6.getClass();
        doVar3.f132308e = czVar6;
        doVar3.f132304a |= 8;
        Context context3 = eVar.f359718a;
        boolean z4 = eVar.f359728k;
        C50801cy cyVar3 = (C50801cy) C50802cz.f132236g.createBuilder();
        C50716a aVar3 = (C50716a) C50723h.f131999e.createBuilder();
        String string3 = context3.getResources().getString(C131655e.m214092a(esVar), new Object[]{"%1$s"});
        aVar3.copyOnWrite();
        C50723h hVar7 = (C50723h) aVar3.instance;
        string3.getClass();
        hVar7.f132001a |= 1;
        hVar7.f132002b = string3;
        C53187ep epVar5 = esVar.f139402g;
        if (epVar5 == null) {
            epVar5 = C53187ep.f139383h;
        }
        aVar3.mo53428a(C131655e.m214094c(epVar5.f139386b));
        C50722g gVar4 = C50722g.UNSPECIFIED;
        aVar3.copyOnWrite();
        C50723h hVar8 = (C50723h) aVar3.instance;
        hVar8.f132003c = gVar4.f131998e;
        hVar8.f132001a |= 2;
        cyVar3.copyOnWrite();
        C50802cz czVar7 = (C50802cz) cyVar3.instance;
        C50723h hVar9 = (C50723h) aVar3.build();
        hVar9.getClass();
        czVar7.f132239b = hVar9;
        czVar7.f132238a |= 1;
        C50723h d3 = C131655e.m214095d(context3, esVar, z, z4);
        cyVar3.copyOnWrite();
        C50802cz czVar8 = (C50802cz) cyVar3.instance;
        d3.getClass();
        czVar8.f132241d = d3;
        czVar8.f132238a |= 4;
        C50802cz czVar9 = (C50802cz) cyVar3.build();
        cnVar.copyOnWrite();
        C50818do doVar4 = (C50818do) cnVar.instance;
        czVar9.getClass();
        doVar4.f132311h = czVar9;
        doVar4.f132304a |= 64;
        C50812di diVar = (C50812di) C50813dj.f132278a.createBuilder();
        diVar.mo58885m(C50753br.f132074d, brVar2);
        cnVar.copyOnWrite();
        C50818do doVar5 = (C50818do) cnVar.instance;
        C50813dj djVar = (C50813dj) diVar.build();
        djVar.getClass();
        doVar5.f132329z = djVar;
        doVar5.f132304a |= 33554432;
        C50729n nVar = ((C50818do) cnVar.instance).f132314k;
        if (nVar == null) {
            nVar = C50729n.f132007g;
        }
        C50728m mVar = (C50728m) nVar.toBuilder();
        C63088z zVar = (C63088z) C60856cj.m92909r(cxVar2);
        mVar.copyOnWrite();
        C50729n nVar2 = (C50729n) mVar.instance;
        zVar.getClass();
        nVar2.f132009a |= 16;
        nVar2.f132013e = zVar;
        cnVar.copyOnWrite();
        C50818do doVar6 = (C50818do) cnVar.instance;
        C50729n nVar3 = (C50729n) mVar.build();
        nVar3.getClass();
        doVar6.f132314k = nVar3;
        doVar6.f132304a |= 512;
        return Optional.m71637of(eVar.f359727j.mo110204b((C50818do) cnVar.build()).mo110198a());
    }
}
