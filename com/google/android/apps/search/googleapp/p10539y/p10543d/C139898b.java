package com.google.android.apps.search.googleapp.p10539y.p10543d;

import com.google.android.apps.search.xblend.p10707b.C142269a;
import com.google.android.apps.search.xblend.p10708c.C142271a;
import com.google.android.apps.search.xblend.p10708c.C142272b;
import com.google.android.libraries.silk.p3205a.p3211ae.C41714a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4295ae.C56646d;
import com.google.p4283bv.p4287b.p4342b.C56938b;
import com.google.p4283bv.p4287b.p4342b.C56943g;

/* renamed from: com.google.android.apps.search.googleapp.y.d.b */
/* compiled from: PG */
public final class C139898b implements C41714a {

    /* renamed from: a */
    private final C142269a f380313a;

    public C139898b(C142269a aVar) {
        this.f380313a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo44315a(C56646d dVar) {
        C56938b bVar = dVar.f151230b;
        if (bVar == null) {
            bVar = C56938b.f151970b;
        }
        int i = bVar.f151972a;
        C142269a aVar = this.f380313a;
        C142271a aVar2 = (C142271a) C142272b.f385977e.createBuilder();
        C56943g gVar = dVar.f151229a;
        if (gVar == null) {
            gVar = C56943g.f151982f;
        }
        aVar2.copyOnWrite();
        C142272b bVar2 = (C142272b) aVar2.instance;
        gVar.getClass();
        bVar2.f385980b = gVar;
        bVar2.f385979a |= 1;
        aVar2.copyOnWrite();
        C142272b bVar3 = (C142272b) aVar2.instance;
        bVar3.f385979a |= 2;
        bVar3.f385981c = true;
        aVar2.copyOnWrite();
        C142272b bVar4 = (C142272b) aVar2.instance;
        bVar4.f385979a |= 4;
        bVar4.f385982d = true;
        aVar.mo41490e((C142272b) aVar2.build());
        return C60866ct.f164955a;
    }

    /* renamed from: b */
    public final /* synthetic */ C60870cx mo44316b() {
        return C60856cj.m92899h(new UnsupportedOperationException("Method SilkXblendContainerApi.getPrefetchedXblendContent not implemented!"));
    }

    /* renamed from: c */
    public final /* synthetic */ C60870cx mo44317c() {
        return C60856cj.m92899h(new UnsupportedOperationException("Method SilkXblendContainerApi.prefetchXblendContent not implemented!"));
    }
}
