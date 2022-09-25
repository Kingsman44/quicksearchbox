package com.google.android.libraries.silk.p3240c.p3246f;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.silk.p3240c.C41778d;
import com.google.android.libraries.silk.p3240c.C41871q;
import com.google.common.p4543n.p4544a.C59347c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4303h.C56704j;
import com.google.p4283bv.p4287b.p4288a.p4323c.p4329f.C56880f;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;
import p5488io.p5490b.C69794a;

/* renamed from: com.google.android.libraries.silk.c.f.g */
/* compiled from: PG */
public final class C41797g implements C21312s {

    /* renamed from: a */
    private final C41778d f109167a;

    public C41797g(C69464a aVar, C41871q qVar) {
        C41871q qVar2 = qVar;
        this.f109167a = new C41778d(qVar2, C56704j.f151353b.getParserForType(), new C41796f(aVar), "CollectionsV2", "setActiveList");
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C56880f.f151773g;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C56880f fVar = (C56880f) obj;
        C41778d dVar = this.f109167a;
        boolean z = false;
        boolean z2 = (fVar.f151775a & 8) != 0;
        C56704j jVar = fVar.f151779e;
        if (jVar == null) {
            jVar = C56704j.f151353b;
        }
        Optional a = C59347c.m92236a(z2, jVar);
        Optional a2 = C59347c.m92236a(1 == (fVar.f151775a & 1), fVar.f151776b);
        Optional a3 = C59347c.m92236a((fVar.f151775a & 2) != 0, fVar.f151777c);
        if ((fVar.f151775a & 4) != 0) {
            z = true;
        }
        return dVar.mo44337a(a, a2, a3, C59347c.m92236a(z, fVar.f151778d));
    }
}
