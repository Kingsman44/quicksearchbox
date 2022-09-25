package com.google.android.libraries.silk.p3240c.p3257q;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.silk.p3240c.C41763b;
import com.google.android.libraries.silk.p3240c.C41871q;
import com.google.common.p4543n.p4544a.C59347c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4295ae.C56646d;
import com.google.p4283bv.p4287b.p4288a.p4323c.p4340q.C56928d;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;
import p5488io.p5490b.C69794a;

/* renamed from: com.google.android.libraries.silk.c.q.e */
/* compiled from: PG */
public final class C41876e implements C21312s {

    /* renamed from: a */
    private final C41763b f109273a;

    public C41876e(C69464a aVar, C41871q qVar) {
        C41871q qVar2 = qVar;
        this.f109273a = new C41763b(qVar2, C56646d.f151227c.getParserForType(), new C41875d(aVar), "XblendContainer", "openFullScreenPane");
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C56928d.f151937f;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C56928d dVar = (C56928d) obj;
        C41763b bVar = this.f109273a;
        boolean z = false;
        boolean z2 = (dVar.f151939a & 4) != 0;
        C56646d dVar2 = dVar.f151942d;
        if (dVar2 == null) {
            dVar2 = C56646d.f151227c;
        }
        Optional a = C59347c.m92236a(z2, dVar2);
        int i = dVar.f151939a;
        Optional a2 = C59347c.m92236a(1 == (i & 1), dVar.f151940b);
        if ((dVar.f151939a & 2) != 0) {
            z = true;
        }
        return bVar.mo44336a(a, a2, C59347c.m92236a(z, dVar.f151941c));
    }
}
