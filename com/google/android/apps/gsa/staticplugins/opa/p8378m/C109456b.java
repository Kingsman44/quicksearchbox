package com.google.android.apps.gsa.staticplugins.opa.p8378m;

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

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.m.b */
/* compiled from: PG */
public final class C109456b {
    /* renamed from: a */
    public static C51805du m182151a(String str, boolean z) {
        C61745g gVar = (C61745g) C61746h.f166791g.createBuilder();
        if (z) {
            gVar.copyOnWrite();
            C61746h hVar = (C61746h) gVar.instance;
            hVar.f166793a |= 2;
            hVar.f166796d = "assistIdFilter";
        } else {
            gVar.copyOnWrite();
            C61746h hVar2 = (C61746h) gVar.instance;
            hVar2.f166793a |= 2;
            hVar2.f166796d = "backendIdFilter";
        }
        C61751m mVar = (C61751m) C61752n.f166808f.createBuilder();
        mVar.copyOnWrite();
        C61752n nVar = (C61752n) mVar.instance;
        nVar.f166810a |= 4;
        nVar.f166811b = "UpdateReminder";
        C61747i iVar = (C61747i) C61748j.f166800d.createBuilder();
        C61757s sVar = (C61757s) C61758t.f166824c.createBuilder();
        sVar.copyOnWrite();
        C61758t tVar = (C61758t) sVar.instance;
        str.getClass();
        tVar.f166826a = 1;
        tVar.f166827b = str;
        iVar.copyOnWrite();
        C61748j jVar = (C61748j) iVar.instance;
        C61758t tVar2 = (C61758t) sVar.build();
        tVar2.getClass();
        jVar.f166803b = tVar2;
        jVar.f166802a = 3;
        gVar.copyOnWrite();
        C61746h hVar3 = (C61746h) gVar.instance;
        C61748j jVar2 = (C61748j) iVar.build();
        jVar2.getClass();
        hVar3.f166797e = jVar2;
        hVar3.f166793a |= 4;
        mVar.mo58184c(gVar);
        C52151hc hcVar = (C52151hc) C52152hd.f136850c.createBuilder();
        C63088z byteString = ((C61752n) mVar.build()).toByteString();
        hcVar.copyOnWrite();
        C52152hd hdVar = (C52152hd) hcVar.instance;
        byteString.getClass();
        hdVar.f136852a |= 1;
        hdVar.f136853b = byteString;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.IntentInput";
        C63088z byteString2 = ((C52152hd) hcVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString2.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString2;
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "asst_input.INTENT";
        dsVar.mo53729a("intent_input", (C52230ka) jzVar.build());
        return (C51805du) dsVar.build();
    }
}
