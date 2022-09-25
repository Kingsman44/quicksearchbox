package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80392e;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80394g;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80280ab;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80281ac;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80293ao;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80338cf;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.bj */
/* compiled from: PG */
public final class C76928bj implements C76591c {

    /* renamed from: a */
    private final C60950i f212398a;

    public C76928bj(C60950i iVar) {
        this.f212398a = iVar;
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72246e(Optional.m71637of(C82831ca.REPORT_FEEDBACK));
        h.mo72277g("Send_feedback", C90126fx.f251259fT);
        h.mo72244c(C58485gu.m89846n("Send_feedback"));
        ((C76541a) h).f211766c = 17001;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        C80280ab abVar = (C80280ab) C80281ac.f220298c.createBuilder();
        abVar.copyOnWrite();
        ((C80281ac) abVar.instance).f220300a = BuildConfig.FLAVOR;
        long epochMilli = this.f212398a.mo57444a().toEpochMilli();
        abVar.copyOnWrite();
        ((C80281ac) abVar.instance).f220301b = epochMilli;
        C80281ac acVar = (C80281ac) abVar.build();
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        lVar.mo74319k(24457);
        C80392e eVar = (C80392e) C80394g.f220645c.createBuilder();
        C80293ao aoVar = (C80293ao) C80295aq.f220357c.createBuilder();
        aoVar.copyOnWrite();
        C80295aq aqVar = (C80295aq) aoVar.instance;
        acVar.getClass();
        aqVar.f220360b = acVar;
        aqVar.f220359a = 1;
        eVar.copyOnWrite();
        C80394g gVar = (C80394g) eVar.instance;
        C80295aq aqVar2 = (C80295aq) aoVar.build();
        aqVar2.getClass();
        gVar.f220648b = aqVar2;
        gVar.f220647a = 2;
        lVar.mo74317i(eVar);
        C80392e eVar2 = (C80392e) C80394g.f220645c.createBuilder();
        C80293ao aoVar2 = (C80293ao) C80295aq.f220357c.createBuilder();
        C80338cf cfVar = C80338cf.f220449a;
        aoVar2.copyOnWrite();
        C80295aq aqVar3 = (C80295aq) aoVar2.instance;
        cfVar.getClass();
        aqVar3.f220360b = cfVar;
        aqVar3.f220359a = 7;
        eVar2.copyOnWrite();
        C80394g gVar2 = (C80394g) eVar2.instance;
        C80295aq aqVar4 = (C80295aq) aoVar2.build();
        aqVar4.getClass();
        gVar2.f220648b = aqVar4;
        gVar2.f220647a = 2;
        lVar.mo74317i(eVar2);
        return C60856cj.m92900i((C80401n) lVar.build());
    }
}
