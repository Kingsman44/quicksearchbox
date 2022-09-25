package com.google.android.libraries.lens.view.filters.p2097a;

import android.view.View;
import com.google.android.libraries.lens.view.p2078at.C25504aj;
import com.google.android.libraries.lens.view.p2090ba.C25686g;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.C28441k;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.common.p4552o.p4563i.C59899bh;
import com.google.common.p4552o.p4563i.C59900bi;
import com.google.common.p4552o.p4563i.C59918c;
import com.google.common.p4552o.p4563i.C59955e;
import com.google.common.p4552o.p4563i.C59956f;
import com.google.common.p4552o.p4563i.C59961k;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;

/* renamed from: com.google.android.libraries.lens.view.filters.a.r */
/* compiled from: PG */
public final /* synthetic */ class C25885r implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C25891x f70321a;

    public /* synthetic */ C25885r(C25891x xVar) {
        this.f70321a = xVar;
    }

    public final void onClick(View view) {
        C25891x xVar = this.f70321a;
        xVar.f70354r.setVisibility(8);
        C59955e eVar = (C59955e) C59956f.f162040c.createBuilder();
        boolean z = xVar.f70342f;
        eVar.copyOnWrite();
        C59956f fVar = (C59956f) eVar.instance;
        fVar.f162042a |= 1;
        fVar.f162043b = !z;
        C59956f fVar2 = (C59956f) eVar.build();
        C59918c cVar = (C59918c) C59961k.f162053f.createBuilder();
        C56306df dfVar = C56306df.DINING;
        cVar.copyOnWrite();
        C59961k kVar = (C59961k) cVar.instance;
        kVar.f162058d = dfVar.f150068m;
        kVar.f162055a |= 1;
        cVar.copyOnWrite();
        C59961k kVar2 = (C59961k) cVar.instance;
        fVar2.getClass();
        kVar2.f162057c = fVar2;
        kVar2.f162056b = 3;
        C59961k kVar3 = (C59961k) cVar.build();
        C28443m mVar = xVar.f70356t;
        C28440j h = C28442l.m53142h();
        C59899bh bhVar = (C59899bh) C59900bi.f161890j.createBuilder();
        bhVar.copyOnWrite();
        C59900bi biVar = (C59900bi) bhVar.instance;
        kVar3.getClass();
        biVar.f161894b = kVar3;
        biVar.f161893a |= 2;
        h.mo33895b(new C28441k(C25686g.f69826b, (C59900bi) bhVar.build()));
        mVar.mo33853c(h.mo33894a(), C28485y.m53234a(xVar.f70350n));
        if (xVar.f70342f) {
            xVar.mo31057f(false);
        } else if (!xVar.f70344h) {
            C25504aj ajVar = xVar.f70359w;
            ajVar.mo30534d(ajVar.mo30538h(), new C25880m(xVar), 72968);
        } else {
            xVar.mo31057f(xVar.f70347k);
        }
    }
}
