package com.google.android.libraries.search.p3055n.p3081g.p3082a;

import com.google.android.libraries.p590as.p593b.p596b.C10950l;
import com.google.android.libraries.search.p3055n.p3085h.C39770c;
import com.google.android.libraries.search.p3055n.p3085h.C39771d;
import com.google.android.libraries.search.p3055n.p3085h.C39774g;
import com.google.android.libraries.search.p3055n.p3085h.C39775h;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.n.g.a.ae */
/* compiled from: PG */
public final /* synthetic */ class C39722ae implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C39774g f104531a;

    public /* synthetic */ C39722ae(C39774g gVar) {
        this.f104531a = gVar;
    }

    public final void accept(Object obj) {
        C39774g gVar = this.f104531a;
        C10950l lVar = (C10950l) obj;
        C39770c cVar = (C39770c) C39771d.f104606e.createBuilder();
        String languageTag = lVar.mo19321a().mo19289g().toLanguageTag();
        cVar.copyOnWrite();
        C39771d dVar = (C39771d) cVar.instance;
        languageTag.getClass();
        dVar.f104608a |= 1;
        dVar.f104609b = languageTag;
        int a = lVar.mo19321a().mo19282a();
        cVar.copyOnWrite();
        C39771d dVar2 = (C39771d) cVar.instance;
        dVar2.f104608a |= 2;
        dVar2.f104610c = (long) a;
        String str = (String) lVar.mo19322b().mo56107c();
        cVar.copyOnWrite();
        C39771d dVar3 = (C39771d) cVar.instance;
        str.getClass();
        dVar3.f104608a |= 4;
        dVar3.f104611d = str;
        gVar.copyOnWrite();
        C39775h hVar = (C39775h) gVar.instance;
        C39771d dVar4 = (C39771d) cVar.build();
        C39775h hVar2 = C39775h.f104621f;
        dVar4.getClass();
        C62971cq cqVar = hVar.f104627e;
        if (!cqVar.mo58948c()) {
            hVar.f104627e = C62942bv.mutableCopy(cqVar);
        }
        hVar.f104627e.add(dVar4);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
