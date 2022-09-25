package com.google.android.apps.gsa.staticplugins.p7445bf.p7450c;

import com.google.android.apps.gsa.assistant.shared.n.k;
import com.google.assistant.p3861at.C49946ew;
import com.google.assistant.p3861at.act;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.bf.c.r */
/* compiled from: PG */
final class C94581r extends k {

    /* renamed from: a */
    final /* synthetic */ SettableFuture f264553a;

    public C94581r(SettableFuture settableFuture) {
        this.f264553a = settableFuture;
    }

    /* renamed from: gn */
    public final void mo88518gn(Throwable th) {
        C59104x c = C94583t.f264554a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "VSRequestHelper");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(20208)).mo56386p("getVoiceSettings.onFailure");
        this.f264553a.mo57357o(th);
    }

    /* renamed from: go */
    public final /* synthetic */ void mo88519go(Object obj) {
        act act = (act) obj;
        C58976aa aaVar = C58975e.f156826a;
        if ((act.f128894a & 524288) != 0) {
            SettableFuture settableFuture = this.f264553a;
            C49946ew ewVar = act.f128911r;
            if (ewVar == null) {
                ewVar = C49946ew.f129824q;
            }
            settableFuture.mo57356n(ewVar);
        }
    }
}
