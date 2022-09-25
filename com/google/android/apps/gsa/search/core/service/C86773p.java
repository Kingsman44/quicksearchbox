package com.google.android.apps.gsa.search.core.service;

import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91007g;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/* renamed from: com.google.android.apps.gsa.search.core.service.p */
/* compiled from: PG */
final class C86773p implements C91007g {

    /* renamed from: a */
    public final Queue f234374a = new ArrayDeque();

    /* renamed from: b */
    public final List f234375b = new ArrayList();

    /* renamed from: c */
    final /* synthetic */ C86775r f234376c;

    public C86773p(C86775r rVar) {
        this.f234376c = rVar;
    }

    /* renamed from: a */
    public final int mo80382a() {
        C86775r rVar = this.f234376c;
        if (rVar.f234397s == null) {
            return 1;
        }
        if (rVar.f234387i || rVar.f234384f.f236953f.equals("transcription")) {
            return this.f234374a.isEmpty() ? 3 : 2;
        }
        return 1;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ClientEventDispatcher");
        C87739bu buVar = C87739bu.UNKNOWN;
        int a = mo80382a() - 1;
        int i = 1;
        if (a == 0) {
            fVar.mo85279c("mode").mo85276a(C90752i.m148229c("paused"));
            fVar.mo85279c("events being dispatched").mo85276a(C90752i.m148230d(Integer.valueOf(this.f234374a.size())));
        } else if (a != 1) {
            fVar.mo85279c("mode").mo85276a(C90752i.m148229c("sync dispatch"));
        } else {
            fVar.mo85279c("mode").mo85276a(C90752i.m148229c("async dispatch"));
            fVar.mo85279c("events being dispatched").mo85276a(C90752i.m148230d(Integer.valueOf(this.f234374a.size())));
        }
        int i2 = 1;
        for (ClientEventData clientEventData : this.f234375b) {
            C91005e c = fVar.mo85279c("pending event id [" + i2 + "]");
            C87739bu a2 = C87739bu.m142761a(clientEventData.f236955a.f237480b);
            if (a2 == null) {
                a2 = C87739bu.UNKNOWN;
            }
            c.mo85276a(C90752i.m148231e(a2));
            i2++;
        }
        for (ClientEventData clientEventData2 : this.f234374a) {
            C91005e c2 = fVar.mo85279c("flushed event id [" + i + "]");
            C87739bu a3 = C87739bu.m142761a(clientEventData2.f236955a.f237480b);
            if (a3 == null) {
                a3 = C87739bu.UNKNOWN;
            }
            c2.mo85276a(C90752i.m148231e(a3));
            i++;
        }
    }
}
