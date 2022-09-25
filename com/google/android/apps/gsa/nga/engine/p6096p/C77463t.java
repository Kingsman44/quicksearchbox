package com.google.android.apps.gsa.nga.engine.p6096p;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.protos.p4985f.p5030q.p5032b.C65033ar;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;

/* renamed from: com.google.android.apps.gsa.nga.engine.p.t */
/* compiled from: PG */
public final /* synthetic */ class C77463t implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C77467x f213491a;

    public /* synthetic */ C77463t(C77467x xVar) {
        this.f213491a = xVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        this.f213491a.f213501h.mo75090a((C58485gu) Collection.EL.stream(((C65033ar) obj).f176113a).sorted(Comparator.EL.reversed(Comparator.CC.comparingLong(C77447d.f213470a))).flatMap(C77457n.f213483a).collect(C58370cn.f155946a));
    }
}
