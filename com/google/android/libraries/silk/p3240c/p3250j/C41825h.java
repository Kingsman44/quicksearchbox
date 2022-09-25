package com.google.android.libraries.silk.p3240c.p3250j;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.silk.p3240c.C41763b;
import com.google.android.libraries.silk.p3240c.C41871q;
import com.google.common.p4543n.p4544a.C59347c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4312q.C56802j;
import com.google.p4283bv.p4287b.p4288a.p4323c.p4333j.C56898f;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;
import p5488io.p5490b.C69794a;

/* renamed from: com.google.android.libraries.silk.c.j.h */
/* compiled from: PG */
public final class C41825h implements C21312s {

    /* renamed from: a */
    private final C41763b f109204a;

    public C41825h(C69464a aVar, C41871q qVar) {
        C41871q qVar2 = qVar;
        this.f109204a = new C41763b(qVar2, C56802j.f151579b.getParserForType(), new C41824g(aVar), "Navigation", "openUrl");
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C56898f.f151840f;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C56898f fVar = (C56898f) obj;
        C41763b bVar = this.f109204a;
        boolean z = false;
        boolean z2 = (fVar.f151842a & 4) != 0;
        C56802j jVar = fVar.f151845d;
        if (jVar == null) {
            jVar = C56802j.f151579b;
        }
        Optional a = C59347c.m92236a(z2, jVar);
        int i = fVar.f151842a;
        Optional a2 = C59347c.m92236a(1 == (i & 1), fVar.f151843b);
        if ((fVar.f151842a & 2) != 0) {
            z = true;
        }
        return bVar.mo44336a(a, a2, C59347c.m92236a(z, fVar.f151844c));
    }
}
