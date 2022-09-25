package com.google.android.libraries.lens.view.session.ondevice.p2164a;

import com.google.android.libraries.lens.view.session.ondevice.C27970h;
import com.google.android.libraries.lens.view.session.ondevice.C27971i;
import com.google.android.libraries.lens.view.session.ondevice.C28014w;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import com.google.p4172bg.p4174b.C55731t;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56244ay;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.bc */
/* compiled from: PG */
final class C27873bc implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C56244ay f75967a;

    /* renamed from: b */
    final /* synthetic */ C27877bg f75968b;

    public C27873bc(C27877bg bgVar, C56244ay ayVar) {
        this.f75968b = bgVar;
        this.f75967a = ayVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (!(th instanceof CancellationException)) {
            ((C58970a) ((C58970a) ((C58970a) C27877bg.f75975a.mo56226d()).mo56382g(th)).mo56372aa(50027)).mo56386p("Failed to get TextImage result");
        }
        C28014w wVar = this.f75968b.f75981g;
        C56244ay ayVar = this.f75967a;
        C27970h n = C27971i.m52077n();
        n.mo33308b(true);
        wVar.mo33463b(ayVar, n.mo33307a());
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C27971i iVar = (C27971i) obj;
        if (iVar.mo33392i() != null) {
            C55731t i = iVar.mo33392i();
            i.getClass();
            ((C58970a) ((C58970a) C27877bg.f75975a.mo56224b()).mo56372aa(50029)).mo56387q("TextImage received: %d", i.f147065c.size());
        } else {
            ((C58970a) ((C58970a) C27877bg.f75975a.mo56224b()).mo56372aa(50028)).mo56386p("Failed to get TextImage result");
        }
        this.f75968b.f75981g.mo33463b(this.f75967a, iVar);
        this.f75968b.f75977c.mo19974a(C37194a.f98524bh);
    }
}
