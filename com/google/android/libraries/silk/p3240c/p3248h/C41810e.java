package com.google.android.libraries.silk.p3240c.p3248h;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.silk.p3240c.C41778d;
import com.google.android.libraries.silk.p3240c.C41871q;
import com.google.common.p4543n.p4544a.C59347c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4307l.C56730f;
import com.google.p4283bv.p4287b.p4288a.p4323c.p4331h.C56888d;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;
import p5488io.p5490b.C69794a;

/* renamed from: com.google.android.libraries.silk.c.h.e */
/* compiled from: PG */
public final class C41810e implements C21312s {

    /* renamed from: a */
    private final C41778d f109186a;

    public C41810e(C69464a aVar, C41871q qVar) {
        C41871q qVar2 = qVar;
        this.f109186a = new C41778d(qVar2, C56730f.f151413b.getParserForType(), new C41809d(aVar), "Geolocation", "getCurrentLocationWithOptions");
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C56888d.f151804g;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C56888d dVar = (C56888d) obj;
        C41778d dVar2 = this.f109186a;
        boolean z = false;
        boolean z2 = (dVar.f151806a & 8) != 0;
        C56730f fVar = dVar.f151810e;
        if (fVar == null) {
            fVar = C56730f.f151413b;
        }
        Optional a = C59347c.m92236a(z2, fVar);
        Optional a2 = C59347c.m92236a(1 == (dVar.f151806a & 1), dVar.f151807b);
        Optional a3 = C59347c.m92236a((dVar.f151806a & 2) != 0, dVar.f151808c);
        if ((dVar.f151806a & 4) != 0) {
            z = true;
        }
        return dVar2.mo44337a(a, a2, a3, C59347c.m92236a(z, dVar.f151809d));
    }
}
