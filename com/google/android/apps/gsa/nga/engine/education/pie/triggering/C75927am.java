package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import com.google.android.apps.gsa.nga.engine.education.pie.C75911l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80208bb;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80265t;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81354b;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81374h;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81377k;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81380n;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81381o;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.am */
/* compiled from: PG */
final class C75927am implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C81374h f210669a;

    /* renamed from: b */
    final /* synthetic */ C75928an f210670b;

    public C75927am(C75928an anVar, C81374h hVar) {
        this.f210670b = anVar;
        this.f210669a = hVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C75911l lVar = this.f210670b.f210673c;
        C81380n d = C81381o.m129461d();
        d.mo75045d(((C81354b) this.f210669a).f222677h);
        d.mo75044c(C81377k.m129443a(((C81354b) this.f210669a).f222670a));
        d.mo75043b(C80265t.TRIGGER_OPA_PROACTIVE_NOTIFICATION_FAILED);
        lVar.mo71913b(d.mo75042a(), false);
        ((C58970a) ((C58970a) ((C58970a) C75928an.f210671a.mo56225c()).mo56382g(th)).mo56372aa(3454)).mo56386p("Failed notification");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C80208bb bbVar = (C80208bb) obj;
    }
}
