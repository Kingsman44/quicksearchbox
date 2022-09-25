package com.google.android.apps.gsa.staticplugins.p7406ar.p7407a;

import com.google.p395al.p398b.p399a.p402b.p403a.p406c.C8434a;
import com.google.p395al.p398b.p399a.p402b.p403a.p406c.C8435b;
import com.google.p395al.p398b.p399a.p402b.p403a.p406c.C8436c;
import com.google.p395al.p398b.p399a.p402b.p403a.p406c.C8437d;
import com.google.p395al.p398b.p399a.p402b.p403a.p406c.C8438e;
import com.google.p395al.p398b.p399a.p402b.p403a.p406c.C8439f;
import com.google.p395al.p398b.p399a.p402b.p403a.p407d.C8440a;
import com.google.p395al.p398b.p399a.p402b.p403a.p407d.C8441b;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.apps.gsa.staticplugins.ar.a.u */
/* compiled from: PG */
public final class C94092u {
    /* renamed from: a */
    public static C8435b m155298a(String str) {
        C8434a aVar = (C8434a) C8435b.f29324c.createBuilder();
        C8436c cVar = (C8436c) C8437d.f29329b.createBuilder();
        C8438e eVar = (C8438e) C8439f.f29332d.createBuilder();
        C8440a aVar2 = (C8440a) C8441b.f29337b.createBuilder();
        aVar2.copyOnWrite();
        str.getClass();
        ((C8441b) aVar2.instance).f29339a = str;
        eVar.copyOnWrite();
        C8441b bVar = (C8441b) aVar2.build();
        bVar.getClass();
        ((C8439f) eVar.instance).f29334a = bVar;
        cVar.copyOnWrite();
        C8437d dVar = (C8437d) cVar.instance;
        C8439f fVar = (C8439f) eVar.build();
        fVar.getClass();
        C62971cq cqVar = dVar.f29331a;
        if (!cqVar.mo58948c()) {
            dVar.f29331a = C62942bv.mutableCopy(cqVar);
        }
        dVar.f29331a.add(fVar);
        aVar.copyOnWrite();
        C8435b bVar2 = (C8435b) aVar.instance;
        C8437d dVar2 = (C8437d) cVar.build();
        dVar2.getClass();
        bVar2.f29327b = dVar2;
        bVar2.f29326a |= 2;
        return (C8435b) aVar.build();
    }
}
