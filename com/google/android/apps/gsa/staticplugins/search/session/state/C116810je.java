package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85421b;
import com.google.android.apps.gsa.shared.logger.p7053c.C89880c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.base.C58887cx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60537to;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.je */
/* compiled from: PG */
final class C116810je implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C116811jf f324101a;

    public C116810je(C116811jf jfVar) {
        this.f324101a = jfVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x d = C116811jf.f324102a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "S_VoiceSearchState");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(32389)).mo56386p("VoiceSearch failed");
        C58887cx.m90979f(th, Error.class);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        C85421b bVar = (C85421b) obj;
        C116811jf jfVar = this.f324101a;
        if (jfVar.f324111j.equals(Query.f252741b) || bVar.mo78933c(jfVar.f324111j)) {
            C85421b bVar2 = jfVar.f324113l;
            if (bVar2 != null) {
                bVar2.mo78931a(C60537to.NO_LONGER_HANDLED, false);
            }
            jfVar.f324113l = bVar;
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        bVar.mo78931a(C89880c.m146354a(jfVar.f324111j), false);
    }
}
