package com.google.android.apps.gsa.staticplugins.searchboxroot.p8723c;

import com.google.android.apps.gsa.h.d.c;
import com.google.android.apps.gsa.p5855h.p5856d.C74535e;
import com.google.android.apps.gsa.shared.p7124p.p7125a.C90446c;
import com.google.android.apps.gsa.shared.p7124p.p7125a.C90447d;
import com.google.android.apps.gsa.staticplugins.searchboxroot.p8723c.C116847d;
import com.google.android.libraries.searchbox.shared.response.C41658m;
import com.google.android.libraries.searchbox.shared.response.C41659n;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.c.b */
/* compiled from: PG */
public final /* synthetic */ class C116845b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C116847d f324302a;

    /* renamed from: b */
    public final /* synthetic */ C41658m f324303b;

    public /* synthetic */ C116845b(C116847d dVar, C41658m mVar) {
        this.f324302a = dVar;
        this.f324303b = mVar;
    }

    public final C60870cx apply(Object obj) {
        C116847d dVar = this.f324302a;
        C41658m mVar = this.f324303b;
        C58833ax hj = ((C116847d.C116848a) C47245e.m84045a(dVar.f324305b, C116847d.C116848a.class, (AccountId) obj)).mo103033hj();
        if (!hj.mo56113h()) {
            C59104x c = C116847d.f324304a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "sb.r.PDSWriter");
            ((C59052c) ((C59052c) c).mo56372aa(32584)).mo56386p("AGSA Classic bootstrap data store is not provided.");
            return C60866ct.f164955a;
        }
        C90446c cVar = (C90446c) C90447d.f252671a.createBuilder();
        cVar.mo58885m(C41659n.f108903a, mVar);
        return ((C74535e) hj.mo56107c()).f208693b.mo46039a(new c((C90447d) cVar.build()), C60826bg.f164896a);
    }
}
