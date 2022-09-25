package com.google.android.libraries.silk.p3240c.p3253m;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.silk.p3240c.C41778d;
import com.google.android.libraries.silk.p3240c.C41871q;
import com.google.common.p4543n.p4544a.C59347c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4320y.C56840e;
import com.google.p4283bv.p4287b.p4288a.p4323c.p4336m.C56918f;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;
import p5488io.p5490b.C69794a;

/* renamed from: com.google.android.libraries.silk.c.m.g */
/* compiled from: PG */
public final class C41856g implements C21312s {

    /* renamed from: a */
    private final C41778d f109243a;

    public C41856g(C69464a aVar, C41871q qVar) {
        C41871q qVar2 = qVar;
        this.f109243a = new C41778d(qVar2, C56840e.f151648f.getParserForType(), new C41855f(aVar), "Share", "showShareSheet");
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C56918f.f151898g;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C56918f fVar = (C56918f) obj;
        C41778d dVar = this.f109243a;
        boolean z = false;
        boolean z2 = (fVar.f151900a & 8) != 0;
        C56840e eVar = fVar.f151904e;
        if (eVar == null) {
            eVar = C56840e.f151648f;
        }
        Optional a = C59347c.m92236a(z2, eVar);
        Optional a2 = C59347c.m92236a(1 == (fVar.f151900a & 1), fVar.f151901b);
        Optional a3 = C59347c.m92236a((fVar.f151900a & 2) != 0, fVar.f151902c);
        if ((fVar.f151900a & 4) != 0) {
            z = true;
        }
        return dVar.mo44337a(a, a2, a3, C59347c.m92236a(z, fVar.f151903d));
    }
}
