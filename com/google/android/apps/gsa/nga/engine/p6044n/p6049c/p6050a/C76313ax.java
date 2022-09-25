package com.google.android.apps.gsa.nga.engine.p6044n.p6049c.p6050a;

import com.google.android.apps.gsa.nga.engine.b.g.b;
import com.google.android.apps.gsa.nga.engine.p5978b.p5989g.C75256am;
import com.google.android.apps.gsa.nga.engine.p5978b.p5989g.C75286u;
import com.google.android.apps.gsa.nga.engine.p6044n.p6049c.C76288a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5072a.p5073a.p5074a.p5075a.C65475b;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.c.a.ax */
/* compiled from: PG */
public final class C76313ax implements C76288a {

    /* renamed from: a */
    private static final C58974d f211375a = C58974d.m91134h("StopListeningExecutor");

    /* renamed from: b */
    private final C75256am f211376b;

    public C76313ax(C75256am amVar) {
        this.f211376b = amVar;
    }

    /* renamed from: a */
    public final C60870cx mo72159a(C80295aq aqVar, C65475b bVar) {
        ((C58970a) ((C58970a) f211375a.mo56224b()).mo56372aa(3530)).mo56386p("Scheduling transition to IDLE");
        this.f211376b.mo71616a(new b(C75286u.m121629b()));
        return C118826c.f331423b;
    }

    /* renamed from: b */
    public final int mo72160b() {
        return 60007;
    }
}
