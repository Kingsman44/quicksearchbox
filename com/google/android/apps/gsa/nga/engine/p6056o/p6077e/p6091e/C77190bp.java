package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import android.content.Intent;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.am.z.c;
import com.google.android.apps.gsa.nga.engine.p5913am.p5917c.C74885bc;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6307af.C80595f;
import com.google.android.apps.gsa.nga.shared.p6307af.C80600k;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80590x;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.C83044e;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.bp */
/* compiled from: PG */
public final /* synthetic */ class C77190bp implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C77196bv f213003a;

    /* renamed from: b */
    public final /* synthetic */ C77192br f213004b;

    /* renamed from: c */
    public final /* synthetic */ C76590bg f213005c;

    /* renamed from: d */
    public final /* synthetic */ C74965n f213006d;

    public /* synthetic */ C77190bp(C77196bv bvVar, C77192br brVar, C76590bg bgVar, C74965n nVar) {
        this.f213003a = bvVar;
        this.f213004b = brVar;
        this.f213005c = bgVar;
        this.f213006d = nVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        String str;
        C77196bv bvVar = this.f213003a;
        C77192br brVar = this.f213004b;
        C76590bg bgVar = this.f213005c;
        C74965n nVar = this.f213006d;
        C74885bc bcVar = (C74885bc) obj;
        C58485gu a = brVar.mo72453b().mo72451a(bgVar, bcVar.mo71275c());
        if (((c) bgVar.mo72271m(C77149ab.f212920d).orElse(brVar.mo72455d())).a(a.size())) {
            return brVar.mo72452a().mo72467a(bgVar, nVar, a);
        }
        boolean z = !bcVar.mo71275c().isEmpty();
        if (!a.isEmpty()) {
            a.size();
            brVar.mo72456e().mo76648a(nVar.mo71336k(), C82835ce.TIMER_NOT_RESOLVED, C83044e.f226656a);
            return C81442m.f222851a;
        }
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        boolean g = brVar.mo72459g();
        lVar.copyOnWrite();
        ((C80401n) lVar.instance).f220663f = g;
        Locale q = nVar.mo71342q();
        if (z) {
            str = bvVar.f213007a.mo75121a(q).getString(R.string.nga_productivity_no_timer_found, new Object[0]);
        } else {
            str = bvVar.f213007a.mo75121a(q).getString(R.string.nga_productivity_no_timer_exists, new Object[0]);
        }
        C81442m.m129557s(lVar, t.r(str));
        C80595f f = C80595f.m128216f(C80590x.CLIENT_OP_SUGGESTION_ON_DEVICE, bvVar.f213007a.mo75121a(q).getString(R.string.nga_productivity_show_timers_suggestion, new Object[0]));
        f.mo74361h(27105);
        C81442m.m129557s(lVar, t.n(C80600k.m128226a(f.mo74357a(new Intent("android.intent.action.SHOW_TIMERS")).mo74356a())));
        return C60856cj.m92900i((C80401n) lVar.build());
    }
}
