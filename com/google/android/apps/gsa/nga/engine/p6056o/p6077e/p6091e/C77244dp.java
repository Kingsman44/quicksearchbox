package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.android.apps.gsa.nga.engine.am.c.a.ac;
import com.google.android.apps.gsa.nga.engine.am.d.m;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.engine.p6246w.C79402e;
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
import p3186j$.time.ZonedDateTime;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.dp */
/* compiled from: PG */
public final class C77244dp implements C76591c {

    /* renamed from: a */
    public static final C58974d f213084a = C58974d.m91136j();

    /* renamed from: b */
    public final C81515c f213085b;

    /* renamed from: c */
    public final m f213086c;

    /* renamed from: d */
    public final C77188bn f213087d;

    /* renamed from: e */
    public final C83216f f213088e;

    /* renamed from: f */
    private final C79402e f213089f;

    public C77244dp(C81515c cVar, C79402e eVar, m mVar, C77188bn bnVar, C83251g gVar) {
        this.f213085b = cVar;
        this.f213089f = eVar;
        this.f213086c = mVar;
        this.f213087d = bnVar;
        this.f213088e = gVar.mo76652a(C82831ca.SNOOZE_ALARM);
    }

    /* renamed from: c */
    public static C80399l m123967c() {
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        lVar.mo74319k(23236);
        return lVar;
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72245d(ac.a());
        h.mo72246e(Optional.m71637of(C82831ca.SNOOZE_ALARM));
        h.mo72277g("Snooze_alarm", C90126fx.f251407iI);
        h.mo72244c(C58485gu.m89846n("Snooze_alarm"));
        ((C76541a) h).f211766c = 10904;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        C77184bj h = C77185bk.m123894h(this.f213087d);
        C77277x xVar = (C77277x) h;
        xVar.f213134b = C77237di.f213077a;
        xVar.f213135c = new C77238dj(this);
        xVar.f213136d = Optional.m71637of(new C77239dk(this));
        xVar.f213137e = this.f213088e;
        h.mo72471b(true);
        C77185bk a = h.mo72470a();
        return a.mo72475c().mo72480a(a, bgVar, nVar);
    }

    /* renamed from: d */
    public final ZonedDateTime mo72486d() {
        return this.f213089f.mo74015g().withSecond(0).withNano(0);
    }

    /* renamed from: e */
    public final Optional mo72487e(C76590bg bgVar) {
        Optional map = bgVar.mo72270l("snooze_duration").map(C77240dl.f213080a);
        if (!map.isPresent()) {
            ZonedDateTime d = mo72486d();
            Optional i = bgVar.mo72267i(C77149ab.f212917a);
            C79402e eVar = this.f213089f;
            Objects.requireNonNull(eVar);
            map = i.map(new C77241dm(eVar)).map(new C77242dn(d)).map(C77243do.f213083a);
        }
        return map.filter(C77232dd.f213072a).filter(C77233de.f213073a);
    }
}
