package com.google.android.apps.gsa.staticplugins.opa.util;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88092ow;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88093ox;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52151hc;
import com.google.assistant.p3897e.p3921j.C52152hd;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.knowledge.p4661a.p4662a.C61745g;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61747i;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61751m;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.knowledge.p4661a.p4662a.C61757s;
import com.google.knowledge.p4661a.p4662a.C61758t;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.cy */
/* compiled from: PG */
public final class C113870cy {

    /* renamed from: a */
    private final C86124t f315288a;

    public C113870cy(C86124t tVar) {
        this.f315288a = tVar;
    }

    /* renamed from: b */
    public static final void m188506b(C52152hd hdVar, C107698i iVar) {
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.IntentInput";
        C63088z byteString = hdVar.toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "asst_input.INTENT";
        dsVar.mo53729a("intent_input", (C52230ka) jzVar.build());
        C88093ox oxVar = (C88093ox) C88094oy.f238174g.createBuilder();
        C63088z byteString2 = ((C51805du) dsVar.build()).toByteString();
        oxVar.copyOnWrite();
        C88094oy oyVar = (C88094oy) oxVar.instance;
        byteString2.getClass();
        oyVar.f238176a |= 1;
        oyVar.f238177b = byteString2;
        C88489j jVar = new C88489j(C87739bu.OPA_CLIENT_INPUT);
        jVar.mo82014b(C88092ow.f238173a, (C88094oy) oxVar.build());
        iVar.mo96219b(jVar.mo82013a());
    }

    /* renamed from: a */
    public final C52152hd mo100735a() {
        C61752n nVar;
        if (this.f315288a.mo79746e(C90014bt.f247737mm)) {
            C61747i iVar = (C61747i) C61748j.f166800d.createBuilder();
            C61757s sVar = (C61757s) C61758t.f166824c.createBuilder();
            sVar.copyOnWrite();
            C61758t tVar = (C61758t) sVar.instance;
            tVar.f166826a = 4;
            tVar.f166827b = true;
            iVar.copyOnWrite();
            C61748j jVar = (C61748j) iVar.instance;
            C61758t tVar2 = (C61758t) sVar.build();
            tVar2.getClass();
            jVar.f166803b = tVar2;
            jVar.f166802a = 3;
            C61748j jVar2 = (C61748j) iVar.build();
            C61745g gVar = (C61745g) C61746h.f166791g.createBuilder();
            gVar.copyOnWrite();
            C61746h hVar = (C61746h) gVar.instance;
            hVar.f166793a |= 2;
            hVar.f166796d = "DisableTts";
            gVar.copyOnWrite();
            C61746h hVar2 = (C61746h) gVar.instance;
            jVar2.getClass();
            hVar2.f166797e = jVar2;
            hVar2.f166793a |= 4;
            C61751m mVar = (C61751m) C61752n.f166808f.createBuilder();
            mVar.copyOnWrite();
            C61752n nVar2 = (C61752n) mVar.instance;
            nVar2.f166810a = 4 | nVar2.f166810a;
            nVar2.f166811b = "Help";
            mVar.mo58185d((C61746h) gVar.build());
            nVar = (C61752n) mVar.build();
        } else {
            C61751m mVar2 = (C61751m) C61752n.f166808f.createBuilder();
            mVar2.copyOnWrite();
            C61752n nVar3 = (C61752n) mVar2.instance;
            nVar3.f166810a = 4 | nVar3.f166810a;
            nVar3.f166811b = "Help";
            nVar = (C61752n) mVar2.build();
        }
        C52151hc hcVar = (C52151hc) C52152hd.f136850c.createBuilder();
        C63088z byteString = nVar.toByteString();
        hcVar.copyOnWrite();
        C52152hd hdVar = (C52152hd) hcVar.instance;
        byteString.getClass();
        hdVar.f136852a = 1 | hdVar.f136852a;
        hdVar.f136853b = byteString;
        return (C52152hd) hcVar.build();
    }
}
