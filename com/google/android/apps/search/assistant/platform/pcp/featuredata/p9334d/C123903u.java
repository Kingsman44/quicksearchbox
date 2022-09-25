package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9334d;

import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.List;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.d.u */
/* compiled from: PG */
final class C123903u implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C53306j f342234a;

    /* renamed from: b */
    final /* synthetic */ List f342235b;

    /* renamed from: c */
    final /* synthetic */ C123904v f342236c;

    public C123903u(C123904v vVar, C53306j jVar, List list) {
        this.f342236c = vVar;
        this.f342234a = jVar;
        this.f342235b = list;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C123904v.f342237a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "PCP.ReminderData");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(35329)).mo56389s("Failed to delete events %s", this.f342235b);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            this.f342236c.f342247k.mo106055b(C58485gu.m89846n(this.f342234a), 1, (Instant) null);
        }
    }
}
