package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6089c;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6157b.C78177a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80293ao;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80345cm;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80346cn;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.C83044e;
import com.google.android.apps.gsa.nga.shared.p6407v.C83216f;
import com.google.android.apps.gsa.nga.shared.p6407v.C83251g;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.c.c */
/* compiled from: PG */
public final class C76959c implements C76591c {

    /* renamed from: a */
    private final C78177a f212476a;

    /* renamed from: b */
    private final C83216f f212477b;

    public C76959c(C78177a aVar, C83251g gVar) {
        this.f212476a = aVar;
        this.f212477b = gVar.mo76652a(C82831ca.BACK);
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72277g("GoBack", C90126fx.f251187eA);
        h.mo72246e(Optional.m71637of(C82831ca.BACK));
        h.mo72244c(C58485gu.m89846n("GoBack"));
        ((C76541a) h).f211766c = 11202;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        if (!this.f212476a.mo73117b()) {
            this.f212477b.mo76648a(nVar.mo71336k(), C82835ce.BACK_ACTION_NOT_AVAILABLE, C83044e.f226656a);
            return C60856cj.m92900i((C80401n) lVar.build());
        }
        C80293ao aoVar = (C80293ao) C80295aq.f220357c.createBuilder();
        C80345cm cmVar = (C80345cm) C80346cn.f220465b.createBuilder();
        cmVar.copyOnWrite();
        ((C80346cn) cmVar.instance).f220467a = 1;
        C80346cn cnVar = (C80346cn) cmVar.build();
        aoVar.copyOnWrite();
        C80295aq aqVar = (C80295aq) aoVar.instance;
        cnVar.getClass();
        aqVar.f220360b = cnVar;
        aqVar.f220359a = 11;
        C81442m.m129555q(lVar, aoVar);
        return C60856cj.m92900i((C80401n) lVar.build());
    }
}
