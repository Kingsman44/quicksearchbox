package com.google.android.apps.gsa.shared.util.p7159c;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Future;

/* renamed from: com.google.android.apps.gsa.shared.util.c.ar */
/* compiled from: PG */
final class C90884ar extends C90888av {

    /* renamed from: a */
    final /* synthetic */ Future f254092a;

    /* renamed from: b */
    final /* synthetic */ long f254093b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90884ar(Future future, long j) {
        super("Guard future timeout", 1, 0);
        this.f254092a = future;
        this.f254093b = j;
    }

    public final void run() {
        if (this.f254092a.cancel(true)) {
            C59104x d = C90886at.f254095a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NamedFutures");
            ((C59052c) ((C59052c) d).mo56372aa(11369)).mo56388r("Timeout future task has been cancelled: %d milliseconds", this.f254093b);
        }
    }
}
