package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import android.content.Intent;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80403p;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.da */
/* compiled from: PG */
public final /* synthetic */ class C77229da implements C77187bm {

    /* renamed from: a */
    public final /* synthetic */ C77230db f213065a;

    public /* synthetic */ C77229da(C77230db dbVar) {
        this.f213065a = dbVar;
    }

    /* renamed from: a */
    public final C60870cx mo72469a(C76590bg bgVar, C74965n nVar) {
        C77230db dbVar = this.f213065a;
        C80399l c = C77230db.m123959c();
        if (!nVar.mo71328c().mo71264c()) {
            dbVar.f213069d.mo72481b(nVar.mo71342q(), c, true);
            return C60856cj.m92900i((C80401n) c.build());
        }
        c.copyOnWrite();
        C80401n nVar2 = C80401n.f220656k;
        ((C80401n) c.instance).f220664g = C80403p.m128150a(3);
        C81442m.m129557s(c, t.u(new Intent("android.intent.action.DISMISS_ALARM").putExtra("android.intent.extra.alarm.SEARCH_MODE", "android.next"), 1, nVar.mo71336k(), false, false));
        return C60856cj.m92900i((C80401n) c.build());
    }
}
