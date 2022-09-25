package com.google.android.apps.gsa.staticplugins.opa.p8369hq;

import android.widget.ImageView;
import com.google.android.apps.gsa.n.g.i;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.assistant.p3781ad.p3784b.p3785a.p3786a.C48480b;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50637am;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.hq.m */
/* compiled from: PG */
final class C109239m implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C50637am f304181a;

    /* renamed from: b */
    final /* synthetic */ ImageView f304182b;

    /* renamed from: c */
    final /* synthetic */ C109243q f304183c;

    public C109239m(C109243q qVar, C50637am amVar, ImageView imageView) {
        this.f304183c = qVar;
        this.f304181a = amVar;
        this.f304182b = imageView;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x d = C109243q.f304191a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "HqController");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(24596)).mo56386p("#updatesCenter Failed to write UpdatesCenterQueue with error");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        C60870cx cxVar;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C58976aa aaVar = C58975e.f156826a;
        }
        C109243q qVar = this.f304183c;
        C50637am amVar = this.f304181a;
        ImageView imageView = this.f304182b;
        String F = ((C86054o) qVar.f304197g.mo27525b()).mo79659F();
        if (F == null) {
            C58976aa aaVar2 = C58975e.f156826a;
            cxVar = C60856cj.m92900i(C58836b.f156633a);
        } else {
            cxVar = qVar.f304195e.mo28209i(((i) qVar.f304196f.mo27525b()).a(F, C65753ak.ASSISTANT_UPDATES_CENTER_POOL, (String) null, C63662ac.f172144a, C48480b.f125234b), "getUpdatesCenterFromGellerFromUpdatesCenterPool", C109234h.f304171a);
        }
        new C90873ag(cxVar, qVar.f304195e, "processUpdateCenterQueue", new C109236j(qVar, axVar, amVar, imageView)).mo85223a(C109237k.f304177a);
    }
}
