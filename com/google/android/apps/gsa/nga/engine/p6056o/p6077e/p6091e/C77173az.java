package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import android.content.Intent;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80403p;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.C83044e;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.az */
/* compiled from: PG */
public final /* synthetic */ class C77173az implements C77194bt {

    /* renamed from: a */
    public final /* synthetic */ C77175ba f212972a;

    public /* synthetic */ C77173az(C77175ba baVar) {
        this.f212972a = baVar;
    }

    /* renamed from: a */
    public final C60870cx mo72468a(C74965n nVar) {
        C77175ba baVar = this.f212972a;
        C80399l c = C77175ba.m123880c();
        if (!nVar.mo71328c().mo71265d()) {
            baVar.f212976c.mo76648a(nVar.mo71336k(), C82835ce.PERSONAL_DATA_ACCESS_DENIED, C83044e.f226656a);
            return C81442m.f222851a;
        }
        c.copyOnWrite();
        C80401n nVar2 = C80401n.f220656k;
        ((C80401n) c.instance).f220664g = C80403p.m128150a(3);
        C81442m.m129557s(c, t.u(new Intent("android.intent.action.DISMISS_TIMER"), 1, nVar.mo71336k(), false, false));
        return C60856cj.m92900i((C80401n) c.build());
    }
}
