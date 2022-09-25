package com.google.android.libraries.silk.p3240c.p3244d;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.silk.p3240c.C41778d;
import com.google.android.libraries.silk.p3240c.C41871q;
import com.google.common.p4543n.p4544a.C59347c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4301f.C56686b;
import com.google.p4283bv.p4287b.p4288a.p4323c.p4327d.C56868b;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;
import p5488io.p5490b.C69794a;

/* renamed from: com.google.android.libraries.silk.c.d.c */
/* compiled from: PG */
public final class C41781c implements C21312s {

    /* renamed from: a */
    private final C41778d f109146a;

    public C41781c(C69464a aVar, C41871q qVar) {
        C41871q qVar2 = qVar;
        this.f109146a = new C41778d(qVar2, C56686b.f151306b.getParserForType(), new C41780b(aVar), "Channels", "getChannelFollowState");
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C56868b.f151727g;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C56868b bVar = (C56868b) obj;
        C41778d dVar = this.f109146a;
        boolean z = false;
        boolean z2 = (bVar.f151729a & 8) != 0;
        C56686b bVar2 = bVar.f151733e;
        if (bVar2 == null) {
            bVar2 = C56686b.f151306b;
        }
        Optional a = C59347c.m92236a(z2, bVar2);
        Optional a2 = C59347c.m92236a(1 == (bVar.f151729a & 1), bVar.f151730b);
        Optional a3 = C59347c.m92236a((bVar.f151729a & 2) != 0, bVar.f151731c);
        if ((bVar.f151729a & 4) != 0) {
            z = true;
        }
        return dVar.mo44337a(a, a2, a3, C59347c.m92236a(z, bVar.f151732d));
    }
}
