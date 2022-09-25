package com.google.android.apps.gsa.staticplugins.p7794df;

import com.google.android.apps.gsa.h.d.d;
import com.google.android.apps.gsa.p5855h.p5856d.C74535e;
import com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90292h;
import com.google.android.apps.gsa.shared.p7124p.p7125a.C90444a;
import com.google.android.apps.gsa.shared.p7124p.p7125a.C90445b;
import com.google.android.apps.gsa.staticplugins.p7794df.C99518d;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.df.b */
/* compiled from: PG */
public final /* synthetic */ class C99516b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C99518d f278462a;

    public /* synthetic */ C99516b(C99518d dVar) {
        this.f278462a = dVar;
    }

    public final C60870cx apply(Object obj) {
        C99518d dVar = this.f278462a;
        C58833ax hj = ((C99518d.C99519a) C47245e.m84045a(dVar.f278465b, C99518d.C99519a.class, (AccountId) obj)).mo91479hj();
        if (!hj.mo56113h()) {
            C59104x c = C99518d.f278464a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SNBWorker");
            ((C59052c) ((C59052c) c).mo56372aa(32627)).mo56386p("AGSA Classic bootstrap data store is not provided.");
            return C60866ct.f164955a;
        }
        C90444a aVar = (C90444a) C90445b.f252668a.createBuilder();
        aVar.mo58885m(C90292h.f252211a, dVar.f278466c.mo78223f("and.gsa.tracker", 0));
        return ((C74535e) hj.mo56107c()).f208692a.mo46039a(new d((C90445b) aVar.build()), C60826bg.f164896a);
    }
}
