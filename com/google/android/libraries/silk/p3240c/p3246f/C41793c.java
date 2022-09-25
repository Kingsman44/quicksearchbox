package com.google.android.libraries.silk.p3240c.p3246f;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.silk.p3240c.C41778d;
import com.google.android.libraries.silk.p3240c.C41871q;
import com.google.common.p4543n.p4544a.C59347c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4303h.C56696b;
import com.google.p4283bv.p4287b.p4288a.p4323c.p4329f.C56876b;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;
import p5488io.p5490b.C69794a;

/* renamed from: com.google.android.libraries.silk.c.f.c */
/* compiled from: PG */
public final class C41793c implements C21312s {

    /* renamed from: a */
    private final C41778d f109163a;

    public C41793c(C69464a aVar, C41871q qVar) {
        C41871q qVar2 = qVar;
        this.f109163a = new C41778d(qVar2, C56696b.f151332b.getParserForType(), new C41792b(aVar), "CollectionsV2", "openCollection");
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C56876b.f151755g;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C56876b bVar = (C56876b) obj;
        C41778d dVar = this.f109163a;
        boolean z = false;
        boolean z2 = (bVar.f151757a & 8) != 0;
        C56696b bVar2 = bVar.f151761e;
        if (bVar2 == null) {
            bVar2 = C56696b.f151332b;
        }
        Optional a = C59347c.m92236a(z2, bVar2);
        Optional a2 = C59347c.m92236a(1 == (bVar.f151757a & 1), bVar.f151758b);
        Optional a3 = C59347c.m92236a((bVar.f151757a & 2) != 0, bVar.f151759c);
        if ((bVar.f151757a & 4) != 0) {
            z = true;
        }
        return dVar.mo44337a(a, a2, a3, C59347c.m92236a(z, bVar.f151760d));
    }
}
