package com.google.android.libraries.logging.p2185ve.p2186a;

import com.google.android.libraries.logging.p2185ve.C28423g;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.libraries.logging.ve.a.a */
/* compiled from: PG */
public final class C28297a {
    /* renamed from: a */
    public static C28423g m52921a() {
        C62940bt btVar = C28304h.f76989a;
        C28300d dVar = (C28300d) C28303g.f76984d.createBuilder();
        dVar.copyOnWrite();
        C28303g gVar = (C28303g) dVar.instance;
        gVar.f76988c = 2;
        gVar.f76986a = 2 | gVar.f76986a;
        return new C28423g(btVar, (C28303g) dVar.build());
    }

    /* renamed from: b */
    public static C28423g m52922b(String str) {
        C62940bt btVar = C28304h.f76989a;
        C28300d dVar = (C28300d) C28303g.f76984d.createBuilder();
        dVar.copyOnWrite();
        C28303g gVar = (C28303g) dVar.instance;
        gVar.f76988c = 1;
        gVar.f76986a |= 2;
        dVar.copyOnWrite();
        C28303g gVar2 = (C28303g) dVar.instance;
        str.getClass();
        gVar2.f76986a = 1 | gVar2.f76986a;
        gVar2.f76987b = str;
        return new C28423g(btVar, (C28303g) dVar.build());
    }

    /* renamed from: c */
    public static C28423g m52923c() {
        C62940bt btVar = C28304h.f76989a;
        C28300d dVar = (C28300d) C28303g.f76984d.createBuilder();
        dVar.copyOnWrite();
        C28303g gVar = (C28303g) dVar.instance;
        gVar.f76988c = 3;
        gVar.f76986a |= 2;
        return new C28423g(btVar, (C28303g) dVar.build());
    }
}
