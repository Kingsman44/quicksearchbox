package com.google.android.apps.search.assistant.surfaces.p9372b.p9376c.p9377a;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32799au;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32804az;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.android.libraries.search.assistant.p2828y.p2858q.C37059a;
import com.google.android.libraries.search.assistant.p2828y.p2858q.C37061c;
import com.google.android.libraries.search.assistant.p2828y.p2858q.C37062d;
import com.google.assistant.p3745ab.p3771w.C48414a;
import com.google.assistant.p3745ab.p3771w.C48416c;
import com.google.assistant.p3745ab.p3771w.C48418e;
import com.google.assistant.p3745ab.p3771w.C48420g;
import com.google.assistant.p3745ab.p3771w.C48421h;
import com.google.assistant.p3745ab.p3771w.C48422i;
import com.google.assistant.p3897e.p3912f.C51209d;
import com.google.assistant.p3897e.p3917i.p3918a.C51533lf;
import com.google.assistant.p3897e.p3917i.p3918a.C51535lh;
import com.google.assistant.p3897e.p3917i.p3918a.C51536li;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.p4552o.ahi;
import dagger.p5294a.C68221g;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.c.a.ae */
/* compiled from: PG */
public final /* synthetic */ class C124394ae implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C124395af f343321a;

    public /* synthetic */ C124394ae(C124395af afVar) {
        this.f343321a = afVar;
    }

    public final Object call() {
        C124395af afVar = this.f343321a;
        if (afVar.f343327d == null) {
            C37062d dVar = afVar.f343326c;
            C51535lh lhVar = C51535lh.REAL_USER;
            if (lhVar != null) {
                C51209d dVar2 = C51209d.SPOKEN;
                if (dVar2 != null) {
                    C37059a aVar = new C37059a(lhVar, dVar2);
                    Optional optional = (Optional) ((C68221g) dVar.f96551a).f184583a;
                    optional.getClass();
                    afVar.f343327d = new C37061c(optional, aVar);
                } else {
                    throw new NullPointerException("Null requestSourceType");
                }
            } else {
                throw new NullPointerException("Null requestReason");
            }
        }
        C37061c cVar = afVar.f343327d;
        C51533lf lfVar = (C51533lf) C51536li.f134316k.createBuilder();
        C51535lh lhVar2 = (C51535lh) cVar.f96549a.orElse(((C37059a) cVar.f96550b).f96547a);
        if (lhVar2 != C51535lh.UNKNOWN_REQUEST_REASON_ENUM) {
            lfVar.copyOnWrite();
            C51536li liVar = (C51536li) lfVar.instance;
            liVar.f134319b = lhVar2.f134315r;
            liVar.f134318a |= 1;
        }
        C51209d dVar3 = ((C37059a) cVar.f96550b).f96548b;
        if (dVar3 != C51209d.UNKNOWN_SOURCE) {
            lfVar.copyOnWrite();
            C51536li liVar2 = (C51536li) lfVar.instance;
            liVar2.f134325h = dVar3.f133323n;
            liVar2.f134318a |= 1024;
        }
        C51533lf lfVar2 = (C51533lf) ((C51536li) lfVar.build()).toBuilder();
        C33476a aVar2 = C124395af.f343323b;
        C48421h hVar = (C48421h) C48422i.f125135e.createBuilder();
        e eVar = e.a;
        hVar.copyOnWrite();
        C48422i iVar = (C48422i) hVar.instance;
        iVar.f125138b = eVar.ca;
        iVar.f125137a |= 1;
        C48414a aVar3 = (C48414a) C48420g.f125128f.createBuilder();
        ahi ahi = ahi.UNKNOWN;
        aVar3.copyOnWrite();
        C48420g gVar = (C48420g) aVar3.instance;
        gVar.f125131b = ahi.f158764y;
        gVar.f125130a |= 1;
        C48418e eVar2 = C48418e.ON_DEVICE_STACK_STATUS_UNKNOWN;
        aVar3.copyOnWrite();
        C48420g gVar2 = (C48420g) aVar3.instance;
        gVar2.f125132c = eVar2.f125126d;
        gVar2.f125130a |= 2;
        C48416c cVar2 = C48416c.UNKNOWN;
        aVar3.copyOnWrite();
        C48420g gVar3 = (C48420g) aVar3.instance;
        gVar3.f125133d = cVar2.f125120e;
        gVar3.f125130a |= 4;
        hVar.copyOnWrite();
        C48422i iVar2 = (C48422i) hVar.instance;
        C48420g gVar4 = (C48420g) aVar3.build();
        gVar4.getClass();
        iVar2.f125140d = gVar4;
        iVar2.f125137a |= 4;
        C52230ka a = aVar2.mo38879a((C48422i) hVar.build());
        lfVar2.copyOnWrite();
        C51536li liVar3 = (C51536li) lfVar2.instance;
        a.getClass();
        liVar3.f134323f = a;
        liVar3.f134318a |= 256;
        C32799au auVar = (C32799au) C32801aw.f87978c.createBuilder();
        C32804az azVar = (C32804az) C32806ba.f87988c.createBuilder();
        C52230ka a2 = C124395af.f343322a.mo38879a((C51536li) lfVar2.build());
        azVar.copyOnWrite();
        C32806ba baVar = (C32806ba) azVar.instance;
        a2.getClass();
        baVar.f87991b = a2;
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
