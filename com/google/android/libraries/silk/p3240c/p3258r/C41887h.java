package com.google.android.libraries.silk.p3240c.p3258r;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.silk.p3240c.C41763b;
import com.google.android.libraries.silk.p3240c.C41871q;
import com.google.common.p4543n.p4544a.C59347c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4296af.C56652d;
import com.google.p4283bv.p4287b.p4288a.p4323c.p4341r.C56936f;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;
import p5488io.p5490b.C69794a;

/* renamed from: com.google.android.libraries.silk.c.r.h */
/* compiled from: PG */
public final class C41887h implements C21312s {

    /* renamed from: a */
    private final C41763b f109286a;

    public C41887h(C69464a aVar, C41871q qVar) {
        C41871q qVar2 = qVar;
        this.f109286a = new C41763b(qVar2, C56652d.f151241a.getParserForType(), new C41886g(), "XblendContainerControl", "setUIMode");
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C56936f.f151964f;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C56936f fVar = (C56936f) obj;
        C41763b bVar = this.f109286a;
        boolean z = false;
        boolean z2 = (fVar.f151966a & 4) != 0;
        C56652d dVar = fVar.f151969d;
        if (dVar == null) {
            dVar = C56652d.f151241a;
        }
        Optional a = C59347c.m92236a(z2, dVar);
        int i = fVar.f151966a;
        Optional a2 = C59347c.m92236a(1 == (i & 1), fVar.f151967b);
        if ((fVar.f151966a & 2) != 0) {
            z = true;
        }
        return bVar.mo44336a(a, a2, C59347c.m92236a(z, fVar.f151968c));
    }
}
