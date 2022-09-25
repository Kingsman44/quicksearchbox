package com.google.android.libraries.lens.view.session.ondevice.p2164a;

import com.google.android.libraries.lens.ondevice.p2018b.p2021c.C24286d;
import com.google.android.libraries.lens.view.session.ondevice.C27796a;
import com.google.android.libraries.lens.view.session.ondevice.C27970h;
import com.google.android.libraries.lens.view.session.ondevice.C27971i;
import com.google.android.libraries.lens.view.session.ondevice.C28014w;
import com.google.android.libraries.p1657ba.p1664c.p1668c.p1670b.C19658f;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56244ay;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.bb */
/* compiled from: PG */
final class C27872bb implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C56244ay f75964a;

    /* renamed from: b */
    final /* synthetic */ C24286d f75965b;

    /* renamed from: c */
    final /* synthetic */ C27877bg f75966c;

    public C27872bb(C27877bg bgVar, C56244ay ayVar, C24286d dVar) {
        this.f75966c = bgVar;
        this.f75964a = ayVar;
        this.f75965b = dVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (!(th instanceof CancellationException)) {
            ((C58970a) ((C58970a) ((C58970a) C27877bg.f75975a.mo56226d()).mo56382g(th)).mo56372aa(50025)).mo56386p("Failed to get EmbeddingResult result");
        }
        C28014w wVar = this.f75966c.f75981g;
        C56244ay ayVar = this.f75964a;
        C27970h n = C27971i.m52077n();
        n.mo33308b(true);
        wVar.mo33463b(ayVar, n.mo33307a());
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        C19658f fVar;
        try {
            C28014w wVar = this.f75966c.f75981g;
            C56244ay ayVar = this.f75964a;
            C27970h n = C27971i.m52077n();
            C24286d dVar = this.f75965b;
            if (dVar == null) {
                fVar = null;
            } else {
                fVar = (C19658f) C60856cj.m92909r(dVar.mo29848a());
            }
            ((C27796a) n).f75839j = fVar;
            wVar.mo33463b(ayVar, n.mo33307a());
            this.f75966c.f75977c.mo19974a(C37194a.f98524bh);
        } catch (IllegalStateException | ExecutionException e) {
            ((C58970a) ((C58970a) ((C58970a) C27877bg.f75975a.mo56225c()).mo56382g(e)).mo56372aa(50026)).mo56386p("Failed to handle on-device engine embedding result");
            this.f75966c.f75981g.mo33462a();
        }
    }
}
