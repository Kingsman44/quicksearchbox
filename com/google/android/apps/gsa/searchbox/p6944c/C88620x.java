package com.google.android.apps.gsa.searchbox.p6944c;

import com.google.android.apps.gsa.search.shared.service.p6935b.C87845fs;
import com.google.android.apps.gsa.shared.monet.p7070b.p7075ac.C90182a;
import com.google.android.apps.gsa.staticplugins.p7867dv.p7869b.C100231z;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.searchbox.c.x */
/* compiled from: PG */
public final class C88620x implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C90182a f239569a;

    public C88620x(C90182a aVar) {
        this.f239569a = aVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x c = C88621y.f239570a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "sb.r.SbRoot");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(9933)).mo56386p("Exception executing async request");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        C87845fs fsVar = (C87845fs) obj;
        if (fsVar != null) {
            ((C23251a) ((C100231z) this.f239569a).f280288b.mo91804c()).mo28730f(fsVar.toByteArray(), false);
        }
    }
}
