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
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.dk */
/* compiled from: PG */
public final /* synthetic */ class C77239dk implements C77187bm {

    /* renamed from: a */
    public final /* synthetic */ C77244dp f213079a;

    public /* synthetic */ C77239dk(C77244dp dpVar) {
        this.f213079a = dpVar;
    }

    /* renamed from: a */
    public final C60870cx mo72469a(C76590bg bgVar, C74965n nVar) {
        C77244dp dpVar = this.f213079a;
        C80399l c = C77244dp.m123967c();
        if (!nVar.mo71328c().mo71264c()) {
            dpVar.f213087d.mo72481b(nVar.mo71342q(), c, true);
            return C60856cj.m92900i((C80401n) c.build());
        }
        Optional e = dpVar.mo72487e(bgVar);
        Intent intent = new Intent("android.intent.action.SNOOZE_ALARM");
        e.ifPresent(new C77231dc(intent));
        c.copyOnWrite();
        C80401n nVar2 = C80401n.f220656k;
        ((C80401n) c.instance).f220664g = C80403p.m128150a(3);
        C81442m.m129557s(c, t.u(intent, 1, nVar.mo71336k(), false, false));
        return C60856cj.m92900i((C80401n) c.build());
    }
}
