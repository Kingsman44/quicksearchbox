package com.google.android.apps.search.assistant.surfaces.p9372b.p9376c.p9377a;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32799au;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32804az;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.assistant.p3897e.p3917i.p3918a.C51376fk;
import com.google.assistant.p3897e.p3917i.p3918a.C51379fn;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.base.C58817ah;
import com.google.knowledge.p4671b.C61789ah;
import com.google.knowledge.p4671b.C61790ai;
import com.google.knowledge.p4671b.C61812e;
import com.google.knowledge.p4671b.C61814g;
import com.google.knowledge.p4671b.C61815h;
import com.google.knowledge.p4671b.C61816i;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.c.a.v */
/* compiled from: PG */
public final /* synthetic */ class C124422v implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C124422v f343397a = new C124422v();

    private /* synthetic */ C124422v() {
    }

    public final Object apply(Object obj) {
        C51379fn fnVar = (C51379fn) obj;
        C33476a aVar = C124423w.f343398a;
        C61790ai aiVar = ((C51379fn) ((C51376fk) fnVar.toBuilder()).instance).f133817b;
        if (aiVar == null) {
            aiVar = C61790ai.f166898o;
        }
        C61789ah ahVar = (C61789ah) aiVar.toBuilder();
        ahVar.copyOnWrite();
        C61790ai aiVar2 = (C61790ai) ahVar.instance;
        aiVar2.f166900a |= 32768;
        aiVar2.f166909j = false;
        ahVar.copyOnWrite();
        C61790ai aiVar3 = (C61790ai) ahVar.instance;
        aiVar3.f166900a |= 65536;
        aiVar3.f166910k = false;
        ahVar.copyOnWrite();
        C61790ai aiVar4 = (C61790ai) ahVar.instance;
        aiVar4.f166900a |= C89885b.S3REQUEST_VALUE;
        aiVar4.f166911l = true;
        ahVar.copyOnWrite();
        C61790ai aiVar5 = (C61790ai) ahVar.instance;
        aiVar5.f166900a |= C89885b.HTTP_VALUE;
        aiVar5.f166912m = false;
        C61790ai aiVar6 = fnVar.f133817b;
        if (aiVar6 == null) {
            aiVar6 = C61790ai.f166898o;
        }
        C61814g gVar = aiVar6.f166903d;
        if (gVar == null) {
            gVar = C61814g.f166984j;
        }
        C61812e eVar = (C61812e) gVar.toBuilder();
        C61815h hVar = (C61815h) C61816i.f166995c.createBuilder();
        hVar.copyOnWrite();
        C61816i iVar = (C61816i) hVar.instance;
        iVar.f166997a |= 1;
        iVar.f166998b = false;
        C61816i iVar2 = (C61816i) hVar.build();
        eVar.copyOnWrite();
        C61814g gVar2 = (C61814g) eVar.instance;
        iVar2.getClass();
        gVar2.f166993h = iVar2;
        gVar2.f166986a |= 128;
        ahVar.copyOnWrite();
        C61790ai aiVar7 = (C61790ai) ahVar.instance;
        C61814g gVar3 = (C61814g) eVar.build();
        gVar3.getClass();
        aiVar7.f166903d = gVar3;
        aiVar7.f166900a |= 16;
        C61790ai aiVar8 = (C61790ai) ahVar.build();
        C51376fk fkVar = (C51376fk) fnVar.toBuilder();
        fkVar.copyOnWrite();
        C51379fn fnVar2 = (C51379fn) fkVar.instance;
        aiVar8.getClass();
        fnVar2.f133817b = aiVar8;
        fnVar2.f133816a |= 1;
        C32799au auVar = (C32799au) C32801aw.f87978c.createBuilder();
        C32804az azVar = (C32804az) C32806ba.f87988c.createBuilder();
        C52230ka a = C124423w.f343398a.mo38879a((C51379fn) fkVar.build());
        azVar.copyOnWrite();
        C32806ba baVar = (C32806ba) azVar.instance;
        a.getClass();
        baVar.f87991b = a;
        baVar.f87990a |= 1;
        auVar.copyOnWrite();
        C32801aw awVar = (C32801aw) auVar.instance;
        C32806ba baVar2 = (C32806ba) azVar.build();
        baVar2.getClass();
        awVar.f87981b = baVar2;
        awVar.f87980a = 1;
        return (C32801aw) auVar.build();
    }
}
