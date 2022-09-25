package com.google.android.apps.gsa.search.core.state.p6872d;

import android.content.BroadcastReceiver;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.state.d.bb */
/* compiled from: PG */
public final /* synthetic */ class C86935bb implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ BroadcastReceiver.PendingResult f234767a;

    public /* synthetic */ C86935bb(BroadcastReceiver.PendingResult pendingResult) {
        this.f234767a = pendingResult;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        BroadcastReceiver.PendingResult pendingResult = this.f234767a;
        C59104x c = C86938be.f234771a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "MicroDetectionState");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(9155)).mo56386p("MicrodetectionWork handleHotwordSnoozeBroadcast failed.");
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}
