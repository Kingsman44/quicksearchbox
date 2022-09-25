package com.google.android.libraries.silk.p3240c.p3257q;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.silk.p3240c.C41763b;
import com.google.android.libraries.silk.p3240c.C41871q;
import com.google.common.p4543n.p4544a.C59347c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4295ae.C56648f;
import com.google.p4283bv.p4287b.p4288a.p4323c.p4340q.C56930f;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;
import p5488io.p5490b.C69794a;

/* renamed from: com.google.android.libraries.silk.c.q.g */
/* compiled from: PG */
public final class C41878g implements C21312s {

    /* renamed from: a */
    private final C41763b f109275a;

    public C41878g(C69464a aVar, C41871q qVar) {
        C41871q qVar2 = qVar;
        this.f109275a = new C41763b(qVar2, C56648f.f151232a.getParserForType(), new C41877f(aVar), "XblendContainer", "prefetchXblendContent");
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C56930f.f151944f;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C56930f fVar = (C56930f) obj;
        C41763b bVar = this.f109275a;
        boolean z = false;
        boolean z2 = (fVar.f151946a & 4) != 0;
        C56648f fVar2 = fVar.f151949d;
        if (fVar2 == null) {
            fVar2 = C56648f.f151232a;
        }
        Optional a = C59347c.m92236a(z2, fVar2);
        int i = fVar.f151946a;
        Optional a2 = C59347c.m92236a(1 == (i & 1), fVar.f151947b);
        if ((fVar.f151946a & 2) != 0) {
            z = true;
        }
        return bVar.mo44336a(a, a2, C59347c.m92236a(z, fVar.f151948c));
    }
}
