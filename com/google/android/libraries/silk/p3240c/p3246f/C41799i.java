package com.google.android.libraries.silk.p3240c.p3246f;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.silk.p3240c.C41778d;
import com.google.android.libraries.silk.p3240c.C41871q;
import com.google.common.p4543n.p4544a.C59347c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4303h.C56708n;
import com.google.p4283bv.p4287b.p4288a.p4323c.p4329f.C56882h;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;
import p5488io.p5490b.C69794a;

/* renamed from: com.google.android.libraries.silk.c.f.i */
/* compiled from: PG */
public final class C41799i implements C21312s {

    /* renamed from: a */
    private final C41778d f109169a;

    public C41799i(C69464a aVar, C41871q qVar) {
        C41871q qVar2 = qVar;
        this.f109169a = new C41778d(qVar2, C56708n.f151360d.getParserForType(), new C41798h(aVar), "CollectionsV2", "unsave");
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C56882h.f151782g;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C56882h hVar = (C56882h) obj;
        C41778d dVar = this.f109169a;
        boolean z = false;
        boolean z2 = (hVar.f151784a & 8) != 0;
        C56708n nVar = hVar.f151788e;
        if (nVar == null) {
            nVar = C56708n.f151360d;
        }
        Optional a = C59347c.m92236a(z2, nVar);
        Optional a2 = C59347c.m92236a(1 == (hVar.f151784a & 1), hVar.f151785b);
        Optional a3 = C59347c.m92236a((hVar.f151784a & 2) != 0, hVar.f151786c);
        if ((hVar.f151784a & 4) != 0) {
            z = true;
        }
        return dVar.mo44337a(a, a2, a3, C59347c.m92236a(z, hVar.f151787d));
    }
}
