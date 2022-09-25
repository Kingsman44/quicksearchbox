package com.google.android.libraries.lens.ondevice.p2031h;

import com.google.android.libraries.lens.ondevice.p2032i.C24530h;
import com.google.android.libraries.lens.ondevice.p2037n.C24805p;
import com.google.android.libraries.lens.ondevice.p2037n.C24807r;
import com.google.android.libraries.lens.ondevice.p2037n.C24808s;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60845bz;
import com.google.lens.p4701g.C62331d;
import com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63238k;
import com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63240m;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.lens.ondevice.h.n */
/* compiled from: PG */
final class C24518n implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C24519o f67149a;

    public C24518n(C24519o oVar) {
        this.f67149a = oVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (!(th instanceof CancellationException)) {
            ((C58970a) ((C58970a) ((C58970a) C24519o.f67150a.mo56225c()).mo56382g(th)).mo56372aa(48822)).mo56389s("Cascade execution failed %s", th);
        }
        C24519o oVar = this.f67149a;
        oVar.f67154e.mo29944c(oVar.f67152c.f66855a, oVar.f67160k, C24805p.CASCADE_RUN_ERROR);
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        C58974d dVar = C24519o.f67150a;
        C63238k kVar = (C63238k) C63240m.f170859b.createBuilder();
        kVar.mo59198a(this.f67149a.f67151b);
        C63240m mVar = (C63240m) kVar.build();
        C24519o oVar = this.f67149a;
        C24530h hVar = oVar.f67154e;
        C62331d dVar2 = oVar.f67152c.f66855a;
        int i = oVar.f67160k;
        C24805p pVar = C24805p.CASCADE_RUN_SUCCESS;
        C58838bb.m90868c(C24530h.m45606a(pVar));
        C24807r rVar = (C24807r) C24808s.f67804l.createBuilder();
        rVar.copyOnWrite();
        C24808s sVar = (C24808s) rVar.instance;
        sVar.f67811f = dVar2.f168273v;
        sVar.f67806a |= 16;
        rVar.copyOnWrite();
        C24808s sVar2 = (C24808s) rVar.instance;
        int i2 = i - 1;
        if (i != 0) {
            sVar2.f67812g = i2;
            sVar2.f67806a |= 32;
            rVar.copyOnWrite();
            C24808s sVar3 = (C24808s) rVar.instance;
            mVar.getClass();
            sVar3.f67816k = mVar;
            sVar3.f67806a |= 512;
            hVar.mo29947f(pVar, (C24808s) rVar.build());
            return;
        }
        throw null;
    }
}
