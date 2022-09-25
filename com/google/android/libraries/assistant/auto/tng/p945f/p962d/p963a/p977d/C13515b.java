package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d;

import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13529e;
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
import com.google.knowledge.p4661a.p4662a.C61753o;
import com.google.knowledge.p4661a.p4662a.C61754p;
import com.google.knowledge.p4661a.p4662a.C61757s;
import com.google.knowledge.p4661a.p4662a.C61758t;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p5001d.C64830l;
import com.google.protos.p4985f.p5001d.C64831m;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.d.b */
/* compiled from: PG */
public final class C13515b {
    /* renamed from: a */
    public static C51805du m29796a(C61752n nVar) {
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "asst_input.INTENT";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.IntentInput";
        C52151hc hcVar = (C52151hc) C52152hd.f136850c.createBuilder();
        C63088z byteString = nVar.toByteString();
        hcVar.copyOnWrite();
        C52152hd hdVar = (C52152hd) hcVar.instance;
        byteString.getClass();
        hdVar.f136852a |= 1;
        hdVar.f136853b = byteString;
        C63088z byteString2 = ((C52152hd) hcVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString2.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString2;
        dsVar.mo53729a("intent_input", (C52230ka) jzVar.build());
        return (C51805du) dsVar.build();
    }

    /* renamed from: b */
    public static C51805du m29797b(String str, C13529e eVar) {
        C61751m mVar = (C61751m) C61752n.f166808f.createBuilder();
        mVar.copyOnWrite();
        C61752n nVar = (C61752n) mVar.instance;
        nVar.f166810a |= 4;
        nVar.f166811b = "ReadMessageNotifications";
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
        mVar.mo58185d(m29798c("dictation", (C61748j) iVar.build()));
        C61747i iVar2 = (C61747i) C61748j.f166800d.createBuilder();
        C61757s sVar2 = (C61757s) C61758t.f166824c.createBuilder();
        sVar2.copyOnWrite();
        C61758t tVar3 = (C61758t) sVar2.instance;
        tVar3.f166826a = 1;
        tVar3.f166827b = "reply";
        iVar2.copyOnWrite();
        C61748j jVar2 = (C61748j) iVar2.instance;
        C61758t tVar4 = (C61758t) sVar2.build();
        tVar4.getClass();
        jVar2.f166803b = tVar4;
        jVar2.f166802a = 3;
        mVar.mo58185d(m29798c("reply_repeat_next_no", (C61748j) iVar2.build()));
        C61753o oVar = (C61753o) C61754p.f166816a.createBuilder();
        C62940bt btVar = C64831m.f175685d;
        C64830l lVar = (C64830l) C64831m.f175684c.createBuilder();
        lVar.copyOnWrite();
        C64831m mVar2 = (C64831m) lVar.instance;
        mVar2.f175688b = eVar.getNumber();
        mVar2.f175687a |= 1;
        oVar.mo58885m(btVar, (C64831m) lVar.build());
        mVar.copyOnWrite();
        C61752n nVar2 = (C61752n) mVar.instance;
        C61754p pVar = (C61754p) oVar.build();
        pVar.getClass();
        nVar2.f166813d = pVar;
        nVar2.f166810a |= 8;
        return m29796a((C61752n) mVar.build());
    }

    /* renamed from: c */
    public static C61746h m29798c(String str, C61748j jVar) {
        C61745g gVar = (C61745g) C61746h.f166791g.createBuilder();
        gVar.copyOnWrite();
        C61746h hVar = (C61746h) gVar.instance;
        hVar.f166793a |= 2;
        hVar.f166796d = str;
        gVar.copyOnWrite();
        C61746h hVar2 = (C61746h) gVar.instance;
        jVar.getClass();
        hVar2.f166797e = jVar;
        hVar2.f166793a |= 4;
        return (C61746h) gVar.build();
    }

    /* renamed from: d */
    public static C61748j m29799d(C61752n nVar) {
        C61747i iVar = (C61747i) C61748j.f166800d.createBuilder();
        iVar.copyOnWrite();
        C61748j jVar = (C61748j) iVar.instance;
        nVar.getClass();
        jVar.f166803b = nVar;
        jVar.f166802a = 2;
        return (C61748j) iVar.build();
    }

    /* renamed from: e */
    public static C61752n m29800e(String str, C61746h hVar) {
        C61751m mVar = (C61751m) C61752n.f166808f.createBuilder();
        mVar.copyOnWrite();
        C61752n nVar = (C61752n) mVar.instance;
        nVar.f166810a |= 4;
        nVar.f166811b = str;
        mVar.mo58185d(hVar);
        return (C61752n) mVar.build();
    }

    /* renamed from: f */
    public static C61752n m29801f(C61746h hVar, C61754p pVar) {
        C61751m mVar = (C61751m) C61752n.f166808f.createBuilder();
        mVar.copyOnWrite();
        C61752n nVar = (C61752n) mVar.instance;
        nVar.f166810a |= 4;
        nVar.f166811b = "InitiateCall";
        mVar.mo58185d(hVar);
        mVar.copyOnWrite();
        C61752n nVar2 = (C61752n) mVar.instance;
        pVar.getClass();
        nVar2.f166813d = pVar;
        nVar2.f166810a |= 8;
        return (C61752n) mVar.build();
    }
}
