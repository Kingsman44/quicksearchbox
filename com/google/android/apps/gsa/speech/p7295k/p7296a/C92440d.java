package com.google.android.apps.gsa.speech.p7295k.p7296a;

import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.speech.k.a.d */
/* compiled from: PG */
final class C92440d extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C60870cx f257808a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92440d(C60870cx cxVar) {
        super("ListenableProducerTimeout", 1, 0);
        this.f257808a = cxVar;
    }

    public final void run() {
        if (!this.f257808a.isDone()) {
            this.f257808a.cancel(false);
        }
    }
}
