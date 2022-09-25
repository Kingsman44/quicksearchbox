package com.google.android.libraries.silk.p3240c.p3250j;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.silk.p3240c.C41763b;
import com.google.android.libraries.silk.p3240c.C41871q;
import com.google.common.p4543n.p4544a.C59347c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4312q.C56796d;
import com.google.p4283bv.p4287b.p4288a.p4323c.p4333j.C56894b;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;
import p5488io.p5490b.C69794a;

/* renamed from: com.google.android.libraries.silk.c.j.d */
/* compiled from: PG */
public final class C41821d implements C21312s {

    /* renamed from: a */
    private final C41763b f109200a;

    public C41821d(C69464a aVar, C41871q qVar) {
        C41871q qVar2 = qVar;
        this.f109200a = new C41763b(qVar2, C56796d.f151566c.getParserForType(), new C41820c(aVar), "Navigation", "openDeepLink");
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C56894b.f151826f;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C56894b bVar = (C56894b) obj;
        C41763b bVar2 = this.f109200a;
        boolean z = false;
        boolean z2 = (bVar.f151828a & 4) != 0;
        C56796d dVar = bVar.f151831d;
        if (dVar == null) {
            dVar = C56796d.f151566c;
        }
        Optional a = C59347c.m92236a(z2, dVar);
        int i = bVar.f151828a;
        Optional a2 = C59347c.m92236a(1 == (i & 1), bVar.f151829b);
        if ((bVar.f151828a & 2) != 0) {
            z = true;
        }
        return bVar2.mo44336a(a, a2, C59347c.m92236a(z, bVar.f151830c));
    }
}
