package com.google.android.apps.search.googleapp.p10527u;

import com.google.android.apps.search.googleapp.search.C137404d;
import com.google.android.apps.search.googleapp.search.C137411e;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import java.util.Map;

/* renamed from: com.google.android.apps.search.googleapp.u.c */
/* compiled from: PG */
public abstract class C139762c implements C47388b {
    /* renamed from: b */
    public static C139762c m227230b(C139779t tVar) {
        C139765f fVar = (C139765f) C139767h.f379869k.createBuilder();
        fVar.copyOnWrite();
        C139767h hVar = (C139767h) fVar.instance;
        hVar.f379872b = tVar.f379907i;
        hVar.f379871a |= 1;
        return new C139760a((C139767h) fVar.build());
    }

    /* renamed from: c */
    public static C139762c m227231c(String str, Map map) {
        C139765f fVar = (C139765f) C139767h.f379869k.createBuilder();
        C139779t tVar = C139779t.SEARCH;
        fVar.copyOnWrite();
        C139767h hVar = (C139767h) fVar.instance;
        hVar.f379872b = tVar.f379907i;
        hVar.f379871a |= 1;
        fVar.copyOnWrite();
        C139767h hVar2 = (C139767h) fVar.instance;
        hVar2.f379871a |= 2;
        hVar2.f379873c = true;
        fVar.copyOnWrite();
        C139767h hVar3 = (C139767h) fVar.instance;
        str.getClass();
        hVar3.f379871a |= 8;
        hVar3.f379876f = str;
        fVar.mo115229a(map);
        return new C139760a((C139767h) fVar.build());
    }

    /* renamed from: d */
    public static C139762c m227232d() {
        C139765f fVar = (C139765f) C139767h.f379869k.createBuilder();
        C139779t tVar = C139779t.SEARCH;
        fVar.copyOnWrite();
        C139767h hVar = (C139767h) fVar.instance;
        hVar.f379872b = tVar.f379907i;
        hVar.f379871a |= 1;
        fVar.copyOnWrite();
        C139767h hVar2 = (C139767h) fVar.instance;
        hVar2.f379871a |= 2;
        hVar2.f379873c = true;
        fVar.copyOnWrite();
        C139767h hVar3 = (C139767h) fVar.instance;
        hVar3.f379871a |= 64;
        hVar3.f379879i = true;
        C139769j jVar = (C139769j) C139770k.f379882c.createBuilder();
        C137404d dVar = (C137404d) C137411e.f373755g.createBuilder();
        dVar.copyOnWrite();
        C137411e eVar = (C137411e) dVar.instance;
        eVar.f373757a |= 4;
        eVar.f373760d = true;
        jVar.copyOnWrite();
        C139770k kVar = (C139770k) jVar.instance;
        C137411e eVar2 = (C137411e) dVar.build();
        eVar2.getClass();
        kVar.f379885b = eVar2;
        kVar.f379884a = 2;
        fVar.copyOnWrite();
        C139767h hVar4 = (C139767h) fVar.instance;
        C139770k kVar2 = (C139770k) jVar.build();
        kVar2.getClass();
        hVar4.f379877g = kVar2;
        hVar4.f379871a |= 16;
        return new C139760a((C139767h) fVar.build());
    }

    /* renamed from: a */
    public abstract C139767h mo115221a();
}
