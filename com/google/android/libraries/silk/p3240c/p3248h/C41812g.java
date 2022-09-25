package com.google.android.libraries.silk.p3240c.p3248h;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.silk.p3240c.C41805h;
import com.google.android.libraries.silk.p3240c.C41871q;
import com.google.common.p4543n.p4544a.C59347c;
import com.google.p4283bv.p4287b.p4288a.p4323c.p4331h.C56890f;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;
import p5488io.p5490b.C69794a;

/* renamed from: com.google.android.libraries.silk.c.h.g */
/* compiled from: PG */
public final class C41812g implements C21312s {

    /* renamed from: a */
    private final C41805h f109188a;

    public C41812g(C69464a aVar, C41871q qVar) {
        this.f109188a = new C41805h(qVar, new C41811f(aVar), "Geolocation", "getGeolocationPermissionState");
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C56890f.f151812e;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C56890f fVar = (C56890f) obj;
        C41805h hVar = this.f109188a;
        int i = fVar.f151814a;
        boolean z = true;
        Optional a = C59347c.m92236a(1 == (i & 1), fVar.f151815b);
        if ((fVar.f151814a & 2) == 0) {
            z = false;
        }
        return hVar.mo44338a(a, C59347c.m92236a(z, fVar.f151816c));
    }
}
