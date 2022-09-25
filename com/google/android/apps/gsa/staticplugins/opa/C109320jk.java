package com.google.android.apps.gsa.staticplugins.opa;

import android.databinding.C0118a;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.jk */
/* compiled from: PG */
final class C109320jk implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C109322jm f304513a;

    public C109320jk(C109322jm jmVar) {
        this.f304513a = jmVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x c = C109322jm.f304515a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "InputStateChipsCtrl");
        C0118a.m108p(c, "Failed when looking up PCP cache", 22836, C38505d.f101863a, Integer.valueOf(C89885b.PCP_FAIL_TO_QUERY_INPUTPLATE_DATA_VALUE));
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        C123746bm bmVar = (C123746bm) obj;
        if (bmVar == null || bmVar.f341820a.isEmpty()) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        this.f304513a.mo97762a(bmVar, true);
    }
}
