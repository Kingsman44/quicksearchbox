package com.google.android.libraries.lens.view.session.p2163a;

import com.google.android.libraries.lens.p2014e.C24201ad;
import com.google.android.libraries.lens.p2014e.C24207aj;
import com.google.android.libraries.lens.p2014e.C24208ak;
import com.google.android.libraries.lens.view.p2054ae.C25023v;
import com.google.android.libraries.lens.view.p2093d.C25762k;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import com.google.lens.p4712n.p4713a.p4714a.C62634b;
import com.google.p4017at.p4056g.p4057a.p4058a.C54008bp;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.lens.view.session.a.c */
/* compiled from: PG */
final class C27735c implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C25762k f75719a;

    /* renamed from: b */
    final /* synthetic */ C24201ad f75720b;

    public C27735c(C25762k kVar, C24201ad adVar) {
        this.f75719a = kVar;
        this.f75720b = adVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f75719a.mo30912b(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58485gu guVar = (C58485gu) Collection.EL.stream(((C62634b) obj).f169105a).filter(C27734b.f75718a).collect(C58370cn.f155946a);
        if (guVar.size() < 2) {
            this.f75719a.mo30914d(new IllegalStateException("Expected at least 2 channel-complete responses in the snapshot"));
            return;
        }
        C54008bp bpVar = (C54008bp) guVar.get(0);
        if (C27736d.m51591c(bpVar)) {
            this.f75719a.mo30914d(new IllegalStateException("Expected first channel-complete response to be a prefetch response"));
            return;
        }
        C54008bp bpVar2 = (C54008bp) C58557jl.m90131l(guVar);
        if (!C27736d.m51591c(bpVar2)) {
            this.f75719a.mo30914d(new IllegalStateException("Expected last channel-complete response to be an interaction response"));
            return;
        }
        if (guVar.size() > 2) {
            ((C58970a) ((C58970a) C27736d.f75721a.mo56224b()).mo56372aa(50125)).mo56387q("Ignoring %d intermediate interaction results", guVar.size() - 2);
        }
        C24207aj c = C24208ak.m45056e(this.f75720b).mo29698c();
        c.mo29694b(C25023v.m46303a(bpVar));
        c.mo29695c(C25023v.m46304b(bpVar2));
        C24208ak a = c.mo29693a();
        C58838bb.m90884s(a.mo29701g(), "Expected interaction result to be complete");
        this.f75719a.mo30913c(a, true);
    }
}
