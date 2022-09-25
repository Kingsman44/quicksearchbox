package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.android.apps.gsa.nga.engine.am.c.a.ac;
import com.google.android.apps.gsa.nga.engine.am.d.m;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.nga.shared.p6407v.C83216f;
import com.google.android.apps.gsa.nga.shared.p6407v.C83251g;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.db */
/* compiled from: PG */
public final class C77230db implements C76591c {

    /* renamed from: a */
    public static final C58974d f213066a = C58974d.m91136j();

    /* renamed from: b */
    public final C81515c f213067b;

    /* renamed from: c */
    public final m f213068c;

    /* renamed from: d */
    public final C77188bn f213069d;

    /* renamed from: e */
    public final C83216f f213070e;

    public C77230db(C81515c cVar, m mVar, C77188bn bnVar, C83251g gVar) {
        this.f213067b = cVar;
        this.f213068c = mVar;
        this.f213069d = bnVar;
        this.f213070e = gVar.mo76652a(C82831ca.SILENCE_ALARM);
    }

    /* renamed from: c */
    public static C80399l m123959c() {
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        lVar.mo74319k(24443);
        return lVar;
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72245d(ac.a());
        h.mo72246e(Optional.m71637of(C82831ca.SILENCE_ALARM));
        h.mo72277g("Silence_alarm", C90126fx.f251406iH);
        h.mo72244c(C58485gu.m89846n("Silence_alarm"));
        ((C76541a) h).f211766c = 10905;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        C77184bj h = C77185bk.m123894h(this.f213069d);
        C77277x xVar = (C77277x) h;
        xVar.f213134b = C77226cy.f213060a;
        xVar.f213135c = new C77227cz(this);
        xVar.f213136d = Optional.m71637of(new C77229da(this));
        xVar.f213137e = this.f213070e;
        h.mo72471b(true);
        h.mo72472c(true);
        C77185bk a = h.mo72470a();
        return a.mo72475c().mo72480a(a, bgVar, nVar);
    }
}
