package com.google.android.apps.gsa.staticplugins.p7967h;

import com.google.android.apps.gsa.search.core.p6519al.p6735h.C85493j;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.assistant.p3994s.p3995a.C53422nh;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.h.aj */
/* compiled from: PG */
final class C101447aj extends C85493j {

    /* renamed from: a */
    final /* synthetic */ C101451an f283025a;

    public C101447aj(C101451an anVar) {
        this.f283025a = anVar;
    }

    /* renamed from: a */
    public final void mo92300a(C53422nh nhVar) {
        C59071e eVar = C101451an.f283032a;
        C58976aa aaVar = C58975e.f156826a;
        if ((nhVar.f140184a & 512) != 0) {
            C53306j a = C53306j.m86809a(nhVar.f140193j);
            if (a == null) {
                a = C53306j.UNKNOWNN;
            }
            if (a == C53306j.DOCK) {
                return;
            }
        }
        if (!this.f283025a.f283042l.isDone()) {
            this.f283025a.f283042l.mo57356n(nhVar);
            return;
        }
        C101451an anVar = this.f283025a;
        anVar.f283042l = new SettableFuture();
        anVar.f283042l.mo57356n(nhVar);
    }

    /* renamed from: n */
    public final void mo79015n(C53422nh nhVar) {
        C59071e eVar = C101451an.f283032a;
        C58976aa aaVar = C58975e.f156826a;
        new C90873ag(this.f283025a.f283035c.mo78643b(nhVar, false), this.f283025a.f283038h, "onZeroStateResponse in ClientSyncPrefetchCallback", new C101445ah(this)).mo85223a(new C101446ai(this, nhVar));
    }
}
