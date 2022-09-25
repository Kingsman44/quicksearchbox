package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8486j;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112473ar;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113425ff;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48591ag;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48592ah;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48633bv;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.j.b */
/* compiled from: PG */
public final class C111218b extends C112473ar {

    /* renamed from: a */
    private final C21370a f309516a;

    /* renamed from: b */
    private final C111217a f309517b;

    /* renamed from: c */
    private final C113425ff f309518c;

    public C111218b(C21370a aVar, C111217a aVar2, C113425ff ffVar) {
        this.f309516a = aVar;
        this.f309517b = aVar2;
        this.f309518c = ffVar;
    }

    /* renamed from: a */
    public final long mo99043a() {
        return 0;
    }

    /* renamed from: b */
    public final C60870cx mo99044b() {
        long b = this.f309516a.mo26870b();
        if (!this.f309518c.mo100139e()) {
            C58976aa aaVar = C58975e.f156826a;
            C48633bv bvVar = (C48633bv) C48635bx.f125704d.createBuilder();
            bvVar.copyOnWrite();
            ((C48635bx) bvVar.instance).f125708c = b;
            return C60856cj.m92900i((C48635bx) bvVar.build());
        }
        Optional a = this.f309517b.mo99058a();
        if (a.isEmpty()) {
            C58976aa aaVar2 = C58975e.f156826a;
            C48633bv bvVar2 = (C48633bv) C48635bx.f125704d.createBuilder();
            bvVar2.copyOnWrite();
            ((C48635bx) bvVar2.instance).f125708c = b;
            return C60856cj.m92900i((C48635bx) bvVar2.build());
        }
        C48633bv bvVar3 = (C48633bv) C48635bx.f125704d.createBuilder();
        C48591ag agVar = (C48591ag) C48592ah.f125595b.createBuilder();
        String str = (String) a.get();
        agVar.copyOnWrite();
        str.getClass();
        ((C48592ah) agVar.instance).f125597a = str;
        C48592ah ahVar = (C48592ah) agVar.build();
        bvVar3.copyOnWrite();
        C48635bx bxVar = (C48635bx) bvVar3.instance;
        ahVar.getClass();
        bxVar.f125707b = ahVar;
        bxVar.f125706a = 12;
        bvVar3.copyOnWrite();
        ((C48635bx) bvVar3.instance).f125708c = b;
        return C60856cj.m92900i((C48635bx) bvVar3.build());
    }
}
