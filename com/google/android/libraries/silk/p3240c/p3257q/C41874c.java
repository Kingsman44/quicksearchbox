package com.google.android.libraries.silk.p3240c.p3257q;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.silk.p3240c.C41778d;
import com.google.android.libraries.silk.p3240c.C41871q;
import com.google.common.p4543n.p4544a.C59347c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4295ae.C56644b;
import com.google.p4283bv.p4287b.p4288a.p4323c.p4340q.C56926b;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;
import p5488io.p5490b.C69794a;

/* renamed from: com.google.android.libraries.silk.c.q.c */
/* compiled from: PG */
public final class C41874c implements C21312s {

    /* renamed from: a */
    private final C41778d f109271a;

    public C41874c(C69464a aVar, C41871q qVar) {
        C41871q qVar2 = qVar;
        this.f109271a = new C41778d(qVar2, C56644b.f151225a.getParserForType(), new C41873b(aVar), "XblendContainer", "getPrefetchedXblendContent");
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C56926b.f151929g;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C56926b bVar = (C56926b) obj;
        C41778d dVar = this.f109271a;
        boolean z = false;
        boolean z2 = (bVar.f151931a & 8) != 0;
        C56644b bVar2 = bVar.f151935e;
        if (bVar2 == null) {
            bVar2 = C56644b.f151225a;
        }
        Optional a = C59347c.m92236a(z2, bVar2);
        Optional a2 = C59347c.m92236a(1 == (bVar.f151931a & 1), bVar.f151932b);
        Optional a3 = C59347c.m92236a((bVar.f151931a & 2) != 0, bVar.f151933c);
        if ((bVar.f151931a & 4) != 0) {
            z = true;
        }
        return dVar.mo44337a(a, a2, a3, C59347c.m92236a(z, bVar.f151934d));
    }
}
