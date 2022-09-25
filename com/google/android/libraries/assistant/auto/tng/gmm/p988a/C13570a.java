package com.google.android.libraries.assistant.auto.tng.gmm.p988a;

import com.google.android.libraries.assistant.auto.tng.gmm.p988a.p989a.C13571a;
import com.google.knowledge.p4671b.C61789ah;
import com.google.knowledge.p4671b.C61790ai;
import com.google.knowledge.p4671b.C61798aq;
import com.google.knowledge.p4671b.C61812e;
import com.google.knowledge.p4671b.C61814g;
import com.google.knowledge.p4671b.C61817j;
import com.google.knowledge.p4671b.C61818k;
import com.google.p4242bp.p4243a.p4247d.C56165e;
import com.google.p4242bp.p4243a.p4247d.C56166f;
import com.google.protobuf.C62940bt;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.gmm.a.a */
/* compiled from: PG */
public final /* synthetic */ class C13570a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C13572b f41563a;

    public /* synthetic */ C13570a(C13572b bVar) {
        this.f41563a = bVar;
    }

    public final Object call() {
        C13572b bVar = this.f41563a;
        C13571a aVar = (C13571a) bVar.f41564a.mo17428b();
        String str = C13571a.m29850a(bVar.f41565b).f40489g;
        C61817j jVar = (C61817j) C61818k.f166999r.createBuilder();
        C61789ah ahVar = (C61789ah) C61790ai.f166898o.createBuilder();
        C61812e eVar = (C61812e) C61814g.f166984j.createBuilder();
        eVar.copyOnWrite();
        C61814g gVar = (C61814g) eVar.instance;
        gVar.f166986a |= 1;
        gVar.f166987b = "com.google.android.projection.gearhead";
        ahVar.copyOnWrite();
        C61790ai aiVar = (C61790ai) ahVar.instance;
        C61814g gVar2 = (C61814g) eVar.build();
        gVar2.getClass();
        aiVar.f166903d = gVar2;
        aiVar.f166900a |= 16;
        C62940bt btVar = C61798aq.f166935a;
        C56165e eVar2 = (C56165e) C56166f.f149643c.createBuilder();
        eVar2.mo54329a(str);
        ahVar.mo58885m(btVar, (C56166f) eVar2.build());
        jVar.copyOnWrite();
        C61818k kVar = (C61818k) jVar.instance;
        C61790ai aiVar2 = (C61790ai) ahVar.build();
        aiVar2.getClass();
        kVar.mo58203b();
        kVar.f167003c.add(aiVar2);
        return (C61818k) jVar.build();
    }
}
