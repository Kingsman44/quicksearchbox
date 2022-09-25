package com.google.android.libraries.silk.p3240c.p3250j;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.silk.p3240c.C41763b;
import com.google.android.libraries.silk.p3240c.C41871q;
import com.google.common.p4543n.p4544a.C59347c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4312q.C56800h;
import com.google.p4283bv.p4287b.p4288a.p4323c.p4333j.C56896d;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;
import p5488io.p5490b.C69794a;

/* renamed from: com.google.android.libraries.silk.c.j.f */
/* compiled from: PG */
public final class C41823f implements C21312s {

    /* renamed from: a */
    private final C41763b f109202a;

    public C41823f(C69464a aVar, C41871q qVar) {
        C41871q qVar2 = qVar;
        this.f109202a = new C41763b(qVar2, C56800h.f151573e.getParserForType(), new C41822e(aVar), "Navigation", "openSearch");
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C56896d.f151833f;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C56896d dVar = (C56896d) obj;
        C41763b bVar = this.f109202a;
        boolean z = false;
        boolean z2 = (dVar.f151835a & 4) != 0;
        C56800h hVar = dVar.f151838d;
        if (hVar == null) {
            hVar = C56800h.f151573e;
        }
        Optional a = C59347c.m92236a(z2, hVar);
        int i = dVar.f151835a;
        Optional a2 = C59347c.m92236a(1 == (i & 1), dVar.f151836b);
        if ((dVar.f151835a & 2) != 0) {
            z = true;
        }
        return bVar.mo44336a(a, a2, C59347c.m92236a(z, dVar.f151837c));
    }
}
