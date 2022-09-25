package com.google.android.libraries.silk.p3240c.p3246f;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.silk.p3240c.C41778d;
import com.google.android.libraries.silk.p3240c.C41871q;
import com.google.common.p4543n.p4544a.C59347c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4303h.C56700f;
import com.google.p4283bv.p4287b.p4288a.p4323c.p4329f.C56878d;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;
import p5488io.p5490b.C69794a;

/* renamed from: com.google.android.libraries.silk.c.f.e */
/* compiled from: PG */
public final class C41795e implements C21312s {

    /* renamed from: a */
    private final C41778d f109165a;

    public C41795e(C69464a aVar, C41871q qVar) {
        C41871q qVar2 = qVar;
        this.f109165a = new C41778d(qVar2, C56700f.f151340e.getParserForType(), new C41794d(aVar), "CollectionsV2", "save");
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C56878d.f151764g;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C56878d dVar = (C56878d) obj;
        C41778d dVar2 = this.f109165a;
        boolean z = false;
        boolean z2 = (dVar.f151766a & 8) != 0;
        C56700f fVar = dVar.f151770e;
        if (fVar == null) {
            fVar = C56700f.f151340e;
        }
        Optional a = C59347c.m92236a(z2, fVar);
        Optional a2 = C59347c.m92236a(1 == (dVar.f151766a & 1), dVar.f151767b);
        Optional a3 = C59347c.m92236a((dVar.f151766a & 2) != 0, dVar.f151768c);
        if ((dVar.f151766a & 4) != 0) {
            z = true;
        }
        return dVar2.mo44337a(a, a2, a3, C59347c.m92236a(z, dVar.f151769d));
    }
}
