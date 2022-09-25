package com.google.android.apps.search.assistant.platform.pcp.api;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123747bn;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124100bz;
import com.google.android.libraries.p1635au.C19569f;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60845bz;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.api.s */
/* compiled from: PG */
final class C123603s implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ Instant f341506a;

    /* renamed from: b */
    final /* synthetic */ C124100bz f341507b;

    /* renamed from: c */
    final /* synthetic */ C60950i f341508c;

    /* renamed from: d */
    final /* synthetic */ C53306j f341509d;

    /* renamed from: e */
    final /* synthetic */ int f341510e;

    public C123603s(Instant instant, C124100bz bzVar, C60950i iVar, C53306j jVar, int i) {
        this.f341506a = instant;
        this.f341507b = bzVar;
        this.f341508c = iVar;
        this.f341509d = jVar;
        this.f341510e = i;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C123604t.f341511a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "PCP.UpdateListener");
        C59052c cVar = (C59052c) d;
        cVar.mo56378ag(C38505d.f101863a, Integer.valueOf(C89885b.PCP_FAIL_TO_NOTIFY_CLIENTS_VALUE));
        ((C59052c) ((C59052c) cVar.mo56382g(th)).mo56372aa(35153)).mo56387q("Failed to notify client: %s", this.f341509d.f139793X);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        String str;
        Void voidR = (Void) obj;
        Instant instant = this.f341506a;
        if (instant != null) {
            C124100bz bzVar = this.f341507b;
            long millis = Duration.between(instant, this.f341508c.mo57444a()).toMillis();
            String name = this.f341509d.name();
            int i = this.f341510e;
            if (i == 0) {
                str = "UNKNOWN";
            } else {
                str = C123747bn.m203105a(i);
            }
            ((C19569f) bzVar.f342762a.f102955cg.mo6453a()).mo24824b((double) millis, name, str);
        }
    }
}
