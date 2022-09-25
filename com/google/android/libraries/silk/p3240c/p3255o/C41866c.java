package com.google.android.libraries.silk.p3240c.p3255o;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.silk.p3240c.C41778d;
import com.google.android.libraries.silk.p3240c.C41871q;
import com.google.common.p4543n.p4544a.C59347c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4292ab.C56626b;
import com.google.p4283bv.p4287b.p4288a.p4323c.p4338o.C56922b;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;
import p5488io.p5490b.C69794a;

/* renamed from: com.google.android.libraries.silk.c.o.c */
/* compiled from: PG */
public final class C41866c implements C21312s {

    /* renamed from: a */
    private final C41778d f109255a;

    public C41866c(C69464a aVar, C41871q qVar) {
        C41871q qVar2 = qVar;
        this.f109255a = new C41778d(qVar2, C56626b.f151187c.getParserForType(), new C41865b(aVar), "WeatherPersonalization", "syncSavedLocations");
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C56922b.f151914g;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C56922b bVar = (C56922b) obj;
        C41778d dVar = this.f109255a;
        boolean z = false;
        boolean z2 = (bVar.f151916a & 8) != 0;
        C56626b bVar2 = bVar.f151920e;
        if (bVar2 == null) {
            bVar2 = C56626b.f151187c;
        }
        Optional a = C59347c.m92236a(z2, bVar2);
        Optional a2 = C59347c.m92236a(1 == (bVar.f151916a & 1), bVar.f151917b);
        Optional a3 = C59347c.m92236a((bVar.f151916a & 2) != 0, bVar.f151918c);
        if ((bVar.f151916a & 4) != 0) {
            z = true;
        }
        return dVar.mo44337a(a, a2, a3, C59347c.m92236a(z, bVar.f151919d));
    }
}
