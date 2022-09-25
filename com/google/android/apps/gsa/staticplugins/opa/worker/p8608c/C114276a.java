package com.google.android.apps.gsa.staticplugins.opa.worker.p8608c;

import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.core.C85664bo;
import com.google.assistant.p4008y.p4015e.C53665a;
import com.google.assistant.p4008y.p4015e.C53666b;
import com.google.assistant.p4008y.p4015e.C53667c;
import com.google.assistant.p4008y.p4015e.C53668d;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.knowledge.p4671b.C61822o;
import com.google.p395al.p417d.p418a.C8583j;
import com.google.p395al.p417d.p418a.C8584k;
import com.google.p4017at.p4060h.p4068b.p4069a.C54185b;
import com.google.p4017at.p4060h.p4068b.p4069a.C54188e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.c.a */
/* compiled from: PG */
public final /* synthetic */ class C114276a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C114277b f316890a;

    public /* synthetic */ C114276a(C114277b bVar) {
        this.f316890a = bVar;
    }

    public final Object apply(Object obj) {
        C114277b bVar = this.f316890a;
        if (((C58833ax) obj).mo56113h()) {
            C58976aa aaVar = C58975e.f156826a;
            return C58836b.f156633a;
        }
        String b = ((bm) bVar.f316893b.mo27525b()).b();
        C53665a aVar = (C53665a) C53668d.f140865e.createBuilder();
        C53666b bVar2 = (C53666b) C53667c.f140861c.createBuilder();
        int a = bVar.f316892a.mo100728a();
        bVar2.copyOnWrite();
        C53667c cVar = (C53667c) bVar2.instance;
        cVar.f140863a |= 1;
        cVar.f140864b = a;
        aVar.copyOnWrite();
        C53668d dVar = (C53668d) aVar.instance;
        C53667c cVar2 = (C53667c) bVar2.build();
        cVar2.getClass();
        dVar.f140870d = cVar2;
        dVar.f140867a |= 16;
        C54185b bVar3 = (C54185b) C54188e.f142203f.createBuilder();
        bVar3.copyOnWrite();
        C54188e eVar = (C54188e) bVar3.instance;
        eVar.f142208d = 1;
        eVar.f142205a |= 8;
        C8583j jVar = (C8583j) C8584k.f29710c.createBuilder();
        jVar.copyOnWrite();
        C8584k kVar = (C8584k) jVar.instance;
        b.getClass();
        kVar.f29712a |= 1;
        kVar.f29713b = b;
        bVar3.copyOnWrite();
        C54188e eVar2 = (C54188e) bVar3.instance;
        C8584k kVar2 = (C8584k) jVar.build();
        kVar2.getClass();
        eVar2.f142209e = kVar2;
        eVar2.f142205a |= 32;
        aVar.copyOnWrite();
        C53668d dVar2 = (C53668d) aVar.instance;
        C54188e eVar3 = (C54188e) bVar3.build();
        eVar3.getClass();
        dVar2.f140869c = eVar3;
        dVar2.f140867a |= 4;
        C61822o e = ((C85664bo) bVar.f316894c.mo27525b()).mo79192e();
        aVar.copyOnWrite();
        C53668d dVar3 = (C53668d) aVar.instance;
        dVar3.f140868b = e.f167065g;
        dVar3.f140867a |= 2;
        return C58833ax.m90834k((C53668d) aVar.build());
    }
}
