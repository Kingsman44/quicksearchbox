package com.google.android.libraries.silk.p3240c.p3251k;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.silk.p3240c.C41778d;
import com.google.android.libraries.silk.p3240c.C41871q;
import com.google.common.p4543n.p4544a.C59347c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4314s.C56819f;
import com.google.p4283bv.p4287b.p4288a.p4323c.p4334k.C56908j;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;
import p5488io.p5490b.C69794a;

/* renamed from: com.google.android.libraries.silk.c.k.k */
/* compiled from: PG */
public final class C41838k implements C21312s {

    /* renamed from: a */
    private final C41778d f109216a;

    public C41838k(C69464a aVar, C41871q qVar) {
        C41871q qVar2 = qVar;
        this.f109216a = new C41778d(qVar2, C56819f.f151608a.getParserForType(), new C41837j(aVar), "Panes", "openModalPane");
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C56908j.f151871g;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C56908j jVar = (C56908j) obj;
        C41778d dVar = this.f109216a;
        boolean z = false;
        boolean z2 = (jVar.f151873a & 8) != 0;
        C56819f fVar = jVar.f151877e;
        if (fVar == null) {
            fVar = C56819f.f151608a;
        }
        Optional a = C59347c.m92236a(z2, fVar);
        Optional a2 = C59347c.m92236a(1 == (jVar.f151873a & 1), jVar.f151874b);
        Optional a3 = C59347c.m92236a((jVar.f151873a & 2) != 0, jVar.f151875c);
        if ((jVar.f151873a & 4) != 0) {
            z = true;
        }
        return dVar.mo44337a(a, a2, a3, C59347c.m92236a(z, jVar.f151876d));
    }
}
