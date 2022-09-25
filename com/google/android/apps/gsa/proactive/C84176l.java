package com.google.android.apps.gsa.proactive;

import android.content.BroadcastReceiver;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.p7159c.C90883aq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.proactive.l */
/* compiled from: PG */
final class C84176l extends C90883aq {

    /* renamed from: a */
    final /* synthetic */ BroadcastReceiver.PendingResult f229120a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84176l(BroadcastReceiver.PendingResult pendingResult) {
        super("scheduleTransition", 2, 0);
        this.f229120a = pendingResult;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = RequestScheduleEvaluatorReceiver.f229098c.mo56225c();
        c.mo56378ag(C58975e.f156826a, "RequestScheduleEvalRcv");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(7068)).mo56386p("Failed to schedule transition");
        this.f229120a.finish();
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C118826c cVar = (C118826c) obj;
        this.f229120a.finish();
    }
}
