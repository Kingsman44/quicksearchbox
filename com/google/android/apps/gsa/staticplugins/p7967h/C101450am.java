package com.google.android.apps.gsa.staticplugins.p7967h;

import com.google.android.apps.gsa.search.core.p6519al.p6735h.C85493j;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.assistant.p3994s.p3995a.C53422nh;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.h.am */
/* compiled from: PG */
final class C101450am extends C85493j {

    /* renamed from: a */
    public final SettableFuture f283028a = new SettableFuture();

    /* renamed from: b */
    final /* synthetic */ C101451an f283029b;

    /* renamed from: c */
    private final Boolean f283030c;

    /* renamed from: d */
    private final Boolean f283031d;

    public C101450am(C101451an anVar, Boolean bool, Boolean bool2) {
        this.f283029b = anVar;
        this.f283030c = bool;
        this.f283031d = bool2;
    }

    /* renamed from: n */
    public final void mo79015n(C53422nh nhVar) {
        C59071e eVar = C101451an.f283032a;
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f283030c.booleanValue()) {
            this.f283028a.mo57356n(C58836b.f156633a);
        } else {
            new C90873ag(this.f283029b.f283035c.mo78643b(nhVar, this.f283031d.booleanValue()), this.f283029b.f283038h, "onZeroStateResponse", new C101448ak(this)).mo85223a(new C101449al(this));
        }
    }
}
