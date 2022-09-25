package com.google.android.libraries.silk.p3240c.p3258r;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.silk.p3240c.C41763b;
import com.google.android.libraries.silk.p3240c.C41871q;
import com.google.common.p4543n.p4544a.C59347c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4296af.C56650b;
import com.google.p4283bv.p4287b.p4288a.p4323c.p4341r.C56934d;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;
import p5488io.p5490b.C69794a;

/* renamed from: com.google.android.libraries.silk.c.r.f */
/* compiled from: PG */
public final class C41885f implements C21312s {

    /* renamed from: a */
    private final C41763b f109285a;

    public C41885f(C69464a aVar, C41871q qVar) {
        C41871q qVar2 = qVar;
        this.f109285a = new C41763b(qVar2, C56650b.f151234d.getParserForType(), new C41884e(aVar), "XblendContainerControl", "replaceContent");
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C56934d.f151956f;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C56934d dVar = (C56934d) obj;
        C41763b bVar = this.f109285a;
        boolean z = false;
        boolean z2 = (dVar.f151958a & 4) != 0;
        C56650b bVar2 = dVar.f151961d;
        if (bVar2 == null) {
            bVar2 = C56650b.f151234d;
        }
        Optional a = C59347c.m92236a(z2, bVar2);
        int i = dVar.f151958a;
        Optional a2 = C59347c.m92236a(1 == (i & 1), dVar.f151959b);
        if ((dVar.f151958a & 2) != 0) {
            z = true;
        }
        return bVar.mo44336a(a, a2, C59347c.m92236a(z, dVar.f151960c));
    }
}
