package com.google.android.libraries.silk.p3240c.p3254n;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.silk.p3240c.C41763b;
import com.google.android.libraries.silk.p3240c.C41871q;
import com.google.common.p4543n.p4544a.C59347c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4321z.C56844b;
import com.google.p4283bv.p4287b.p4288a.p4323c.p4337n.C56920b;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;
import p5488io.p5490b.C69794a;

/* renamed from: com.google.android.libraries.silk.c.n.c */
/* compiled from: PG */
public final class C41861c implements C21312s {

    /* renamed from: a */
    private final C41763b f109250a;

    public C41861c(C69464a aVar, C41871q qVar) {
        C41871q qVar2 = qVar;
        this.f109250a = new C41763b(qVar2, C56844b.f151659a.getParserForType(), new C41860b(aVar), "TaskState", "syncTaskState");
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C56920b.f151906f;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C56920b bVar = (C56920b) obj;
        C41763b bVar2 = this.f109250a;
        boolean z = false;
        boolean z2 = (bVar.f151908a & 4) != 0;
        C56844b bVar3 = bVar.f151911d;
        if (bVar3 == null) {
            bVar3 = C56844b.f151659a;
        }
        Optional a = C59347c.m92236a(z2, bVar3);
        int i = bVar.f151908a;
        Optional a2 = C59347c.m92236a(1 == (i & 1), bVar.f151909b);
        if ((bVar.f151908a & 2) != 0) {
            z = true;
        }
        return bVar2.mo44336a(a, a2, C59347c.m92236a(z, bVar.f151910c));
    }
}
