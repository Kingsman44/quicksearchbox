package com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.p1018d.p1021c;

import com.google.android.gms.car.C143118bb;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.tng.j.c.d.c.d */
/* compiled from: PG */
public final class C13678d {

    /* renamed from: a */
    public static final C58974d f41742a = C58974d.m91134h("ProjectedVecRegister");

    /* renamed from: b */
    public final Optional f41743b;

    /* renamed from: c */
    public boolean f41744c;

    /* renamed from: d */
    private C143118bb f41745d;

    public C13678d(Optional optional) {
        C69664n.m101061g(optional, "transportManagerOptional");
        this.f41743b = optional;
    }

    /* renamed from: a */
    public final void mo21214a(C143118bb bbVar) {
        this.f41745d = bbVar;
        this.f41743b.ifPresent(new C13667a(bbVar));
        bbVar.mo118051a(new C13676b(this));
        this.f41744c = true;
    }

    /* renamed from: b */
    public final void mo21215b() {
        this.f41743b.ifPresent(C13677c.f41741a);
        C143118bb bbVar = this.f41745d;
        if (bbVar != null) {
            bbVar.mo118054d();
        }
        C143118bb bbVar2 = this.f41745d;
        if (bbVar2 != null) {
            bbVar2.mo118052b();
        }
        this.f41745d = null;
        this.f41744c = false;
    }
}
