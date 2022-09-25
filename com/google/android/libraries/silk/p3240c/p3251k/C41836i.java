package com.google.android.libraries.silk.p3240c.p3251k;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.silk.p3240c.C41763b;
import com.google.android.libraries.silk.p3240c.C41871q;
import com.google.common.p4543n.p4544a.C59347c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4314s.C56817d;
import com.google.p4283bv.p4287b.p4288a.p4323c.p4334k.C56906h;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;
import p5488io.p5490b.C69794a;

/* renamed from: com.google.android.libraries.silk.c.k.i */
/* compiled from: PG */
public final class C41836i implements C21312s {

    /* renamed from: a */
    private final C41763b f109214a;

    public C41836i(C69464a aVar, C41871q qVar) {
        C41871q qVar2 = qVar;
        this.f109214a = new C41763b(qVar2, C56817d.f151604b.getParserForType(), new C41835h(aVar), "Panes", "openMediaPane");
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C56906h.f151864f;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C56906h hVar = (C56906h) obj;
        C41763b bVar = this.f109214a;
        boolean z = false;
        boolean z2 = (hVar.f151866a & 4) != 0;
        C56817d dVar = hVar.f151869d;
        if (dVar == null) {
            dVar = C56817d.f151604b;
        }
        Optional a = C59347c.m92236a(z2, dVar);
        int i = hVar.f151866a;
        Optional a2 = C59347c.m92236a(1 == (i & 1), hVar.f151867b);
        if ((hVar.f151866a & 2) != 0) {
            z = true;
        }
        return bVar.mo44336a(a, a2, C59347c.m92236a(z, hVar.f151868c));
    }
}
