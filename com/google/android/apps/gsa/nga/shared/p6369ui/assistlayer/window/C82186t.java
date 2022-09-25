package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.window;

import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.lockscreen.impl.C81852g;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.lockscreen.impl.C81860o;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.lockscreen.impl.C81865t;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81827t;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.window.t */
/* compiled from: PG */
public final /* synthetic */ class C82186t implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C82192z f224618a;

    public /* synthetic */ C82186t(C82192z zVar) {
        this.f224618a = zVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C82192z zVar = this.f224618a;
        if (((Boolean) obj).booleanValue()) {
            zVar.f224644q.mo76663c(C83349aj.m132656k(zVar.f224640m.mo75218b(), zVar.f224641n.mo75218b(), new C82172f(zVar)), new C82173g(zVar));
            zVar.f224644q.mo76663c(zVar.f224631d, new C82174h(zVar));
            zVar.f224644q.mo76663c(zVar.f224640m.mo75220d(), new C82175i(zVar));
            zVar.f224644q.mo76663c(zVar.f224641n.mo75220d(), new C82176j(zVar));
            zVar.f224644q.mo76663c(C83349aj.m132654i(zVar.f224640m.mo75218b(), zVar.f224640m.mo75219c(), zVar.f224641n.mo75218b(), zVar.f224641n.mo75219c(), C82178l.f224609a), new C82180n(zVar));
            zVar.f224644q.mo76663c(zVar.f224632e, new C82181o(zVar));
            C83363m mVar = zVar.f224644q;
            C83357g gVar = zVar.f224630c;
            C81827t tVar = zVar.f224643p;
            Objects.requireNonNull(tVar);
            mVar.mo76663c(gVar, new C82177k(tVar));
            zVar.f224640m.mo75221e();
            C81865t tVar2 = (C81865t) zVar.f224646s;
            tVar2.f223859d.mo28212l("[NGA] onAssistUiCreate", new C81860o(tVar2));
            zVar.f224641n.mo75221e();
            return;
        }
        for (C82155be a : zVar.f224642o.f224574b.values()) {
            a.mo75525a();
        }
        zVar.f224641n.mo75222f();
        C81865t tVar3 = (C81865t) zVar.f224646s;
        tVar3.f223859d.mo28212l("[NGA] onAssistUiDestroy", new C81852g(tVar3));
        zVar.f224640m.mo75222f();
        zVar.mo75533l(C58485gu.m89845m());
        zVar.f224644q.mo76661a();
    }
}
