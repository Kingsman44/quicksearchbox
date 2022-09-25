package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8648e;

import com.google.android.apps.gsa.search.core.p6491a.C84364j;
import com.google.android.apps.gsa.search.core.p6491a.C84368n;
import com.google.android.apps.gsa.search.core.p6491a.C84369o;
import com.google.android.apps.gsa.search.core.p6491a.C84370p;
import com.google.android.apps.gsa.search.core.p6491a.C84371q;
import com.google.android.apps.gsa.shared.util.C90736at;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.e.c */
/* compiled from: PG */
public final /* synthetic */ class C115417c implements C90736at {

    /* renamed from: a */
    public final /* synthetic */ C115418d f320228a;

    public /* synthetic */ C115417c(C115418d dVar) {
        this.f320228a = dVar;
    }

    /* renamed from: a */
    public final void mo17700a(Object obj) {
        C115418d dVar = this.f320228a;
        C84368n i = C84369o.m134630i();
        i.mo77906b(2);
        ((C84364j) i).f229608a = dVar.f320232e;
        C84370p a = ((C84371q) obj).mo77929a(i.mo77905a());
        C61751m mVar = (C61751m) C61752n.f166808f.createBuilder();
        mVar.copyOnWrite();
        C61752n nVar = (C61752n) mVar.instance;
        nVar.f166810a |= 4;
        nVar.f166811b = "PlayNarrativeNews";
        C61745g gVar = (C61745g) C61746h.f166791g.createBuilder();
        gVar.copyOnWrite();
        C61746h hVar = (C61746h) gVar.instance;
        hVar.f166793a |= 2;
        hVar.f166796d = "refresh_news";
        C61747i iVar = (C61747i) C61748j.f166800d.createBuilder();
        C61757s sVar = (C61757s) C61758t.f166824c.createBuilder();
        sVar.copyOnWrite();
        C61758t tVar = (C61758t) sVar.instance;
        tVar.f166826a = 1;
        tVar.f166827b = "refresh_news_in_player";
        C61758t tVar2 = (C61758t) sVar.build();
        iVar.copyOnWrite();
        C61748j jVar = (C61748j) iVar.instance;
        tVar2.getClass();
        jVar.f166803b = tVar2;
        jVar.f166802a = 3;
        gVar.copyOnWrite();
        C61746h hVar2 = (C61746h) gVar.instance;
        C61748j jVar2 = (C61748j) iVar.build();
        jVar2.getClass();
        hVar2.f166797e = jVar2;
        hVar2.f166793a |= 4;
        mVar.mo58185d((C61746h) gVar.build());
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.IntentInput";
        C52151hc hcVar = (C52151hc) C52152hd.f136850c.createBuilder();
        C63088z byteString = ((C61752n) mVar.build()).toByteString();
        hcVar.copyOnWrite();
        C52152hd hdVar = (C52152hd) hcVar.instance;
        byteString.getClass();
        hdVar.f136852a |= 1;
        hdVar.f136853b = byteString;
        C63088z byteString2 = ((C52152hd) hcVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString2.getClass();
        kaVar2.f137059a = 2 | kaVar2.f137059a;
        kaVar2.f137061c = byteString2;
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "asst_input.INTENT";
        dsVar.mo53729a("intent_input", (C52230ka) jzVar.build());
        a.mo77919a((C51805du) dsVar.build());
    }
}
