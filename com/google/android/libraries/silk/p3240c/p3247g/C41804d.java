package com.google.android.libraries.silk.p3240c.p3247g;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.silk.p3240c.C41763b;
import com.google.android.libraries.silk.p3240c.C41871q;
import com.google.common.p4543n.p4544a.C59347c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4305j.C56716d;
import com.google.p4283bv.p4287b.p4288a.p4323c.p4330g.C56884b;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;
import p5488io.p5490b.C69794a;

/* renamed from: com.google.android.libraries.silk.c.g.d */
/* compiled from: PG */
public final class C41804d implements C21312s {

    /* renamed from: a */
    private final C41763b f109177a;

    public C41804d(C69464a aVar, C41871q qVar) {
        C41871q qVar2 = qVar;
        this.f109177a = new C41763b(qVar2, C56716d.f151382c.getParserForType(), new C41803c(aVar), "Feedback", "showFeedbackWindow");
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C56884b.f151791f;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C56884b bVar = (C56884b) obj;
        C41763b bVar2 = this.f109177a;
        boolean z = false;
        boolean z2 = (bVar.f151793a & 4) != 0;
        C56716d dVar = bVar.f151796d;
        if (dVar == null) {
            dVar = C56716d.f151382c;
        }
        Optional a = C59347c.m92236a(z2, dVar);
        int i = bVar.f151793a;
        Optional a2 = C59347c.m92236a(1 == (i & 1), bVar.f151794b);
        if ((bVar.f151793a & 2) != 0) {
            z = true;
        }
        return bVar2.mo44336a(a, a2, C59347c.m92236a(z, bVar.f151795c));
    }
}
