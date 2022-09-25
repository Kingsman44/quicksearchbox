package com.google.android.apps.gsa.staticplugins.p7922eo;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58887cx;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.eo.aw */
/* compiled from: PG */
final class C100594aw implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C100603be f281275a;

    public C100594aw(C100603be beVar) {
        this.f281275a = beVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C58887cx.m90979f(th, Error.class);
        C59104x c = C100603be.f281293a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "StateCallbackHandler");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(33713)).mo56386p("Failed to get suppress results signal");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            this.f281275a.f281295c.mo78948n();
            Query query = (Query) axVar.mo56107c();
            if (query.mo84368cA()) {
                C100626w wVar = this.f281275a.f281306n;
                query.f252768g.toString();
                query.mo84423dD();
                wVar.mo91990a();
            }
        }
    }
}
