package com.google.android.apps.gsa.search.core.p6517ak.p6518a;

import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.ak.a.l */
/* compiled from: PG */
final class C84585l extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C84591r f230189a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84585l(C84591r rVar) {
        super("Stop TTS", 1, 0);
        this.f230189a = rVar;
    }

    public final void run() {
        C84591r rVar = this.f230189a;
        if (rVar.f230218p) {
            C58976aa aaVar = C58975e.f156826a;
            this.f230189a.f230219q = true;
            return;
        }
        synchronized (rVar.f230211i) {
            this.f230189a.f230220r = true;
        }
        this.f230189a.mo78351c();
    }
}
